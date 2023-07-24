# true-detective

True Detective loves the truth, seeks the truth night and day. He keeps asking "Is it true that... ?" about everything,
even the most profane aspects of the world.

The only thing that makes him happy is grabbing the truth value of the case being examined in one, single, crystal clear
expression. For example, whether someone is a queen can be answered with the expression hasBeenCrowned && !isMale.

His assistant, Dr Whatif admires this ability and always tries to reproduce the results of his friend. Unfortunately he
lacks the logical skills of True Detective: he is only able to think in a series of simple conditionals (if this then
that), and he doesn't know about logical operators or any other higher level constructs. Nevertheless, although in a
much more roundabout fashion, he is always able to reproduce the results of True Detective. For example, to the above
queen question Dr Whatif would write something like this:

```javascript
function isQueen(boolean

isMale, boolean
hasBeenCrowned
)
{
    if (isMale) {
        return false
    } else {
        if (hasBeenCrowned) {
            return true
        } else {
            return false
        }
    }
}
```

Which mindset is closer to you? To check this, you need to solve cases (implement functions) both ways. Write two
implementations for each required function, one in truedetective.js and one in whatif.js.

Tests are included with many expected answers in the repository. Keep running them to check your solutions.

What are you going to learn?

* Write conditionals.
* Use logical operators.
* Simplify boolean expressions.
* Run tests.

## Tasks

### The case of two-digit odd numbers

Is a given positive integer an odd number with two digits? Implement isTwoDigitOdd in two versions.

* Dr Whatif's solution has no logical operators and passes all the tests.
* True Detective's solution only has one return statement and passes all the tests.

### The case of user access

Does a user have write access to a Unix file? The parameters are user, usersGroups, fileOwner, writableByOwner,
fileGroup, writableByGroup, writableByOthers, sudoMode. Implement hasAccess in two versions.

* Dr Whatif's solution has no logical operators and passes all the tests.
* True Detective's solution only has one return statement and passes all the tests.

### The case of leap years

Is a given year (AD) a leap year in the Gregorian calendar? The official definition is the following: "Every year that
is exactly divisible by four is a leap year, except for years that are exactly divisible by 100, but these centurial
years are leap years if they are exactly divisible by 400." Implement isLeapYear in two versions.

* Dr Whatif's solution has no logical operators and passes all the tests.
* True Detective's solution only has one return statement and passes all the tests.

### The case of Sundays

Is a given day of a month Sunday? We also know the first day of the month (one of ("M", "Tu", "W", "Th", "F", "Sa", "
Su"). Supposing it is a 31-day-long month, days other than 1..31 cannot be Sundays. Implement isSunday in two versions.

* Dr Whatif's solution has no logical operators and passes all the tests.
* True Detective's solution only has one return statement and passes all the tests.

### The case of umbrellas

Should True Detective bring an umbrella when going out? Well, it depends. Obviously he should when it rains, unless the
wind is too strong. Wind strength greater than or equal to 7 (on the Beaufort scale) would turn the umbrella inside out.
Taking the umbrella is also reasonable when it's not raining but it is cloudy, the wind is not too strong, and there are
signs of a rain coming. Such signs are: red sky during sunset // flowers smell stronger than normal // spiders come down
from their webs // cattle lie down in a group in the fields. But True Detective also likes to take his umbrella when the
sun is shining strongly. Again, unless the wind situation is not too stormy. Implement shouldBringUmbrella in two
versions.

* Dr Whatif's solution has no logical operators and passes all the tests.
* True Detective's solution only has one return statement and passes all the tests.

### OPTIONAL TASK:

The case of taking a nap
Should one take a nap? Follow this decision tree. Implement shouldTakeANap in two versions.

* Dr Whatif's solution has no logical operators and passes all the tests.
* True Detective's solution only has one return statement and passes all the tests.

### General requirements

### Hints

* There are two test files included for checking your results. There is a guide in the Background materials section for
  running the tests.
* Write Dr Whatif's version first, that can help you build the denser solution. You may find a way to do the conversion
  systematically.
* Usually there are multiple equivalent solutions both for Dr Whatif and for True Detective. Try to come up with
  alternative solutions. After finishing the project, compare your solutions with those of others.
* hasAccess requires the following parameters.
    * user: integer type, represents the ID of the user.

    * usersGroups: list type, represents the IDs of each user group that has write access to the file.

    * fileOwner: integer type, represents the ID of the file owner.

    * writableByOwner: boolean type, represents whether the file is writable by owner.

    * fileGroup: integer type, represents the ID of the group that has write access to the file.

    * writableByGroup: boolean type, represents whether the file is writable by the group.

    * writableByOthers: boolean type, represents whether the file is writable by others.

    * sudoMode: boolean type, represents whether the sudo mode is activated.

### Background materials

[Logical Operators (Boolean section)](/JavascriptDataTypes.md)  
[Control structures](/JavascriptControlFlow.md)  
[Getting started with Jest](https://jestjs.io/docs/getting-started)  
[Running Jest tests](https://jestjs.io/docs/cli)  
