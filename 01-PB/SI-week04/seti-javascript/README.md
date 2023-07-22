# SETI

The SETI initiative proved to be successful in the first decades of 21st century: we found another intelligent species,
and following the first lead, we met many others in the Universe. A dedicated UN organization began communicating with
our new neighbors regularly.

As a developer working for the program for extraterrestrial communications, you often have to work with other scientists
to help them decode the latest messages from the conversations between our numerous alien neighbors, such as the
Hexacats and the Septatigers.

One of their latest conversations includes a talk about the universal constant for the theory of everything. Unlike us,
who use 10 as the base system (and 60 and sometimes 12), the Hexacats have 16 tentacles, so they use 16 as their number
base system and the Septatigers have seven talons, so they use 7 as the base. To understand their numbers, we have to
convert them to the decimal format.

Your task for today is to create a reliable system that converts any number from a base system to another. Start with
the specialized functions converting between decimal and binary since these are the main tools we use for encoding our
messages and communicating via computers.

What are you going to learn?

* Understand number bases and their role in programming.

## Tasks

### From decimal to binary

Implement the decimalToBinary(decimalNumber) function that converts numbers from base 10 to base 2.

* The function returns a list containing only zeros and ones.
* The returned list of digits represent the binary representation of the input. For example, if the decimal input is 20,
  the output is [1, 0, 1, 0, 0].

### From binary to decimal

Implement the binaryToDecimal(binaryDigits) function that converts numbers from base 2 to base 10 integers.

* The function returns an integer that represents a decimal number.
* The returned number is the decimal representation of the binary input. For example, if the binary input
  is [1, 0, 1, 0, 0], the output is 20.

### From decimal to any base

Implement the decimalToBase(decimalNumber, destinationBase) function that converts numbers from base 10 to
destinationBase. A “digit” in this context means a number between 0 and destinationBase -1.

* The function returns a list that contains digits in the destinationBase.
* The returned list of digits represent the decimal input number in the destinationBase. For example, if the decimal
  input
  is 20 and destinationBase. For example, if the decimal input is 20 and destination_base is 8, the output is [2, 4].

### From any base to decimal

Implement the baseToDecimal(digits, originalBase) function that converts numbers from originalBase to base 10.

* The function returns an integer that represents a decimal number.
* The returned number is the decimal representation of the input in originalBase. For example, if the input is [2, 4]
  and
  originalBase is 8, the output is 20.

### String representation of digits

Implement the digitsAsString(digits, base) function that converts a list of digits representing a number in base into a
string representation.

* The function returns a string where each digit in the list is mapped into a single character. Digits greater than 10
  are
* represented by letters A-F.
* Digits between 10 and 15 turn to letters A-F. Smaller digits do not change in the string representation. For example,
  if
* the input digits are [2, 15, 9, 11], the output is "2F9B".
* When the input parameter base is greater than 16 the function throws an Error("This is not a right value").
* When any of the digits in the array is greater than base - 1, the function throws an Error("This is not a right
  value").

### From any base to any other

Implement the convertBase(originalDigits, originalBase, destinationBase) function that converts a list of digits given
in originalBase to digits in destinationBase.

* The function returns a list of digits in destinationBase.
* The function returns a list of digits that represent the original number in destinationBase. For example, if the
  digits
  are [1, 1, 2, 0], originalBase is 3 and destinationBase is 2, the output is [1, 0, 1, 0, 1, 0].

### General requirements

* No built-in base conversion functions are used.

### Hints

Try to understand the mathematical algorithm for the conversion for each function before working with them. The easiest
way is to try it on an example.
Verify yourself along the way by using an online resource, such
as [this one](https://www.rapidtables.com/convert/number/base-converter.html).

### Background materials

[Binary, decimal and hexadecimal numbers](https://www.mathsisfun.com/binary-decimal-hexadecimal.html)  
[Number Conversion Algorithms](http://www.cs.trincoll.edu/~ram/cpsc110/inclass/conversions.html)  
[Converting from decimal to binary](https://www.youtube.com/watch?v=H4BstqvgBow&ab_channel=KhanAcademy)  
[Control structures](/JavascriptControlFlow.md)  
[Functions](https://javascript.info/function-basics)  
[Functions by Codecool](/JavascriptFunctions.md)  
