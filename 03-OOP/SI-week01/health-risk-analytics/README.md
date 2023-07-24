# health-risk-analytics

A healthcare company contacted you to ask for help implementing a health risk analytics software with specific focus on
the risks related to being overweight. They have a database populated with data about their customers. They record the
date of birth, gender, height, and weight of their patients. The weight is updated once every year to keep track of
changes.

They prepared a list of calculations to be performed on the dataset. Your task is to provide the implementation of these
features to generate useful insights about their patients.

What are you going to learn?

* Use Java control statements
* Use Java primitive types
* Use Enums in Java
* Use LocalDate class
* Use Array operations
* Use console input & output
* Read and understand unit tests
* Understand Single Responsibility Principle

## Tasks

### Age calculation

The company wants the software to calculate the age of every customer. For this, you need to implement the calculateAge
method of the AnalyticsService class. The Person class holds all the information about a patient. The birth date is
recorded as a String field in the Person class. You need to come up with a way to calculate the person's current age
using the birth date.

* The calculateAge method in the AnalyticsService class is implemented and it correctly returns a person's current age
  in years

### Body-Mass Index (BMI) calculation

The next step is to create a function that calculates the Body-Mass Index (BMI) for each patient. The Person class
contains an int array that holds the patient's reported weight for each year, with the latest year being the first value
in the array. The BMI needs to be calculated for each reported year. The formula is the following:

BMI = kg/m2,

where kg is a person's weight in kilograms and m2 is their height in metres squared.

* The calculateBMISeries method in the AnalyticsService class is implemented and it correctly calculates the BMI values
  for each related weight in the weights array of the Person class. It returns an array of double where each element
  corresponds to the value with the same index in the weights array of the Person class.

### Overweight risk calculation

Next, we need a method that determines if a person is currently at risk of being overweight. A person can be considered
at the risk of being overweight if their Body-Mass Index (BMI) was greater than 25 for the last three years. That means
that the first three elements of the BMI series calculated for that person are all greater than 25.
If a person does not have the weight data for the last three years, the result must be Unknown.

* The determineWeightCondition method in the AnalyticsService class is implemented and it the returns the correct
  WeightCondition enum corresponding to whether the person is at risk of being overweight.

### Statistics

Finally, we need some statistics. The company wants to know what percentage of their customers can be counted as at risk
of being overweight. For this, we need a method that receives an array of Person objects, determines the overweight risk
for each, then compares the number of persons with overweight risk to the total number of customers, otherwise known as
the Overweight Risk Ratio (ORR).

* The calculateORR method in the AnalyticsService class is implemented and it returns the correct Overweight Risk Ratio
  for the dataset

### User interface

Now that the all the analytics features are implemented, we need a basic UI to show the calculation results. Create a
HealthRiskUi class that receives an instance of AnalyticsService in the constructor, and has public methods to print the
results of the analysis to the console.

* The HealthRiskUi class is created and placed in a ui package.
* A method is created that invokes the relevant functions in the AnalyticsService for each person in the database and
  diplays their current age, gender, BMI series, and overweight risk.
* A method is created that invokes the statistics functions of the AnalyticsService and displays the results on the
  console.

### Application

All the compnents are ready! Now we just need to do some scaffolding. Complete the main method in the Application class
that creates a Person array, an instance of AnalyticsService, and a UI object. It then needs to calls the public methods
of the HealthRiskUi class to display the analysis results.

* The main method of the Application class is implemented and all the required calls are made to display the calculation
  results on the console

### OPTIONAL TASK: More statistics

We need some more statistics. Complete the following tasks for some extra challenge.

* A method is created that calculates the Overweight Risk Ratio (ORR) per gender. The method has two inputs, a Person
  array and a Gender enum. From these, it calculates the ratio of persons at risk of being overweight in the dataset for
  the specified gender.

* A method is created that calculates the Overweight Risk Ratio (ORR) per age group. The method has two inputs, a Person
  array and something that specifies the age group. From these, it calculates the ratio of persons with overweight risk
  in
  the dataset for the specified age group.
  The company is interested in the following age groups:

```
Young adults: 18-25
Adults: 26-44
Middle aged: 45-59
Old: 60+
```

* The new statistical methods are invoked from the UI and the results are displayed on the console

### Hints

* The PersonProvider class contains a method that randomly generetes an array of Person objects with the specified
  length. You can change the length to suit your development and debugging needs. In the early phase it may be easier to
  work with a smaller dataset.
* You can use the unit tests provided for the AnalyticsService class. When you finish implementing a method, run the
  tests to see if your implementation is correct.
* You can use theLocalDate class to calculate the age from the birth date.
* You can use the roundToTwoDecimals method in the Utilities class to display double values with only two decimals.

### Background materials

[Java 8 Date/Time API (includes LocalDate)](https://www.baeldung.com/java-8-date-time-intro)  
[How to convert String to LocalDate in Java](https://mkyong.com/java8/java-8-how-to-convert-string-to-localdate/)  
[How to substract two dates in Java](https://www.delftstack.com/howto/java/java-subtract-dates/)  
[Console input & output in Java](https://www.baeldung.com/java-console-input-output)  
