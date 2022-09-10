# Functions and Methods

In Java, the word method refers to the same kind of thing that the word function is used for in other languages. Specifically, a method is a function that belongs to a class. In Java, every function belongs to a class. 

- Like a mini-program (or subprogram) in its own right.
- Can take in special inputs (arguments).
- Can produce an answer value (return value).
- Similar to the idea of a function in mathematics.

## Why write and use functions?

### Divide and Conquer

- Can break up programs and algorithms into smaller, more manageable pieces.
- This makes for easier writing, testing, and debugging.
- Also, easier to break up the work for team development.

### Re-usability

- Functions can be called to do their tasks anywhere in a program, as many times as needed.
- Avoids repetition of code in a program.
- Functions can be placed into libraries to be used by more than one "program".

## Java Method Syntax

```
accessModifier static returnType nameOfMethod(dataType parameterOne, dataType parameterTwo){
    // methodBody
}
```

Let's go one by one describing each of these:

- **accessModifier** : It defines access types whether the method is public, private, and so on.
- **static** (optional) : This means that this method belongs to the class itself and not to the object on initialization.
- **returnType** :  It specifies what type of value a method returns For example if a method has an int return type then it returns an integer value.
- **nameOfMethod** : It is an identifier that is used to refer to the particular method in a program.
- **dataType** parameters : It defines the data type that the method should expect as argument.
- **methodBody** : It includes the programming statements that are used to perform some tasks. The method body is enclosed inside the curly braces { }.

Let's see a real case method:

```
public static int calculateSumOfTwoNumbers(int numberOne, int numberTwo){
    
    //This method should return an int as indicated on the method declaration.
    return numberOne + numberTwo;
    
}
```

And now implement this to a run-able scenario:

```java
import java.util.Scanner;

public class MethodTester {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Pick the first number");
        int firstNumber = console.nextInt();

        System.out.println("Pick the second number");
        int secondNumber = console.nextInt();

        int result = calculateSumOfTwoNumbers(firstNumber, secondNumber);

        System.out.println("The sum of those numbers is: " + result);

    }

    public static int calculateSumOfTwoNumbers(int numberOne, int numberTwo){

        //This method should return an int as indicated on the method declaration.
        return numberOne + numberTwo;

    }
}
```








