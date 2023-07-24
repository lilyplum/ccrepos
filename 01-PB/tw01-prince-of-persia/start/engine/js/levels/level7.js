function loadLevel7(existingMap, engineFunctions) {
    const map = getRandomMap();
    engineFunctions.gameStats.playerLocationX = 1;
    engineFunctions.gameStats.playerLocationY = 1;

    existingMap.length = 0;
    existingMap.push(...map);
    window.moveDirection = engineFunctions.moveDirection;
    window.showMessage = engineFunctions.showMessage;
    window.gameMap = JSON.parse(JSON.stringify(map));

    logMap();
    let tick = engineFunctions.tickTime+1;
    setTimeout(() => autoAdvancePrince(map, engineFunctions.gameStats, tick), 500);
}

function autoAdvancePrince(map, gameStats, tick) {
    if (gameStats.isGameRunning) {
        const left = map[gameStats.playerLocationX][gameStats.playerLocationY-1];
        const right = map[gameStats.playerLocationX][gameStats.playerLocationY+1];
        const up = map[gameStats.playerLocationX-1][gameStats.playerLocationY];
        const down = map[gameStats.playerLocationX+1][gameStats.playerLocationY];
        if (window['level2Move'].toString().includes('moveDirection')) {
            console.log('\n\n\nIn this level you can not use the "moveDirection" function directly\n\n\nBut nothing stops you from creating another function that calls "moveDirection" and then calling that function.');
            return;
        }

        window['level2Move'](left, right, up, down);
        setTimeout(
            () => autoAdvancePrince(map, gameStats, tick)
            ,tick
        )
    }
}

function getRandomMap() {
    let map = [
        [13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13],
        [13, 10, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 13],
        [13, 11, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 11, 13],
        [13, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 13],
        [13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13],
    ];
    const insert = (what, where, index) => ([...where.slice(0, index), what , ...where.slice(index, where.length)]);
    const generateRandomNumber = (min, max) => Math.floor(min + Math.random()*(max - min + 1));

    const randomZigZagToAdd = generateRandomNumber(2,4);
    for (let i = 0; i<randomZigZagToAdd; i++) {
        map[4][map[0].length -2 -i*4] = 11;
        map[4][map[0].length -3 -i*4] = 11;
        map[4][map[0].length -4 -i*4] = 11;
        map[4][map[0].length -5 -i*4] = 13;

        map[3][map[0].length -4 -i*4] = 11;
        map[3][map[0].length -5 -i*4] = 11;
        map[3][map[0].length -6 -i*4] = 11;
        map[3][map[0].length -7 -i*4] = 13;
    }

    const randomPathToPrincess = generateRandomNumber(4,9);
    for (let i = 0; i<randomPathToPrincess; i++) {
        map[i+3][map[0].length - 2 - randomZigZagToAdd * 4] = 11;
        map[i+3][map[0].length - 3 - randomZigZagToAdd * 4] = 11;
    }

    const randomPrincessLocationX = generateRandomNumber(0,1);
    const randomPrincessLocationY = generateRandomNumber(0,1);
    map[randomPathToPrincess+1+randomPrincessLocationX][map[0].length - 2 - randomPrincessLocationY - randomZigZagToAdd * 4] = 99;

    const randomHeightToAdd = generateRandomNumber(1,7);
    for (let i=0; i<randomHeightToAdd; i++) {
        map = insert(map[2], map, 2);
    }

    const randomWidthToAdd = generateRandomNumber(1,7);
    for (let i=0; i<randomWidthToAdd; i++) {
        for (let j = 0; j<map.length; j++) {
            map[j] = insert(map[j][3], map[j], 3);
        }
    }

    return map;
}

const getMapCodes = () => {
    const codes = [];
    for (let i=0; i<gameMap.length; i++) {
        for (let j=0; j<gameMap[i].length; j++) {
            if (!codes.includes(gameMap[i][j])) {
                codes.push(gameMap[i][j]);
            }
        }
    }
    return codes;
}

function logMap() {
    const spaces = 3;
    const formatPrint = (toPrint, pattern=' ') => ' '.repeat(spaces - toPrint.toString().length) + toPrint + pattern;
    let toPrint = '\n\n' + ' '.repeat(spaces+1);
    for (let i = 0; i < gameMap[0].length; i++) {
        toPrint += formatPrint(i);
    }
    toPrint += '\n';
    toPrint += ' '.repeat(spaces) + `-`.repeat((spaces+1)*gameMap[0].length);
    for (let i = 0; i < gameMap.length; i++) {
        toPrint += `\n`;
        toPrint += formatPrint(i, '|');
        for (let j = 0; j < gameMap[i].length; j++) {
            toPrint += formatPrint(gameMap[i][j]);
        }
    }

    toPrint += `\n\n\n${' '.repeat(spaces*Math.ceil(gameMap[0].length/2)+spaces)}Legend\n`
    const keys = Object.keys(mapCallbacks);
    const codes = getMapCodes();

    for (let i=0; i<keys.length; i++) {
        if (codes.includes(mapCallbacks[keys[i]].code)) {
            toPrint += `\n${mapCallbacks[keys[i]].code} - ${keys[i]}\n`
        }
    }
    console.log(toPrint);
}



loadLevel(7);
