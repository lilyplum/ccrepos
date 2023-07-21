# simple-calculator--javascript

These steps are one possible path to a solution for the Simple calculator project in JavaScript.

## Understanding the project

### Understanding the functions

This section describes the purpose of each function without describing their sequence or relationship at this point.

* simpleCalculator(): The main container function calling other functions in the desired sequence
* askForANumber(forceValidInput): Requests a numeric input (operand) from the user. The same function will be used to
  request both numbers, referenced as a and b. Output is controlled with the forceValidInput parameter: If true, the
  function must return a valid number (repeat requesting user input until a valid value is provided).
* askForAnOperator(forceValidInput): Requests the operator from the user Output is controlled with the forceValidInput
  parameter: If true, the function must return a valid operation (repeat requesting user input until a valid value is
  provided).
* convertStringToNumber(str): Converts a string to a number
* isNumber(str): Validates whether the provided user input is a number
* isValidOperator(operation): Validates whether the provided user input is an operation
* calculate(operation, a, b): Performs the operation between a and b based on user inputs

### Understanding the logic flow

The simpleCalculator() container function will call other functions in the following sequence:

| Step	 | Purpose	                                                                           | Function                           |
|-------|------------------------------------------------------------------------------------|------------------------------------|
| 1.	   | The user provides the first number	                                                | askForANumber(forceValidInput).    |
| 2.	   | The user provides the operation to perform                                         | 	askForAnOperator(forceValidInput) |
| 3.	   | The user provides the second number	                                               | askForANumber(forceValidInput)     |
| 4.	   | The program performs the operation on the provided numbers and returns the result	 | calc(operation, a, b)              |

The sequence is further explained where the main program logic is described.

Validation functions are not called directly by the simpleCalculator function, but rather by each function responsible
for the above steps. Keep on reading to understand why!

## Top to Down planning

In this example the project is built from top to down. This means we will start from the main logic and step by step add
details with additional functions in the following order:

1. Code the main logic
2. Code calculator logic
3. Code user input request functions
4. Code validation functions

### Main logic

Each project requires a main function. Consider this as entry point of our program. As indicated earlier, our main logic
will be implemented in the simpleCalculator() function, so we will reference this function as the main function:

```javascript
function simpleCalculator() {
}

simpleCalculator();
```

```
The example code includes Top-level script environment. You can find detailed explanation regarding this in the
background materials section.
```

As introduced in the logic flow, functions must be called in the following sequence:

1. Request an operand using the askForANumber(forceValidInput) function and save it in the a variable. According to the
   requirements, the script should exit when the user enters a non-numeric value (like a letter) for the first number
   input. This means, we do not necessarily expect a number for operand a, so the forceValidInput parameter shall be
   False.
2. Request an operation using the askForAnOperator(forceValidInput) function. The operation is mandatory for the
   calculation to be performed, so the forceValidInput flag is set to true
3. Request another operand, using the askForANumber(forceValidInput) function and save it in the b variable. If we got
   to
   this point, the second operand is mandatory for the calculation to be performed, so forceValidInput flag shall be
   true
4. Calculate the result of a operation b expression using calculate(operation, a, b).

The same flow represented as code is the following. Note as we construct our project top-down, we will define each
referenced function later.

```javascript
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
            console.log(`The result is ${calculate(op, a, b)}`);
        }
    }
}
```

### Calculation

The calculate function performs an operation on the a and b operands (numbers).

As we want to make our code and functions reusable and cannot be sure whether the provided parameters have been already
validated elsewhere in our code (even though in this project they will be validated at the time of requesting inputs)
the calculate function also has to check whether the operation variable contains a valid operation and the a and b
variables contain valid numbers.

So, before performing the operation, the validator functions must be called by the calculator (note the validator
functions will be also defined later). All validation conditions must be true to proceed with the calculation:

```javascript
function calculate(operator, a, b) {
    if (!isValidOperator(operator) || !isNumber(a) || !isNumber(b)) {
        return NaN;
    }
}
```

With the inputs now validated, the actual mathematical operation can be performed. This means, we have to perform the
given operation on the two given operands (numbers). As it is not possible to divide by zero, we have to make sure if
the operation is division and the second operand is 0, an error is returned.

```javascript
function calculate(operator, a, b) {
    if (!isValidOperator(operator) || !isNumber(a) || !isNumber(b)) {
        return NaN;
    }
    let result = NaN;
    if (operator === '+') {
        result = a + b;
    } else if (operator === '-') {
        result = a - b;
    } else if (operator === '*') {
        result = a * b;
    } else if (operator === '/') {
        if (b !== 0) {
            result = a / b;
        } else {
            console.log('Error: Division by zero');
        }
    }
    return result;
}
```

## Requesting user input

For a basic mathematical operation the user will provide two operands (numbers) and an operator. This will be realized
with two different functions: askForANumber(forceValidInput) and askForAnOperator(forceValidInput) respectively.

### Ask for a number

The askForANumber function requests user input and calls the isNumber validation function to verify the user has
provided a number. With the forceValidInput parameter set to true, by not providing a return value for this case we
force the function in a loop and keep requesting input until a number has been provided. Keep in mind any input which
represents a number is acceptable, not just integers.

```javascript
function askForANumber(forceValidInput) {
    const prompt = require('prompt-sync')();
    while (true) {
        const userInput = prompt('Please enter a number: ');
        const inputNumber = convertStringToNumber(userInput);
        if (!isNumber(inputNumber)) {
            console.log('This didn\'t look like a number.');
            if (!forceValidInput) {
                return NaN;
            }
        } else {
            return inputNumber;
        }
    }
}
```

To get user input we are using the 'prompt-sync' package. To be able to use that package you will need to install it
with "npm install prompt-sync".

### Ask for an operation

The askForAnOperator function will be very similar to the previous one; it requests an operation from the user and calls
the isValidOperator validation function to verify the user provided an appropriate operation. With the forceValidInput
parameter set to true, by not providing a return value for this case we force the function in a loop to keep requesting
input until a valid operation has been provided.

```javascript
function askForAnOperator(forceValidInput) {
    const prompt = require('prompt-sync')();
    while (true) {
        const userInput = prompt('Please provide an operator (one of +, -, *, /)! ');
        if (isValidOperator(userInput)) {
            return userInput;
        } else {
            if (!forceValidInput) {
                return null;
            }
            console.log('Unknown operator.');
        }
    }
}
```

## Input validator functions

To complete our calculator program, as already referenced by the calculator and the user input request functions, we
need two functions to perform user input validation. The isValidOperator function validates whether the input parameter
is a valid operation and the isNumber function validates whether the input parameter is a number.

### Operator validator function

The isValidOperator function verifies whether the input parameter is any of the following characters: +, or - or * or /
respectively representing addition, subtraction, multiplication and division operations.

```javascript
function isValidOperator(operator) {
    const operators = ['+', '-', '*', '/'];
    return operators.indexOf(operator) > -1;
}
```

### Number validator function

The isNumber function verifies whether the input parameter is a number. We can call this function with number r string
parameter as well. First, if the parameter is a number, we need to check if it is really a valid number and not NaN, we
have isNaN to help us check this. Controversially the type of NaN is number. To see whether the string is a valid
number, one possibility is to cast the input string to a floating type number; if this is possible, the input is
representing a valid number. If for some reason this is not possible, a NaN is returned:

```javascript
function isNumber(str) {
    if (typeof str === 'number') {
        return !isNaN(str);
    }
    const num = parseFloat(str);
    return !isNaN(num);
}
```

## Sample output

If you carefully followed the previous steps, the calculator is now ready. From now on, you can use this script for any
basic math calculation.

```
Please provide a number! 2.3
Please provide an operation (one of +, -, *, /)! +
Please provide a number! 9.7
The result is 12.0
Please provide a number!
```