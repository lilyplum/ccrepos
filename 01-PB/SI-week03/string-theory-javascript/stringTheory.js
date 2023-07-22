function isPalindrome(text) { 
    let cleanText = text.replace(/\W+|_/g, "").toLowerCase();
    let reversedText = polishedString.split("").reverse().join("");
    return (cleanText === reversedText) ? console.log(true) : console.log(false);
}

//isPalindrome("Eva, can I see bees in a cave?");

function isIsogram(text) {
    return (!/(\w).*\1/i.test(text)) ? console.log(true) : console.log(false);
}

//isIsogram("ja");

function isPangram(text) {
    let regex = /([a-z])(?!.*\1)/g;
    if((text.match(regex) || []).length === 26) {
        console.log(true);
    } else {
        console.log(false);
    }
}

//isPangram("a?b?c?d?e?f?g?h?i?j?k?l?m?n?o?p?q?r?s?t?u?v?w?x?y?z()@#$@)%@#%");
//isPangram('The quick brown fox jumps over the lazy dog');

function isAnagram(text1, text2) {
    const cleanText1 = text1.replace(/\W+|_/g, "").toLowerCase().split("").sort().join("") 
    const cleanText2 = text2.replace(/\W+|_/g, "").toLowerCase().split("").sort().join("");

    return (cleanText1 === cleanText2) ? console.log(true) : console.log(false);
}

//isAnagram('Justin Timberlake', "I'm a jerk but listen");
//isAnagram("silenT", "listen");

/**
 *  ```javascript
 *  isBlanagram('Justin Timberlake', "I'm a berk but listen")
 *  true
 *  ```
 */
function isBlanagram(text1, text2) {

}
