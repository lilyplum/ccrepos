# run-rabbit-run

On a planet like ours, fluffy creatures are leaders of the world. They call themselves Rabbit. In fact, they are quite
similar to rabbits on Earth. The only difference is that they run instead of hopping. They are very particular to a
specific plant, carrots. They would run quite a distance to get one. We are planning our first contact with them. To
have a fruitful first encounter, we want to run some simulations.

What are you going to learn?

* Understand data vs service classes.
* Understand Single Resposibility Principle.

## Tasks

### The rabbit model

Before we get into the simulation, we need a data model for these creatures. You must track their position, speed and
create an ID (some integer value) for them.

* There is a Rabbit class is in the model package.
* The Rabbit has an id, speed, and position.

### Running to the carrot

These Rabbits will run any distance for a carrot. We want to simulate their movement. Also, we want to measure how much
time they need to travel a given distance (which is how far the carrot is) at a given speed.

The status of the rabbit and the time necessary to reach the carrot needs to be printed .

For example: The speed of the rabbit is 10, the distance is 50 and the starting position is 0.
The simulation output must be the following:

```
Rabbit current position: 0, time: 0
Rabbit current position: 10, time: 1
Rabbit current position: 20, time: 2
Rabbit current position: 30, time: 3
Rabbit current position: 40, time: 4
Rabbit current position: 50, time: 5
```

* The simulate() method of the RunToCarrotSimulator class simulates a race, printing the results of every lap to the
  console. When the race ends, the method returns the final time.

### Carrot race

There is an exciting phenomenon where two rabbits notice the same carrot and they race to it. We want to create a
simulation for this too.

The simulation must inform us about the id of the winning rabbit. It also needs to create a log (printing to terminal)
about the state of the race in every iteration.

The following is possible:
The first rabbit is at 80 and its speed is 20, while the second rabbit is starting from 120 and its speed is 30. The
position of the carrot is at 0, so the distance of the rabbit from the carrot is decreasing. If the two rabbits reach
the carrot at the same time, the simulation must return -1 instead of the ID of the rabbit.

The simulation must print a log similar to the following example:

```
Rabbit#1 distance from carrot: 80, Rabbit#2 distance from carrot: 120
Rabbit#1 distance from carrot: 60, Rabbit#2 distance from carrot: 90
Rabbit#1 distance from carrot: 40, Rabbit#2 distance from carrot: 60
Rabbit#1 distance from carrot: 20, Rabbit#2 distance from carrot: 30
Rabbit#1 distance from carrot: 0, Rabbit#2 distance from carrot: 0
```

* The simulate() method of the CarrotRaceSimulator class simulates a race, printing the results of every lap to the
  console. When the race ends, the method returns the id of the winning rabbit. If the race is a tie, the method returns
  -1.

### Exchange point

Sometimes, rabbits are not excited about carrots but very captivated by gossip. The runners of different rabbit colonies
can meet at an exchange point to swap gossip. We want to measure the time required for the two rabbits to meet.

The initial conditions are the following: The position of one rabbit is 0 and its speed is 10. The position of the other
rabbit is 90 and its speed is 15. They meet when the distance between the two is 0 or less. For the first rabbit, the
position is increasing, for the second rabbit, it is decreasing.
The simulation must print the following log:

```
Rabbit#1 current position: 0, Rabbit#2 current position: 90 distance: 90
Rabbit#1 current position: 10, Rabbit#2 current position: 75 distance: 65
Rabbit#1 current position: 20, Rabbit#2 current position: 60 distance: 40
Rabbit#1 current position: 30, Rabbit#2 current position: 45 distance: 15
Rabbit#1 current position: 40, Rabbit#2 current position: 30 distance: -10
```

* The simulate() method of the ExchangePointSimulator class simulates two rabbits racing towards each other, printing
  their position and distance from each other in every lap to the console. When they finally meet, the method returns
  the time the race took.

### Hints

* You can use the unit tests to validate your solution.
* The unit for time is 1.
* You can use the new position = old position + speed formula to calculate the position.
* You need to use the - operator to decrease a value.

### Background materials

[Classes and Objects](https://www.baeldung.com/java-classes-objects)  
[Single Responsibility Principle](https://www.baeldung.com/java-single-responsibility-principle)  
[Single Responsibility Principle in depth](https://reflectoring.io/single-responsibility-principle/)  
