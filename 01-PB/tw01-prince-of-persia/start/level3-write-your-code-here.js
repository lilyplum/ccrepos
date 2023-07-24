/*
    Implement the function `level3Move` below so that the prince can
    reach his beloved princess.

    The 'level3Move' should return an array with a mixture of the words
    'left', 'right', 'up' or 'down'. These words will then be passed as
    parameters to the `moveDirection` function (you do not have access to
    this function in this level).

    The map changes from level to level BUT you have a representation of
    it through the variables `gameMap`.

    HINT: use the BROWSER DEVELOPER TOOLS.
*/

function level3Move(gameMap) {
    console.dir(gameMap);
    debugger
let i=0
let j=0
let bustAMove = []
        for (i; gameMap[i+2][1]!==13; i++){
            bustAMove[i]= "down"
        }

        for (j; gameMap[i+1][j+2]!==13; j++){
            bustAMove[j+i]= "right"
        }
    return bustAMove;
}