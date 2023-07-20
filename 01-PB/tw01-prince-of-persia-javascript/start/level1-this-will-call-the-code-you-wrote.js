/*
    ********************************
    *PLEASE DO NOT MODIFY THIS FILE*
    ********************************
*/
setTimeout(() => loadLevel(6), 500);
setTimeout(() => startLevel1(), 2000);

function startLevel1() {
    for (let i = 0; i < 8; i++) {
        let directionToGo = getStairsMovementDirection(i, false);
        moveDirection(directionToGo, `[getStairsMovementDirection(${i}, false)] says to go: ${directionToGo}`);
    }

    for (let i = 0; i < 8; i++) {
        let directionToGo = getStairsMovementDirection(i, true);
        moveDirection(directionToGo, `[getStairsMovementDirection(${i}, true)] says to go: ${directionToGo}`);
    }

    for (let i = 0; i < 10; i++) {
        let directionToGo = getZigZagMovementDirection(i);
        moveDirection(directionToGo, `[getZigZagMovementDirection(${i})] says to go: ${directionToGo}`);
    }
}
