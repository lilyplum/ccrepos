# solar-array

Your green energy company sells solar panel arrays of various size. Your job is to create the manager software that
helps to plan the output of a solar power plant. The software also needs to collect data during operation, and trigger
regular and specific checks if needed.

In case you don't know much about solar panels, the engineering team left a short summary on the topic for you to read
in the repository.

What are you going to learn?

* Use arrays
* Use and manipulate dates
* Use enums with data
* Write loops and simple grid algorithms

## Tasks

### Initialize a homogeneous solar array

Create n×m panels of a given panel type.

* The constructor that receives a PanelType parameter initializes the two dimensional panels array made of Panel
  instances of the given type.

### Initialize a heterogeneous solar array

Create n×m panels by following a given type pattern. For example, the new SolarArray(6, 2, date, new int[]{3, 1, 2})
must produce the following array:

```
MONO   MONO   MONO   POLY   THIN   THIN   
MONO   MONO   MONO   POLY   THIN   THIN
```

While the new SolarArray(4, 2, date, new int[]{1, 2}) must produce the following array:

```
MONO   POLY   POLY   MONO   
POLY   POLY   MONO   POLY
```

* The constructor that receives an integer array initializes the two dimensional panels array made of Panel instances.
* The array parameter is used as the generator sequence. The first number is the number of instances of the first panel
  type to be created, the next number is the number of panels of the second type, and so on. The pattern starts
  sequentially in the first row, and continues consecutively in the next rows.
* Missing parameter array elements (when the array length is less than the number of panel types) are treated as zeroes.
* Excess parameter array elements (at index greater or equal than the number of panel types) are ignored.
* Negative numbers in the parameter array are treated as zeroes.
* If the parameter array is empty, or there are no positive numbers in it, a homogeneous array is created with panels of
  the first type (MONO)

### Calculate maximum daily output

Implement getMaxEnergyForDate() in SolarArrayManager that calculates the daily output of the solar array according to
the engineers' instructions (look for calculations.md in the repository resources). Panels are installed horizontally by
default, do not change the initial zero angles.

* The getMaxEnergyForDate() method implements the equation given in the instructions, and sums up the output of the
  individual panels for the whole array.

### Calculate maximum yearly output for fixed horizontal panels

Sum up daily energy outputs to get a total energy calculation for the year. Panels are installed horizontally by
default, do not change the initial angles.

* Daily outputs are summed for all 365 days of the year, using horizontal panel setting.

### Calculate maximum yearly output for fixed optimal angle

Sum up daily energy outputs to get a total energy calculation for the year. Panels must be set to optimal angles.

* Daily outputs are summed for all 365 days of the year, using optimal panel angle setting. The angles are provided in
  SolarArrayManager.getOptimalPanelAngle().

### Calculate maximum yearly output for quarterly updated angles

Sum up daily energy outputs to get a total energy calculation for the year. Change panel angles four times, at the start
of each quarter, setting angles to midterm optimal ones (as recommended in calculations.md in the repository resources).

* Daily outputs are summed for all 365 days of the year, using four different panel angle settings quarterly.
* Quarterly angles are the daily optimal angles for the middle days of each quarter.

### Add recommended check period

Each panel type has a period of time in operation after which an engineering check is recommended. Add these data fields
to the PanelType enum values:

```
MONO: 100 days
POLY:  80 days
THIN:  40 days
```

* The field is added to PanelType as field daysBetweenChecks.
* The field value is set at construction time.
* There is a getter for the field.

### Run regular panel checks

Implement checkPanels to look for panels that needs to be checked on a given day. A check is due if the recommended
period is elapsed since the last engineering check date.

* The checkPanels method runs through all panels, and prints a line for each due checks: Panel [panelID] ([panelType])
  has been checked.
* The lastCheckedAt fields are updated for these panels

### OPTIONAL TASK:

Check for extreme low power output
The software also monitors real-time output of the solar plant. Update current power data and compare it to the average
of the surrounding values.

* Method refreshCurrentPower() in SolarArrayManager calls the method of the same name from every panel. The
  refreshCurrentPower() method in the Panel class uses a random generator to simulate real data input.
* The checkForPowerOutliers() method calculates the average power output in the surrounding distance number of layers (
  including same types only) and returns the list of those that do not reach the threshold.
* No warnings are raised when the surrounding sample is empty (that is, there are no panels of the same type nearby).

### Background materials

[Multi Dimensional Arrays in Java](https://www.baeldung.com/java-jagged-arrays)  
[About enum fields](https://www.programiz.com/java-programming/enum-constructor)  
[About LocalDate](https://o7planning.org/13667/java-localdate)  
