mapCallbacks["potion6"] = {
    code: 26,
    icon: "fa-solid fa-prescription-bottle-medical",
    callback: () => potionCallback({
            question: 'Sum all the numbers from the following input: {{1}}',
            rewardPoints: 15,
            randomInputCallback: () => {
                const amount = Math.floor(Math.random() * 5)+3;
                let input = "";
                for (let i=0; i<amount; i++) {
                    input += "*" + Math.floor(Math.random() * 10);
                }
                return [input]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion6Answer",
            answerCallback: a=>{numbers=a.split("*");let b=0;return numbers.forEach(a=>{isNaN(converted=parseInt(a))||(b+=converted)}),b},
        }
    )
};
