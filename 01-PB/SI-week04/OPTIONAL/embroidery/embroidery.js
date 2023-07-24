function drawRectangle(width, height, borderColor = null, fillColor = null, borderWidth = null) {
    matrix = [];
    return matrix;
}

function drawTriangle(height, borderColor = null, fillColor = null) {
    matrix = [];
    return matrix;
}

function drawChristmasTree(blocks, borderColor = null, fillColor = null) {
    matrix = [];
    return matrix;
}

function drawCircle(radius, borderColor = null, fillColor = null) {
    matrix = [];
    return matrix;
}

function embroider(matrix, colorScheme) {
    for (let row of matrix) {
        let line = "";
        for (let cell of row) {
            line += colorScheme[cell];
        }
        console.log(line);
    }
    console.log();
}

const colorScheme = { 0: ' ', 1: '*', 2: '.' }
embroider([[0, 0, 0, 1, 0, 0, 0], [0, 0, 1, 2, 1, 0, 0], [0, 1, 2, 2, 2, 1, 0], [1, 1, 1, 1, 1, 1, 1]], colorScheme)

// This should have the same output:
// embroider(drawTriangle(4, 1, 2), colorScheme)
