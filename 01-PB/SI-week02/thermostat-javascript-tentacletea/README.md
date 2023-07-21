# thermostat

Setting a proper temperature in our indoor living spaces can drastically improve our carbon footage by not spending
unnecessary resources. Your task is here to implement the logic behind the settings of a thermostat. Let's take our part
in saving the Earth!

What are you going to learn?

* How to implement functions
* How to call functions
* How to handle parameters
* How to handle return values

## Tasks

### Change temperature

First, we need to simulate the mechanism of a thermostat - changing the temperature by user setting. Implement the
changeTemperature function in thermostat.js, considering the following situations: What if the room's temperature
setting is higher than the room temperature? Also, what if the set temperature is lower than the room itself? If they
equal, we should let the users know.

* Temperature increasing function is called when the room temperature is lower than the setting.
* Temperature decreasing function is called when the room temperature is higher than the setting.
* When the temperature equals the setting, the following message is written to the console: 'Room temperature equals the
  set value.'.

### Increase temperature

Implement the increaseTemperature function in thermostat.js. This function should set the room temperature higher by 0.5
and then return this value.

* Temperature variable is increased by 0.5 .
* The function returns the increased value of the temperature.

### Decrease temperature

Implement the decreaseTemperature function in thermostat.js. This function should set the room temperature lower by 0.5
and then return this value.

* Temperature variable is decreased by 0.5 .
* The function returns the increased value of the temperature.

### Change temperature setting

Implement the changeSetTemperature function in thermostat.js. This function should call the functions responsible for
increasing or decreasing the setting, based on the function parameter.

* If the user pressed the increasing button, the increaseSetTemperature is called with the current temperature as
  parameter.
* If the user pressed the decreasing button, the decreaseSetTemperature is called with the current temperature as
  parameter.

### Increase temperature setting

Implement the increaseSetTemperature function in thermostat.js. This function should turn the setting higher by 0.5 and
then return this value.

* The temperature setting variable is increased by 0.5 .
* he function returns the increased value of the setting.

### Decrease temperature setting

Implement the decreaseSetTemperature function in thermostat.js. This function should turn the setting lower by 0.5 and
then return this value.

* The temperature setting variable is decreased by 0.5 .
* The function returns the decreased value of the setting.


### Hints
* We already started this project for you, so you only need to focus on implementing functions described in the tasks. You can find more files in the repository, but you should only modify the thermostat.js one.
* Check the //TODO blocks - you should create your solutions there.
* This project is meant to be used in the browser. Start it by opening the thermostat.html in the browser.
* You can find relevant information in the JSDoc (inside blocks marked with /** */) about the suggested behaviour of a functions.

### Background materials

[JS Functions](https://javascript.info/function-basics)  
[JS Functions by CC](/JavascriptFunctions.md)  
[JS Control Structures by CC](/JavascriptControlFlow.md)
