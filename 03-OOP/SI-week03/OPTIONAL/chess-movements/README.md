# chess-movements

You are fascinated by the fact that an open source software called Stockfish, running on an ordinary PC, can beat the
best human chess players easily. As a hobby project, you decide to write a simple chess engine, not tuned for
performance, but beautiful object-oriented design.

As a start, need to create the most fundamental part, the one that generates the possible movements for each piece. You
decide to only generate the simplest possible moves within the chessboard:

* Skip anything else than one step forward for pawns.
* Implement the white pawn perspective only. This defines forward as a larger Y coordinate.
* Skip castling.

However, you decide to follow the best OOP practices. You have the chance to master the open–closed principle: every new
task that introduces the logic of a new piece needs to be incorporated into the code base without modifying anything
that previously existed.

And remember to cover your code with tests.

What are you going to learn?

* Apply open–closed principle.
* Apply single-responsibility principle.
* Write parametrized unit tests.

## Tasks

### Engine closed for modification

The MovementEngine class is the heart of the engine: it must be capable of providing the list of possible moves for any
piece at any position.

Implement the class in a way that prevents refactoring each time you include a new chess piece. It needs to be open for
extension to any hypothetical types, so hard-coding the six piece types is not good enough.

This class must only return moves that fit within the chess board.

* The MovementEngine class forwards a request to the relevant generator (if there is one). The generators are not
  hard-coded, but injected as external dependencies.
* The MovementEngine class filters the possible moves to be within the board limits.

### Implement pawn

Implement and test PawnGenerator as a MovementGenerator that returns a single move forward for a white pawn, that is,
plus one in Y coordinates.

Do not check for the board limits, MovementEngine needs to remove any moves that do not fit within the chess board.

Do not change MovementEngine at all. If you cannot find a way to include this piece in the engine logic, refactor
MovementEngine until you can incorporate this piece and any future ones.

* The generator returns the single possible move for a white pawn, regardless of the board limits.
* The generator is covered with unit tests.

### Implement king

Implement and test KingGenerator as a MovementGenerator that returns a single move forward for a king, that is, one step
at every direction.

Do not check for the board limits, MovementEngine needs to remove any moves that do not fit within the chess board.

Do not change MovementEngine at all. If you cannot find a way to include this piece in the engine logic, refactor
MovementEngine until you can incorporate this piece and any future ones.

* The generator returns the single possible move for a king, regardless of the board limits.
* The generator is covered with unit tests.

### Implement knight

Implement and test KnightGenerator as a MovementGenerator that returns a single move forward for a knight, that is, all
possible "L-shaped" moves).

Do not check for the board limits, MovementEngine needs to remove any moves that do not fit within the chess board.

Do not change MovementEngine at all. If you cannot find a way to include this piece in the engine logic, refactor
MovementEngine until you can incorporate this piece and any future ones.

* The generator returns the single possible move for a knight, regardless of the board limits.
* The generator is covered with unit tests.

### Implement bishop

Implement and test BishopGenerator as a MovementGenerator that returns a single move forward for a bishop that is, all
diagonal moves, with the maximum length of the board size.

Do not check for the board limits, MovementEngine needs to remove any moves that do not fit within the chess board.

Do not change MovementEngine at all. If you cannot find a way to include this piece in the engine logic, refactor
MovementEngine until you can incorporate this piece and any future ones.

* The generator returns the single possible move for a bishop, regardless of the board limits.
* The generator is covered with unit tests.

### Implement rook

Implement and test RookGenerator as a MovementGenerator that returns a single move forward for a rook, that is, all
horizontal and vertical moves, with the maximum length of the board size.

Do not check for the board limits, MovementEngine needs to remove any moves that do not fit within the chess board.

Do not change MovementEngine at all. If you cannot find a way to include this piece in the engine logic, refactor
MovementEngine until you can incorporate this piece and any future ones.

* The generator returns the single possible move for a rook, regardless of the board limits.
* The generator is covered with unit tests.

### Implement queen

Implement and test QueenGenerator as a MovementGenerator that returns a single move forward for a queen, that is, all
horizontal, vertical, and diagonal moves, with the maximum length of the board size.

Do not check for the board limits, MovementEngine needs to remove any moves that do not fit within the chess board.

Do not change MovementEngine at all. If you cannot find a way to include this piece in the engine logic, refactor
MovementEngine until you can incorporate this piece and any future ones.

* The generator returns the single possible move for a queen, regardless of the board limits.
* The generator is covered with unit tests

### Test the engine

Cover the overall behavior of MovementEngine with tests. Write a test method that uses the given parameter stream in
MovementEngineTest. Start this task only if you are familiar with data driven testing. You can come back after
completing the learning unit about DDT.

* The data-driven tests based on the given parameters run in MovementEngineTest.

### Hints

* All you need to know about chess is how the pieces are allowed to move, withou special moves and all other rules of
  the game. You can just look at the top image at the page shared in the Background materials. Implement the "dot"
  movements only.
* You can implement the generators independently. However, if you notice a chance for logic reuse, try to extract the
  logic into another class that both pieces can use following the SRP.

### Background materials

[How does each piece move](https://www.rookieroad.com/chess/how-does-each-piece-move-0687978/)  
