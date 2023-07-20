const prompt = require("prompt-sync")();
// Implement flowchart "Size" here.

// Give me your size:
const userInput = prompt("Give me your size");

if (userInput <= 10) {
    console.log("Oh this is small");
} else if (userInput <= 90) {
    console.log("The size is medium");
} else {
    console.log("Huh, this is large.");
}
// Based on the input, display
// - Oh, this is small.
// - This size is medium.
// - Huh, this is large.
