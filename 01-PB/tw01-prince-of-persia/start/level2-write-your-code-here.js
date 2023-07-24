let direction = 'down'

function move(direction){
    moveDirection(direction);
}
function level2Move(elementLeftOfPrince, elementRightOfPrince, elementUpOfPrince, elementDownOfPrince) {
    if (direction === 'down'){
      if (elementRightOfPrince===11 && elementUpOfPrince===11){
          direction = 'right';
          } 
      else if (elementLeftOfPrince!==13 && elementUpOfPrince===11 && elementDownOfPrince===13){
          direction='left';
      }
      else if (elementDownOfPrince!==13 || elementLeftOfPrince===11){
          return move(direction);
      }
  }

  if (direction === 'right'){
      if (elementUpOfPrince===11 && elementLeftOfPrince===11){
        direction = 'up'; 
        } 
      else if (elementRightOfPrince!==13){
        return move(direction);
    }
  }

  if (direction==='up'){
      if (elementLeftOfPrince===11 && elementDownOfPrince===11){
        direction = 'left'; 
        } 
      else if (elementUpOfPrince!==13){
        return move(direction);
    }
  }

  if (direction==='left'){
      if (elementUpOfPrince!==13 && elementRightOfPrince!==13){
        direction = 'up'; 
        }
      else if (elementDownOfPrince!==13 && elementRightOfPrince===11){
          direction = 'down';
      }
      else if (elementLeftOfPrince!==13){
        return move(direction);
    }
  }

  if (elementDownOfPrince!==13 && elementUpOfPrince!==13 && elementLeftOfPrince!==13){
      return stepDirection('down');
  }
}
