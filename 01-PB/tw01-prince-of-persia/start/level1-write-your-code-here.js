function getStairsMovementDirection(stairNumber, isClimbingStairs) {
   /*
    if (isClimbingStairs === false){
        if (stairNumber%2 === 0){
            return 'down';
        } else {
            return 'right';
        }
    } else {
        if (stairNumber%2 === 0){
            return 'up';
        } else {
            return 'right';
        }
    }
    */
    if (stairNumber%2 === 0 && isClimbingStairs===false) {
        return "down"
    } else if (stairNumber%2 !==0) {
        return "right"
    } else if (stairNumber%2 === 0 && isClimbingStairs === true){
        return "up"
    }
}

function getZigZagMovementDirection(step) {
    if (step%6 === 0){
        return 'up';
    } else if (step%3 === 0){
        return 'down';
    } else {
        return 'right';
    }    
}

//First try
//let useArrowKey = true;

const moveDirectionsWASD = {
    KeyW: 'up',
    KeyS: 'down',
    KeyA: 'left',
    KeyD: 'right'
  }
  
const moveDirectionArrow = {
      ArrowUp: 'up',
      ArrowDown: 'down',
      ArrowLeft: 'left',
      ArrowRight: 'right'
  }
  
let useArrowKeys = false;

function manuallyControl(key) {
    /* First try 
    if (key === 'KeyQ'){
        useArrowKey = !useArrowKey;
    }

    if (useArrowKey){
        if (key === 'KeyA'){
            moveDirection('left');
        }

        if (key === 'KeyD'){
            moveDirection('right');
        }

        if (key === 'KeyW'){
            moveDirection('up');
        }

        if (key === 'KeyS'){
            moveDirection('down');
        }
    } else {
        if (key === 'ArrowLeft'){
            moveDirection('left');
        }

        if (key === 'ArrowRight'){
            moveDirection('right');
        }

        if (key === 'ArrowUp'){
            moveDirection('up');
        }

        if (key === 'ArrowDown'){
            moveDirection('down');
        }
    }
    */
    if (key === 'KeyQ'){
        useArrowKeys = !useArrowKeys;
    }

    const directionMap = useArrowKeys ? moveDirectionArrow : moveDirectionsWASD;
    
    if (key in directionMap) {
        moveDirection(directionMap[key]);
    }
    console.log(`[manuallyControl] received key pressed: ${key}`);
}

function givePotion2Answer(list) {
    //sum of even numbers in the list
    /*
    const even = list.filter(number => {
        return number % 2 === 0;
    });

    const sum = even.reduce((accumulator, value) => {
        return accumulator + value;
    }, 0);

    return sum;
    */

    let result = 0;
    for (let i=0; i<list.length;i++){
        if (list[i]%2===0){
            result += list[i];
        }
    }
    return result;
}

function givePotion3Answer(list) {
    let result = 0;
    for (let i=0; i<list.length;i++){
        if (result<list[i]){
            result = list[i];
        }
    }
    return result;
}

function givePotion4Answer(input, toCapitalize) {    
    let result = '';
    for (let i=0; i<input.length; i++){
        let shouldCapitalize = false;
        for (let j=0; j<toCapitalize.length;j++){
            if (input[i]===toCapitalize[j]){
                shouldCapitalize = true;
            }
        }
        if (shouldCapitalize=== true){
            result += input[i].toUpperCase();
        } else {
            result += input[i];
        }
    }
    return result;
    
    
    /*
    let result = '';
    for (let i=0; i<input.length; i++){
        if (input[i]===toCapitalize[0] || input[i]===toCapitalize[1]){
            result += input[i].toUpperCase();
        } else {
            result += input[i];
        }
    }

    return result;
    */
}

function givePotion5Answer(hours, minutes, seconds, secondsToAdd) {
    if (seconds+secondsToAdd>59){
        seconds = ((seconds + secondsToAdd)-60);
        minutes = minutes+1;
    } else if (seconds+secondsToAdd<60){
        seconds = seconds+secondsToAdd;
    }
    if (minutes>59) {
        minutes = 0;
        hours = hours+1;
    }
     return (`${hours}:${minutes}:${seconds}`);
}

function givePotion6Answer(input) {
    //Sum all the numbers from the following input: |*8*2*9*6*9*5|
    let sum = 0;
    for (let i= 0; i<input.length; i++) {
        if (i%2 !== 0 ){
            sum += parseInt(input[i]);
        }
    }
    return sum; 
}

function givePotion7Answer(list) {
    for (let i = 0; i < list.length; i++) {
        if(!isNaN(list[i])){
            sum += parseInt(list[i]);
        }
    }
    return sum;
}

function givePotion8Answer(numbers) {
    //Is the number |7| prime or not ?
    for (let i = 2; i < numbers; i++){
        if (numbers % i === 0){
            return false;
        }
        return numbers >1;
    }
}

function givePotion9Answer(list) {
   function sortLowtoHigh(a,b){
    return a-b;
   }
   list.sort(sortLowtoHigh);
   return list[0] + list[1];
}


function givePotion10Answer(letterToFind, list) {
    //Find the first position where the letter |e| first appears in the string |iireioeei| and -1 if not found.
    for (let i = 0; i < list.length; i++ ){
        if(list[i]===letterToFind){
            return i;
        } 
    }
    return -1;
}

function givePotion11Answer(list,letterToReplace, letterToPutInstead) {
    //Replace all the occurrences of the letter |dusodqurq| with the letter |o| in the string |u| (do not use the replace function)
    let letters = '';
    for (let i = 0; i < list.length; i++){
        if (list[i]===letterToReplace){
            letters += letterToPutInstead;
        } else {
            letters += list[i];
        }
    }
    return letters;
}

function givePotion12Answer(list) {
    //Make the sum of all the numbers in the list |-4,5,-2,6,-3|. If a number is negative make it positive before addition [-1,2] => [1, 2] => 3
    let countNegatives = 0;
    let countPositives = 0;

    for (let i = 0; i < list.length; i++){
        if(list[i] < 0){
            countNegatives += list[i]*(-1);
        }
        if(list[i] > 0){
            countPositives += list[i];
        }
    }
    return countNegatives + countPositives;
}
