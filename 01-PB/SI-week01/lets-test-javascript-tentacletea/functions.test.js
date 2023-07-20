/* 
    YOU CAN RUN THIS FILE in Terminal: 
    node functions.test.js

    DO NOT MODIFY THIS FILE!

*/

const {addTwoNumbers, isLeftGreaterThanRight, sayHello} = require('./functions');
const tests = require('./test.lib.js');

// [functionToTest, parametersAsArray, expectedResult]
tests(
    [

			[addTwoNumbers, [5,6], 11],
			[addTwoNumbers, [7,7], 14],
			[addTwoNumbers, [5,5], 10],

			[isLeftGreaterThanRight, [50,6], true],
			[isLeftGreaterThanRight, [1,6], false],
			[isLeftGreaterThanRight, [6,6], false],

			[sayHello, ["Riley"], "Hello, Riley!"],
			[sayHello, ["Chloe"], "Hello, Chloe!"],
			[sayHello, ["David"], "Hello, David!"]

    ]
);