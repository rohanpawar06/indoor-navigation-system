function selectDestination() {
    const destination = document.getElementById('destination').value;
    if (!destination) {
        alert('Please select a destination');
        return;
    }
    localStorage.setItem("destination", destination);
    window.location.href = "navigate.html";
}
