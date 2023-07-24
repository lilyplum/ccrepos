function loadLevel5(existingMap, engineFunctions) {
  map = [
    [12, 12, 12, 12, 12],
    [12, 12, 10, 12, 12],
    [12, 12, 11, 12, 12],
    [12, 12, 11, 12, 12],
    [12, 12, 20, 12, 12],
    [12, 12, 11, 12, 12],
    [12, 12, 99, 12, 12],
  ];

  existingMap.push(...map);
  window.moveDirection = engineFunctions.moveDirection;
  window.potionCallback = engineFunctions.potionCallback;
}

loadLevel(5);