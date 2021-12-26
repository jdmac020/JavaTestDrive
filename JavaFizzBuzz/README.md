# FizzBuzz in Java

A simple project for practicing test driven development and problem solving

## Project Details

- Created with JetBrains IntelliJ Community Edition
  - Maven project, default archetype
  - Java Development Kit (JDK) 1.8
- JUnit5 Testing Framework
    - Following a [JetBrains tutorial](https://www.jetbrains.com/help/idea/junit.html)

## The Challenge

#### _Note_
Starting instructions sourced from [Steve Smith](https://github.com/ardalis/kata-catalog/blob/main/katas/FizzBuzz.md)
and modified to make an admittedly very contrived domain problem.

### The Business Case

There is a nightly process that prints out all the client ids at the local marketing firm you just started at.

Every morning, Jordan (the special assistant to the COO) has to take the first part of their day to mark certain 
entries with code words indicating the risk level of the client cancelling the service contract.

Jordan has this down to a science, and it really doesn't take them more than a cup of coffee or so to complete this 
task...but Jordan is also going on vacation soon, and no one wants to learn how to do this arcane process. The COO wants
it automated.

Your tech lead and designer have both spoken to Jordan and think they've identified the process. They can't really
identify a better way to get the job done (it's a complicated mathematical formula some data analyst named Ptyor
discovered in the early 1990s), so they broke it down into some discrete acceptance criteria on the card and assigned it
to you.

### Work Item 314

Linda and Rich interviewed Jordan and think it's a straight forward set of steps to automate with no special
architecture or discovery concerns. Suitable for the newbie to handle with minimal supervision.

#### Value Story:

AS an operations specialist,
I WANT to be able to identify high risk clients
SO THAT I can take action to prevent revenue loss.

#### Acceptance Criteria:

GIVEN a client ID is divisible by 3\
WHEN it prints out\
THEN the ID is replaced by the word "Fizz"

GIVEN a client ID is divisible by 5\
WHEN it prints out\
THEN the ID is replaced by the word "Buzz"

GIVEN a client ID is divisible by both 3 and 5\
WHEN it prints out\
THEN the ID is replaced by the word "FizzBuzz

#### Testing Notes

Run IDs 1-16 thru the solution to ensure all possible cases are covered. QA sent over the expected output, below.

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
16
```