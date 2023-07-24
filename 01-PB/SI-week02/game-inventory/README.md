# game-inventory

You just started working at a game development company named Eastwood Studios and they decided to create a new
text-based role-playing video game. You are responsible for implementing the inventory system of the game, which stores,
shows, and manages goods the player acquires.

As there are other developers on this project, who implement other parts of the game, it's crucial to use the provided
function names and conform with the requirements to have a working final product. Also note that your git commit
messages communicate your intents to your team-mates, so make sure to write meaningful ones.

What are you going to learn?

* Use JavaScript Object as a key-value store.
* Use loops.
* Print data on console in an organized way.
* Work with files.
* Handle exceptions.

## Tasks

### Display inventory

Write a function named displayInventory(inventory) that takes any possible inventory as an object and displays its
contents.

* Calling the function with a non-empty object argument results in displaying each key, followed by a colon, a space,
  the corresponding value, and a new line.
* Calling the function with an empty object displays nothing.

### Add to inventory

Write a function named addToInventory(inventory, addedItems) that adds the contents of the addedItems list to the
inventory object.

* When the function is called with items that are not in the inventory, the items are added to the inventory with 1 as
  their initial value.
* When the function is called with items that are in the inventory, the value of those items is increased by 1.
* The function can handle multiple occurrences of the same item in addedItems. In this case, the value of the item is
  increased by the number of occurrences.

### Remove from inventory

Write a function named removeFromInventory(inventory, removedItems) that removes the contents of the removedItems list
from the inventory object.

* When the function is called with items which are in the inventory, the values of the keys matching the items are
  decreased by 1.
* If any value in the object becomes 0 or less after decreasing, the corresponding key is removed.
* If the removedItems argument contains multiple occurrences of the same item, object values are decreased by the number
  of occurrences.
* Calling the function with items that are not in the inventory results in no change.

### Print table

Write a function named printTable(inventory, order) that takes an inventory as parameter and displays it in an ordered,
well-organized table with each column right-aligned.

* Calling the function with a non-empty object argument results in displaying a two-column table with all the items,
  where the first column contains the keys and the second column contains the values, similar to the following example.

```
-----------------
item name | count
-----------------
gold coin | 45
arrow | 12
torch | 6
dagger | 2
rope | 1
ruby | 1
-----------------
```

* The printing order can be set with the order parameter in the following way. * empty (by default) means the table is
  unordered * count,desc means the table is ordered by count (of items in the inventory) in descending order * count,asc
  means the table is ordered by count in ascending order

### Import inventory

Write a function named importInventory(inventory, filename) which can import new inventory items from a CSV file.

* The function can handle CSV files containing items in the ruby,rope,ruby,gold coin,ruby,axe format.
* When the function is called with a file in comma separated format (such as rope, torch, arrow), that contains items
  which are not in the inventory, the items are added to the inventory with 1 as their initial value.
* When the function is called with a CSV file containing items which are already in the inventory, the value of those
  items is increased by 1.
* The function can handle if the CSV file contains multiple occurrences of the same item. In that case, inventory values
  are incremented by the number of occurrences.
* If not specified, the filename is import_inventory.csv by default.
* If the file provided in the filename argument is not found, the File '<filename>' not found! error message is
  displayed (remember to use console.error).

### Export inventory

Write a function named exportInventory(inventory, filename) which can export all inventory items to a CSV file.

* Calling the function with a filename argument results in the map entries being saved in CSV format in the file.
* If there are keys in the map with values greater than 1, the key is written to the file a number of times that equals
  the value. For example, if the value of the key torch is 3, torch,torch,torch is written in the file.
* If not specified, the filename is export_inventory.csv by default.
* The file denoted in the filename argument is automatically created if it does not exist. The file is overwritten if it
  already exists.
* If the user executing the function does not have write access in the folder where the script is executed, the You
  don't have permission creating file '<filename>'! error message is displayed (remember to use console.error).

### Hints

* Use the fs.readFileSync(...) function to read the content of a text file.
* Use a for..of loop on Object.entries(myObject) to loop through all key-value pairs in an Object.
* Use string templates to print out variables mixed with text comfortably.
* Feel free to include any code in the main part of the program (outside the functions) during development if you want
  to try your functions. Make sure to remove or comment out these lines before pushing your code.
* Use the public tests of the project to check whether your functions work as intended. Run the test file with npx jest
  gameInventory.test.js to get a detailed output. Note that passing all tests not necessarily means passing all
  requirements.

### Background materials

[JS Objects](/JavascriptObjects.md)  
[Reading files with Node.js](https://nodejs.dev/en/learn/reading-files-with-nodejs/)  
[Control structures](/JavascriptControlFlow.md)  
[Commit messages tutorial](https://www.youtube.com/watch?v=9Siot_y9wY8&ab_channel=goobar)  
[Deep-dive into git commit messages](https://cbea.ms/git-commit/)  
