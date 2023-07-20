const td = require('./truedetective.js');

test('testIsTwodigitOdd', () => {
    expect(td.isTwodigitOdd(5)).toBe(false)
    expect(td.isTwodigitOdd(15)).toBe(true)
    expect(td.isTwodigitOdd(115)).toBe(false)
})

test('testHasAccess', () => {
    expect(td.hasAccess(42, [142, 143], 11, true, 10, true, true, false)).toBe(true)
    expect(td.hasAccess(42, [142, 143], 11, true, 10, true, false, true)).toBe(true)
    expect(td.hasAccess(42, [142, 143], 11, true, 10, true, false, false)).toBe(false)
    expect(td.hasAccess(42, [142, 143], 11, true, 143, true, false, false)).toBe(true)
    expect(td.hasAccess(42, [142, 143], 11, true, 143, false, false, false)).toBe(false)
    expect(td.hasAccess(42, [142, 143], 11, true, 143, false, false, true)).toBe(true)
    expect(td.hasAccess(42, [142, 143], 42, true, 10, false, false, false)).toBe(true)
    expect(td.hasAccess(42, [142, 143], 42, false, 10, false, false, false)).toBe(false)
    expect(td.hasAccess(42, [142, 143], 42, false, 10, false, false, true)).toBe(true)
})

test('testIsLeapYear', () => {
    expect(td.isLeapYear(1995)).toBe(false)
    expect(td.isLeapYear(1996)).toBe(true)
    expect(td.isLeapYear(1997)).toBe(false)
    expect(td.isLeapYear(1998)).toBe(false)
    expect(td.isLeapYear(1999)).toBe(false)
    expect(td.isLeapYear(2000)).toBe(true)
    expect(td.isLeapYear(1900)).toBe(false)
})

test('testIsSunday', () => {
    expect(td.isSunday(1, 'M')).toBe(false)
    expect(td.isSunday(6, 'M')).toBe(false)
    expect(td.isSunday(7, 'M')).toBe(true)
    expect(td.isSunday(7, 'W')).toBe(false)
    expect(td.isSunday(6, 'W')).toBe(false)
    expect(td.isSunday(5, 'W')).toBe(true)
    expect(td.isSunday(32, 'F')).toBe(false)
})

test('testShouldBringUmbrella', () => {
    expect(td.shouldBringUmbrella(true, 2, true, false, false, false, false, false)).toBe(true)
    expect(td.shouldBringUmbrella(true, 7, true, false, false, false, false, false)).toBe(false)
    expect(td.shouldBringUmbrella(false, 0, true, false, false, false, false, false)).toBe(false)
    expect(td.shouldBringUmbrella(false, 0, true, false, true, false, false, false)).toBe(true)
    expect(td.shouldBringUmbrella(false, 0, true, false, false, false, true, false)).toBe(true)
    expect(td.shouldBringUmbrella(false, 6, true, true, true, true, true, false)).toBe(true)
    expect(td.shouldBringUmbrella(false, 7, true, true, true, true, true, false)).toBe(false)
    expect(td.shouldBringUmbrella(false, 0, false, false, false, false, false, false)).toBe(false)
    expect(td.shouldBringUmbrella(false, 0, false, false, false, false, false, true)).toBe(true)
    expect(td.shouldBringUmbrella(false, 8, false, false, false, false, false, true)).toBe(false)
})

test('testshouldTakeANap', () => {
    expect(td.shouldTakeANap(false, false, false, false, false, false, false)).toBe(false)
    expect(td.shouldTakeANap(true, true, false, false, false, false, false)).toBe(false)
    expect(td.shouldTakeANap(true, false, true, false, false, false, false)).toBe(false)
    expect(td.shouldTakeANap(true, false, false, false, false, false, false)).toBe(false)
    expect(td.shouldTakeANap(true, false, false, false, false, true, false)).toBe(true)
    expect(td.shouldTakeANap(true, false, false, false, false, false, true)).toBe(true)
    expect(td.shouldTakeANap(true, false, false, true, true, false, false)).toBe(false)
    expect(td.shouldTakeANap(true, false, false, true, false, false, true)).toBe(true)
    expect(td.shouldTakeANap(true, false, false, true, false, true, true)).toBe(true)
})
