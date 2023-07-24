mapCallbacks["potion4"] = {
    code: 24,
    icon: "fa-solid fa-filter-circle-dollar",
    callback: () => potionCallback({
            question: 'Capitalize in the string {{1}} the letters: {{2}}',
            rewardPoints: 30,
            randomInputCallback: () => {
                const letters = ['c', 'o', 'd', 'e', 'l', 'r', 'c'];
                let input = "";
                let toCapitalize = [];
                for (let i = 0; i < Math.floor(Math.random() * 8); i++) {
                    input += letters[Math.floor(Math.random() * letters.length)];
                }
                toCapitalize.push(letters[Math.floor(Math.random() * letters.length)]);
                toCapitalize.push(letters[Math.floor(Math.random() * letters.length)]);

                return [input, toCapitalize]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion4Answer",
            answerCallback: (a,b)=>(result="",a.split("").forEach(a=>{result+=b.includes(a)?a.toUpperCase():a}),result)
        }
    )
};
