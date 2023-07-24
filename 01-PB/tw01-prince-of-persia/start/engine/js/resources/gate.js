mapCallbacks["gate1"] = { code: 90, callback: gate1Callback, icon: "fa-solid fa-person-cane" };

function gate1Callback(gameStats) {
  if (gameStats.playerHealth > 99) {
    console.log("You are fit enough to carry the grand prize !");
    return true;
  }
  showMessage(`Player health: ${gameStats.playerHealth}`)
  console.log("You shall not pass !!!\n(until you have 100 health)\n\n\t\t\t\t\t\tGandalf");
  return false;
}
