# tic-tac-toe
In this project your job is to implement Tic-Tac-Toe for two players. You also can try writing some AI to play the game. If you find it easy, try to make it unbeatable.

What are you going to learn?
Variables
Functions
Loops and conditionals
Lists
Error handling

## Tasks

### Initialize the board
Create a getEmptyBoard() function which returns an empty 3-by-3 board, a list of lists filled with dots. The inner lists are considered as the rows of the board.

A list of lists is returned that represents a list of rows.

Every cell of the returned value contains .

The rows of the returned value are independent. Changing one row does not affect the others.

### Get players' move
Create a getPlayerMove() function which gets a valid move from the user via user input.

* If the user clicks on an empty tile, the tile will be filled with an X or and O.
The user can't mark an occupied tile.

### Change player
Create a changePlayer() function which changes between the two players. When a user has chosen a tile, the program switches to another player.

* If the player starts with an X, after a move the program switches to player 0 and vice versa.
### Check for winners
Create a getWinningPlayer() function that returns X or O based on whether a player has three of their marks horizontally, vertically, or diagonally in board.

* The getWinningPlayer() function returns X if X has a three-in-a-row on board.
* The getWinningPlayer() function returns None if there is no three-in-a-row on the board
### Check for a full board
Create an isBoardFull() function that returns True if the board is full.

* The isBoardFull() function returns True if there are no empty cells on the board.
* The isBoardFull() returns False if there are empty cells on the board.
### Print the result
If the game is over, the game shows if it's a tie or if X or O won the game.

* If player X wins, "X has won!" is displayed.
* If player 0 wins, "0 has won!" is displayed.
* If nobody wins, "It's a tie!" is displayed.
### Game logic
Create a main() function which calls all the other functions in the structure required for the game. You need to design that in what order, by what conditions, and in what loops you need to organize your function calls. You will need to implement and use the userAction() and the resetBoard() functions (included in the starter code) too.

* Player X starts the game.
* Players alternate their moves (X, 0, X, 0...).
* The game ends when someone wins or the board is full.
### AI can play
Implement player-against-AI mode. The AI can drive one of the players, and the game is fully playable against the computer.

* When the user selects the game mode against AI the function, getRandomAiMove() or getUnbeatableAiMove() is called instead of getPlayerMove() when it's Player 0 turn.
* Function getRandomAiMove() and getUnbeatableAiMove() returns None if the board is full.
* Function getMenuOption() is implemented as a menu for between choosing 2-player mode and against-AI mode.
### OPTIONAL TASK: AI goes for easy win
AI is capable of recognizing the opportunity to win the game with one move.

* Function getUbeatableAiCoordinates() picks the winning move if there is one on the board.
### OPTIONAL TASK: AI prevents easy lose
AI is capable of recognizing if its enemy could win the game with the next move, and (supposing there is no direct winning move) moves against it.

* Function getUbeatableAiCoordinates() (when there is no winning move in one step) picks a move which prevents a certain winning move for its enemy.
* When there is a direct winning move, function getUbeatableAiCoordinates() still picks that.
* When there are multiple one-step options for the enemy, getUbeatableAiCoordinates() tries to prevent one of them.
### OPTIONAL TASK: Unbeatable AI
AI is unbeatable in all cases.

* There is no strategy or combination of steps that can win the game against the AI.
### OPTIONAL TASK: AI vs AI
AI can play against itself

* When the menu option is called with the argument 'AI-AI', it calls getUbeatableAiCoordinates() or getRandomAiCoordinates() for both players.
* The game ends without any user interaction.
* There is a one second delay between moves to make gameplay easier to follow.

### General requirements

### Hints
* You don't have to come up with an AI strategy. You can search the internet for strategy descriptions. Do not use external code; implement written instructions instead.
* You don't have to implement a general playing strategy. Tic-Tac-Toe has a rather easy unbeatable strategy that can be expressed as a sequence of conditionals.
* Ideal team size is 3. Maximum team size is 3.