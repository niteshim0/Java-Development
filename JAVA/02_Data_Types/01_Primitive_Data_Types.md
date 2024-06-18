# Variables

- a variable acts as a container that holds data which can be used and manipulated throughout a program. 
- Variables allow developers to store, retrieve, and manipulate data in a flexible way.

## Key Characteristics of Variables

- **Name**: A variable must have a name that is unique within the scope of the program.
- **Type**: A variable must have a data type that defines the kind of data it can store.
- **Value**: A variable can store a value that can be changed during the execution of the program.
- **Scope**: A variable must have a scope that defines where it can be accessed within the program.
- **Lifetime**: A variable must have a lifetime that defines how long it exists in memory.


## Types of Variables

### Local Variables

- **Declaration:** Inside a method, constructor, or block.
- **Scope:** Limited to the block or method where they are declared.
- **Lifetime:** Exists only during the execution of the block or method in which they are declared.
- **Default Value:** No default value. Must be initialized before use.

```java
public void myMethod() {
    int localVar = 10; // Local variable
    System.out.println(localVar);
}
```

### Instance Variables

- **Declaration:** Inside a class but outside a method, constructor, or block.
- **Scope:** Accessible to all methods, constructors, and blocks in the class.Belongs to a specific instance of a class. Each object has its own copy.
- **Lifetime:** Exists as long as the object of the class exists.
- **Default Value:** Default values are assigned based on the data type(e.g., 0 for numeric types, null for object references).

```java
public class MyClass {
    int instanceVar; // Instance variable

    public MyClass(int value) {
        this.instanceVar = value;
    }
}
```

### Static Variables(Class Variables)

- **Declaration:** Inside a class but outside a method, constructor, or block with the `static` keyword.
- **Scope:** Accessible to all methods, constructors, and blocks in the class. Belongs to the class itself.
- **Lifetime:** Exists as long as the class is loaded in memory.
- **Default Value:** Default values are assigned based on the data type(e.g., 0 for numeric types, null for object references).

```java
public class MyClass {
    static int staticVar; // Static variable
}
```

### Parameters

- **Declaration:** In the method or constructor signature.
- **Scope:** Limited to the method or constructor where they are declared.
- **Lifetime:** Exists only during the execution of the method or constructor.
- **Default Value:** No default value. Must be initialized when the method or constructor is called.

```java
public void myMethod(int param) { // Parameter
    System.out.println(param);
}
```

### Constants

- **Declaration:** Inside a class but outside a method, constructor, or block with the `final` keyword.
- **Scope:** Accessible to all methods, constructors, and blocks in the class. Belongs to the class itself.
- **Lifetime:** Exists as long as the class is loaded in memory.
- **Default Value:** Must be initialized when declared.

```java
public class MyClass {
    static final int CONSTANT = 100; // Constant
}
```

## Variable Naming Conventions in Java

Adhering to naming conventions is essential for writing clear, readable, and maintainable code. Here are some standard conventions for naming variables in Java:

### General Conventions
1. **Descriptive Names**: Use meaningful and descriptive names that indicate the purpose of the variable.
   - Good: `totalAmount`, `userName`
   - Bad: `x`, `a1`

2. **Camel Case**: Start with a lowercase letter and use uppercase letters to indicate the start of new words.
   - Example: `firstName`, `totalScore`, `isAvailable`

3. **Case Sensitivity**: Remember that Java is case-sensitive. For example, `myVariable` and `myvariable` are considered different variables.

### Specific Conventions
1. **Local Variables**: Use short, descriptive names in camel case.
   - Example: `int count`, `String name`

2. **Instance Variables (Non-Static Fields)**: Use camel case. Often prefixed with `m` or `this.` when used in constructors or methods to distinguish them from local variables or parameters.
   - Example: `int age`, `double salary`
   - With `this`: `this.age = age`

3. **Class Variables (Static Fields)**: Use camel case. If they are constants, use all uppercase letters with underscores separating words.
   - Example (regular static field): `static int numberOfInstances`
   - Example (constant): `static final int MAX_USERS = 100`

4. **Parameters**: Use camel case similar to local variables.
   - Example: `public void setAge(int age)`

### Constants
- **Naming**: Use all uppercase letters with words separated by underscores. Constants are typically declared using the `final` keyword.
   - Example: `final int MAX_HEIGHT = 250`

### Naming Rules
1. **Start with a Letter**: Variable names should start with a letter, dollar sign (`$`), or an underscore (`_`). Subsequent characters may include digits.
2. **No Reserved Keywords**: Avoid using Java reserved keywords (e.g., `int`, `class`, `public`).

### Example Code
Here’s a Java class that demonstrates proper naming conventions:

```java
public class VariableNamingExample {

    // Class variable (constant)
    static final int MAX_USERS = 100;

    // Instance variables
    private int userId;
    private String userName;

    // Constructor
    public VariableNamingExample(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    // Method with local variables and parameters
    public void displayUserInfo() {
        // Local variable
        String info = "User ID: " + userId + ", User Name: " + userName;
        System.out.println(info);
    }

    // Main method to demonstrate variable naming
    public static void main(String[] args) {
        VariableNamingExample user = new VariableNamingExample(1, "John Doe");
        user.displayUserInfo();
    }
}
```

# Primitive Type Variables in Java

Java has eight primitive data types. These types are predefined by the language and named by a keyword. They serve as the building blocks for data manipulation in Java.

## 1. byte
- **Definition**: An 8-bit signed integer.
- **Size**: 1 byte (8 bits)
- **Range**: -128 to 127
- **Storage of Negative Values**: Uses two's complement representation.
- **Type**: Integral (integer)
- **Default Value**: 0

## 2. short
- **Definition**: A 16-bit signed integer.
- **Size**: 2 bytes (16 bits)
- **Range**: -32,768 to 32,767
- **Storage of Negative Values**: Uses two's complement representation.
- **Type**: Integral (integer)
- **Default Value**: 0

## 3. int
- **Definition**: A 32-bit signed integer.
- **Size**: 4 bytes (32 bits)
- **Range**: -2^31 to 2^31-1 (-2,147,483,648 to 2,147,483,647)
- **Storage of Negative Values**: Uses two's complement representation.
- **Type**: Integral (integer)
- **Default Value**: 0

## 4. long
- **Definition**: A 64-bit signed integer.
- **Size**: 8 bytes (64 bits)
- **Range**: -2^63 to 2^63-1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
- **Storage of Negative Values**: Uses two's complement representation.
- **Type**: Integral (integer)
- **Default Value**: 0L

## 5. float
- **Definition**: A single-precision 32-bit IEEE 754 floating point.
- **Size**: 4 bytes (32 bits)
- **Range**: Approximately ±3.40282347E+38F (6-7 significant decimal digits)
- **Type**: Fractional (floating-point)
- **Default Value**: 0.0f

## 6. double
- **Definition**: A double-precision 64-bit IEEE 754 floating point.
- **Size**: 8 bytes (64 bits)
- **Range**: Approximately ±1.79769313486231570E+308 (15 significant decimal digits)
- **Type**: Fractional (floating-point)
- **Default Value**: 0.0d

## 7. char
- **Definition**: A single 16-bit Unicode character.
- **Size**: 2 bytes (16 bits)
- **Range**: '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)
- **Type**: Integral (character)
- **Default Value**: '\u0000'

## 8. boolean
- **Definition**: Represents one bit of information.
- **Size**: Not precisely defined (depends on the JVM implementation, often as small as 1 bit but typically 1 byte for practical purposes)
- **Range**: `true` or `false`
- **Type**: Logical
- **Default Value**: false

## Storage of Negative Values in Integral Types
In Java, negative values for integral types (`byte`, `short`, `int`, `long`, `char`) are stored using two's complement representation. This means the highest bit is used as the sign bit:
- A `0` in the highest bit means the number is non-negative.
- A `1` in the highest bit means the number is negative.
- To find the two's complement of a number, invert all the bits and add 1 to the least significant bit.


