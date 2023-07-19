const maxDiff = require('./maxDiff');

const array1 = [10, 20, 30, 40];
const array2 = [100, 100, 100, 100];
const array3 = [-10, -50, -100, -200, -32];
const array4 = [];
const array5 = [1];

test('diff between smallest and biggest should be 30', () => {
  expect(maxDiff(array1)).toBe(30);
});


test('diff between equal nums should be 0', () => {
  expect(maxDiff(array2)).toBe(0);
});


test('diff between negative nums should be 190', () => {
  expect(maxDiff(array3)).toBe(190);
});

test('empty list throws error', () => {
  expect(() => maxDiff(array4)).toThrow("List does not have enough elements!");
});

test('list with 1 element throws error', () => {
  expect(() => maxDiff(array5)).toThrow("List does not have enough elements!");
});