// Give me an integer (greater than 1)
// Possible outcomes:
// - Not an integer
// - Too small
// - Not prime
// - Prime


function isInteger(number) {
    if (!Number.isInteger(number)) {
        console.log("Not an Integer");
    } else {
        isGreaterThanOne(number);
    }
}

function askForNumber() {
    const prompt = require("prompt-sync")();
    const userInput = prompt("Give me an integer (greater than 1): ");
    const inputNumber = parseFloat(userInput);
        if (inputNumber) {
            isInteger(inputNumber);
        } else {
            console.log("Please type in a number");
        }

}

function isGreaterThanOne(number) {
    if (number < 2) {
        console.log("Too small");
    } else {
        isPrime(number);
    }
}

function isPrime(number) {
    for (let i = 2; i < number; i++){
        if (number % i === 0){
          console.log("Not Prime");
        }
        console.log("Prime");
    } 
}

askForNumber();