# Exceptions and Exception Handling

Exception Handling in Java is one of the effective means to handle the runtime errors so that the regular flow of the application can be preserved. Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

## What is an Exception?

Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred.

## Why do Exceptions occur?

Some reasons might include:

- Invalid user input.
- Device Failure.
- Loss of network connection.
- Physical limitations (out of disk memory).
- Code errors.
- Opening an unavailable file.

## Is an Exception an *Error*?

The main difference between an **exception** and an **error** is:

- Error : An error indicates a serious problem that a reasonable application should not try to catch.
- Exception : An exception indicates conditions that a reasonable application might try to catch.

## Exception Hierarchy

![](../../Assets/ExceptionHierarchy.png)

## Types of Exceptions

- User-defined Exception.
- Built-in Exception.

### User-Defined Exceptions:

Java exceptions cover almost all the general types of exceptions that may occur in the programming. However, we sometimes need to create custom exceptions.

- Some advantages:

1. To catch and provide specific treatment to a subset of existing Java exceptions.
2. Business logic exceptions: These are the exceptions related to business logic and workflow. It is useful for the application users or the developers to understand the exact problem.

Let's check out an example of a User-Defined Exception

```java
class MyUserException extends Exception {
    public MyUserException (String s) {
        
        // Call constructor of parent class 'Exception'
        super(s);
        
    }
}

// Create a class that would use the user made exception
public class ExceptionTester {
    
    public static void main(String[] args) {
        
        try {

            // Throw an object of user defined exception
            throw new MyUserException("Here would a description of the exception go");

        } catch (MyUserException example) {

            System.out.println("Exception caught");

            // Print the message from MyException object
            System.out.println(example.getMessage());

        }
    }
}
```

Output:

```
Exception caught
Here would a description of the exception go
```

### Built-In Exceptions:

Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain certain error situations.

There are 2 types of build-int exceptions:

- **Checked Exceptions**.


These are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using the **throws** keyword.

Consider the following code example:

````java
// Importing I/O classes
// Java I/O (Input and Output) is used to process the input and produce the output.
// Java uses the concept of a stream to make I/O operation fast. The java.io package contains all the classes required for input and output operations.
// We can perform file handling in Java by Java I/O API.
import java.io.*;

public class CheckedExceptionTester {

    public static void main(String[] args) {

        // Reading file from path in local directory
        FileReader file = new FileReader("Assets/example.txt");

        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "example.txt"
        for(int i = 0; i < 3; i++) {

            System.out.println(fileInput.readLine());

        }

        // To avoid memory leak, we close the fileInput
        fileInput.close();

    }

}
````

On compilation, the output is

```
java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
```

As soon as we declare IOException to be thrown and add this line to our main method:

```
public static void main(String[] args)  throws IOException {
```

The compilation goes through and the result is what we expected:

```
Im just
an checkedException
text file
```

- **Unchecked Exceptions**.


  The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these exceptions at compile time. In simple words, if a program throws an unchecked exception, and even if we didn’t handle or declare it, the program would not give a compilation error.

Consider the following code example:

```java
public class UncheckedExceptionTester {

    int firstNumber;
    int secondNumber;
    
    public UncheckedExceptionTester (int a, int b) {

        firstNumber = a;
        secondNumber = b;

    }

    public static void main(String[] args) {

        UncheckedExceptionTester testerObject = new UncheckedExceptionTester(7, 0);
        int dividedNumber = testerObject.divide(testerObject.firstNumber, testerObject.secondNumber);
        System.out.println(dividedNumber);

    }

    public int divide(int a, int b){

        return  a / b;

    }

}
```

If we run this, the output would be the following:

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
```

What does this mean?

Java does not verify unchecked exceptions at compile-time. Furthermore, we don't have to declare unchecked exceptions in a method with the throws keyword. And although the above code does not have any errors during compile-time, it will throw ArithmeticException at runtime.














