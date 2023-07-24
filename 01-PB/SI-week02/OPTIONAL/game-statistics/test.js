const fs = require("fs");
const reports = require("./reports")

function getSorted() {
    return [
        'Age of Empires',
        'Command & Conquer',
        'Counter-Strike',
        'Counter-Strike: Condition Zero',
        'Crysis',
        'Diablo II',
        'Diablo III',
        'Doom 3',
        'EverQuest',
        "Garry's Mod",
        'Guild Wars',
        'Half-Life',
        'Half-Life 2',
        'Minecraft',
        'Populous',
        'StarCraft',
        'StarCraft II: Wings of Liberty',
        'Terraria',
        'The Sims',
        'The Sims 2',
        'The Sims 3',
        'Warcraft III: Reign of Chaos',
        'Warhammer 40,000: Dawn of War (including expansions)',
        'World of Warcraft'
    ]
}
const INPUT_FILE = "game_stat.txt"

test('1. CountGames', () => {
    result = reports.countGames(INPUT_FILE)
    expect(result).toBe(24)
})

test('2. Decide', () => {
    result = reports.decide(INPUT_FILE, 2000)
    expect(result).toBe(true);
})

test('3. GetLatest', () => {
    result = reports.getLatest(INPUT_FILE)
    expected = "Diablo III"
    expect(result).toBe(expected)
})

test('4. CountByGenre', () => {
    result = reports.countByGenre(
        INPUT_FILE,
        "First-person shooter"
    )
    expect(result).toBe(6)
})

test('5. GetLineNumberByTitle', () => {

    result = reports.getLineNumberByTitle(
        INPUT_FILE, 
        "Counter-Strike"
    )
    expect(result).toBe(6)
})

test('5. RaisesErrorWhenNoGame', () => {
    expect(() => {
        reports.getLineNumberByTitle(
            INPUT_FILE, 
            "Non-existing game"
        )
    }).toThrowError('No such game!')
})

test('bonus 1: SortAbc', () => {
    sortedResult = reports.sortAbc(INPUT_FILE)
    expectedResult = getSorted()
    expect(sortedResult).toEqual(expectedResult)
})

test('bonus 2: CheckForbiddenFunctions', () => {
    const data = fs.readFileSync('reports.js', "utf8")
    expect(data).toEqual(expect.not.stringMatching(/\.sort\(/))
})

test('bonus 3: GetGenres', () => {
    result = reports.getGenres(INPUT_FILE)
    expectedResult = [
        "Action-adventure",
        "First-person shooter",
        "Real-time strategy",
        "RPG",
        "Sandbox",
        "Simulation",
        "Survival game"
    ].sort()

    expect(result).toEqual(expectedResult)
})

test('bonus 4: WhenWasTopSoldFps', () => {
    result = reports.whenWasTopSoldFps(INPUT_FILE)
    expect(result).toBe(1999)
})

test('bonus 5: RaisesErrorWhenNoFpsGame', () => {
    expect(() => {
        result = reports.whenWasTopSoldFps("game_stat_nofpstest.txt")
    }).toThrowError('There is no FPS game!')
})
