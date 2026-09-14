const source = localStorage.getItem("source");
const destination = localStorage.getItem("destination");

// SVG node coordinates (frontend map)
const nodeCoordinates = {
    "Main Entrance": { x: 50, y: 100 },
    "Main Corridor": { x: 130, y: 100 },
    "Library": { x: 230, y: 40 },
    "Office": { x: 230, y: 160 },
    "Stairs": { x: 50, y: 160 },
    "Laboratory": { x: 50, y: 220 },
    "Admin Block": { x: 230, y: 100 }
};

let currentStep = 0;
let path = [];
let instructions = [];

// Call backend for navigation path
fetch(`/api/navigate?source=${source}&destination=${destination}`)
    .then(response => response.json())
    .then(data => {
        if (data.error) {
            document.getElementById("instructions").innerText = data.error;
            return;
        }
        path = data.path;
        instructions = data.instructions;
        drawFullPath();
        showStep(0);
    })
    .catch(err => console.error("Navigation error", err));

function drawFullPath() {
    const svg = document.querySelector(".map");

    // Draw path segments
    for (let i = 0; i < path.length - 1; i++) {
        const from = nodeCoordinates[path[i]];
        const to = nodeCoordinates[path[i + 1]];

        if (!from || !to) continue;

        const line = document.createElementNS("http://www.w3.org/2000/svg", "line");
        line.setAttribute("x1", from.x);
        line.setAttribute("y1", from.y);
        line.setAttribute("x2", to.x);
        line.setAttribute("y2", to.y);
        line.setAttribute("class", "route-line");

        svg.appendChild(line);
    }
}

function showStep(step) {
    currentStep = step;
    document.getElementById("instructions").innerText = instructions[step] || "";

    // Update buttons
    document.getElementById("prevBtn").disabled = step === 0;
    document.getElementById("nextBtn").disabled = step === instructions.length - 1;
    if (step === instructions.length - 1) {
        document.getElementById("nextBtn").innerText = "Finish";
    } else {
        document.getElementById("nextBtn").innerText = "Next";
    }

    // Move "You" marker to current position
    updateCurrentLocation(step);
}

function updateCurrentLocation(step) {
    const svg = document.querySelector(".map");
    const youCircle = svg.querySelector("circle");
    const youText = svg.querySelector("text");

    if (step < path.length) {
        const pos = nodeCoordinates[path[step]];
        if (pos) {
            youCircle.setAttribute("cx", pos.x);
            youCircle.setAttribute("cy", pos.y);
            youText.setAttribute("x", pos.x - 20);
            youText.setAttribute("y", pos.y + 20);
        }
    }
}

function nextStep() {
    if (currentStep < instructions.length - 1) {
        showStep(currentStep + 1);
    } else {
        // Finish navigation
        alert("Navigation completed!");
    }
}

function prevStep() {
    if (currentStep > 0) {
        showStep(currentStep - 1);
    }
}

function goBack() {
    window.location.href = "destination.html";
}
