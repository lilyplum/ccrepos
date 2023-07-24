# encrypted-letters

Last week you got a love letter from the cutest person at school and panicked – what were you going to do?!

Because you were shy and only wanted to date with bright people, you decided to answer the letter in an encrypted
message – let's see if they can decipher it!

To learn about encryption you asked for help from a programmer friend. Your friend has just replied, and when you open
the Git repository they sent, you find a bunch of unit tests.

What are you going to learn?

* Run and read unit tests.
* Write complex string arithmetic.
* Implement encryption and decryption.

## Tasks

### Implement Caesar cipher

Run the CaesarCipherTest class, and make all the test methods pass by implementing the encrypt and decrypt methods of
the CaesarCipher class. The cipher is expected to encrypt letters a-z and A-Z (lowercase and uppercase English
alphabet), and leave all other characters unchanged.

* The encryptsEmptyText test method passes in the CaesarCipherTest class.
* The encryptsShortTextUsingZeroShift test method passes in the CaesarCipherTest class. Zero shift must leave the text
  unchanged.
* The encryptsShortText test method passes in the CaesarCipherTest class.
* The encryptsTextWithSpecialCharacters test method passes in the CaesarCipherTest class.
* The decryptsEmptyText test method passes in the CaesarCipherTest class.
* The decryptsShortTextUsingZeroShift test method passes in the CaesarCipherTest class. Zero shift must leave the text
  unchanged.
* The decryptsShortText test method passes in the CaesarCipherTest class.
* The decryptsTextWithSpecialCharacters test method passes in the CaesarCipherTest class.

### Implement Vigenère cipher

Run the VigenereCipherTest test class and make all the test methods pass by implementing the encrypt and decrypt methods
of the VigenereCipher class. The cipher is expected to encrypt letters a-z and A-Z (lowercase and uppercase English
alphabet), and leave all other characters unchanged.

* As the heart of the Vigenère cipher is the same as that of the Caesar cipher (rotational character shift operations),
  you must rely on the injected caesarCipher as much as you can to avoid code duplication.
* The encryptsEmptyText test method passes in the VigenereCipherTest class.
* The encryptsShortTextUsingZeroKeyword test method passes in the VigenereCipherTest class. A keyword made of a
  characters only must leave the text unchanged.
* The encryptsShortText test method passes in the VigenereCipherTest class.
* The encryptsTextWithSpecialCharacters test method passes in the VigenereCipherTest class.
* The decryptsEmptyText test method passes in the VigenereCipherTest class.
* The decryptsShortTextUsingZeroKeyword test method passes in the VigenereCipherTest class. A keyword made of a
  characters only must leave the text unchanged.
* The decryptsShortText test method passes in the VigenereCipherTest class.
* The decryptsTextWithSpecialCharacters test method passes in the VigenereCipherTest class.

### Emulate Caesar cipher using Vigenère cipher

Emulate Caesar cipher using Vigenère cipher by providing the proper keyword in the caesarCipherKeyword variable of the
decryptsCaesarCipherTextCharacters test method in the VigenereCipherTest class.

* The decryptsCaesarCipherTextCharacters test method is enabled and passes in the VigenereCipherTest class.

### Hints

* You can focus on making a single test function pass, one step at a time.
* You can rely on debugging when trying to fix a unit test.
* During Vigenère encryption, unchanged letters (non-standard alphabetic characters) affect how the key is created from
  the keyword.
* Calculating modulus with negative arguments can be tricky.
* If you are ready, and all your tests turned to green, you can run the short main() method in EncryptedLetter to see
  whether your solution qualifies or not.

### Background materials

[Caesar cipher](https://en.wikipedia.org/wiki/Caesar_cipher)  
[Vigenère cipher](https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher)  
[JavaDoc for floorMod](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#floorMod-int-int-)