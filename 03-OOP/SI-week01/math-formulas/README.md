# math-formulas

The application used by our company relies on various math formulas throughout the code. These are very simple formulas,
but used so many times in the code base that there is a chance that there are errors in the implementation.

To prevent such silly (and expensive) bugs, the management wants to see all these resources in a shared library. The
test department already provided a unit test suite for them. Your task is to understand the expected behavior by reading
the tests, and implement the formulas.

What are you going to learn?

* Run and read unit tests.
* Implement simple methods that meet the requirements.

## Tasks

### Divisibility check

Check if an integer is divisible by another.

* Tests isDivisible and isNotDivisible pass.

### Same remainder

Check if two integers have the same remainder when divided by another.

* Tests hasTheSameRemainder and hasDifferentRemainder pass.

### Number of multiples

Count the number of multiples of a given integer up to a limit, the limit included. For example, number 3 has four
multiples up to 12: 3, 6, 9, and 12 itself. The result is also 4 for limit 14.

* Tests numberOf3MultiplesUpTo9, numberOf3MultiplesUpTo10, numberOf3MultiplesUpTo11, and numberOf3MultiplesUpTo12 pass.

### Relative primes

Check if two positive integers are relative primes. This is the case if the only positive integer that is a divisor of
both of them is 1, that is, if their greatest common divisor (GCD) is 1. A method for calculating GCD is provided in the
source code.

* Tests relativePrimes and notRelativePrimes pass.

### Least common multiple

Calculate the least common multiple (LCM) of two positive integers. Do not code it from scratch, use the already known
GCD value and the LCM = a × b / GCD formula.

* Tests lcmOfRelativePrimes and lcmOfNotRelativePrimes pass.

### Check difference range

Check if a value (a real number) is within the given percentage range of a target number. For example, 110.1 is not
within the 10% range of 100, while 90.1 is.

* Tests isWithin8FromBelow, isWithin8FromAbove, isNotWithin8FromBelow, and isNotWithin8FromAbove pass.

### Calculate difference

Calculate the difference of a value (a real number) in percentage from a target number. For example, 90.1 differs by
9.9% from target 100.

* Tests zeroDiffInPercentage, nonZeroDiffInPercentageFromBelow, and nonZeroDiffInPercentageFromAbove pass.

### Hints

* The calculation of the greatest common divisor (GCD) of two integers is included in the starter code. It implements
  the Euclidean algorithm.
* Do not compare floating point numbers using a simple equality. Such numbers can be artificially different, due to the
  way they are represented in the computer memory. Always use inequalities, or use a small delta (d) range for direct
  comparison, such as |a -b| < d. For example, see the way comparing doubles is implemented in the test of the last
  task: a delta parameter is provided for the floating point assertEquals method. If you set the delta value lower by an
  order of magnitude, even green (passing) tests can turn into red.

### Background materials

[]()  
[]()  
[]()  
[]()  
[]()  
[]()  
[]()
