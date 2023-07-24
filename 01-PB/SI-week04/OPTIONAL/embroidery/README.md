# Embroidery

Winter is coming, and so is Christmas. You have a small enterprise that produces Christmas tree decorations. This year,
you bought a machine that is able to produce embroidery and is controllable through a programmable interface.

The machine requests a matrix as an input where 0 means an empty pixel, and positive integers mean different colors.

Your job is to design simple ornament matrices for this year's Christmas fair.

What are you going to learn?

* Think in algorithms.
* Handle edge cases.
* Use parameters and default arguments.
* Use nested lists and advanced list manipulation.

## Tasks

### Draw a rectangle

Implement drawRectangle methods to return matrices similar to the following examples.

```
1 1 1 1 1 1 1          1 1 1 1 1 1 1          1 1 1 1 1 1 1
1 1 1 1 1 1 1          1 2 2 2 2 2 1          1 1 1 1 1 1 1
1 1 1 1 1 1 1          1 2 2 2 2 2 1          1 1 2 2 2 1 1
1 1 1 1 1 1 1          1 2 2 2 2 2 1          1 1 2 2 2 1 1
1 1 1 1 1 1 1          1 2 2 2 2 2 1          1 1 1 1 1 1 1
1 1 1 1 1 1 1          1 1 1 1 1 1 1          1 1 1 1 1 1 1
```

* There are optional parameters, such as borderColor, fillColor, and borderWidth. The default value is 1 for all of
  these.
* Called with default arguments, the returned matrix is a width-by-height rectangle shape marked by 1s.
* The border of the rectangle has borderColor, and it is filled with fillColor.
* The third optional parameter, borderWidth, specifies the width of the border.
* There are no completely empty rows or columns in the returned matrix.
* The function provides reasonable answers to edge cases (all combinations of integers as parameters).

### Draw a triangle

Implement the drawTriangle(height) function to return arrays similar to the following examples.

```
0 0 0 1 0 0 0          0 0 0 1 0 0 0
0 0 1 1 1 0 0          0 0 1 2 1 0 0
0 1 1 1 1 1 0          0 1 2 2 2 1 0
1 1 1 1 1 1 1          1 1 1 1 1 1 1
```

* There are optional parameters, such as borderColor and fillColor. The default value is 1 for all of these.
* Called with default arguments, the returned matrix consists of height rows and shows a tringle filled with 1s.
* The border of the triangle has borderColor, and it is filled with fillColor.
* There are no completely empty rows or columns in the returned matrix.
* The function provides reasonable answers to edge cases (all combinations of integers as parameters).

### Draw a Christmas tree

Implement the drawchristmastree(blocks) function to return arrays similar to the following example (when blocks == 4).

```
0 0 0 0 0 1 0 0 0 0 0
0 0 0 0 1 2 1 0 0 0 0
0 0 0 1 2 2 2 1 0 0 0
0 0 0 0 1 2 1 0 0 0 0
0 0 0 1 2 2 2 1 0 0 0
0 0 1 2 2 2 2 2 1 0 0
0 0 0 1 2 2 2 1 0 0 0
0 0 1 2 2 2 2 2 1 0 0
0 1 2 2 2 2 2 2 2 1 0
0 0 1 2 2 2 2 2 1 0 0
0 1 2 2 2 2 2 2 2 1 0
1 1 1 1 1 1 1 1 1 1 1
```

* There are optional parameters, such as borderColor and fillColor. The default value is 1 for all of these.
* Called with default arguments, the returned matrix shows a Christmas tree made of blocks pieces of trapezoid blocks
  and filled with 1s. Each block has 3 rows, and each first row is one step shorter than the last row of the block
  above.
* The border of the triangle has borderColor, and it is filled with fillColor.
* There are no completely empty rows or columns in the returned matrix.
* The function provides reasonable answers to edge cases (all combinations of integers as parameters).

### OPTIONAL TASK:

Draw a circle
Implement the drawCircle(radius) function to return similar to the following example (truncated).

```
0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 1 1 2 2 2 2 2 2 2 1 1 1 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 1 1 2 2 2 2 2 2 2 2 2 2 2 2 2 1 1 0 0 0 0 0 0 0
0 0 0 0 0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0 0 0 0 0
0 0 0 0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0 0 0 0
0 0 0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0 0 0
0 0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0 0
0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0
0 0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0 0
0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0
0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0
0 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1 0
1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1
1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1
1 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 1
```

* There are optional parameters, such as borderColor and fillColor. The default value is 1 for all of these.
* Called with default arguments, the returned matrix shows a circle of radius r filled with 1s.
* The returned matrix shows a continuous circle outline of borderColor, and filled with fillColor.
* There are no completely empty rows or columns in the returned matrix.
* The function provides reasonable answers to edge cases (all combinations of integers as parameters).

### Hints

* You can use the embroider method to print the shapes.
* You can create an array with a fixed length with initial values with the following pattern: Array(length).fill(
  fillValue). For example: Array(3).fill('a') is going to result in: [ 'a', 'a', 'a' ]
* Try to solve the problems without distinguishing the border and the inside first (that is, borderColor == fillColor),
  you may find them much easier this way.
* This is especially true for the drawCircle function. Drawing a nice border for a circle is a rather advanced exercise,
  even though the only extra math needed for the solution is the Pythagorean theorem to calculate distance.

### Background materials

[JS Arrays](/01-PB/JavascriptArrays.md)  
[Two-dimensional arrays](https://www.geeksforgeeks.org/javascript-multidimensional-array/)  
