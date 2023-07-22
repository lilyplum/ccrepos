# Project rewrite

This kind of exercise is a classic: your task is to reimplement some basic built-in functionalities of a language or its
standard library for pedagogical reasons without using built-in functionalities or the standard library itself. Caveat:
don’t use such code in your commercial projects!

What are you going to learn?

* Practice the basics of the language.
* Get familiar with a few simple algorithms.

## Tasks

### min()

Implement the min(x, y) function for two integers as inputs.

* From any two numbers, the lesser is returned.
* No built-in functions are used.

### max()

Implement the max(valuesList) function for a list of numbers.

* For any list of numbers the greatest is returned.
* No built-in functions are used.

### len()

Implement the length(valuesList) function for a list of numbers or strings which returns the length of the list.

* For any list the number of its elements is returned.
* No built-in functions are used.

### multiply()

Implement the multiply(x, y) function for integer numbers as inputs. Do not use the * and / operators or any built-in
functions. You can use +.

* For any two integer inputs the returned value equals the result of x * y.
* Neither *, / nor any built-in functions are used.

### pow()

Implement the pow(x, y) function for real base numbers and positive integer exponents! Do not use any built-in
functions. You can use *.

* For inputs from the specified domain, the returned value equals the result of Math.pow(x, y). Both the inputs and the
  return value must be integers.
* Neither ** nor any built-in functions are used.

### OPTIONAL TASK: divmod()

Implement the divmod(x, y) function for two integers as inputs. Do not use the / and the % operator or any built-in
functions. The return value must be a number array where the first value is equal to the value of x / y (natural number
not with zecimals) and the second value is equal to the value of x % y (natural number not with zecimals). Ex divmod(
5,3) => [1,2]

* For any two positive integer inputs the returned value equals [x / y, x % y].
* For any two +/- integer inputs the returned value equals [x / y, x % y].
* Neither /, %, nor any built-in functions are used.

### General requirements
* In general, do not use any built-in functions.

### Hints
* How to look for the greatest value in a list? Iterate through the list. Keep track of the greatest value by storing it in a variable. Compare the variable at every iteration with the current list element. If the variable is smaller than the current list element - replace it. At the end of the loop it will hold the answer.
* To get a length, you can iterate and count.
* Integer multiplication is basically addition a given number of times.
* An integer power function is basically multiplication a given number of times.
* How can you divide and calculate modulo without actually dividing? Try to add up numbers until you reach the goal! We'll test only with not too large numbers (between -100 and 100).
* Also, reproducing integer divison can be tricky, as the result is always rounded towards 0: 4/5 is 0 and -4/5 is also 0.
### Background materials

[Data Types](/JavascriptDataTypes.md)  
[Control structures](/JavascriptControlFlow.md)  
[Functions](https://javascript.info/function-basics)  
[Functions by CC](../../JavascriptFunctions.md)