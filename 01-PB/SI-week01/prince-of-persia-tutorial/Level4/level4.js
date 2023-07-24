/*
  Move the prince through the maze to find the princess.
  You can move the prince by calling the already created function
  `moveDirection` and passing the STRING as PARAMETER
  `left`
  `right`
  `up`
  `down`.
  Extra challenge: change the value of the variable `direction`
  to be either `down` or `right` using an `if` statement based on
  the value of the variable `turn`

  HINT: Open the browser developer tools to see what is happening in
  each turn.
*/

let turn ='down'
for (let i = 0; i <= 12;i++){

  if (turn ==='down'){
    moveDirection('down');
    turn = 'right';
  }
  else {
    moveDirection('right');
    turn = 'down';
  }

}