# Types of Conversion in Java

In Java, type conversion refers to changing the type of a variable from one type to another. This can be done either implicitly (automatically by the compiler) or explicitly (manually by the programmer). There are two main types of type conversion:

## 1. Implicit Conversion (Widening Conversion)
Implicit conversion, also known as widening conversion, occurs automatically when the source type is smaller than the destination type. This type of conversion is safe and does not lose information.

### Characteristics:
- No data loss
- Automatically performed by the Java compiler
- Converts a smaller type to a larger type

### Examples of Implicit Conversion:
- **byte to short, int, long, float, double**
- **short to int, long, float, double**
- **char to int, long, float, double**
- **int to long, float, double**
- **long to float, double**
- **float to double**

### Example Code:
```java
public class ImplicitConversionExample {
    public static void main(String[] args) {
        int intVar = 100;
        long longVar = intVar; // int to long
        float floatVar = longVar; // long to float
        double doubleVar = floatVar; // float to double

        System.out.println("Int value: " + intVar);
        System.out.println("Long value: " + longVar);
        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);
    }
}
```

## 2. Explicit Conversion (Narrowing Conversion)
Explicit conversion, also known as narrowing conversion, requires the programmer to manually convert the source type to the destination type. This type of conversion can lead to data loss and must be done carefully.

- If their is curreny involved in the conversion, it is better to use `BigDecimal` class to avoid any loss of precision or `BigInteger` class for large numbers.(This is the reason most of the companies lost millions of dollars due to loss of precision in currency conversion.)

### Characteristics:
- Possible data loss
- Must be explicitly done using cast operators
- Converts a larger type to a smaller type

### Examples of Explicit Conversion:
- **double to float, long, int, short, byte, char**
- **float to long, int, short, byte, char**
- **long to int, short, byte, char**
- **int to short, byte, char**
- **short to byte, char**
- **char to byte, short**

### Example Code:
```java
public class ExplicitConversionExample {
    public static void main(String[] args) {
        double doubleVar = 100.04;
        float floatVar = (float) doubleVar; // double to float
        long longVar = (long) floatVar; // float to long
        int intVar = (int) longVar; // long to int
        short shortVar = (short) intVar; // int to short
        byte byteVar = (byte) shortVar; // short to byte

        System.out.println("Double value: " + doubleVar);
        System.out.println("Float value: " + floatVar);
        System.out.println("Long value: " + longVar);
        System.out.println("Int value: " + intVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Byte value: " + byteVar);
    }
}
```

# Promotion During Expression in Java

In Java, promotion during expressions refers to the automatic conversion of operands to a wider data type in expressions involving mixed data types. This is similar to implicit conversion but specifically occurs during arithmetic or bitwise operations.

## Types of Promotion

### 1. Numeric Promotion
Numeric promotion occurs when operators with mixed data types are involved in arithmetic or bitwise operations. It ensures that operands are converted to a common type before the operation is performed.

#### Rules for Numeric Promotion:
- **If either operand is `double`, the other is converted to `double`.**
- **Otherwise, if either operand is `float`, the other is converted to `float`.**
- **Otherwise, if either operand is `long`, the other is converted to `long`.**
- **Otherwise, both operands are converted to `int`.**

### Example of Numeric Promotion:
```java
public class NumericPromotionExample {
    public static void main(String[] args) {
        int intValue = 5;
        double doubleValue = 10.5;
        double result = intValue + doubleValue; // int is promoted to double

        System.out.println("Result: " + result); // Output: 15.5
    }
}
```

### 2. Boolean Promotion

Boolean promotion occurs in conditional expressions (&&, ||, ? :) and bitwise operations (&, |, ^, ~). It converts boolean values to int values (true to 1 and false to 0) for evaluation.

```java
public class BooleanPromotionExample {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;
        int result = (condition1 && condition2) ? 1 : 0; // boolean promoted to int

        System.out.println("Result: " + result); // Output: 0 (false && true)
    }
}
```


- Promotion during expressions ensures that operations are performed with a higher precision or capacity type when necessary.
- It helps prevent data loss and maintains accuracy in arithmetic and bitwise operations.

