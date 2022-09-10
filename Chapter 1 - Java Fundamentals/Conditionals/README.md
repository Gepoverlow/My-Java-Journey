# Conditionals

Java supports the usual logical conditions from mathematics:

- Less than: a < b
- Less or Equal than: <= b
- Greater than: a > b
- Greater or Equal than: >= b
- Equal to: a == b
- Not Equal to: a != b

In strongly typed languages such as Java, you don't need to use a strict comparison operator because the language already "handles" the type comparison. So for example a === b is not needed.

The way java approaches the conditionals is identical to the way other languages I've had a bit of experience with, but again, for the sake of cleanliness lets go through them.

Java has the following conditional statements:

- Use **if** to specify a block of code to be executed, if a specified condition is true.
- Use **else** to specify a block of code to be executed, if the same condition is false.
- Use **else if** to specify a new condition to test, if the first condition is false.
- Use **switch** to specify many alternative blocks of code to be executed.

## **IF** Statement

```
if (a > b) {
    //code to be executed if the condition a > b is TRUE.
        }
```

## **ELSE** Statement

```
if (a > b) {
    // code to be executed if the condition a > b is TRUE.
} else {
    // code to be executed if the condition a > b is FALSE.
}
```

## **ELSE IF** Statement

```
if (a > b) {
    // code to be executed if the condition a > b is TRUE.
} else if (a == b) {
    // code to be executed if the condition a > b is FALSE and the condition a == b is TRUE.
} else {
    // code to be executed if the condition a > b is FALSE and a == b is also FALSE.
}
```

## Ternary Operator

There is also a short-hand if else, which is known as the *ternary operator* because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

``` 
variable = (condition) ? expressionTrue :  expressionFalse;
```

## **SWITCH** Statement

Use the **switch** statement to select one of many code blocks to be executed.

```
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

How does it work?

- The switch expression is evaluated once.
- The value of the expression is compared with the values of each case.
- If there is a match, the associated block of code is executed.

### break and default keywords

**break** : When Java reaches a break keyword, it breaks out of the switch block.

**default** : The default keyword specifies some code to run if there is no case match.





