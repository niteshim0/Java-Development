# First Java Program

```java
class FirstJavaProgram {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

# To Compile and Run

```bash
javac FirstJavaProgram.java
java FirstJavaProgram
```

# Output
```
Hello, World!
```

# Explanation

- The `class` keyword is used to declare a class in Java.
- The `main` method is the entry point of any Java program. It is declared with the `public` access modifier so that it can be accessed from outside the class.
- `static` is a keyword. If we declare any method as static, it is known as the static method. The` core advantage of the static method is that there is no need to create an object to invoke the static method`. The main() method is executed by the JVM, so it doesn't require creating an object to invoke the main() method. So, it saves memory.
- `System.out.println()` is used to print statement. Here, System is a class, out is an object of the PrintStream class, println() is a method of the PrintStream class.
- String[] args or String args[] is used for command line argument. It is an array of type java.lang.String class. args is the variable name of the String array. It is widely used for command line argument.
- `void` is the return type of the method. It means it doesn't return any value. 
