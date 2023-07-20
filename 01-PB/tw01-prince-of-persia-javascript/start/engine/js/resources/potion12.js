mapCallbacks["potion12"] = {
    code: 32,
    icon: "fa-solid fa-prescription-bottle-medical",
    callback: () => potionCallback({
            question: 'Make the sum of all the numbers in the list {{1}}. If a number is negative make it positive before addition [-1,2] => [1, 2] => 3',
            rewardPoints: 15,
            randomInputCallback: () => {
                const amount = Math.floor(Math.random() * 6) + 2;
                const list = [];
                for (let index = 0; index < amount; index++) {
                    list.push((Math.floor(Math.random() * 10)) * ((index % 2) === 0 ? -1 : 1))
                }
                return [list]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion12Answer",
            answerCallback: b=>{let c=0;for(let a=0;a<b.length;a++)b[a]<0?c+=-1*b[a]:c+=b[a];return c}    })
};
