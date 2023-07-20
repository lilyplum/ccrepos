mapCallbacks["potion3"] = {
    code: 23,
    icon: "fa-solid fa-prescription-bottle-medical",
    callback: () => potionCallback({
            question: 'Find the highest number in the list {{1}}',
            rewardPoints: 10,
            randomInputCallback: () => {
                Math.max = () => {
                    console.log("Magic door does not allow to use Math.max function, find another way !");
                }
                const amount = Math.floor(Math.random() * 6) + 2;
                const list = [];
                for (let index = 0; index < amount; index++) {
                    list.push(Math.floor(Math.random() * 20))
                }
                return [list]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion3Answer",
            answerCallback: (a)=>{let c=a[0];for(let b=0;b<a.length;b++)a[b]>c&&(c=a[b]);return c},
        }
    )
};
