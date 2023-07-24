function maxDiff(list) {
  if (list.length === 0 || list.length === 1) {
    throw 'List does not have enough elements!';
  }

  let smallestNumber = list[0];
  let largestNumber = list[0];

  for (let i=0; i<list.length; i++) {
    let currentNumber = list[i];

    if (currentNumber < smallestNumber) {
      smallestNumber = currentNumber;
    }
    if (currentNumber > largestNumber) {
      largestNumber = currentNumber;
    }
  }

  return largestNumber - smallestNumber;
}

module.exports = maxDiff
