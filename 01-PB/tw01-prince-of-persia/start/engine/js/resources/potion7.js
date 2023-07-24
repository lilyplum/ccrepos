mapCallbacks["potion7"] = {
    code: 27,
    icon: "fa-solid fa-filter-circle-dollar",
    callback: () => potionCallback({
            question: 'Make a sum of all the numbers in the input: {{1}}',
            rewardPoints: 30,
            randomInputCallback: () => {
                const allowedCharacters = "a3w9*8(6%0";
                let input = "";
                const amount = Math.floor(Math.random() * 4)+4;
                for (let i=0; i<amount; i++) {
                    input += allowedCharacters[Math.floor(Math.random() * 10)];
                }
                return [input]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion7Answer",
            answerCallback: e=>{let b=e.split(""),c=0;for(let a=0;a<b.length;a++){let d=parseInt(b[a]);isNaN(d)||(c+=d)}return c}        }
    )
};
