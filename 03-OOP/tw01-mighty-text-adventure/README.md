# mighty-text-adventure

As you open the rusty door you feel a warm breeze and a strong stench. Your dragon sense 2000 ring begins to glow and
you know that this will be the ultimate battle...

Have you ever played an old text-based adventure game? You don't just read them as a story (as with any other book), but
you can also influence the environment with text commands. A story can have several outcomes and your choices determine
which one you reach.

You will make our own adventure this week.

What are you going to learn?

* Understand basic syntax.
* Work with different data types.
* Use arrays.
* Use data and service classes in concept.
* Understand MVC design pattern.
* Handle edge cases.
* Understand Single Responsibility Principle (SRP).

# Project name

## Tasks

### Game concept

Plan your game and sketch your story.

* There is a main character to walk through your game. The character and the starting context are described to the user.
* The user can name the character.
* The game has a base storyline, separated into smaller stages. This is the plan of what can happen to the main
  character.

### Area

Create a data structure that to store the details of an area.

* The description of the area is stored.
* One or more actions that the player can do in the area are stored.
* One or more connected areas where each action leads are stored.

### Start and end

The game has a well-defined starting and ending point.

* The game has a starting point.
* There is at least one goal for the game. The game checks in every turn whether the player reached the goal.

### Game logic

Make the game playable. Have a class that handles the logic.

* The user can move the Player in between areas, based on the selected action.
* A message is displayed when the player wins the game.
* A message is displayed when the player loses the game.

### Player

Define a Player class that stores the necessary properties.

* The name of the player is stored.
* The current area where the player is located is stored.
* The items picked up during the adventure are stored.

### Player actions

Add multiple actions to the game, such as Go North, Go South, Pick up teapot.

* There is a class that describes the Action that can be performed at an Area.
* The descriptions for the actions are stored.
* Both long and short forms of actions are accepted, such as 'N' or 'North'.

### Display

Create a separate class which handles all output to the console.

* All UI display tasks are organized separately from the logic.

### Input handling

Create a class that handles user input.

* The user input handler is case insensitive.
* If h or help is typed into the console, information about the game controls is displayed.

### Hints

* Draw the steps of the storyline on paper. This provides a detailed plan of the possibilities in the game in a diagram
  format.
* Get inspiration from this and this example story.

### Background materials

[Interactive Fiction](https://en.wikipedia.org/wiki/Interactive_fiction)  
