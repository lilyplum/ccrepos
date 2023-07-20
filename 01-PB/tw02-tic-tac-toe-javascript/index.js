/// DO NOT MODIFY THESE LINES
const tiles = Array.from(document.querySelectorAll(".tile"));
const playerDisplay = document.querySelector(".display-player");
const resetButton = document.querySelector("#reset");
const announcer = document.querySelector(".announcer");

tiles.forEach((tile, index) => {
    tile.addEventListener("click", () => userAction(tile, index));
});

resetButton.addEventListener("click", resetBoard);

/// WRITE YOUR CODE AFTER THIS LINE
const aiButton = document.querySelector("#ai");
aiButton.addEventListener("click", turnOnAi);

let currentPlayer = "X";
let winningPlayer = null;
let aiPlayer = false;

function checkValidMove(tile) {
    const X = tile.innerText === "X";
    const O = tile.innerText === "O";
    if (X || O) {
        return false;
    }
    return true;
}

function changePlayer() {
    playerDisplay.classList.remove(`player${currentPlayer}`);
    currentPlayer = currentPlayer === "X" ? "O" : "X";
    playerDisplay.innerText = currentPlayer;
    playerDisplay.classList.add(`player${currentPlayer}`);
}

function getWinningPlayer() {
    const winConditions = [
        //rows
        [0, 1, 2],
        [3, 4, 5],
        [6, 7, 8],
        //columns
        [0, 3, 6],
        [1, 4, 7],
        [2, 5, 8],
        //diagonals
        [0, 4, 8],
        [2, 4, 6]
    ]
    
    for (let i = 0; i < winConditions.length; i++) {
        const currentWinCond = winConditions[i];
        const firstTileValue = tiles[currentWinCond[0]].innerText;

        if (firstTileValue === "") continue;

        const SecondTileComparison = firstTileValue === tiles[currentWinCond[1]].innerText;
        const ThirdTileComparison = firstTileValue === tiles[currentWinCond[2]].innerText;

        if (SecondTileComparison && ThirdTileComparison) {
            return firstTileValue;
        }
    }
    return null;
}

function checkWin() {
    winningPlayer = getWinningPlayer();

    if (winningPlayer) {
        announcer.classList.remove("hide");
        announcer.innerText = `Player ${winningPlayer} has won`;
    }

    if (isBoardFull() && !winningPlayer) {
        announcer.classList.remove("hide");
        announcer.innerText = `It"s a tie`;
    }
}

function userAction(tile) {
    if (winningPlayer) {
        return;
    }

    if (checkValidMove(tile)) {
        tile.innerText = currentPlayer;
        tile.classList.add(`player${currentPlayer}`);

        if (aiPlayer) {
            checkWin();
            changePlayer();
            getRandomAiMove();
        }
        
        checkWin();
        changePlayer();
    }
}

function resetBoard() {
    for (let i = 0; i < tiles.length; i++) {
        tiles[i].innerText = "";
        tiles[i].classList = "tile";
    }
    winningPlayer = null;
    announcer.classList.add("hide");
    playerDisplay.classList.remove(`player${currentPlayer}`);
    playerDisplay.innerText = "X";
    playerDisplay.classList.add(`playerX`);
    currentPlayer = "X"

    if (aiPlayer) {
        announcer.classList.remove("hide");
        announcer.innerText = `epicAI is on`;
    }
}

function isBoardFull() {
    for (let i = 0; i < tiles.length; i++) {
        if (tiles[i].innerText === "") {
            return false;
        }
    }
    return true;
}

function turnOnAi() {
    aiPlayer = !aiPlayer;
    if (aiPlayer) {
        announcer.classList.remove("hide");
        announcer.innerText = `epicAI is on`;
    } else {
        announcer.classList.add("hide")
    }
}

function getRandomAiMove() {
    const randomInteger = Math.floor(Math.random() * 9);
    const currentTile = tiles[randomInteger];
    if (!isBoardFull() && !getWinningPlayer()) {
        if (checkValidMove(currentTile)) {
            currentTile.innerText = currentPlayer;
            currentTile.classList.add(`player${currentPlayer}`);
        } else {
            getRandomAiMove();
        }
    }
}

function getUnbeatAbleAiMove() {

}
