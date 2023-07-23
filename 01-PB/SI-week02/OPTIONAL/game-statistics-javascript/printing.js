const reports = require('./reports.js');
const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})

/**
 * Helper function to get input from the users from the command line as a Promise.
 *  
 * @param {string} message Message to print to the user
 */
const input = (message) => {
    return new Promise((resolve, _reject) => {
        readline.question(message, (response) => {
            resolve(response)
        })
    })
}

// Printing functions

function main() {



    // Close input source in the end
    readline.close()
}

if (require.main === module) {
    main()
}