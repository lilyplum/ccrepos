# feng-shui-match-calculator

Love works in mysterious ways, but now we can at least double check it! Your task is to build a Feng Shui Match
Calculator application to check how well couples match, based on their birth years.🔮

What are you going to learn?

* Understand data vs service classes.
* Work with dates.
* Use console input & output.
* Understand Single Responsibility Principle.
* Use records in Java.
* Use enums in Java.

## Tasks

### Zodiac sign calculator

Create a SignCalculator class that calculates the Chinese zodiac sign for a given birth date. The application needs to
take birth dates in a yyyy-mm-dd format.

Calculate the sign by dividing the year of birth by 12 (the number of zodiac signs) and take the remainder. From all
available signs, pick the sign on the index of the remainder (for example, if the remainder is 1, the zodiac sign is the
monkey).

* The SignCalculator service class is created. It contains a method for calculating the Chinese zodiac sign for a given
  birth date.

### Zodiac match calculator

Create a MathCalculator class to calculate the match between two persons based on their birth dates. There are three
possible outcomes: good, average, or bad match. The Persona objects created by the PersonaRepository hold the relevant
information for each sign.

* The MatchCalculator class is created. It has a method for calculating the match between two supplied birth dates.

### User interface

Create a class that handles the user input from the console, performs the matching, and displays the results on the
console.

* The class contains a method that asks for a string input from the console for each birth date.
* The class calls the necessary methods to determine how well the couple matches, then displays the results.

### Application

Implement the main method in the Application class. This is the main entry point of the program. The task of this method
is to create the necessary components, then initiate the matching algorithm.

* The Application class is created. It contains a main method which creates all the required components and kicks off
  the matching process.

### Hints

* The PersonaRepository contains a method of accessing a Persona object by its Sign.
* You can use an enum for the matching results (good, average, or bad).
* You can use theLocalDate class for anything related to dates, such as date processing.
* You can use the Scanner class to make input processing from the console easier.

### Background materials

[LocalDate in Java](https://www.baeldung.com/java-8-date-time-intro)  
[Console input and output in Java](https://www.baeldung.com/java-console-input-output)  
[Records in Java](https://www.baeldung.com/java-record-keyword)  
[Enums in Java](https://www.baeldung.com/a-guide-to-java-enums)  
