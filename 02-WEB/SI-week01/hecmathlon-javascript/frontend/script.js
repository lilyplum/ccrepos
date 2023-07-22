const hECMAthlon = {
  getMaxValue: function (input) {
    let maxValues = input.split(",");
    let maxValue = 0;
    for (let i = 0; i < maxValues.length; i++) {
      let tempValue = parseInt(maxValues[i]);
      if (tempValue > maxValue) {
        maxValue = tempValue;
      }
    }
    return [maxValue];
  },

  getGreaterThan: function (input) {
    let greaterValues = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    let greaterNums = [];
    for (let j = 0; j < greaterValues.length; j++) {
      if (greaterValues[j] > parseInt(input)) {
        greaterNums.push(greaterValues[j]);
      }
    }
    return greaterNums;
  },

  fizzBuzz: function (input) {
    let output = [];
    for (let k = 1; k <= parseInt(input); k++) {
      let value;
      if (k % 5 === 0 && k % 3 === 0) value = "FizzBuzz";
      else if (k % 3 === 0) value = "Fizz";
      else if (k % 5 === 0) value = "Buzz";
      else value = k;
      output.push(value);
    }
    return output;
  },
};

function setupEvents() {
  let maxValueButton = document.getElementById("max-value-button");
  let greaterThanButton = document.getElementById("greater-than-button");
  let fizzBuzzButton = document.getElementById("fizz-buzz-button");

  let maxValueInput = document.getElementById("max-value-input");
  let greaterThanInput = document.getElementById("greater-than-input");
  let fizzBuzzInput = document.getElementById("fizz-buzz-input");

  let maxValueContainer = document.getElementById("max-value-container");
  let greaterThanContainer = document.getElementById("greater-than-container");
  let fizzBuzzContainer = document.getElementById("fizz-buzz-container");

  maxValueButton.addEventListener("click", () => {
    let maxValue = getOutput(hECMAthlon.getMaxValue(maxValueInput.value));
    logResult(maxValueContainer, maxValue);
  });

  greaterThanButton.addEventListener("click", () => {
    let greaterValues = getOutput(
      hECMAthlon.getGreaterThan(greaterThanInput.value)
    );
    logResult(greaterThanContainer, greaterValues);
  });

  fizzBuzzButton.addEventListener("click", () => {
    let result = getOutput(hECMAthlon.fizzBuzz(fizzBuzzInput.value));
    logResult(fizzBuzzContainer, result);
  });

  function getOutput(output) {
    let returnValue = ["The function starts"];
    for (let i = 0; i < output.length; i++) {
      returnValue.push(output[i]);
    }
    returnValue.push("The function ends");
    return returnValue;
  }

  function logResult(place, values) {
    while (place.firstChild) {
      place.firstChild.remove();
    }
    for (let j = 0; j < values.length; j++) {
      place.insertAdjacentHTML("beforeend", "<div>" + values[j] + "</div>");
    }
  }
}

setupEvents();
