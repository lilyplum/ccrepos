function giveDoor1Answer(firstNumber, secondNumber) {
  /*
  Write the code for the function `giveDoor1Answer` so that
  it answers the secret door's question.
  Be carefull, the secret door always changes the numbers but
  you will be able to access them via the function parameters.

  HINT: Open the browser developer tools to view the question
  */

  console.log(firstNumber);
  console.log(secondNumber);

  let result = (firstNumber**4)/(firstNumber + secondNumber);
  if (result % 1 ===0){
    return result;
  }

  if (result % 1 >= 0){
    return result - result % 1;
  }

}



moveDirection("down");
moveDirection("down");
moveDirection("down");
moveDirection("down");
moveDirection("down");
moveDirection("down");
