const button = document.getElementById("buttonchange");
button.addEventListener("click", changeColor);

function changeColor() {
    button.classList.toggle("change-color");
}