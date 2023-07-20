function askForNumber() {
    const prompt = require("prompt-sync")();
        const userInput = prompt("Give me an integer (greater than 1): ");
        const inputNumber = parseFloat(userInput);
        if (inputNumber) {
            isInteger(inputNumber);
        }
}

function isInteger(number) {
    if (!Number.isInteger(number)) {
        console.log("Not an Integer");
    } else {
        console.log("is integer")
    }
}

askForNumber();