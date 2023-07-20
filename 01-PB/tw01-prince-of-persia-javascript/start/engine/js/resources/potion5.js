mapCallbacks["potion5"] = {
    code: 25,
    icon: "fa-solid fa-filter-circle-dollar",
    callback: () => potionCallback({
            question: 'if you add {{4}} seconds to {{1}}:{{2}}:{{3}} what time will it be ?',
            rewardPoints: 30,
            randomInputCallback: () => {
                const hours = Math.floor(Math.random() * 24);
                const minutes = Math.floor(Math.random() * 2 )+58;
                const seconds = Math.floor(Math.random() * 10)+50;
                const secondsToAdd = Math.floor(Math.random() * 50);

                return [hours, minutes, seconds, secondsToAdd]; // always return a list with the values that are required
            },
            studentImplementationCallback: "givePotion5Answer",
            answerCallback: (a,b,c,d)=>((c+=d)>59&&(c-=60,(b+=1)>59&&(b-=60,(a+=1)>23&&(a=0))),`${a}:${b}:${c}`)
        }
    )
};
