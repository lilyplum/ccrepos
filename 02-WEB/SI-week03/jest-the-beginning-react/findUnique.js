function findUnique(numbers) {
  let firstNumber = numbers[0];
  let secondNumber = numbers[1];
  let defaultNumber;

  if (typeof numbers[0] === 'undefined') {
    throw 'Invalid input';
  }

  if (firstNumber === secondNumber)  {
    defaultNumber = firstNumber;
    for (let i=0; i<numbers.length; i++) {
      let currentNumber = numbers[i];

      if (currentNumber !== defaultNumber) {
        return currentNumber
      }
    }
  } else {
    let thirdNumber = numbers[2];
    
    if (thirdNumber === secondNumber) {
      return firstNumber
    } else {
      return secondNumber
    }
  }
}

module.exports = findUnique;
