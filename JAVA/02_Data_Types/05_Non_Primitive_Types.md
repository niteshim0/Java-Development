# Reference(Non-Primitive) Data Types

## Introduction

In Java, reference data types are types that refer to objects. Unlike primitive data types which store their values directly, reference data types store references (or addresses) to the locations in memory where the actual data (objects) are stored.

Reference data types are also called non-primitive data types because they do not store values directly. Instead, they store references to the memory locations where the values are stored.

Reference data types are used to represent complex data structures such as objects, arrays, classes, interfaces, and enums.

## Characteristics of Reference Data Types

- `Default Value`: The default value for reference data types is null.
- `Methods`: Reference types can have methods defined in the class or interface which they refer to.
- `Memory Allocation`: Memory for objects is allocated on the heap.
- `Accessing Members`: Members (fields and methods) of reference data types are accessed using the dot operator (e.g., obj.field or obj.method()).
- `Passing as Arguments`: Reference data types are passed by reference when used as arguments in methods. This means that changes made to the object inside the method will affect the original object.
- `Equality`: Reference data types are compared using the `==` operator, which compares the references (memory addresses) of the objects, not the values they contain. To compare the values of objects, you need to override the `equals()` method.

## Types of Reference Data Types

Java has several built-in reference data types. Some of the most commonly used reference data types include:

1. **String**: Represents a sequence of characters.(discussed in detail in separate section)
2. **Array**: Represents a collection of elements of the same type.
3. **Class**: Represents a blueprint for creating objects.
4. **Interface**: Represents a contract for classes that implement it.
5. **Enum**: Represents a group of named constants.

## Class

- Classes are blueprints for objects. When you create an instance of a class, it becomes an object. The class defines the structure and behaviors (fields and methods) that the objects created from it will have.

- When a class is defined, no memory is allocated for it. However, when an object is created, memory is allocated for it.

- The `new` keyword is used to create objects from a class. It allocates memory for the object and returns a reference to the memory location where the object is stored.

- The reference to an object can be stored in a variable of the class type. This variable is called an object reference.

- The object reference can be used to access the fields and methods of the object.

- Example:

  ```java
  class Person {
      String name;
      int age;
  }

  public class Main {
      public static void main(String[] args) {
          Person person1 = new Person();
          person1.name = "Alice";
          person1.age = 30;

          System.out.println(person1.name + " is " + person1.age + " years old.");
      }
  }
  ```

  Output:

  ```
  Alice is 30 years old.
  ```

## Interface

- An interface in Java is a reference data type that defines a set of abstract methods that a class must implement. It is a contract that specifies the behavior that a class must provide.

- An interface can contain constants, abstract methods, default methods, and static methods.

- A class implements an interface by providing concrete implementations for the abstract methods defined in the interface.

- An interface is similar to a class but cannot be instantiated. It is used to achieve abstraction and multiple inheritance in Java.

- Example:

  ```java
  interface Shape {
      double getArea();
  }

  class Circle implements Shape {
      double radius;

      Circle(double radius) {
          this.radius = radius;
      }

      @Override
      public double getArea() {
          return Math.PI * radius * radius;
      }
  }

  public class Main {
      public static void main(String[] args) {
          Circle circle = new Circle(5);
          System.out.println("Area of the circle: " + circle.getArea());
      }
  }
  ```

  Output:

  ```
  Area of the circle: 78.53981633974483
  ```

## Enum

- An enum in Java is a special data type that represents a group of named constants. It is used to define a set of predefined values that can be assigned to a variable.

- Enums are a special class type that represents a group of constants (unchangeable variables, like final variables). Each enum constant is an object of its enum type.

- Enums are used to define collections of related constants that are logically grouped together.

- Example:

  ```java
  enum Day {
      SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
  }

  public class Main {
      public static void main(String[] args) {
          Day today = Day.MONDAY;
          System.out.println("Today is " + today);
      }
  }
  ```

  Output:

  ```
  Today is MONDAY
  ```

## Array

- An array in Java is a reference data type that represents a collection of elements of the same type. It is used to store multiple values of the same data type in a single variable.

- Arrays are objects in Java, and they are dynamically allocated on the heap memory.

- The elements of an array can be accessed using an index, which represents the position of the element in the array.

- Example:

  ```java
  public class Main {
      public static void main(String[] args) {
          int[] numbers = {1, 2, 3, 4, 5};
          for (int i = 0; i < numbers.length; i++) {
              System.out.println("Element at index " + i + ": " + numbers[i]);
          }
      }
  }
  ```

  Output:

  ```
  Element at index 0: 1
  Element at index 1: 2
  Element at index 2: 3
  Element at index 3: 4
  Element at index 4: 5
  ```








