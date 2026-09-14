// Read source from URL (QR code)
const params = new URLSearchParams(window.location.search);
const source = params.get("source") || "entrance";

// Store source for later screens
localStorage.setItem("source", source);

document.getElementById("startBtn").addEventListener("click", () => {
    window.location.href = "destination.html";
});
