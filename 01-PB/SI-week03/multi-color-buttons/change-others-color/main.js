const text = document.getElementById("spantext");
const button = document.getElementById("changeButton");

button.addEventListener("click",changeBg);

function changeBg() {
    text.classList.add("changeBgColor");
}

