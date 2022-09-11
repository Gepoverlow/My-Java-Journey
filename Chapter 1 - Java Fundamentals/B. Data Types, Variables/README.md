# Data Types, Variables

## Data Types:

Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java: 

- Primitive: The primitive data types include boolean, char, byte, short, int, long, float and double.
- Non-primitive (a.k.a reference types, because they reference to an object): The non-primitive data types include String(yes, these are actually reference to a String object!), Classes, Arrays, Interfaces, etc.

### PlayingAround.Main differences between Primitive and Non-Primitive(or reference):

1. Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
2. Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
3. A primitive type has always a value, while non-primitive types can be null.
4. A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
5. The size of a primitive type depends on the data type, while non-primitive types have all the same size.

### Primitives Handy table:

| Data Type | Size    | Description                                                                        | Example                      |
|-----------|---------|------------------------------------------------------------------------------------|------------------------------|
| byte      | 1 byte  | Stores whole numbers from -128 to 127                                              | byte foo = 10;               |
| short     | 2 bytes | Stores whole numbers from -32,768 to 32,767                                        | short foo = 1000;            |
| int       | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647                          | int foo = 100_000;           |
| long      | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to  9,223,372,036,854,775,807 | long foo = 100_000_000_000L; |
| float     | 4 bytes | Stores fractional numbers. Sufficient for  storing 6 to 7 decimal digits           | float foo = 10.10F;          |
| double    | 8 bytes | Stores fractional numbers. Sufficient for  storing 15 decimal digits               | double foo = 10.123456789;   |
| char      | 2 bytes | Stores a single character/letter or ASCII values                                   | char foo = 'A';              |
| boolean   | 1 byte  | Stores true or false values                                                        | boolean foo = true;          |

## Variables 

A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.

As we saw in the previous primitives table above, 'foo' is the name of the variable where we store the data in.

There are 3 types of variables in Java: Local, Instance and Static.

### Local Variable

A variable defined within a block or method or constructor is called a local variable.

- These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.
- The scope of these variables exists only within the block in which the variables are declared, i.e., we can access these variables only within that block.
- Initialization of the local variable is mandatory before using it in the defined scope.

````java
class Example {
    
    public static void main(String[] args) {

        // Declare a Local Variable. This variable is local to this main method only.
        int localVariable = 10;
        System.out.println('The local variable value is '+ localVariable);
        
    }
    
}
````

Output:
```
The local variable value is 10
```

### Instance Variable

Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block.

- As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
- Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used.
- Initialization of an instance variable is not mandatory. Its default value is 0.
- Instance variables can be accessed only by creating objects.

````java
class InstanceVariableTester {

    // Declare Instance Variable
    public String instanceVariable;

    // Default Constructor
    public InstanceVariableTester() {

        // initializing Instance Variable
        this.instanceVariable = "Hello World - instance variable edition"; 

    }
    
    //PlayingAround.Main Method
    public static void main(String[] args) {

        // Object Creation
        Testing.InstanceVariableTester exampleObject = new Testing.InstanceVariableTester();
        // Displaying O/P
        System.out.println("Version: " + exampleObject.instanceVariable);

    }
}
````

Output:
```
Version: Hello World - instance variable edition
```

### Static Variable

Static variables are also known as class variables.

- These variables are declared similarly as instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor or block.
- Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.
- Static variables are created at the start of program execution and destroyed automatically when execution ends.
- Initialization of a static variable is not mandatory. Its default value is 0.
- If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically.
- If we access a static variable without the class name, the compiler will automatically append the class name.

````java
class StaticVariableTester {

    //Declared static variable
    public static String staticVariable = "Hello World - static variable edition";

    public static void main (String[] args) {

        //staticVariable variable can be accessed without object creation
        //Displaying O/P
        //Testing.StaticVariableTester.staticVariable --> using the static variable
        System.out.println("Version : "+Testing.StaticVariableTester.staticVariable);
        
    }
    
}
````

Output:

```
Version : Hello World - static variable edition
```










