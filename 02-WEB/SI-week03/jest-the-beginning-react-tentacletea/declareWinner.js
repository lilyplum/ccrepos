function declareWinner(fighter1, fighter2, firstAttacker) {
  let firstFighter;
  let secondFighter;

  if (firstAttacker === fighter1.name) {
    firstFighter = fighter1
    secondFighter = fighter2
  } else {
    firstFighter = fighter2
    secondFighter = fighter1
  }

  for (let i=0; i>-1; i++) {
    let isEven = i % 2 == 0;

    if (isEven) {
      secondFighter.health = secondFighter.health - firstFighter.damagePerAttack;

      if (secondFighter.health <= 0) {
        return firstFighter.name
      }
    } else {
       firstFighter.health = firstFighter.health - secondFighter.damagePerAttack;

      if (firstFighter.health <= 0) {
        return secondFighter.name
      }
    }
  }
}

module.exports = declareWinner;
