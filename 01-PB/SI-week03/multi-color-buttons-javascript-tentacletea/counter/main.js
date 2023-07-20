const buttonCount = document.getElementById("count");
buttonCount.addEventListener("click", increaseNumber);
currentNumber = parseInt(buttonCount.innerText)

function increaseNumber() {
    buttonCount.innerText = ++currentNumber;
}