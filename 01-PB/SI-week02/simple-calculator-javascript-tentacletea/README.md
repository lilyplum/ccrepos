# simple-calculator
This is a guided project
To learn the most, try and implement it on your own first, and check the solution only when you feel necessary. However, if you feel completely stuck, feel free to check the [step-by-step solution guide](SolutionGuide.md)

Your task is to implement a simple calculator script that asks the user to enter a number, then an operation (like + and /), then a number again. After the second number input, the result of the operation is calculated and printed out. After that, the program asks again for a first number.

The script exits when the user enters a non-numeric expression (such as a letter) for the first number input.

What are you going to learn?
* more advanced conditional statements
* type conversion
* basic exception handling

## Tasks

### Implement a number validator
Implement isNumber(str) function, which checks whether given string can be converted into a numeric value.

* If the given string contains a valid number, the function returns true.
* If the given string contains an invalid value, the function returns false.
* The function works for non-negative integers, like 5 or 1000.
* The function works for negative integers, like -5 and -1000.
* The function works for any real numbers, like 5.25 or -1000.14

### Implement a number converter
Implement convertNumber(str) function, which converts given string into a numeric value.

* The function returns the coverted numeric value from given string.
* The function works for non-negative integers, like 5 or 1000.
* The function works for negative integers, like -5 and -1000.
* The function works for any real numbers, like 5.25 or -1000.14

### Implement an input number requester
Implement askForANumber(forceValidInput) to return the numeric value of the user input. The function continuously asks for input from the user until the input is numeric when forceValidInput is true. When the forceValidInput is false and the user input is not numeric, the function returns with NaN.

* The function asks for input from the user, e.g.: 'Please provide a number! '.
* The function returns the numeric value of the input string if it represents a valid number.
* The function returns NaN when the user input does not represent any number and forceValidInput is false.
* If forceValidInput is true, the function continuously asks for a number, until the input string represents a valid number. After an unsuccessful input, the program informs the user about the wrong input, e.g.: 'This didn't look like a number, try again.'.
### Implement an operator checker
Implement an isValidOperator(operator) to return true if the operator input parameter represents a valid operator, and otherwise return false.

* Valid operators are the following: +, -, *, /.
### Implement an operator requester
Implement an askForAnOperator(forceValidInput) to return a valid operator. The function continuously asks the user for an operator until the input is valid when forceValidInput is true. When forceValidInput is false and the user input is not a valid operator, the function returns null.

* The function asks the user for input, e.g.: 'Please provide an operator (one of +, -, *, /)! '.
* The function returns an operator if the input string represents a valid operator.
* The function returns null when the user input does not represent a valid operator and forceValidInput is false.
* If forceValidInput is true, the function continuously asks for an operator until the input string represents a valid operator. After an unsuccessful input, the program informs the user about the wrong input, e.g.: 'Unknown operator.'.
### Implement the calculator core
Implement a calc(operator, a, b) to calculate the result of the 'a' 'operator' 'b' operator. The function returns NaN if any operand or the operator is not valid. The function handles division by zero, in this case the returned value is NaN

* The function checks the validity of the operands and the operator. Returns NaN in case of invalid input.
* The function returns the result of 'a' + 'b' if the operator is '+'.
* The function returns the result of 'a' - 'b' if the operator is '-'.
* The function returns the result of 'a' * 'b' if the operator is '*'.
* The function returns the result of 'a' / 'b' if the operator is '/' and b is not equal to 0. If 'b' is equal to 0, the function prints an error message, e.g.: 'Error: Division by zero' and returns NaN.


### Implement the main calculator logic
Implement simpleCalculator() to create the calculator. The function continuously asks for number 'a' and 'b' and an operator and calculates the result of 'a' 'operator' 'b'.

* The function checks the validity of the operands and the operator. Exit from the program if the 'a' operand is not valid. If 'a' operand is valid, the function ensures that operand 'b' and the operator are valid.
* The function prints the calculation results, e.g.: 'The result is 10'.

### Hints
* You need a function that asks for input numbers from the user. For the first number request, non-number input is acceptable (this triggers the exit from the program), but for the second input request, it is not allowed.
* You can ask for user input using the prompt() function.

### Background materials
[Control Structures](/JavascriptControlFlow.md)  
[A step-by-step solution guide](SolutionGuide.md)  
