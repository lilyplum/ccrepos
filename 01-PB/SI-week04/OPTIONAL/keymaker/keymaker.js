// In node.js: install a prompt library by running: `npm install prompt-sync` in the current folder
const prompt = require("prompt-sync")()

/**
 * shiftCharacters('abby', 5) -> 'fggd'
 */
function shiftCharacters(word, shift) {
    return ""
}

/**
 * padUpTo('abb', 5, 11) -> 'abbfggkllpq'
 */
function padUpTo(word, shift, n) {
    return ""
}

/**
  * abcMirror('abcd') -> 'zyxw'
 */
function abcMirror(word) {
    return ""
}

/**
  * createMatrix('mamas', 'papas') -> ['bpbph', 'mamas', 'bpbph', 'mamas', 'esesk']
 */
function createMatrix(word1, word2) {
    return []
}

/**
 * zigZagConcatenate(['abc', 'def', 'ghi', 'jkl']) -> 'adgjkhebcfil'
 */
function zigZagConcatenate(matrix) {
    return ""
}

/**
 * rotateRight('abcdefgh', 3) -> 'fghabcde'
 */
function rotateRight(word, n) {
    return ""
}

/**
 * getSquareIndexChars('abcdefghijklm') -> 'abej'
 */
function getSquareIndexChars(word) {
    return ""

    /**
     * removeOddBlocks('abcdefghijklm', 3) -> 'abcghim'
     */
    function removeOddBlocks(word, blockLength) {
        return ""
    }

    /**
     * reduceToFixedWord('abcdefghijklm', 6) -> 'bafedc'
     */
    function reduceToFixedWord(word, n) {
        return ""
    }

    /**
     * hashIt('morpheus') -> 'trowdo'
     */
    function hashIt(word) {
        padded = padUpTo(word, 15, 19);
        elogenated = zigZagConcatenate(createMatrix(padded, abcMirror(padded)));
        rotated = rotateRight(elogenated, 3000003);
        cherryPicked = getSquareIndexChars(rotated);
        halved = removeOddBlocks(cherryPicked, 3);
        key = reduceToFixedWord(halved, 6);
        return key;
    }

    const name = prompt("Enter your name! ");
    console.log(`Your key: ${hashIt(name.toLowerCase())}`);
}
