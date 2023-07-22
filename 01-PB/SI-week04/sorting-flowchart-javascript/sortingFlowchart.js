// write your code here
//Buble Sort algorithm

/* 
let array = [1, 5, 7, 6];
n = array.length;

for (let i = 0; i < n; i++) {
    if (i < n -1 === false) {
        console.log(array);
    }
    for (let j = 0; j < n; j++) {
        if(j < n - i -1) {
            if (array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            } else {
                j++;
            }
        } else {
            i++;
        }
    }
} */

function bubbleSort(array) {
    n = array.length;

    //Outerpass
    for (let i = 0; i < n; i++) {
        //Innerpass
        for (let j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                //swapping
                //[array[j + 1],array[j]] = [array[j],array[j + 1]]

                temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
            }
        }
    }
    return array;
}

//console.log(bubbleSort([1, 2, 56, 32, 51, 2, 8, 92, 15]));

function binarySearch(array, value) {
    let start = 0;
    let end = array.length -1;
    while (start <= end) {
        let mid = Math.floor((start + end) / 2);
        if (array[mid] === value) {
            return mid;
        } else if (array[mid] > value) {
            end = mid - 1;
        } else {
            start = mid +1;
        }
    }

    return -1;
}

console.log(binarySearch([1, 2, 4, 7, 11, 22, 38, 42, 43], 1));