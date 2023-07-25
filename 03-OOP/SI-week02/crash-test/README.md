# crash-test

Melon Musk just came in saying, if we'd like to launch every model of Mesla into space, we should crash test them
first – before they meet some asteroids themselves!

Your task is to create unit tests where cars' crashing behavior can be checked through tests.

What are you going to learn?

* Write unit tests for an existing code base using JUnit 5.

## Tasks

### Crash test below minimum speed

Write the tests for the cases in which the car crashes with less than the minimum speed for the airbags to open (one
seat only). (I.e. the speed limit for the airbags to open is 30, then the car crashes at 29)

* If the car crashes with a speed below the minimum speed limit for the airbags to open, and no seat is taken, then no
  airbags should open.
* If the car crashes below the minimum speed for airbags to open even if a seat is taken, no airbags should open (as the
  minimum speed is not reached)

### Crash test above minimum speed

Write the tests for the cases in which the car crashes with at least the minimum speed for the airbags to open (one seat
only).

* If the car crashes with at least the minimum speed for the airbags to open, and no seat is taken, then the airbags
  should not open.
* If the car crashes with at least the minimum speed for the airbags to open, and a seat is taken, then the airbag for
  the occupied seat should open.

### Crash test above minimum speed with two seats

Write the tests for a car crashing with at least the minimum speed for the airbags to open (two seats - one seat is
taken and another one is not)

* The car crashes with at least the minimum speed for the airbags to open. On the seat, which is taken, the airbag
  opens, by the empty seat, no airbags should open.

### Full test coverage

Run tests with coverage and make sure you cover 100% of the code base

* The logic contained in the CrashTester class has 100% test coverage.

### Background materials

[](../../IntroductionToJUnit.md)  
[](https://www.baeldung.com/junit-5)  
[](https://www.jetbrains.com/help/idea/running-test-with-coverage.html)  
