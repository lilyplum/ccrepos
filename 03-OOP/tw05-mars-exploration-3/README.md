No starter code is provided. Start from scratch!

# mars-exploration-3

Humanity is ready to take their current Mars exploration strategy to the next level. Until now, the rover would just
report whether there is a viable colonization spot on the Mars chart. After that, a team of humans would be deployed
there, but without any infrastructure upon their arrival. But what if the rover would do something about it while it’s
waiting for the humans to arrive? What if the rover could not only explore, but also… colonize?

The next goal of the Mars exploration series of sprints is to upgrade the current behavior of the Mars exploration
rover, so it becomes a Mars colonization rover. Start from a copy of your existing code base - you will be able to keep
most of its functionality, extended with few extra features that would allow rovers to gather resources and construct
command centers.

The simulation may still be stopped due to the same reasons implemented in the previous sprint. But in case the rover
would consider that the outcome is that the Mars chart is colonizable, then everything changes: the exploration strategy
gets expanded to a colonization strategy.

In that case, the rover should pick one reasonable spot nearby the resources it found and start extracting minerals to
build a command center right there. Once the building is completed, the rover can focus on gathering minerals. The
command center takes care of constructing subsequent rovers when enough minerals have been gathered for it. The goal of
this center is to create enough rovers to cover all the available resources within its radius (it could be several
mineral spots, also water or any other resource that was included during the previous sprint).

Once all these resources have an active rover assigned to it, so it can extract them and deliver them regularly to the
command center, the final rover of this settlement is created. This rover will be deployed as an explorer and will
attempt to find a new location suitable for a secondary base somewhere else. When it finds it, it follows the same
strategy as the first rover deployed in the chart. The only difference is that once this secondary base has been
completed and all its nearby resources are being extracted, then the simulation ends.

It is at that moment when we can really consider that this area is ready for human colonization.

What are you going to learn?

* Read and parse files dynamically.
* Write log files based on several kinds of events.
* Structure complex algorithms in dynamic steps.
* Expand a previously established solution.
* Store and keep the simulation’s information up to date in a database.
* Practice SOLID principles.
* Practice other design principles like SLAP and YAGNI.
* Test automatically the logic and behavior of your service classes.

## Tasks

### Desired simulation goal

Our simulation will start to colonize an area of the Mars chart as soon as the rover detects a suitable one. This
implies gathering materials, building command centers, creating more rovers, etc.

But before we go deeper into specifics, we need to determine the big picture, the simulation’s end goal. When is the
simulation over? Do we just build one base? Do we provide a secondary base as backup? Does it take much more effort to
make it three? We would like to recommend that you choose to have at least two separate bases to consider the simulation
completed. But, does your team think it’s doable within one single sprint?

Decide together with your team which one will be the final goal of this sprint: one, two, three or endless colonies
within the simulation time.

* The desired simulation goal is agreed upon within the team.

### Desired colonization strategy

We already have a simulator that can explore a Mars chart and determine whether it’s colonizable (sprint 2). How do we
expand it so that it also prepares the area for future colonization?

We need to have a very clear understanding of the strategy that the rover must follow in order to accomplish such a big
task. Especially considering that during the process several more rovers will be constructed and put into motion. The
success of the operation will depend on how flexible and accurate our rover strategy is.

Determine the colonization strategy of your rover thoroughly, and document it! See the Hints section for some examples.

* The elements of the desired colonization strategy is agreed upon by the team.

### Create command centers

Create a data class for command centers with all the relevant attributes.

* There is a data class for keeping at least these attributes for command centers: id, location, status, resources on
  stock.

### Multiple rovers

Modify the simulation context and the simulation logic so that it is capable of running multiple rovers at once.

* The simulation context holds a collection of rovers.
* The simulator moves each active rovers forward in each simulation step

### Extend the rover routines

Until now the rover could explore and return. Expand its functionalities to be able to at least do the following:

* Replace the simple return routine with a more general moving-to-a-destination-coordinate routine.
* Construct a command center.
* Extract a natural resource.

Provide unit tests for the new logic.

* The return routine is extended to a more general moving-to-a-destination-coordinate routine.
* There is a rover routine for building command centers.
* There is a rover routine for extracting natural resources.

### Extend the exploration simulation steps

Extend the simulation logic to manage rovers' and command centers' state changes based on their local data. Add timers
to keep track of the time spent on different activities, and create new simulation phases if needed. Provide unit tests
for the new logic.

* The rovers' states and routines are changed upon local data, along the lines of the simulation strategy sketched out
  earlier.
* The states of command centers are changed upon local data, along the lines of the simulation strategy sketched out
  earlier

### Extend the simulation step logging

During the logging simulation phase we want to make sure that we write the current state of the simulation in the
exploration.log file. This includes not only the current position of any rover within the simulation, but also
extraction, delivery and construction events. This means that on each simulation step it’s very likely that we will have
to log more than just one event line. All the information that we need should be available for us in the Context.
Additionally, if the Context already has a simulation outcome, we will write it as the last line of the file.

As a clarification, a rover first moves and arrives to a desired position (for extracting, delivering or constructing)
in a particular simulation step, and only in the next one it starts the operation (of extracting, delivering, or
constructing). Its position must always being logged in every simulation step, regardless of whether it’s moving or
performing any other operation.

* The exploration simulator logging phase is extended to keep track of all rovers and command centers, as well as the
  progresses of their operations.

### Interplanetary database

The operations center on Earth needs real time data of the resource status to make high level decisions. In order to
accomplish this, the command centers have a strong antenna that can connect to an interplanetary SQLite database. In
this database, we want to know in real time:

* Which and how many resources have been extracted by each rover in total.
* Which and how many resources have been delivered to each command center.
* Which and how many resources have been used for construction by which command center.

A look at the rovers table will show one row per rover, keeping track of the resources extracted so far. A look at the
command centers table will show one row per command center, keeping track of the resources delivered to it so far in
total, and also currently in stock. A look at the constructions table will show one row per construction, keeping track
of the resources used in the construction, which rover or command center was in charge of it and in which step of the
simulation happened.

* The required data for rovers is stored in a table in an SQLite database.
* The required data for command centers is stored in a table in an SQLite database.
* The required data for construction events is stored in a table in an SQLite database.

### Hints

* This project may look overwhelming at first, but it’s nothing like that. Remember that your team will decide its scope
  in tasks 1 and 2, based on how many team members you have and your confidence of how much you can accomplish together
  during this sprint. Make sure you design a challenge for yourselves that remains engaging and fun.

* This project is not only about problem solving, writing complex algorithms and seeing them in action. The true goal of
  this project is to offer you a fun challenge where you can consolidate important programming concepts, like clean
  code, design principles and automated testing. It’s much better to reduce the scope of the project and make sure that
  the quality of the code is the best you can produce as a team. This is our chance to focus on quality over quantity.
  So let’s take it!

* When planning the colonization strategy, think about a series of steps like this:

```
    * Validation completed.
      * Exit: wrong landing coordinates.
    * Rover one is deployed in an adjacent coordinate.
    * Rover one begins its exploration routine:
      * Exit: not colonizable due to lack of resources.
      * Exit: timeout.
    * Rover one finds a colonizable spot (based on the predefined conditions chosen in sprint 2). Within this spot, one particular coordinate will be chosen as the location of the future command center.
    * Rover one extracts minerals and gathers them at the chosen command center coordinate.
    * Rover one has collected enough minerals to start constructing the command center.
    * ... etc.

    It is important that the sequence and the conditions of moving on (or exit) must be clear from the strategy plan. Also consider questions like these:

    * How do you ensure that different rovers (or command centers) don't move for the same natural resources?
    * How do you implement operations that require progress over time, like extraction, delivery or construction?
    * How should the rover should between routines and how should it chain them in the case they are composed of smaller repetitive ones? Which service class should take responsibility for this task?

    You can simplify the strategy at many points if you make it clear in your strategy description. Some examples:

    * Rover one comes equipped with enough minerals to build the first command center.
    * Extracting and delivering resources or building centers may be immediate tasks that need no progress over time.
    * Rovers focus only on mining minerals, extracting water and other resources are left for the next wave of colonizers.
```

* The following are examples of an event log line showing the position of different rovers. It is expected for this log
  file to contain a lot of these event log lines, also within the same step number based on how many rovers are active:

```
STEP 14; EVENT position; UNIT rover-1; POSITION [2,0]
STEP 270; EVENT position; UNIT rover-1; POSITION [2,3]
STEP 270; EVENT position; UNIT rover-2; POSITION [12,33]
STEP 425; EVENT position; UNIT rover-3; POSITION [58,100]
```

The following are examples of other event log lines showing the actions that are happening within our colonization plan:

```
STEP 506; EVENT extraction; UNIT rover-1; RESOURCE mineral; PROGRESS 1 of 3
STEP 527; EVENT delivery; UNIT rover-1; RESOURCE mineral; PROGRESS 1 of 2
STEP 1570; EVENT construction; UNIT command-centre-1; POSITION [73,110]; PROGRESS 1 of 10
STEP 1571; EVENT construction; UNIT command-centre-1; POSITION [73,110]; PROGRESS 2 of 10
STEP 1691; EVENT construction; UNIT rover-2; POSITION [74,110]; PROGRESS 8 of 10
STEP 1693; EVENT construction; UNIT rover-2; POSITION [74,110]; PROGRESS 10 of 10
```

The following are examples of the last event log line showing the outcome of the simulation. It is expected for this log
file to contain only one of these event log lines, the last one:

```
STEP 121; EVENT outcome; OUTCOME NOT_COLONIZABLE
STEP 542; EVENT outcome; OUTCOME COLONIZABLE
STEP 10000; EVENT outcome; OUTCOME TIMEOUT
```

Here is one simplified example of how a partial log file could look like:

```
STEP 0; EVENT position; UNIT rover-1; POSITION [2,1]
(...)
STEP 505; EVENT position; UNIT rover-1; POSITION [68,105]
STEP 506; EVENT position; UNIT rover-1; POSITION [68,105]
STEP 506; EVENT extraction; UNIT rover-1; RESOURCE mineral; PROGRESS 1 of 3
(...)
STEP 526; EVENT position; UNIT rover-1; POSITION [72,110]
STEP 527; EVENT position; UNIT rover-1; POSITION [72,110]
STEP 527; EVENT delivery; UNIT rover-1; RESOURCE mineral; PROGRESS 1 of 2
(...)
STEP 1570; EVENT position; UNIT rover-1; POSITION [72,110]
STEP 1570; EVENT construction; UNIT command-centre-1; POSITION [73,110]; PROGRESS 1 of 90
STEP 1571; EVENT position; UNIT rover-1; POSITION [72,110]
STEP 1571; EVENT construction; UNIT command-centre-1; POSITION [73,110]; PROGRESS 2 of 90
(...)
STEP 1659; EVENT position; UNIT rover-1; POSITION [72,110]
STEP 1659; EVENT construction; UNIT command-centre-1; POSITION [73,110]; PROGRESS 90 of 90
(...)
STEP 1691; EVENT construction; UNIT rover-2; POSITION [74,110]; PROGRESS 8 of 20
(...)
STEP 1703; EVENT construction; UNIT rover-2; POSITION [74,110]; PROGRESS 20 of 20
STEP 1703; EVENT position; UNIT rover-1; POSITION [69,105]
STEP 1703; EVENT position; UNIT rover-2; POSITION [74,110]
(...)
STEP 5424; EVENT outcome; OUTCOME COLONIZABLE
```