# String theory

Otto Reinier, the eccentric billionaire has a strange
hobby: [recreational linguistics](https://en.wikipedia.org/wiki/Logology_(linguistics)). He loves to play around with
words and is eager to find patterns in texts. He hires you to write a library that can help him in his research. And...
well, he pays a lot, so you decide to deal with anagrams and stuff for a while. See the grammatical definitions at "
Hints".

What are you going to learn?

* Practice string operations.
* Improve your algorithmic skills.

## Tasks

### Palindrome checker

Implement the isPalindrome method that checks whether a given input string is palindrome. Check the letters only. Upper
or lower case, whitespace, and punctuation does not matter.

* For palindrome input strings the return value is true, otherwise false.
* The checker skips everything but the letters.
* The checker is insensitive to letter case.

### Isogram checker

Implement the isIsogram method that checks whether a given input string is isogram. Check the letters only. Upper or
lower case, whitespace, and punctuation does not matter.

* For isogram input strings the return value is true, otherwise false.
* The checker skips everything but the letters.
* The checker is insensitive to letter case.

### Pangram checker

Implement the isPangram method that checks whether a given input string is pangram. Check the letters only. Upper or
lower case, whitespace, and punctuation does not matter.

* For pangram input strings the return value is true, otherwise false.
* The checker skips everything but the letters.
* The checker is insensitive to letter case.

### Anagram checker

Implement the isAnagram method that checks whether two given strings are anagrams of each other. Check the letters only.
Upper or lower case, whitespace, and punctuation does not matter.

* For anagrammatic input strings the return value is true, otherwise false.
* The checker skips everything but the letters.
* The checker is insensitive to letter case.

### OPTIONAL TASK: Blanagram checker

Implement the isBlanagram function that checks whether two given strings are blanagrams of each other. Check the letters
only. Upper or lower case, whitespace, and punctuation does not matter.

* For blanagrammatic input strings the return value is true, otherwise false.
* The checker skips everything but the letters.
* The checker is insensitive to letter case.

### General requirements

### Hints

* A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such
  as "rotator", "Anna", "My gym". See https://en.wikipedia.org/wiki/Palindrome.
* An isogram (or heterogram) is a word or phrase without a repeating letter, such as "cornflakes", "subdermatoglyphic".
  See https://en.wikipedia.org/wiki/Isogram.
* A pangram is a sentence or other sequence of characters in which every letter of the alphabet is used at least once,
  such as "Sphinx of black quartz, judge my vow". See https://en.wikipedia.org/wiki/Pangram.
* An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original
  letters exactly once, such as "fairy tales" for "rail safety" or "eleven plus two" for "twelve plus one".
  See https://en.wikipedia.org/wiki/Anagram.
* A blanagram (from blank+anagram) is a word which is an anagram of another but for the substitution of a single letter,
  such as "chipotle" for "poetical" (anagrams after replacing "a" for "h"). See https://en.wikipedia.org/wiki/Blanagram.

### Background materials

[Strings](/JavascriptDataTypes.md)  
[Arrays](/JavascriptArrays.md)  
[Regular Expression(regex)](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions)  
