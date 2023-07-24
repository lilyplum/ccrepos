# Game statistics

You are a software architect at game development company named Eastwood Studios. Judy, a colleague from sales, asks you
to help her in a competitor evaluation project. She has lots of data files with statistical information about famous
games of all time. Judy has some unanswered questions about the games and expects you to write a program that can answer
these questions.

There is an additional request: Judy likes to explore the data manually, and for that she needs a simple terminal
interface where she can pick her questions, type the required inputs, and get the answer printed on the screen. On the
other hand, there are many files that need to be processed, so you also need a way to answer the questions
programmatically and save them into a target file.

Since you are an architect, you cannot help but use a modular structure, where no code is duplicated, and the
responsibilities are strictly separated. So you decide to create three modules: reports, printing, and export to cover
all the requested features.

What are you going to learn?

* Use multiple files.
* Conform to test requirements.
* Filter data.
* Work with files.
* Handle exceptions.
* Follow clean code practices.

## Tasks

### Count games

"How many games are in the file?" asks Judy. Implement countGames(fileName) to answer this question. The expected output
of the function is a number.

* The function returns the number of games (as an integer), based on the data file.

### Year check

"Is there a game from a given year?" asks Judy. Implement decide(fileName, year) to answer this question. The expected
output of the function is a boolean value.

* The function returns true or false to answer the question, based on the data file.

### Latest game

"Which is the latest game?" asks Judy. Implement getLatest(fileName) to answer this question. The expected output of the
function is the title of the latest game. If there is more than one, return the first title from the file.

* The function returns the title that answers the question, based on the data file

### Count games by genre

"How many games are in the file by genre?" asks Judy. Implement countByGenre(fileName, genre) to answer this question.
The expected output of the function is an integer.

* The function returns the number of games in the given genre (as an integer), based on the data file.

### Line number by title

"What is the line number of a given title?" asks Judy. Implement getLineNumberByTitle(fileName, title) to answer this
question, based on the data file. The expected output of the function is an integer. If the title is not found, throw an
Error with the following text: 'No such game!'.

* The function returns the number of line of the given (as an integer) title, based on the data file.
* The function throws an Error with the text "No such game!" if the title is not found in the data file

### List titles sorted

"Can you give me the alphabetically ordered list of the titles?" asks Judy. Implement sortABC(fileName) to answer this
question based on the given data file. The expected output of the method is an array of titles.

* The function returns the sorted array of the titles based on the given data file

### Get genres

"Which genres occur in the data file?" asks Judy. Implement getGenres(fileName) to answer this question based on the
given data file. The expected output of the method is an array of the genres without duplicates, in alphabetical order.

* The method returns the sorted array of the unique genres based on the given data file.

### Top selling FPS

"What is the release year of the top selling first-person shooter game?" asks Judy. Implement whenWasTopSoldFPS(
fileName) to answer this question based on the given data file. The expected output of the function is the year of the
release (as an integer). If there is no first-person shooter game in the data file, an Error with text "There is no FPS
game!" is thrown.

* The function returns the release year of the top selling first-person shooter game based on the given data file.
* The function throws an Error with the text "There is no FPS game!" if the FPS genre is not found in the given data
  file.

### Modularity

The three modules share the responsibilities as described in the introduction: Reports contains the functions providing
the answers, Printing asks for user input and prints output to the terminal, Export gets the required input parameters
as command line arguments, then saves the results. The latter two modules call the core functions of reports.

* The Reports modules does not ask for user input and does not print anything.
* The Printing module asks for user input, first for the name of a data file, then it goes through all the questions,
  asks for the extra arguments, and prints the results to the screen.
* The Printing module does not exit on the exceptions of reports. It handles them and communicates them to the user.
* The Printing module does not implement the answers themselves but imports Report's functions (and does not import
  Export's functions).
* The Export module needs command line arguments in this form: sourceFileName targetFileName inputYear inputGenre
  inputTitle where the last 3 are arguments for questions #2, #4, and #5, respectively. The results are saved into a
  file targetFileName, the individual answers written into new lines. Clarification: first write games filtered just by
  the provided year, then write games filtered just by the provided genre, and after that write games filtered just by
  the provided title.
* The Export module does not exit on the exceptions of reports. It handles them and sends informative text snippets to
  the output instead.
* The Export module does not implement the answers themselves but imports Report's functions (and does not use
  Printing's functions).

### General requirements
* Variable names in the program are meaningful, non-abbreviated nouns.
* Function names in the program are meaningful, non-abbreviated verbs.
* There are no unnecessary (dead) code parts or comments in the program.
* There are no duplicate code parts or code parts doing the same thing differently in the program.
* There are no functions doing more than one thing in the program.
* There are no external imports in the program.
* No built-in sorting methods, like sort have been used in the code.
### Hints
* Check your code by running test.js after implementing each function.
* Keep in mind: Don't repeat yourself! When a piece of code appears in multiple locations, try to extract it into a function.
* Add some abstraction if it helps you to reduce the code (such as using parameters to unify similar snippets in one function).
* Your functions need to process any input files with the same structure as game_stat.txt. Every line contains the title, the copies sold (in millions), the release year, the genre, and the publisher of a popular computer game. The columns are separated by tab characters, such as Minecraft⟶23⟶2009⟶Survival game⟶Microsoft↲. Create files with the same structure but different data and test your solution on them.
* Avoid magic numbers.
* Command line arguments separated by space by default. To provide a single command line argument that contains space, put it between quotation marks, such as "Electronic Arts".
* You can safely assume, that all inputs coming from the user are valid, so there's no need to implemented input validation everywhere.
* Node.js can help us to write applications for the command line, browsers can not load files from the filesystem.

