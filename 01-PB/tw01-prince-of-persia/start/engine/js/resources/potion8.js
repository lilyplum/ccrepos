mapCallbacks["potion8"] = {
    code: 28,
    icon: "fa-solid fa-filter-circle-dollar",
    callback: () => potionCallback({
            question: 'Is the number {{1}} prime or not ?',
            rewardPoints: 30,
            randomInputCallback: () => {
                const numbers = [4, 3, 8, 7, 20, 13, 17, 19, 23, 12, 24, 29]
                return [numbers[Math.floor(Math.random() * numbers.length)]]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion8Answer",
            answerCallback: b=>{for(let a=2;a<b-1;a++)if(b%a==0)return!1;return!0}    }
    )
};
