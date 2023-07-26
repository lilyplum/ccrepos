# mars-exploration-2

Humanity continues with its ambitious plan of colonizing Mars.

After the great success with the map generation software, your team has a new task. The goal is to develop a new project
that will simulate a rover exploring a map, so we can determine whether an area can be inhabited by a future human
colony. The rover will scout the map, collect information about the terrain and its resources, and write its findings
into a log file.

When the exploration software seems to be working solidly in the simulator (pun intended), nothing can get in the way of
real colonization!

What are you going to learn?

* Read and parse files dynamically.
* Write log files based on events.
* Structure algorithms in steps.
* Practice SOLID principles.
* Practice YAGNI and the MVP approach.

## Tasks

### Simulation context

The simulation needs to keep track of many important pieces of information:

* The current step number.
* The number of simulation steps required to reach a timeout (given as an argument).
* The map of the area (read from a file given as an argument).
* The location of the spaceship (given as an argument).
* The rover.
* The exploration outcome.
* A path to the log file to be written (given as an argument).

The rover's state must include:

* An id (like rover-42).
* Its current position.
* Its sight, meaning how far away it can see.
* A routine, its current mode of operation.
* One or more Coordinate collections remembering where it moved through, and the coordinates where it found interesting
  objects (like minerals, water or aliens).

Create all the required data classes to hold all these information.

* There is a Rover class with these properties: id, position, sight, routine, coordinate track records.
* There is a Context class with these properties: step number, timeout, map, landing coordinate, rover, exploration
  outcome, log file.
* There is a SimulationInput class with these properties: map file path, landing coordinates, timeout, log file path.

### Simulation steps

The rover follows a loop of simulation steps until the mission has an outcome. Each step has at least these phases:

* Movement: the rover moves according to its state
* Scan: the environment is scanned around the rover's new position and the context is updated
* Analysis: the updated context data is analysed if there is a definite outcome
* Log: the events of this round are appended to the log file
* Step increment: the simulation step counter in the context is incremented.

The phases have to implement the Phase interface. Make sure that the simulation context is passed over and updated
through the simulation's steps and phases.

Create an ExplorationSimulator class which performs these phases for each step until there is an outcome. This class
should be open to be extended by new phase types (like Fighting or Terrain sampling).

* There are at least trivial implementations for the five mandatory phases.
* The ExplorationSimulator class performs the phases for each step until there is an outcome.
* The ExplorationSimulator class follows the OCP - it could perform more phase types without modifying its code.

### Rover movement routines

In order for the rover to explore the chart it needs to follow some sort of algorithm. As long as we haven’t determined
any exploration outcome, its strategy should focus mostly on exploring the field around. However, once an outcome has
been reached, it should drive back to the spaceship to report its findings. This implies that the rover has at least two
different movement routines:

* Exploring routine. It wanders around with the intent of gathering information.
* Returning routine. It drives back to the spaceship.

Implement the given Routine interface. Later you can add further routines like combat or going around object. You can
decide how complex all these routines can be (see the hints for some ideas). Make sure you start small and later
increase the complexity of the algorithms so your team can accomplish completing the sprint on time. Try to apply YAGNI
as much as you can.

* There is an exploring routine implementation.
* There is an returning routine implementation.

### Determining the outcome

During the Analysis step phase we need to determine whether we have reached a simulation outcome. Following the OCP
again, let’s create a list of analyzers, each of which search for a particular simulation outcome. If none of them
detect an outcome, the simulation continues.

You should create at least the following analyzers by implementing the Analyzer interface:

* A Timeout analyzer to check whether the current step number has reached the timeout amount.
* A Success analyzer to check whether the right conditions for colonization have been met. You can be fully creative
  here (for some ideas see the hints).
* A Lack of resources analyzer to check if there are so few resources found on the already explored territories that the
  rover should turn back. Use some sensible thresholds depending on the discovered area.


* The Timeout analyzer is implemented.
* The Success analyzer is implemented by some custom condition.
* The Lack of resources analyzer is implemented by some custom condition.

### Log events

During the Log phase you have to write the current state of the simulation into log file strictly following this format:

```
STEP 14; EVENT position; UNIT rover-1; POSITION [2,0]
STEP 27; EVENT position; UNIT rover-1; POSITION [2,3]
STEP 86; EVENT position; UNIT rover-1; POSITION [5,0]
```

Log the position in each step along with the rover Id. Additionally, if the Context already has a simulation outcome,
write it as the last line of the file. It is expected that a log file contains only one of these outcome event lines,
and it is always the last one:

```
STEP 121; EVENT outcome; OUTCOME NOT_COLONIZABLE_RESOURCES
STEP 542; EVENT outcome; OUTCOME COLONIZABLE
STEP 10000; EVENT outcome; OUTCOME TIMEOUT
```

* The position is logged for each simulation step in the appropriate format.
* The outcome is logged as a single entry at the end of the file in the appropriate format.

### Add aliens

We have to prepare to close encounter of aliens. The initial strategy is to run back to the ship as soon as an alien is
spotted, and close the exploration with a new outcome NOT_COLONIZABLE_ALIENS. This is the point where your SOLID design
should shine. Do the following:

* Prepare the rover's Scan phase to seek for a new sign on the map (A) which represents an alien life form.
* Add an analyzer called AlienSpotter with the optional outcome NOT_COLONIZABLE_ALIENS.


* The Scan phase seeks for the signs of aliens.
* There IS an analyzer called AlienSpotter with the optional outcome NOT_COLONIZABLE_ALIENS when an alien is spotted by
  the rover.

### OPTIONAL TASK: Talk to aliens

Maybe aliens are not unfriendly at all. And if they are, most probably it will be too late just to run away after our
rovers spotted them. So let's modify the strategy as follows:

* Spotting an alien should switch into a new routine which drives the rover straight next to it.
* Upon the direct contact with the alien life form the communication takes place. The responsible analyzer should pick a
  random outcome, either NOT_COLONIZABLE_ALIENS or FRIENDLY_ALIENS. In both cases the rover must head back to the
  spaceship.


* There is a routine which approaches a target directly.
* There is an analyzer that picks randomly between NOT_COLONIZABLE_ALIENS and FRIENDLY_ALIENS outcomes if the rover is
  in direct contact with an alien.

### OPTIONAL TASK: Log into database

Instead of (or in parallel to) writing into files, save all the relevant data and events into a relational database.
Come up with a suitable DB design, create the tables, and save data using a dedicated DB phase.

In contrast to the log files, save also the locations of the resources found during the exploration (i.e. minerals and
water).

* There is a DB phase which saves position and outcome information into a relational database.
* Save resource (minerals and water) locations revealed by the rover into the database.

### Hints

* Consider which are the goals of your simulation exploration as a team before starting coding: which routines will the
  rover have, which simulation phases compose each simulation step, what makes a right condition for colonization, etc.
* An exploring routine could follow either of the strategies below:
    * Move completely randomly.
    * Follow a sequential pattern to scan the map from one side to the other.
    * Follow a smart algorithm to avoid revisiting areas that have already been explored.
* A returning routine could follow either of the strategies below:
    * Teleport back to the spaceship.
    * Follow the tracked route backwards.
    * Try to moves straight back to the landing spot.
    * Try to find the shortest path back to the spaceship based on the already explored coordinates.
* Example ideas for the condition of successful colonization:
    * 4 minerals and 3 waters found in total.
    * Mineral was found within 5 steps of a water source.
    * 2 water sources were found within 10 steps from the spaceship landing spot.
* Don't forget that plenty of the coding time will be spent creating proper tests, which is part of the project as well.
* Try to apply clean code and design principles as much as possible. Practicing these concepts is a big goal of this
  project.
* It could happen that as some parts of the code have been completed, a deeper understanding of the project may arise
  and with it the need to change perspectives. In this case, discuss the new information with the team and determine
  whether there is time for a change of direction.
* This is a huge exercise if you aim for clever algorithms, however, you can proceed much faster and complete way more
  tasks if you follow the MVP approach: implement a minimum viable version which fulfills the requirements. You always
  can come back and develop it further if you have time at the end of the sprint.

### Background materials

[YAGNI](https://martinfowler.com/bliki/Yagni.html)  
