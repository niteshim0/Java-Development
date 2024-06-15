# JVM (Java Virtual Machine) Architecture

## Java Virtual Machine
The Java Virtual Machine (JVM) is an abstract machine. It is a specification that provides a runtime environment in which Java bytecode can be executed. JVMs are available for many hardware and software platforms (i.e., JVM is platform-dependent).

### What is JVM
It is:

- **A Specification**: The working of the Java Virtual Machine is specified, but the implementation provider is independent to choose the algorithm. Its implementation has been provided by Oracle and other companies.
- **An Implementation**: Its implementation is known as JRE (Java Runtime Environment).
- **Runtime Instance**: Whenever you write the `java` command on the command prompt to run the Java class, an instance of JVM is created.

### What it does
The JVM performs the following operations:

- **Loads Code**
- **Verifies Code**
- **Executes Code**
- **Provides Runtime Environment**

### JVM Provides Definitions For:
- Memory Area
- Class File Format
- Register Set
- Garbage-Collected Heap
- Fatal Error Reporting, etc.

## Internal Architecture of JVM

![](https://www.javatpoint.com/images/jvm-architecture.png)

### JVM Components

1. **ClassLoader**
   Classloader is a subsystem of JVM which is used to load class files. Whenever we run the Java program, it is loaded first by the classloader. There are three built-in classloaders in Java:
   
   - **Bootstrap ClassLoader**: This is the first classloader which is the superclass of Extension classloader. It loads the `rt.jar` file which contains all class files of Java Standard Edition like `java.lang` package classes, `java.net` package classes, `java.util` package classes, `java.io` package classes, `java.sql` package classes, etc.
   
   - **Extension ClassLoader**: This is the child classloader of Bootstrap and parent classloader of System classloader. It loads the jar files located inside `$JAVA_HOME/jre/lib/ext` directory.
   
   - **System/Application ClassLoader**: This is the child classloader of Extension classloader. It loads the class files from classpath. By default, classpath is set to the current directory. You can change the classpath using `-cp` or `-classpath` switch. It is also known as Application classloader.

   ```java
   // Example to print the classloader name
   public class ClassLoaderExample {  
       public static void main(String[] args) {  
           // Let's print the classloader name of current class.   
           // Application/System classloader will load this class  
           Class c = ClassLoaderExample.class;  
           System.out.println(c.getClassLoader());  
           // If we print the classloader name of String, it will print null because it is an  
           // in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
           System.out.println(String.class.getClassLoader());  
       }  
   }  
    ```
2. **Class(Method) Area**
Class(Method) Area stores per-class structures such as the runtime constant pool, field and method data, and the code for methods.

3. **Heap**

Heap is the runtime data area in which objects are allocated. Java heap is divided into two areas:

- **Young Generation**: This is where all new objects are allocated and aged. When the young generation fills up, this causes a minor garbage collection.
- **Old or Tenured Generation**: This is where long-lived objects are stored. When the old generation fills up, this causes a major garbage collection. Most garbage collection occurs in the young generation.

4. **Stack**
Java Stack stores frames. It holds local variables and partial results, and plays a part in method invocation and return. Each thread has its own Java Stack, which is created when the thread is created. Java Stack is thread-safe.

5. **Program Counter Register**

PC (program counter) register contains the address of the Java virtual machine instruction currently being executed.

6. **Native Method Stack**

It contains all the native methods used in the application.

7. **Execution Engine**

The JVM executes the .class file line by line. It contains:

- **JIT (Just-In-Time) Compiler**: It is used to improve the performance. JIT compiles parts of the byte code that have similar functionality at the same time, and hence reduces the amount of time needed for compilation. Here the term "compiler" refers to a translator from the instruction set of a Java virtual machine (JVM) to the instruction set of a specific CPU.

8. **Native Method Interface**

It is a programming framework that enables Java code running in a JVM to call and be called by native applications and libraries written in other languages such as C, C++, etc.

9. **Java Native Interface**

It defines a way for the bytecode that is executed by the JVM to interoperate with applications and libraries written in other programming languages.

10. **Java Virtual Machine (JVM) Architecture**

The JVM architecture is based on three distinct subsystems:

- **Class Loader Subsystem**: It is used to load class files.

- **Runtime Data Area**: It is divided into method area, heap, stack, and PC registers.

- **Execution Engine**: It is used to execute the instructions contained in the method area.

## JVM Memory Areas

### Method Area

- **Static variables**
- **Class information**
- **Method information**
- **Runtime constant pool**

### Heap Area

- **Objects**
- **Instance variables**

### Stack Area

- **Local variables**
- **Method calls**


## JVM Memory Management

### Heap Memory

- **Garbage Collection**: The JVM performs automatic memory management through garbage collection. It periodically scans the heap to identify objects that are no longer in use and reclaims their memory. This helps prevent memory leaks and ensures efficient memory utilization.

- **Memory Areas**: The JVM divides memory into different areas, such as the heap, stack, method area, and native method stack, each serving a specific purpose in the execution of Java programs.

### Stack Memory

- **Stack Memory**: Each thread in a Java program has its own stack memory, which is used for storing local variables, method parameters, and intermediate results. Stack memory is faster to access than heap memory.






