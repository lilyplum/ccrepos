mapCallbacks["potion2"] = {
    code: 22,
    icon: "fa-solid fa-prescription-bottle-medical",
    callback: () => potionCallback({
            question: 'What is the sum of all the even numbers in the list {{1}} ?',
            rewardPoints: 10,
            randomInputCallback: () => {
                const amount = Math.floor(Math.random() * 6) + 2;
                const list = [];
                for (let index = 0; index < amount; index++) {
                    list.push(Math.floor(Math.random() * 20))
                }
                return [list]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion2Answer",
            answerCallback: (b)=>{let c=0;for(let a=0;a<b.length;a++)b[a]%2==0&&(c+=b[a]);return c}
        }
    )
};
