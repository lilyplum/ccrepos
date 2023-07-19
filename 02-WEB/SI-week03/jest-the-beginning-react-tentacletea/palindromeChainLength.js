function reverseNumber(number) {
  let numberAsString = "" + number;
  let numberAsArray = numberAsString.split("");
  let numberAsArrayReversed = numberAsArray.reverse();
  let numberAsStringReversed = numberAsArrayReversed.join("");
  return parseInt(numberAsStringReversed);
}

function isPalindrome(number) {
  let numberReversed = reverseNumber(number);
  return number === numberReversed;
}

function palindromeChainLength(number) {
  if (isPalindrome(number)) {
    return 0;
  }

  let stepCounter = 0;
  let baseNumber = number;
  let reversedNumber = null;

  for (let i=0; i<100;  i++) {
    stepCounter++;
    reversedNumber = reverseNumber(baseNumber);
    let resultOfAddition = baseNumber + reversedNumber;
    if (isPalindrome(resultOfAddition)) {
      return stepCounter;
    } else {
      baseNumber = resultOfAddition;
    }
  }

  throw 'Number is too big or a Lychrel number!';
}

module.exports = {
  reverseNumber,
  isPalindrome,
  palindromeChainLength
};
