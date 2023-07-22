function isNumber(str) {
    if (typeof str === "number") {
        return !isNaN(str);
    }
    const NUM = parseFloat(str);
    return !isNaN(NUM);
}

function convertStringToNumber(USER_INPUT){ 
    const NUM = parseFloat(USER_INPUT);
    return NUM;
}

function isValidOperator(operator) {
    const OPERATORS = ["+", "-", "*", "/"];
    return OPERATORS.indexOf(operator) > -1;
}

function askForANumber(forceValidInput) {
    const PROMPT = require("prompt-sync")();
    while (true) {
        const USER_INPUT = PROMPT("Please enter a number");
        const INPUT_NUMBER = convertStringToNumber(USER_INPUT);
        if (!isNumber(INPUT_NUMBER)) {
            console.log("Invalid Input");
            if (!forceValidInput) {
                return NaN;
            }
        } else {
            return INPUT_NUMBER;
        }
    }
}   

function askForAnOperator(forceValidInput) {
    const PROMPT = require("prompt-sync")();
    while (true) {
        const USER_INPUT = PROMPT("Input Operator (+, -, *, /) ");
        if (isValidOperator(USER_INPUT)) {
            return USER_INPUT;
        } else {
            if (!forceValidInput) {
                return null;
            }
            console.log("Invalid Input. Try again.");
        }
    } 
}

function calculate(operator, a, b) {
    if (!isValidOperator(operator) ||
        !isNumber(a) ||
        !isNumber(b)) {
            return NaN;
    }
    let result = NaN;
    if (operator === "+") {
        result = a + b;
    } else if (operator === "-") {
        result = a - b;
    } else if (operator === "*") {
        result = a * b;
    } else if (operator === "/") {
        if (b !== 0) {
            result = a / b;
        } else {
            console.log("Division by zero is not allowed.")
        }
    }
    return result;
}

function simpleCalculator() {
    while (true) {
        const a = askForANumber(false);
        if (isNaN(a)) {
            break;
        }
        const op = askForAnOperator(true);
        const b = askForANumber(true);
        const result = calculate(op, a, b);
        if (result) {
            console.log(`${calculate(op, a, b)}`);
        }
    }
}
simpleCalculator();