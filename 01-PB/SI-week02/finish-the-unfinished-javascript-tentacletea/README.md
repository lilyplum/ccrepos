# finish-the-unfinished
One of the key developers left the company, and left everything behind around his desk: drafts, papers, notes everywhere. He also created a few flowcharts to sketch his ideas.

And now your boss is asking you to implement the code snippets based on the flowcharts to see whether the unfinished projects can be finished.

What are you going to learn?
* Read flowcharts.
* Write code based on flowcharts.
* Use loops and conditional statements.

## Tasks

### Flowchart "Size"
Implement the code described by the "Size" flowchart (see the Background materials section).

* The code based on the flowchart is properly implemented and can be run in size.js.

### Flowchart "Prime"
Implement the code described by the "Prime" flowchart (see the Background materials section).

* The code based on the flowchart is properly implemented and can be run in prime.js.

### Flowchart "Calculator"
Implement the code described by the "Calculator" flowchart (see the Background materials section).

* The code based on the flowchart is properly implemented and can be run in calculator.js.

### General requirements

### Hints

* You can use the while statement to implement conditional loops.
* You can use the isNaN() method to check whether a string can be converted to a number. It tells you whether a string is "not a number" or not, you can negate it with the ! operator. !isNaN("42") is true, while !isNaN("forty-two") is false. Non-integer numbers, like !isNaN("3.14") also return true.
* parseInt() and parseFloat() are built-in functions to convert strings to numbers. The result of parseInt("3.14") is 3, parseFloat("3.14") gives 3.14, while parseInt("forty-two") and parseFloat("forty-two") both returns NaN.
* Number.isInteger() can tell if a number is an integer or not. Number.isInteger(42) returns true while Number.isInteger("42") or Number.isInteger(3.14) are false.
* Watch out that = is used for variable assignment, and ==/=== is used for equality checking.
* The % operator is called the modulo operator, and it gives back the remainder after division, e.g. 42 % 5 is 2. The expression n % i === 0 shows that n is divisible by i.
* The Continue sign in the calculator flowchart means the continuation of the chart on the next diagram block.

### Background materials
[Flowchart "Size"](flowchart-size.png)  
[Flowchart "Prime"](flowchart-prime.png)
[Flowchart "Calculator"](flowchart-calculator.png)  
[About Flowcharts](../../Flowcharts.md)  
[Flowchart tutorial](https://online.visual-paradigm.com/diagrams/tutorials/flowchart-tutorial/)  
[A more detailed flowchart tutorial](https://creately.com/guides/flowchart-guide-flowchart-tutorial/)