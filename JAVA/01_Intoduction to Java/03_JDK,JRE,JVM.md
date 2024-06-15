# Java Virtual Machine (JVM)

## Overview
The Java Virtual Machine (JVM) is an abstract machine that provides a runtime environment for executing Java bytecode. It is called a virtual machine because it does not physically exist; it is a specification that defines a set of operations for a runtime environment. The JVM can also run programs written in other languages that are compiled to Java bytecode.

## Platform Dependency
- **JVM, JRE, and JDK**: Although JVM, Java Runtime Environment (JRE), and Java Development Kit (JDK) are platform-dependent due to different OS configurations, Java itself is platform-independent. This means that Java programs can run on any device equipped with a compatible JVM.
- **Availability**: JVMs are available for many hardware and software platforms, ensuring that Java applications can be executed anywhere.

## Three Notions of the JVM
1. **Specification**: This is a document that formally describes the requirements and behaviors of the JVM. It provides a blueprint for building JVM implementations.
2. **Implementation**: This refers to the actual software implementation of the JVM specification. There can be multiple implementations of the JVM, provided they adhere to the specification.
3. **Instance**: When you run a Java program, an instance of the JVM is created. This instance executes the compiled Java bytecode.

## Main Tasks of the JVM

1. **Loads Code**:
    - The JVM loads the Java bytecode into memory. This is done by the class loader, which locates and imports the necessary class files.
    - Class loading is a dynamic process, meaning classes are loaded into memory as they are needed during execution.

2. **Verifies Code**:
    - The JVM verifies the bytecode to ensure it adheres to the Java language rules and does not violate security constraints.
    - Bytecode verification involves checking the code for type safety, ensuring no illegal bytecode operations are performed, and that the code does not perform any actions that could corrupt the runtime environment.

3. **Executes Code**:
    - The JVM executes the bytecode using an interpreter or a Just-In-Time (JIT) compiler.
    - The interpreter reads and executes bytecode instructions one by one. In contrast, the JIT compiler translates bytecode into native machine code, which is then executed directly by the hardware. This improves performance by allowing frequently executed code paths to run more efficiently.

4. **Provides Runtime Environment**:
    - The JVM provides a runtime environment that includes memory management, garbage collection, and other services necessary for the execution of Java applications.
    - This environment abstracts away the underlying hardware and OS, allowing Java programs to run consistently across different platforms.

5. **Ensures Security**:

    - The JVM enforces security restrictions to prevent malicious code from causing harm to the system.
    - Security features include sandboxing, which isolates untrusted code, and access controls to restrict certain operations.

## Memory Management in the JVM

- **Heap Memory**: The JVM manages memory allocation for objects in the heap. The heap is a region of memory where objects are stored, and it is shared among all threads.

- **Stack Memory**: Each thread in a Java program has its own stack memory, which is used for storing local variables, method parameters, and intermediate results. Stack memory is faster to access than heap memory.

- **Garbage Collection**: The JVM performs automatic memory management through garbage collection. It periodically scans the heap to identify objects that are no longer in use and reclaims their memory. This helps prevent memory leaks and ensures efficient memory utilization.

- **Memory Areas**: The JVM divides memory into different areas, such as the heap, stack, method area, and native method stack, each serving a specific purpose in the execution of Java programs.

## JVM Implementations

- **Oracle HotSpot**: The most widely used JVM implementation, known for its high performance and optimizations.

- **OpenJ9**: An open-source JVM implementation developed by IBM that focuses on memory efficiency and fast startup times.

- **GraalVM**: A high-performance JVM implementation that includes a polyglot runtime, allowing developers to run programs written in multiple languages on the JVM.

- **Zing JVM**: A commercial JVM implementation by Azul Systems that is optimized for low-latency and high-throughput applications.

- **JRockit**: A JVM implementation by Oracle that is designed for high performance and scalability in enterprise applications.

## JVM Languages

- **Java**: The primary language for JVM development, known for its simplicity, readability, and strong ecosystem of libraries and frameworks.

- **Kotlin**: A modern, statically-typed language that is fully interoperable with Java and offers features such as null safety, extension functions, and coroutines.

- **Scala**: A functional and object-oriented language that combines features of both paradigms. Scala is known for its expressive syntax and powerful type system.

- **Groovy**: A dynamic language that is compatible with Java and provides features such as closures, dynamic typing, and domain-specific language support.

- **Clojure**: A functional Lisp dialect that runs on the JVM and emphasizes immutability, concurrency, and simplicity.

- **JRuby**: An implementation of the Ruby programming language that runs on the JVM, allowing Ruby developers to leverage Java libraries and tools.

- **Jython**: An implementation of the Python programming language that runs on the JVM, enabling Python developers to interact with Java code and libraries.

- **Gosu**: A statically-typed language that runs on the JVM and is designed for ease of use and readability.

- **Ceylon**: A modern, modular language that runs on the JVM and is designed for large-scale enterprise applications.


# Java Runtime Environment (JRE)

## Overview
The Java Runtime Environment (JRE) is a software package that provides the necessary runtime components to execute Java applications. It includes the Java Virtual Machine (JVM), core libraries, and other components required to run Java programs. The JRE does not contain development tools such as compilers and debuggers, which are included in the Java Development Kit (JDK).

## Key Points
- **JRE**: Acronym for Java Runtime Environment, also written as Java RTE.
- **Purpose**: Provides the runtime environment for executing Java applications.
- **Components**: Includes the JVM, core libraries, and other necessary components to run Java applications.
- **Excludes**: Development tools like compilers and debuggers, which are part of the JDK.
- **Existence**: The JRE physically exists as a set of software tools used for developing and running Java applications.

## Composition
The JRE contains:
- **Java Virtual Machine (JVM)**: Executes the Java bytecode.
- **Core Libraries**: A set of libraries that JVM uses at runtime, which include essential classes and APIs.
- **Other Components**: Various runtime libraries and components that support Java program execution.

## Implementations
The implementation of the JVM and JRE is also actively released by other companies besides Sun Microsystems (now part of Oracle Corporation). These implementations adhere to the standard specifications provided by Oracle but may include additional features or optimizations specific to certain platforms or needs.

## Diagram
![JRE](https://static.javatpoint.com/images/jre2.png)

# JDK(Java Development Kit)

## Overview
The Java Development Kit (JDK) is a software development kit used to develop Java applications. It includes the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), and other tools needed for Java development. The JDK is a superset of the JRE, providing additional tools and libraries for developing, debugging, and monitoring Java applications.

## Key Points

- **JDK**: Acronym for Java Development Kit.
- **Purpose**: Used for developing Java applications.
- **Components**: Includes the JRE, compiler, interpreter, archiver, documentation generator, and other tools.
- **Superset**: Contains all the tools and libraries provided by the JRE, along with additional development tools.
- **Existence**: The JDK physically exists as a set of software tools used for developing Java applications.

## Composition
The JDK contains:
- **Java Runtime Environment (JRE)**: Provides the runtime environment for executing Java applications.
- **Java Compiler (javac)**: Translates Java source code into bytecode.
- **Java Interpreter/Loader (Java)**: Loads and executes Java bytecode.
- **Java Archiver (jar)**: Packages Java classes and resources into a single archive file.
- **Documentation Generator (Javadoc)**: Generates API documentation from Java source code.
- **Other Tools**: Various tools for developing, debugging, and monitoring Java applications.


## Implementations

The JDK is available in different implementations, each providing a set of tools and libraries for Java development. Some popular JDK implementations include:

- **Oracle JDK**: The official JDK distribution provided by Oracle Corporation.
- **OpenJDK**: An open-source implementation of the JDK that is maintained by the OpenJDK community.
- **AdoptOpenJDK**: A distribution of the OpenJDK that is supported by the AdoptOpenJDK community.
- **Amazon Corretto**: A no-cost, multiplatform distribution of the OpenJDK provided by Amazon.

## Diagram

![JDK](https://static.javatpoint.com/images/jdk2.png)



