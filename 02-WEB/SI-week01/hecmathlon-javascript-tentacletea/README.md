# Pretty Simple Web server written in Node.js

You can use this repository as a template for your repository or copy the files into your repository manually

1. Open a new terminal (eg. in VS Code when your repository's directory opened)
2. Run with the following command: `node backend/server.js` (Make sure that you are in the right directory.)
3. If you don't need it stop it with `Control + C` keycommand.

You can write your frontend code (`HTML, CSS, JS`) into the `frontend` directory.

# hECMAthlon

The hECMAthlon is a feature competition where programmers can measure their strength in refactoring javascript code. Every competitor gets a codebase and their task is to refactor the code using the newest features of the ECMAScript. You are lucky and your friend is part of the judge of the competition. He shared with you the codebase and the main point of view of the judgment. Before you participate in the real competition you need to practice it.

What are you going to learn?  
* Important features of ECMA Standardised Javascript  
* Refactor code

## Tasks

### Block variables
Transform the variables in every function to being declared with the const or let keywords.  
There is no variable declared with the var keyword in the javascript code

### .reduce()
The reduce() method executes a reducer function (that you provide) on each element of the array, resulting in single output value. Refactor the getMaxValue() function using the reduce() method.

The getMaxValue() function starts with the return keyword in the JavaScript code

### .filter()
The filter() method creates a new array with all elements that pass the test implemented by the provided function. Refactor the getGreaterThan() function using the filter() method.

The getGreaterThan() function starts with the return keyword in the JavaScript code

### .map()
The map() method creates a new array populated with the results of calling a provided function on every element in the calling array. Refactor the fizzBuzz() function using the map() method. Check the BG materials how can you create an array from a number.

There is no for loop in the fizzBuzz() function in the JavaScript code

### Easy copy
Refactor the getOutput() function using the spread operator.

The getOutput() function starts with the return keyword.

### Ternary Operator
Refactor the fizzBuzz() method's if/else part by using ternary operator only.

There is no if and else keyword in fizzBuzz() just ternary operator.


### General requirements
Every functionality works after the refactoring  
All the functions are declared as arrow functions

### Hints
There are more features about the features following the ES6. We can't cover all of them so take your time and browse amongst them.  
Try out the functionalities of the code before and after the refactor. It's easier to find out where you ruined the code if you do

### Background materials
[Link text Here](https://link-url-here.org)
[Video about the greatest features with ECMA 6](https://www.youtube.com/watch?v=NCwa_xi0Uuc&ab_channel=ProgrammingwithMosh)  
[.filter()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter)  
[.reduce()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/Reduce)  
[How create an array from a number](https://jasonwatmore.com/post/2021/10/02/vanilla-js-create-an-array-with-a-range-of-numbers-in-a-javascript)  
[.map()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/map)  
[ternary Operator](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Conditional_Operator)  
[Overview and comparison with ECMA 6](http://es6-features.org/#Constants)  
[Examples about the features](https://www.javascripttutorial.net/es6/)  
[.map() vs for loops](https://medium.com/@ExplosionPills/map-vs-for-loop-2b4ce659fb03)  
