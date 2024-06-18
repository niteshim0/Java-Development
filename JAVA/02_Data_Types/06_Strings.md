# Strings in Java

## Strings as Reference Data Types:
- In Java, `String` is a class that represents a sequence of characters.
- `String` objects are reference data types, meaning variables of type `String` store references to `String` objects rather than the actual text.

## Immutability of Strings:
- Strings in Java are immutable, meaning once a `String` object is created, its value cannot be changed.
- The immutability of strings offers several advantages:
  - **Security**: Immutable strings prevent accidental or malicious modifications, making them safer to use (e.g., in class loading, user authentication).
  - **Thread Safety**: Since strings are immutable, they are inherently thread-safe and can be shared between multiple threads without synchronization.
  - **Caching**: Java optimizes string handling by caching string literals. Immutability ensures that these cached strings remain unchanged, improving performance and reducing memory footprint.

## String Constant Pool:
- The **String Constant Pool** is a special memory region in the Java heap where `String` literals are stored.
- When a string literal is created, the JVM checks the string pool to see if an identical string already exists. If it does, the reference to the existing string is returned. If not, the new string is added to the pool.
- This interning mechanism helps save memory by avoiding the creation of duplicate `String` objects for identical string literals.

## String Literals vs. String Objects:

### String Literals:
- String literals are defined directly in the code using double quotes.
  ```java
  String str1 = "Hello";
  String str2 = "Hello";

- In this example, `str1` and `str2` refer to the same object in the string pool because the string "Hello" already exists there.

### String Objects:

- String objects are created using the `new` keyword, which forces the creation of a new String object on the heap, `even if an identical string exists in the pool`.
  ```java
  String str3 = new String("Hello");
  String str4 = new String("Hello");

- In this example, str3 is a reference to a new String object on the heap, which is not the same as the "Hello" in the string pool. Similarly, str4 refers to another new String object on the heap.
