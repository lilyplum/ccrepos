function loadLevel1(existingMap, engineFunctions) {
  const map = [
    [12, 12, 12, 12, 12, 12],
    [12, 11, 11, 11, 11, 12],
    [12, 11, 11, 11, 11, 12],
    [12, 11, 12, 11, 11, 12],
    [12, 10, 12, 11, 11, 12],
    [12, 12, 12, 12, 11, 12],
    [12, 99, 12, 12, 11, 12],
    [12, 11, 11, 11, 11, 12]
  ];
  existingMap.push(...map);
  window.moveUp = () => engineFunctions.moveDirection("up");
  window.moveDown = () => engineFunctions.moveDirection("down");
  window.moveLeft = () => engineFunctions.moveDirection("left");
  window.moveRight = () => engineFunctions.moveDirection("right");
}

loadLevel(1);