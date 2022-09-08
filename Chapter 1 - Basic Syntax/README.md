# Basic Syntax

Thanks to my previous experience with other programming languages, adapting to the Java Syntax was not much of a struggle, but for organization and cleanliness sake, lets go through them again:

Java relies heavily on objects and OOP, so lets start from the beginning and run through the fundamentals:

## Basic terminologies in Java.

### Class:

A class is a blueprint (plan) of the instance of a class (object). It can be defined as a template that describes the data and behavior associated with its instance.

### Object:

An object is an instance of a class. It is an entity that has behavior and state.

### Method:

A method is the behaviour of a particular object. (Functions of a certain object)

### Instance Variables:

Every object has its own unique set of instance variables. The state of an object is generally created by the values that are assigned to these instance variables. These are also known as object properties.

## Example

````java
class AppRunner {

    public static void main(String[] args) {

        try{

            // 'exampleObject' is my instantiated class, therefore my *Object*.
            ExamplePrinter exampleObject = new ExamplePrinter();

            exampleObject.printExample();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

}

// 'ExamplePrinter' is my *Class*.
class ExamplePrinter {

    // 'example' is my Instance *Variable*.
    String example = "Hello World - example version";

    // 'printExample' is my *Method*.
    public void printExample(){

        System.out.println(example);

    }

}
````

The output after running:

````
Hello World - example version
````

# Syntax:

## Comments in Java:

### Single Line Comment

```
// This is a single line comment.
```

### Multi-line Comment

```
/*
A line of code;
Another line of code;
*/
```

### Documentation Comment

``` 
/** documentation */
```

## Source File Name:

The name of a source file should exactly match the public class name with the extension of .java. The name of the file can be a different name if it does not have any public class. Assume you have a public class AppRunner.

```
AppRunner.java // valid syntax
apprunner.java // invalid syntax
```

## Case Sensitivity:

Java is a case-sensitive language, which means that the identifiers AB, Ab, aB, and ab are different in Java.

```
System.out.println("Hello World"); // valid syntax
system.out.println("Hello World"); // invalid syntax
```

## Class Names:

### The first letter of the class should be in Uppercase:

```
class ExamplePrinter { ...code... } // Nice.
class examplePrinter { ...code... } // Allowed, but discouraged.
```

### If several words are used to form the name of the class, each inner word’s first letter should be in Uppercase. Underscores are allowed, but not recommended. Also allowed are numbers and currency symbols, although the latter are also discouraged because the are used for a special purpose (for inner and anonymous classes).

```
class ExamplePrinter { ...code... } // Nice.
class 1examplePrinter { ...code... } // NOT ALLOWED.
class $examplePrinter { ...code... } // Allowed, but discouraged.
class example$Printer { ...code... } // Allowed, but discouraged.
class example1Printer { ...code... } // Allowed, but discouraged.
class examplePrinter { ...code... } // Allowed, but discouraged.
```

## public static void main (String[] args) :

The method main() is the main entry point into a Java program; this is where the processing starts. Also allowed is the signature public static void main(String… args).

## Method Names:

### All the method names should start with a lowercase letter.

```
public void printExample { ...code... } // Nice.
public void PrintExample { ...code... } // Allowed, but discouraged.
```

### If several words are used to form the name of the method, then each first letter of the inner word should be in Uppercase. Underscores are allowed, but not recommended. Also allowed are digits and currency symbols.

```
public void printExample { ...code... } // Nice.
public void 1printExample { ...code... } // NOT ALLOWED.
public void $printExample { ...code... } // Allowed, but discouraged.
public void print$Example { ...code... } // Allowed, but discouraged.
public void print1Example { ...code... } // Allowed, but discouraged.
public void PrintExample { ...code... } // Allowed, but discouraged.
```

## Identifiers in Java:

Identifiers are the names of local variables, instance and class variables, and labels, but also the names for classes, packages, modules and methods. All Unicode characters are valid, not just the ASCII subset. 