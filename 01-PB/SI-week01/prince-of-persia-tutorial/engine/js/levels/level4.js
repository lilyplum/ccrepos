function loadLevel4(existingMap, engineFunctions) {
  map = [
    [12, 12, 12, 12, 12, 12, 12, 12],
    [12, 10, 12, 12, 12, 12, 12, 12],
    [12, 11, 11, 12, 12, 12, 12, 12],
    [12, 12, 11, 11, 12, 12, 12, 12],
    [12, 12, 12, 11, 11, 12, 12, 12],
    [12, 12, 12, 12, 11, 11, 12, 12],
    [12, 12, 12, 12, 12, 11, 11, 12],
    [12, 12, 12, 12, 12, 12, 11, 99],
    [12, 12, 12, 12, 12, 12, 12, 12],
  ];
  existingMap.push(...map);
  window.moveDirection = engineFunctions.moveDirection;
}

loadLevel(4);