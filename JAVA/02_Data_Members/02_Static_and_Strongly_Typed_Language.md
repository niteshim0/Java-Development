# Static and Strong Typed Languages

## Static Typed Languages

**Static typing** means that the type of a variable is known at compile-time. This means that variable types are explicitly declared and thus known before the program runs. 

### Characteristics of Static Typing:
1. **Type Checking at Compile Time**: Errors related to type mismatches are caught during the compilation process, before the program is run.
2. **Explicit Type Declarations**: Variables must be declared with a specific type before they are used.
3. **Better Performance**: Since the types are known at compile time, optimizations can be made by the compiler for better performance.
4. **Improved Code Safety**: Helps prevent certain types of bugs by ensuring type correctness before runtime.

### Examples of Statically Typed Languages:
- **Java**: 
    ```java
    int number = 5;
    String text = "Hello, World!";
    ```
- **C++**:
    ```cpp
    int number = 5;
    std::string text = "Hello, World!";
    ```

## Strong Typed Languages

**Strong typing** means that the language enforces strict rules on how different types of data can be intermingled. A strongly typed language prevents operations between incompatible types, reducing the risk of runtime errors related to type mismatches(their is range of data types).

### Characteristics of Strong Typing:
1. **Type Safety**: Prevents operations on incompatible types, such as adding an integer to a string, unless explicitly allowed by the language rules.
2. **Less Implicit Conversions**: Does not allow implicit type conversions that might lead to unexpected behaviors. Any type conversion needs to be explicit.
3. **Error Prevention**: Helps prevent certain types of errors by ensuring that types are used correctly.

### Examples of Strongly Typed Languages:
- **Java**: 
    ```java
    int number = 5;
    String text = "Number: " + number; // Allowed: Concatenation converts number to string
    int result = number + text; // Compilation error: Incompatible types
    ```
- **Python** (also strongly typed but dynamically typed):
    ```python
    number = 5
    text = "Hello"
    result = number + text # Raises TypeError: unsupported operand type(s) for +: 'int' and 'str'
    ```

## Combining Static and Strong Typing

Many languages, like Java, are both statically and strongly typed. This means:
- **Statically Typed**: Types are checked at compile-time, requiring explicit type declarations.
- **Strongly Typed**: Strict type rules are enforced, preventing operations on incompatible types without explicit conversions.

### Examples in Java (Statically and Strongly Typed):

- **Correct Usage**:
    ```java
    int number = 5;
    String text = "Hello";
    String combined = text + number; // Allowed: 'number' is implicitly converted to String
    ```

- **Type Error**:
    ```java
    int number = 5;
    String text = "Hello";
    int result = number + text; // Compilation error: Incompatible types: int cannot be converted to String
    ```

