# fizzbuzz-cooperation

You may be familiar with the famous FizzBuzz exercise - if you're not, don't worry, the rules are the following:

You will get a number:

* If the number is a multiple of 3: return the value "Fizz"
* If the number is a multiple of 5: return the value "Buzz"
* If the number is a multiple of 3 & 5: return the value "FizzBuzz"
* if the number is not true for any of the above listed, return the number as a String.

Create a Java program for this algorithm, but in an OOP fashion!

What are you going to learn?

* Class cooperation
* Class composition
* Dependency Injection Principle
* Interface Segregation Principle

## Tasks

### Create a NumberProvider

Create a NumberProvider class responsible for reading the number which the user provides.

* The NumberProvider class is present in the ui package.
* The NumberProvider class has a provide() method. This method takes the user input and returns that as an int
* The NumberProvider class needs a Scanner in order to read user input. This Scanner must not be initialized inside the
  class.

### Define Check

Create a Check interface responsible for validating the numbers.

* The Check interface is present in the check package which is contained in the logic package.
* The Check interface has a validates() method. This method takes an int parameter which it checks, and returns a
  boolean according to the check's result.
* The Check interface has a getKeyword() method. This method returns a String according to the check's result ('Fizz'
  or 'Buzz' or 'FizzBuzz' later on).

### Create DivisibleBy3

Create a DivisibleBy3 class responsible for validating the numbers.

* The DivisibleBy3 class is present in the check package which is contained in the logic package.
* The DivisibleBy3 class implements the validates() method from the Check interface. This method takes an int parameter
  which it checks, and returns a boolean according to the check's result.
* The DivisibleBy3 class implements the getKeyword() method from the Check interface. This method returns a String
  according to the check's result ('Fizz').
* All tests in DivisibleBy3Tests pass.

### Create DivisibleBy5

Create a DivisibleBy5 class responsible for validating the numbers.

* The DivisibleBy5 class is present in the check package which is contained in the logic package.
* The DivisibleBy5 class implements the validates() method from the Check interface. This method takes an int parameter
  which it checks, and returns a boolean according to the check's result.
* The DivisibleBy5 class implements the getKeyword() method from the Check interface. This method returns a String
  according to the check's result ('Buzz').
* All tests in DivisibleBy3Tests pass.

### Create DivisibleBy3And5 class

Create a DivisibleBy3And5 class responsible for validating the numbers.

* The DivisibleBy3And5 class is present in the check package which is contained in the logic package.
* The DivisibleBy3And5 class implements the validates() method from the Check interface. This method takes an int
  parameter which it checks, and returns a boolean according to the check's result.
* The DivisibleBy3And5 class implements the getKeyword() method from the Check interface. This method returns a String
  according to the check's result ('FizzBuzz').
* All tests in DivisibleBy3And5Tests pass.

### Create FizzBuzz class

Create a FizzBuzz class responsible for the process of validating the number on every check.

* The FizzBuzz class is present in the logic package.
* The FizzBuzz class has a process() method. This method takes an int parameter and validates it on every check. If a
  check validates the number, then the method returns the keyword of the check. (I.e., if the number is divisible by 3,
  the method returns 'Fizz'). If no check validates, the method returns the String value of the int number.
* The FizzBuzz class requires the list of checks necessary for the process() method. This list must not be created
  inside the class.

### Create unit tests

Check your checks by creating unit tests!

* DivisibleBy3 is covered with unit tests.
* DivisibleBy5 is covered with unit tests.
* DivisibleBy3And5 is covered with unit tests.

### Hints

* You can find requirements about not instantiating an "alien thing" inside a class. Think about the dependency of the
  class here: these things are the perfect candidates for a field! This field could get the value from the constructor
  as a parameter, as it is essential for this class to proceed with their logic.

### Background materials

[FizzBuzz exercise on Leetcode](https://leetcode.com/problems/fizz-buzz/)  
[Scanner class in Java](https://www.geeksforgeeks.org/scanner-class-in-java/)  
[Introduction to Interfaces](../../IntroductionToJavaInterfaces.md)  
[Composition over Inheritance - simplified](https://www.geeksforgeeks.org/favoring-composition-over-inheritance-in-java-with-examples/)  
[Composition over Inheritance - more detailed blog post from the writer of Effective Java](https://blogs.oracle.com/javamagazine/post/java-inheritance-composition)  
