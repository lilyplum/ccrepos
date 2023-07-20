mapCallbacks["fire"] = { code: 13, callback: potion1Callback, icon: "fa-solid fa-fire" };

function potion1Callback(gameStats) {
    console.log("You entered in the fire and died a terrible death :( ");
    gameStats.playerHealth = 0;
    gameStats.isGameRunning = 0;
    return false;
}
