let boardIcons = [];
let map = level1;
let counterNut = 0;
let counterWorm = 0;

let currentIndex = 18 * map[0].length + 6;

let bugIndex = 5 * map[0].length +14;
let bugStatus = true;

let spiderIndex = 4 * map[0].length + 14;
let spiderStatus = true;

let mosquitoIndex = 6 * map[0].length + 14;
let mosquitoStatus = true;

let playerStat = 3;
let gameStatus = null;

let timerId;
let currentTime = 100;

const BTN_START_GAME = document.getElementById("btn-start-game");
const BOARD = document.getElementById("startBox");
const BTN_INTRO = document.getElementById("btn-intro");
const INTRO = document.getElementById("intro");
const GET_INPUT_NAME = document.getElementById("input-start-game");
const GET_INPUT_RACE = document.getElementById("playerRace");
const playerStats = document.getElementById("playerStats");
const timeLeft = document.getElementById("timeLeft");

INTRO.hidden = true;
BTN_START_GAME.hidden = true;

BTN_START_GAME.addEventListener("click", start);
BTN_INTRO.addEventListener("click", setIntro);

playerStats.hidden = true;
timeLeft.hidden = true;

function setIntro() {
    BTN_INTRO.hidden = true;
    BTN_START_GAME.hidden = false;

    INTRO.hidden = false;
    INTRO.innerText = `Hello ${GET_INPUT_NAME.value} (${GET_INPUT_RACE.value})! You are a proud chick parent and your chicks love you very much!
    Unfortunately you have hurt your wing while looking for food, now you have to climb back to your nest.
    On the way back you will encounter challenges you will have to master.
    Your chicks are hungry, hurry!
    
    (move with W, A, S, D)`;

    GET_INPUT_NAME.hidden = true;
    GET_INPUT_RACE.hidden = true;
}

function start() {
    playerStats.hidden = false;
    timeLeft.hidden =false;
    gameStatus = true;

    if (gameStatus) {
        document.body.addEventListener("keydown", movePlayer);
    }

    initBoard(map);
    startTimer();
}

function startTimer() {
    if (timerId) {
        clearInterval(timerId);
    } else {
        timerId = setInterval(randomEnemyMove, 1000);

    }
}

function initBoard(map) {
    BOARD.classList.add("map-grid");
    if (map === level1) {
        BOARD.classList.add("level1");
    } else if (map === level2) {
        BOARD.classList.remove("level1");
        BOARD.classList.add("level2");
    } else {
        BOARD.classList.remove("level2");
        BOARD.classList.add("level3");
    }
    BOARD.style.gridTemplateColumns = `${"1fr ".repeat(map[0].length)}`
    BOARD.style.gridTemplateRows = `${"1fr ".repeat(map.length)}`
    BOARD.innerHTML = "<div></div>".repeat(map.length * map[0].length);
    boardIcons = document.querySelectorAll("#startBox > div");
    getMapIcons();
    _updateStats(playerStat, counterNut, counterWorm);
    playerSpawnPos();
    enemeySpawnPos();
    randomEnemyMove();
}

function getMapIcons() {
    for (let i = 0; i < map.length; i++) {
        for (let j = 0; j < map[i].length; j++) {

            if (map[i][j] === 21) {


                let img = document.createElement("img");
                img.src = "project_vogel_img/hazelnut.png";
                img.alt = "nut";
                boardIcons[i * map[0].length + j].appendChild(img);
            }

            if (map[i][j] === 22) {
                let img = document.createElement("img");
                img.src = "project_vogel_img/worm.png";
                img.alt = "worm";
                boardIcons[i * map[0].length + j].appendChild(img);
            }

            if (map[i][j] === 31) {
                boardIcons[i * map[0].length + j].classList.add("b_left");
            }

            if (map[i][j] === 32) {
                boardIcons[i * map[0].length + j].classList.add("b_right");
            }

            if (map[i][j] === 34) {
                boardIcons[i * map[0].length + j].classList.add("inner_wall");
            }

            if (map[i][j] !== 55 && map[i][j] !== 31 && map[i][j] !== 32 && map[i][j] !== 34 && map[i][j] !== 11) {
                boardIcons[i * map[0].length + j].classList.add("bg_tree");
            }

            if (map[i][j] === 55) {
                boardIcons[i * map[0].length + j].classList.add("outside");
            }

            if (map[i][j] === 41) {
                let img = document.createElement("img");
                img.src = "project_vogel_img/squirrel.png";
                img.alt = "squirrel"
                boardIcons[i * map[0].length + j].appendChild(img);
                boardIcons[i * map[0].length + j].classList.add("squirrel");
            }

            if (map[i][j] === 42) {
                let img = document.createElement("img");
                img.src = "project_vogel_img/owl.png";
                img.alt = "owl"
                boardIcons[i * map[0].length + j].appendChild(img);
                boardIcons[i * map[0].length + j].classList.add("owl");
            }
        }
    }
}

function playerSpawnPos() {
    let startingPosition1 = 18 * map[0].length + 6;
    let startingPosition2 = 19 * map[0].length + 13;
    //if lvl 1 else lvl 2/3 spawn
    if (map === level1) {
        updatePlayerPos(startingPosition1);
    } else {
        currentIndex = startingPosition2;
    }
}

function enemeySpawnPos() {
    let bugStartingPos = 5 * map[0].length +14;
    let spiderStartingPos =  4 * map[0].length + 14;
    let mosquitoStartingPos = 6 * map[0].length + 14;

    if (map === level1) {
        updateBugPos(bugStartingPos);
    } else if (map === level2) {
        updateSpiderPos(spiderStartingPos);
        updateMosquitoPos(mosquitoStartingPos);
    }
}

function updateBugPos(enemyIndex) {
    let img = document.createElement("img");
    img.src = `project_vogel_img/bug.png`
    img.alt = "bug";
    boardIcons[enemyIndex].appendChild(img);
    boardIcons[enemyIndex].classList.add("bug");

}

function updateSpiderPos(enemyIndex) {
    let imgSpider = document.createElement("img");
    imgSpider.src = "project_vogel_img/spider.png";
    imgSpider.alt = "spider"
    boardIcons[enemyIndex].appendChild(imgSpider);
    boardIcons[enemyIndex].classList.add("spider");
}

function updateMosquitoPos(enemyIndex) {
    let imgMosq = document.createElement("img");
    imgMosq.src = "project_vogel_img/mosquito.png";
    imgMosq.alt = "mosq";
    boardIcons[enemyIndex].appendChild(imgMosq);
    boardIcons[enemyIndex].classList.add("mosquito");
}

function updatePlayerPos(currentPosition) {
    let img = document.createElement("img");
    img.src = `project_vogel_img/${GET_INPUT_RACE.value.toLowerCase()}.png`;
    boardIcons[currentPosition].appendChild(img);
}

function checkObject(currentIndex) {
    if (boardIcons[currentIndex].firstElementChild !== null) {
        let alt = boardIcons[currentIndex].firstElementChild.alt;
        if (alt === "nut" || alt === "worm") {
            collectItem(alt);
        }

        if (alt === "squirrel") {
            if (counterNut >= 3) {
                alert("I am delighted, thank you!");
                counterNut -= 3;
                map = level2;
                initBoard(map);

            } else {
                alert(`Hello ${GET_INPUT_NAME.value}, I have collected nuts for the winter have you seen them ? If you bring me three of them I will let you pass.`)
            }
        }

        if (alt === "owl") {
            if (counterWorm >= 3) {
                alert("Thank you, I can finally eat.");
                counterWorm -= 3;
                map = level3;
                initBoard(map);
            } else {
                alert(`Hello ${GET_INPUT_NAME.value}, do you have any worms for me ? Even an owl like me gets hungry. Bring me three worms then I'll let you pass.`)
            }
        }

        if (alt === "bug") {
            let questionAndPlayersInput = prompt("How many Codecool locations are there in vienna (2022)? (Type in A or B)", "A: 1, B: 3");
            let playerAnswer = questionAndPlayersInput;

            if (playerAnswer !== "A") {
                playerStat -= 1;
                _updateStats(playerStat, counterNut, counterWorm);
            } else {
                bugStatus = false;
                boardIcons[currentIndex].firstElementChild.remove();
                boardIcons[currentIndex].classList.remove("bug");
            }
        }

        if (alt === "spider") {
            let questionAndPlayersInput = prompt("What's a loop? (Type in A or B)", "A: for (...), B: let ...");
            let playerAnswer = questionAndPlayersInput;

            if (playerAnswer !== "A") {
                playerStat -= 1;
                _updateStats(playerStat, counterNut, counterWorm);
            } else {
                spiderStatus = false;
                boardIcons[currentIndex].firstElementChild.remove();
                boardIcons[currentIndex].classList.remove("spider");
            }
        }

        if (alt === "mosq") {
            let questionAndPlayersInput = prompt("What is an array? (Type in A or B)", "A: list of elements, B: a set");
            let playerAnswer = questionAndPlayersInput;

            if (playerAnswer !== "A") {
                playerStat -= 1;
                _updateStats(playerStat, counterNut, counterWorm);
            } else {
                mosquitoStatus = false;
                boardIcons[currentIndex].firstElementChild.remove();
                boardIcons[currentIndex].classList.remove("mosquito");
            }
        }
    }
}

function checkForHindrance(currentIndex) {
    let classText = boardIcons[currentIndex].classList;
    let str = classText.toString();
    let pattern = /inner_wall|b_left|b_right|outside|squirrel|owl|bug|spider|mosquito/i;
    return (str.match(pattern) === null ? false : true);
}

function collectItem(alt) {
    boardIcons[currentIndex].firstElementChild.remove();
    if (alt === "nut") {
        counterNut += 1;
    } else {
        counterWorm += 1;
    }
}

function _updateStats(playerStatText, counterNut, counterWorm) {
    playerStats.innerText = `Life = ${playerStatText} Nuts = ${counterNut} Worms = ${counterWorm}`;
}

function movePlayer(e) {
    if (gameStatus === false) {
        return;
    }
    boardIcons[currentIndex].innerHTML = "";
    switch (e.keyCode) {
        // A key
        case 65:
            currentIndex -= 1;
            checkObject(currentIndex);
            if (checkForHindrance(currentIndex)) {
                currentIndex += 1;
                updatePlayerPos(currentIndex);
                return;
            }
            break;

        // D key
        case 68:
            currentIndex += 1;
            checkObject(currentIndex);
            if (checkForHindrance(currentIndex)) {
                currentIndex -= 1;
                updatePlayerPos(currentIndex);
                return;
            }
            break;

        // W key
        case 87:
            currentIndex -= map[0].length;
            checkObject(currentIndex);
            if (checkForHindrance(currentIndex)) {
                currentIndex += map[0].length;
                updatePlayerPos(currentIndex);
                return;
            }
            break;

        // S key
        case 83:
            currentIndex += map[0].length;
            checkObject(currentIndex);
            if (checkForHindrance(currentIndex)) {
                currentIndex -= map[0].length;
                updatePlayerPos(currentIndex);
                return;
            }
            break;
    }
    _updateStats(playerStat, counterNut, counterWorm);
    updatePlayerPos(currentIndex);
}

//TODO, if player stands still and enemy moves into player
function randomEnemyMove() {
    currentTime--;
    timeLeft.innerText = `Time left: ${currentTime}`;
    boardIcons = document.querySelectorAll("#startBox > div");

    const randomMoveOne = Math.floor(Math.random() * 2);
    const randomMoveTwo = Math.floor(Math.random() * 4);

    const left = -1;
    const right = +1;
    const up = - map[0].length;
    const down = + map[0].length;

    moves = [
        left,
        right,
        up,
        down,
    ]

    if (map === level1 && bugStatus) {
        boardIcons[bugIndex].innerHTML = "";
        boardIcons[bugIndex].classList.remove("bug");
        bugIndex += moves[randomMoveOne];
        if (checkForHindrance(bugIndex)) {
            boardIcons[bugIndex].classList.remove("bug");
            bugIndex -= moves[randomMoveOne];
        }
        updateBugPos(bugIndex);

    } else if (map === level2) {

        if (spiderStatus) {
            boardIcons[spiderIndex].innerHTML = "";
            boardIcons[spiderIndex].classList.remove("spider");
            spiderIndex += moves[randomMoveTwo];
            if (checkForHindrance(spiderIndex)) {
                boardIcons[spiderIndex].classList.remove("spider");
                spiderIndex -= moves[randomMoveTwo];
            }
            updateSpiderPos(spiderIndex);
        }


        if (mosquitoStatus) {
            boardIcons[mosquitoIndex].innerHTML = "";
            boardIcons[mosquitoIndex].classList.remove("mosquito");
            mosquitoIndex += moves[randomMoveOne]
            if (checkForHindrance(mosquitoIndex)) {
                boardIcons[mosquitoIndex].classList.remove("mosquito");
                mosquitoIndex -= moves[randomMoveOne];
            }
            updateMosquitoPos(mosquitoIndex);
        }
    }
    _gameOver();
}

//TODO Lose condition, unfinished
function _gameOver() {
    if(playerStat === 0 || currentTime === 0) {
        gameStatus = false;
        const endBox = document.getElementById("endBox")
        BOARD.innerHTML= "";
        endBox.classList.remove("is-hidden")
        endBox.innerText = "You lost :(";
        clearInterval(timerId);
    }
}

//TODO Random ItemSpawnPoints
function randomItemSpawns() {
    //idea
    //list of spawnpoints
    //gen random number 
    //spawnPoints[3]
    let startingPos;//(randomnumber instead of 5) * map[0].length + (randomnumber instead of 14);

}

/* function checkForEnemy() {
    let classText = boardIcons[currentIndex].classList;
    let str = classText.toString();
    let pattern = /bug|spider|mosquito/i;
    console.log(str.match(pattern));

    if (str.match(pattern)) {
        checkObject();
    }
}
*/

////////////////////////////////// PRE-WRITTEN CODE //////////////////////////////////
// /**
//  * Code to run when the player hits restart.
//  * 
//  * Makes sure that the proper boxes are visible.
//  */
// function _restart() {
//     const msgBox = document.getElementById("startBox")
//     msgBox.classList.remove("is-hidden")
//     const endBox = document.getElementById("endBox")
//     endBox.classList.add("is-hidden")
//     init()
// }
//init();