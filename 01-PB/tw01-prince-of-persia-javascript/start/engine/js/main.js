/*
    ********************************
    *PLEASE DO NOT MODIFY THIS FILE*
    ********************************
*/
(() => {
    const tickTime = 100;
    let lastCallTime = 0;
    const commandQueue = [];
    const gameStats = {
        playerLocationX: 0,
        playerLocationY: 0,
        playerHealth: 3,
        isGameRunning: true
    };
    let map = [];
    const mapCallbacks = {
        "prince": { code: 10, callback: () => true, icon: "fa-solid fa-person-running" },
        "free-space": { code: 11, callback: () => true, icon: "" },
        "wall": { code: 12, callback: () => { console.log("Can not go through wall!"); return false; }, icon: "fa-solid fa-border-all" },
        "princess": { code: 99, callback: (game) => { alert("YOU WON !!! Hit F5 to play Again!"); game.isGameRunning = 0; return 0; }, icon: "fa-solid fa-face-grin-hearts" },
    };
    const directionCoordinates = {
        "down": { x: +1, y: 0 },
        "up": { x: -1, y: 0 },
        "left": { x: 0, y: -1 },
        "right": { x: 0, y: +1 }
    }

    function potionCallback(configuration) {
        let allowMove = false;
        let input = configuration.randomInputCallback();
        let question = configuration.question;
        input.forEach((item, iterator) => {
            question = question.replace(`{{${iterator+1}}}`, `|${item}|`);
        })
        console.log(question);
        try {
            const answerFromStudentImplementation = window[configuration.studentImplementationCallback](...input);
            const correctAnswer = configuration.answerCallback(...input);
            if (answerFromStudentImplementation === correctAnswer) {
                console.log(`|${answerFromStudentImplementation}| is correct, here is your vitality potion !`);
                allowMove = true;
                gameStats.playerHealth += configuration.rewardPoints;
                showMessage(`Player health: ${gameStats.playerHealth}`);
            } else {
                console.log(`Function |${configuration.studentImplementationCallback}| returned |${answerFromStudentImplementation}|, but |${correctAnswer}| was expected :(`);
            }
        } catch (e) {
            console.log(`You have an error in the implementation of the function |${configuration.studentImplementationCallback}|`);
            if (!window[configuration.studentImplementationCallback]) {
                console.log(`You have not implemented the function |${configuration.studentImplementationCallback}|`)
            } else {
                console.log(e);
            }
        }
        return allowMove;
    }

    function initMap(map) {
        const htmlMap = document.getElementById("container")
        htmlMap.style.gridTemplateColumns = `${"1fr ".repeat(map[0].length)}`
        htmlMap.innerHTML = "<i></i>".repeat(map.length * map[0].length);
    }

    function getMapIconFor(label) {
        const found = Object.values(mapCallbacks).find(c => c.code === label);
        return found ? found.icon : "empty";
    }

    function render(map) {
        const cells = document.querySelectorAll("#container > i");
        for (let i = 0; i < map.length; i++) {
            for (let j = 0; j < map[i].length; j++) {
                cells[i * map[0].length + j].className = getMapIconFor(map[i][j]);
            }
        }
    }

    function movePlayer(direction, message) {
        if (!gameStats.isGameRunning) {
            return;
        }
        message && console.log(message);

        try {
            const proposedLocationX = directionCoordinates[direction].x + gameStats.playerLocationX;
            const proposedLocationY = directionCoordinates[direction].y + gameStats.playerLocationY;
            if (!map[proposedLocationX] || !map[proposedLocationX][proposedLocationY]) {
                console.log("Can't go outside edges");
                return;
            }

            const proposedDestinationAction = Object.values(mapCallbacks).find(c => c.code === map[proposedLocationX][proposedLocationY]);
            if (!proposedDestinationAction) {
                console.log(`You haven't loaded the right level, can not find action for map code: ${map[proposedLocationX][proposedLocationY]}`);
                gameStats.isGameRunning = false;
                return;
            }
            const allowMove = proposedDestinationAction.callback(gameStats);

            if (gameStats.playerHealth < 1) {
                alert("You died, press F5 to play again.");
                gameStats.isGameRunning = false;
                return;
            }

            if (allowMove) {
                map[gameStats.playerLocationX][gameStats.playerLocationY] = mapCallbacks["free-space"].code;
                gameStats.playerLocationX = proposedLocationX;
                gameStats.playerLocationY = proposedLocationY;
                map[gameStats.playerLocationX][gameStats.playerLocationY] = mapCallbacks["prince"].code;
                render(map);
            }
            return gameStats;
        }
        catch (e) {

        }
    }

    function executeDelayedCommandQueue() {
        setInterval(() => {
            if (commandQueue.length > 0) {
                commandQueue[0]();
                commandQueue.shift()
            }
        }, tickTime)
    }

    function showMessage(message) {
        document.getElementById("messageBox").innerHTML = message;
    }

    function startGame() {
        initMap(map);
        setTimeout(() => render(map), 500);
        executeDelayedCommandQueue();
    }

    function moveDirection(direction, message) {
        const now = (new Date()).getTime();
        if (now - lastCallTime < 50) {
            commandQueue.push(() => movePlayer(direction, message));
        } else {
            movePlayer(direction, message);
        }
        lastCallTime = now;
    }

    function setPlayerCoordinates(map) {
        for (let i = 0; i < map.length; i++) {
            for (let j = 0; j < map[i].length; j++) {
                if (map[i][j] === mapCallbacks["prince"].code) {
                    gameStats.playerLocationX = i;
                    gameStats.playerLocationY = j;
                }
            }
        }
    }

    function loadLevel(number) {
        const loaderFunction = window[`loadLevel${number}`];
        if (!loaderFunction) {
            console.log(`That level does not exist: ${number}`);
        }
        loaderFunction(map, {
            moveDirection,
            showMessage,
            potionCallback,
            gameStats,
            tickTime
        });
        setPlayerCoordinates(map);
        startGame();
    }

    window.loadLevel = loadLevel;
    window.mapCallbacks = mapCallbacks;
})();
