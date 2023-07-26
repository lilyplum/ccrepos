# fly-that-drone

A drone manufacturer company contacted you to create a simulator for their products. The first series is ready, these
are drones with ground movement capability. They have many more in the pipeline. Your task is to create a simulation
engine to facilitate a virtual 3D showcase of the drones for the potential customers.

The company wants fast development. The simulation engine needs to be flexible enough to handle new requirements
regarding the movement capabilities of the drones without major developments to the engine itself. This ensures that the
new drones can be included in the simulation as soon as they are developed by the company, with very little code change.

What are you going to learn?

* Practice Open/Closed principle.
* Practice Single Responsibility Principle.
* Write parameterized unit tests.

## Tasks

### Basic ground movement

The first line of drones the company developed is only capable of four-directonal ground movement, such as Forward,
Backward, Left, and Right. Implement the MovementEngine to handle these four types of movements.

* The MovementEngine can move the drone Forward.
* The MovementEngine can move the drone Backward.
* The MovementEngine can move the drone Left.
* The MovementEngine can move the drone Right.

### Diagonal movement

The second batch of drones arrived, and the company is excited to include them in the simulation. These new drones are
capable of diagonal ground movements, such as Forward-Left, Forward-Right, Backward-Left, and Backward-Right.

Implement the new movements without making any changes to the MovementEngine class. If even a single letter is changed,
your solution is not accepted. If there is no way to solve this task without making changes to the implemented
MovementEngine, go back to the first task and refactor it. Begin this task only after implementing that structure.

* The MovementEngine can move the drone Forward-Left.
* The MovementEngine can move the drone Forward-Right.
* The MovementEngine can move the drone Backward-Left.
* The MovementEngine can move the drone Backward-Right.
* No changes are made to the MovementEngine.

### Air movement

The final batch of the drones are getting released. The new feature is flying. The company contacted you to include air
movements in the engine, such as Up and Down. Implement the new movements in your program.

You cannot modify the MovementEngine class. If the current architecture does not allow for new movements to be added
without modification to the MovementEngine, go back to the first task and start over.

* The MovementEngine can move the drone Up.
* The MovementEngine can move the drone Down.
* No changes are made to the MovementEngine.

### OPTIONAL TASK: Write parametrized tests

There is a prepared list of expected drone behavior as reactions to various commands in the repository. Use that list to
run parameterized tests on the drone.

* The test file runs parameterized tests based upon the predefined test cases.

### Hints

* The logic of the drone movement is easy and quick to implement. The main focus of this project is to apply OCP and
  create a plugin architecture design, which makes the system extensible without touching the existing code.
* Develop the first version of the movement engine in a way that allows adding new movement types without changing the
  engine code. There are multiple ways to achieve this. Feel free to explore the different ideas and compare their
  advantages before picking a solution. Take your time to think about the problem before starting to implement it.

### Background materials

[Open/Closed Principle explained](https://stackify.com/solid-design-open-closed-principle/)  
[OCP in JAVA](https://www.baeldung.com/java-open-closed-principle)  
