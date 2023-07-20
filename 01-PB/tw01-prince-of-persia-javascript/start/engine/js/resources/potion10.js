mapCallbacks["potion10"] = {
    code: 30,
    icon: "fa-solid fa-prescription-bottle-medical",
    callback: () => potionCallback({
            question: 'Find the first position where the letter {{1}} first appears in the string {{2}} and -1 if not found.',
            rewardPoints: 10,
            randomInputCallback: () => {
                String.prototype.indexOf = () => console.log("Magic door does not allow the use of the function indexOf.");
                String.prototype.search = () => console.log("Magic door does not allow the use of the function search.");
                const letters = "sadeqroiu";
                const letterToFind = letters[Math.floor(Math.random() * letters.length)];
                let input = "";
                for (let i=0; i<9; i++) {
                    input = input + (letters[Math.floor(Math.random() * letters.length)]);
                }
                return [letterToFind, input]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion10Answer",
            answerCallback: (c,b)=>{for(let a=0;a<b.length;a++)if(b[a]===c)return a;return -1}
    })
};
