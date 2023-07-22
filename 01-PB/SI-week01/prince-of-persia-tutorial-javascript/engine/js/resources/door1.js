mapCallbacks["door1"] = {
  code: 20,
  icon: "fa-solid fa-door-closed",
  callback: () => potionCallback({
    question: 'What is {{1}} to the power of 4 divided by the sum of {{2}} with {{1}} and finally rounded down ?',
    rewardPoints: 10,
    randomInputCallback: () => {
      const random1 = Math.floor(Math.random() * 100)
      const random2 = Math.floor(Math.random() * 100);
      return [random1, random2]; // always return a list with the values that are required
    },
    studentImplementationCallback: giveDoor1Answer,
    answerCallback: (a, b) => Math.floor(Math.pow(a,4) / (a+b))
  })
};