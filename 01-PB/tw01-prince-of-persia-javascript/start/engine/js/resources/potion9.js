mapCallbacks["potion9"] = {
    code: 29,
    icon: "fa-solid fa-filter-circle-dollar",
    callback: () => potionCallback({
            question: 'Make the sum of the 2 smallest numbers in the list {{1}}',
            rewardPoints: 30,
            randomInputCallback: () => {
                const list = [];
                for (let i=0; i<5; i++) {
                    list.push(Math.floor(Math.random() * 20))
                }
                return [list]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion9Answer",
            answerCallback: a=>(a.sort((a,b)=>a-b),a[0]+a[1])    })
};
