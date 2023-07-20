/*

    DO NOT RUN THIS FILE!
    DO NOT MODIFY THIS FILE!

*/

const passOrFail = (fun, [a,b], res) => fun(a,b) === res ? 
    `
        \x1b[47m\x1b[32mPASSED!\x1b[0m
        The\x1b[34m ${fun.name}()\x1b[0m function is returning the expected \x1b[32m${res}\x1b[0m.
            
    ` : 
    `
        \x1b[47m\x1b[31mFAILED!\x1b[0m
        The\x1b[34m ${fun.name}()\x1b[0m function is returning \x1b[35m${fun(a,b)}\x1b[0m instead of \x1b[35m${res}\x1b[0m.
    
    `
;
const slowResult = (msg, i) => new Promise((res) => setTimeout(() => res(msg), 1000*i));
module.exports = toTest => toTest.map( async (f,i) => console.log(await slowResult( passOrFail(...f), i) ) );