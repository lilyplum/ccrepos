const button = document.querySelector("#flip-flop");
//const rightButton = document.querySelector(".right");
button.addEventListener("click", jumpingButt);

function jumpingButt() {
    let left = "Go Left!";
    let right = "Go Right!";

    if (button.innerText === right) {
        button.innerText = left;
        button.classList.add("right");
    } else {
        button.innerText = right;
        button.classList.remove("right");
    }
}