# speed-limit-fine-calculator

You own a transportation company, and your negligent drivers keep exceeding the speed limit over and over again. Every time you want to calculate how much you will pay, you need to Google the speed limits and the corresponding fines. To make your life easier, you decided to create a console app that asks for the vehicle type, the road type, and the speed of the vehicle, then calculates the fine.

What are you going to learn?
* Use primitive data types.
* Use control statements.
* Understand Single Responsibility Principle
* Work with console input & output.
* Use enum classes.
## Tasks

### Vehicle speed limit provider
Implement a class named VehicleLimitProvider to provide the speed limit values for different vehicles on different roads.

This example includes three vehicle types with the following speed limits.

- Cars are limited to 50 in urban areas, 90 on main roads, and 130 on highways.
- Buses are limited to 50 in urban areas, 70 on main roads, and 100 on highways.
- Trucks are limited to 50 in urban areas, 70 on main roads, and 80 on highways.

* The VehicleLimitProvider class is created and placed in a package named named service or logic.
* The VehicleLimitProvider class contains a method that receives a vehicle type and a road type, then returns the correct speed limit value.

### Speed limit fine calculator
Create the SpeedLimitFineCalculator class that calculates the value of the fine based on the vehicle type, the road type, and the speed of the vehicle.

* The SpeedLimitFineCalculator is created and placed in a package named service or logic.
* The SpeedLimitFineCalculator class contains a method that receives a vehicle type, a road type and a vehicle speed, then returns the correct fine value.

### Fine calculator UI
Create a FineCalculatorUI class that asks for the three inputs (vehicle type, road type, and vehicle speed), invokes the necessary components to calculate the value of the fine, and then displays the results.

* The FineCalculatorUI class is implemented and placed in a package named ui.
* The FineCalculatorUI class gets the user input, delegates the fine calculation to the SpeedLimitFineCalculator, and displays results.
### Application
Finally, create an Application class with a main method. This is the entry point of the program. The task of this class is to create the necessary components and invoke the UI.

* The main method of the Application class is implemented. It handles the instantiation of the components and invokes the UI.

### Hints
* Check out the background materials for information on converting strings to enums and vice versa.
### Background materials
[Enums in Java](https://www.baeldung.com/a-guide-to-java-enums)  
[Enum-String conversion in Java](https://www.baeldung.com/java-string-to-enum)  
[Console input and output in Java](https://www.baeldung.com/java-console-input-output)  
