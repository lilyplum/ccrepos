mapCallbacks["manualControlOn"] = { code: 41, callback: manualControlOnCallback, icon: "fa-solid fa-keyboard" };

function manualControlOnCallback(gameStats) {
  console.log("You can now manually control the player through the keyboard.");
  document.body.addEventListener("keydown", (event) => {
    if (gameStats.isGameRunning)
    {
        try {
            manuallyControl(event.code);
        } catch (e) {
            console.log(`You haven't implemented the function for moving!`);
            console.log(e);
        }
    }
  });

  return true;
}
