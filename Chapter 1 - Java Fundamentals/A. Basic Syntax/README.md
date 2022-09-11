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
            Testing.ExamplePrinter exampleObject = new Testing.ExamplePrinter();

            exampleObject.printExample();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

}

// 'Testing.ExamplePrinter' is my *Class*.
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

## Comments in Java

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

## Source File Name

The name of a source file should exactly match the public class name with the extension of .java. The name of the file can be a different name if it does not have any public class. Assume you have a public class AppRunner.

```
AppRunner.java // valid syntax
apprunner.java // invalid syntax
```

## Case Sensitivity

Java is a case-sensitive language, which means that the identifiers AB, Ab, aB, and ab are different in Java.

```
System.out.println("Hello World"); // valid syntax
system.out.println("Hello World"); // invalid syntax
```

## Class Names

- The first letter of the class should be in Uppercase:

```
class Testing.ExamplePrinter { ...code... } // Nice.
class examplePrinter { ...code... } // Allowed, but discouraged.
```

- If several words are used to form the name of the class, each inner word’s first letter should be in Uppercase. Underscores are allowed, but not recommended. Also allowed are numbers and currency symbols, although the latter are also discouraged because the are used for a special purpose (for inner and anonymous classes).

```
class Testing.ExamplePrinter { ...code... } // Nice.
class 1examplePrinter { ...code... } // NOT ALLOWED.
class $examplePrinter { ...code... } // Allowed, but discouraged.
class example$Printer { ...code... } // Allowed, but discouraged.
class example1Printer { ...code... } // Allowed, but discouraged.
class examplePrinter { ...code... } // Allowed, but discouraged.
```

## public static void main (String[] args) 

The method main() is the main entry point into a Java program; this is where the processing starts. Also allowed is the signature public static void main(String… args).

## Method Names

- All the method names should start with a lowercase letter.

```
public void printExample { ...code... } // Nice.
public void PrintExample { ...code... } // Allowed, but discouraged.
```

- If several words are used to form the name of the method, then each first letter of the inner word should be in Uppercase. Underscores are allowed, but not recommended. Also allowed are digits and currency symbols.

```
public void printExample { ...code... } // Nice.
public void 1printExample { ...code... } // NOT ALLOWED.
public void $printExample { ...code... } // Allowed, but discouraged.
public void print$Example { ...code... } // Allowed, but discouraged.
public void print1Example { ...code... } // Allowed, but discouraged.
public void PrintExample { ...code... } // Allowed, but discouraged.
```

## Identifiers in Java

Identifiers are the names of local variables, instance and class variables, and labels, but also the names for classes, packages, modules and methods. All Unicode characters are valid, not just the ASCII subset. 

- In programming languages, identifiers are used for identification purposes. In Java, an identifier can be a class name, method name, variable name, or label. For example : 

```java
public class Example
{
    public static void main(String[] args)
    {
        int a = 20;
    }
}
```

In the above java code, we have 5 identifiers namely : 

- Example : class name.
- main : method name.
- String : predefined class name.
- args : variable name.
- a :  variable name.

### Rules for defining Java identifiers:

1. All identifiers can begin with a letter, a currency symbol or an underscore (_). According to the convention, a letter should be lower case for variables.

2. The first character of identifiers can be followed by any combination of letters, digits, currency symbols and the underscore. The underscore is not recommended for the names of variables. Constants (static final attributes and enums) should be in all Uppercase letters.

3. Most importantly identifiers are case-sensitive.

4. A keyword cannot be used as an identifier since it is a reserved word and has some special meaning.

``` 
Legal identifier examples: myTestIdentifier, _my_test_identifier, MY_TEST_IDENTIFIER, MyTestIdentifier, my10thTestIdentifier, $testIdentifier, mYtEsTiDeNtIfIeR.
Illegal identifier examples: 1337testVariable, -TESTVARIABLE.
```

## Java Keywords

Keywords or Reserved words are the words in a language that are used for some internal process or represent some predefined actions. These words are therefore not allowed to use as variable names or objects.

```
abstract | assert | boolean | break | byte | casecatch | char | class |	const |	continue | default | do | double | else | enum
extends | final | finally | float | for | goto | if | implements | import | instanceof | int | interface
long | native |	new | package | private | protected | public | return | short |	static | strictfp | super
switch | synchronized |	this | throw | throws |	transient | try | void | volatile | while
```

## White Spaces in Java

A line containing only white spaces, possibly with the comment, is known as a blank line, and the Java compiler totally ignores it.

## Modifiers in Java

### Access Modifiers:

These modifiers control the scope of class and methods.

- Access Modifiers: Private, Default, Protected, Private.

1. Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
4. Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.


| Access Modifier | Within Class | Within Package | Outside Package by subclass only | Outside Package |
|-----------------|--------------|----------------|----------------------------------|-----------------|
| Private         | YES          | NO             | NO                               | NO              |
| Default         | YES          | YES            | NO                               | NO              |
| Protected       | YES          | YES            | YES                              | NO              |
| Public          | YES          | YES            | YES                              | YES             |

### Non-access Modifiers:

These types of modifiers are used to control a variety of things, such as inheritance capabilities, whether all objects of our class share the same member value or have their own values of those members, whether a method can be overridden in a subclass, etc.

Without going in too deep on what each of these modifiers handles, I found a handy table that summarizes pretty good:

| Modifier Name | Overview                                                                                                        |
|---------------|-----------------------------------------------------------------------------------------------------------------|
| static        | The member belongs to the class, not to objects of that class.                                                  |
| final         | Variable values can't be changed once assigned, methods can't be overriden, classes can't be inherited.         |
| abstract      | If applied to a method - has to be implemented in a subclass, if applied to a class - contains abstract methods |
| synchronized  | Controls thread access to a block/method.                                                                       |
| volatile      | The variable value is always read from the main memory, not from a specific thread's memory.                    |
| transient     | The member is skipped when serializing an object.                                                               |





