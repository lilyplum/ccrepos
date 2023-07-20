mapCallbacks["potion11"] = {
    code: 31,
    icon: "fa-solid fa-prescription-bottle-medical",
    callback: () => potionCallback({
            question: 'Replace all the occurrences of the letter {{1}} with the letter {{2}} in the string {{3}} (do not use the replace function)',
            rewardPoints: 15,
            randomInputCallback: () => {
                String.prototype.indexOf = () => console.log("Magic door does not allow the use of the function indexOf.");
                String.prototype.search = () => console.log("Magic door does not allow the use of the function search.");
                const letters = "sadeqroiu";
                let input = "";
                for (let i=0; i<9; i++) {
                    input = input + (letters[Math.floor(Math.random() * letters.length)]);
                }
                const letterToReplace = input[Math.floor(Math.random() * letters.length)];
                const letterToPutInstead = input[Math.floor(Math.random() * letters.length)];
                return [input, letterToReplace, letterToPutInstead]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion11Answer",
            answerCallback: (b,d,e)=>{let c="";for(let a=0;a<b.length;a++)b[a]===d?c+=e:c+=b[a];return c}    })
};
