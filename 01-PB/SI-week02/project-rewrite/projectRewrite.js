function min(x, y) {
    let lesserValue = 0;
    if (x < y) {
        lesserValue = x;
    } else if (y < x) {
        lesserValue = y;
    }
    return lesserValue;        
}

function max(valuesList) {
    let biggestNumber = 0;
    for (let i = 0; i < valuesList.length; i++) {
        if (biggestNumber < valuesList[i]){
            biggestNumber = valuesList[i]
        } 
    }
    return biggestNumber;
}

function len(valuesList) {
    let counter = 0;
    for (let i = 0; i < valuesList.length; i++) {
        counter ++;
    }
    return counter;
}

function multiply(x, y) {
    if (x === 1){
        return y;
    } else if (x > 1){
        return y + (x -1, y)
    } else {
        return "Not a number"
    }
}

function pow(x, y) {
    if (y === 0){
        return 1;
    } else if (y === 1){
        return x;
    } 
    return x * pow(x, y -1)
}

function divmod(x, y) {

}
