# FizzBuzz Kata
Base repo with a single failing test, designed to be a semi-guided first stop for practicing TDD, we'll emphasise the following:
- [Red] Start by writing a failing test for the simplest behaviour.
- [Green] Implement the simplest amount of code needed to make the test pass.
- [Refactor] As you add more tests, refactor to make the code more generic and more suitable.

## Instructions:
Write a function that takes positive integers and outputs their string representation.

Your function should comply with the following additional rules:
* If the number is a multiple of three, return the string "Fizz".
* If the number is a multiple of five, return the string "Buzz".
* If the number is a multiple of both three and five, return the string "FizzBuzz".

For example, given the numbers from 1 to 15 in order, the function would return:
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

## Optional Extension:
One version of the FizzBuzz game in real life adds an extra Fizz or Buzz whenever one of the digits ('3' or '5') appears in the number itself (for example, see [Dr Mike's Math Games for Kids](https://www.dr-mikes-math-games-for-kids.com/fizz-buzz.html)).

So, '3' would become FizzFizz, '5' would become BuzzBuzz, '15' would be FizzBuzzBuzz.

Modify your program to reflect this requirement while maintaining your discipline in using red-green-refactor cycles.