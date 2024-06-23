# Java SE JDK 17 - Oracle's 1ZO-829 exam's preparation

The purpose of this repository is to serve as a workspace in which every topic of Oracle's IZO-829 will be addressed.

## Exam's Objectives

<ol>
    <li>
        Handling date, time, text, numeric and boolean values
        <ol>
            <li>Use primitives and wrapper classes including Math API, parentheses, type promotion, and casting to evaluate arithmetic and boolean expressions</li>
            <li>Manipulate text, including text blocks, using String and StringBuilder classes</li>
            <li>Manipulate date, time, duration, period, instant and time-zone objects using Date-Time API</li>
        </ol>
    </li>
    <li>
        Controlling Program Flow
        <ol>
            <li>Create program flow control constructs including if/else, switch statements and expressions, loops, and break and continue statements</li>
        </ol>
    </li>
    <li>
        Utilizing Java Object-Oriented Approach
        <ol>
            <li>Declare and instantiate Java objects including nested class objects, and explain the object life-cycle including creation, reassigning references, and garbage collection</li>
            <li>Create classes and records, and define and use instance and static fields and methods, constructors, and instance and static initializers</li>
            <li>Implement overloading, including var-arg methods</li>
            <li>Understand variable scopes, use local variable type inference, apply encapsulation, and make objects immutable</li>
            <li>Implement inheritance, including abstract and sealed classes. Override methods, including that of Object class. Implement polymorphism and differentiate object type versus reference type. Perform type casting, identify object types using instanceof operator and pattern matching</li>
            <li>Create and use interfaces, identify functional interfaces, and utilize private, static, and default interface methods</li>
            <li>Create and use enumerations with fields, methods and constructors</li>
        </ol>
    </li>
    <li>
        Handling Exceptions
        <ol>
            <li>Handle exceptions using try/catch/finally, try-with-resources, and multi-catch blocks, including custom exceptions</li>
        </ol>
    </li>
    <li>
        Working with Arrays and Collections
        <ol>
            <li>Create Java arrays, List, Set, Map, and Deque collections, and add, remove, update, retrieve and sort their elements</li>
        </ol>
    </li>
    <li>
        Working with Streams and Lambda expressions
        <ol>
            <li>Use Java object and primitive Streams, including lambda expressions implementing functional interfaces, to supply, filter, map, consume, and sort data</li>
            <li>Perform decomposition, concatenation and reduction, and grouping and partitioning on sequential and parallel streams</li>
        </ol>
    </li>
    <li>
        Packaging and deploying Java code and use the Java Platform Module System
        <ol>
            <li>Define modules and their dependencies, expose module content including for reflection. Define services, producers, and consumers</li>
            <li>Compile Java code, produce modular and non-modular jars, runtime images, and implement migration using unnamed and automatic modules</li>
        </ol>
    </li>
    <li>
        Managing concurrent code execution
        <ol>
            <li>Create worker threads using Runnable and Callable, manage the thread lifecycle, including automations provided by different Executor services and concurrent API</li>
            <li>Develop thread-safe code, using different locking mechanisms and concurrent API</li>
            <li>Process Java collections concurrently including the use of parallel streams</li>
        </ol>
    </li>
    <li>
        Using Java I/O API
        <ol>
            <li>Read and write console and file data using I/O Streams</li>
            <li>Serialize and de-serialize Java objects</li>
            <li>Create, traverse, read, and write Path objects and their properties using java.nio.file API</li>
        </ol>
    </li>
    <li>
        Accessing databases using JDBC
        <ol>
            <li>Create connections, create and execute basic, prepared and callable statements, process query results and control transactions using JDBC API</li>
        </ol>
    </li>
    <li>
        Implementing Localization
        <ol>
            <li>Implement localization using locales, resource bundles, parse and format messages, dates, times, and numbers including currency and percentage values</li>
        </ol>
    </li>
    <li>
        Other
        <ol>
            <li>Understand the basics of Java Logging API</li>
            <li>Use Annotations such as Override, Functional Interface, Deprecated, SuppressWarnings, and SafeVarargs</li>
            <li>Use generics, including wildcards</li>
        </ol>
    </li>
</ol>

## Repository References

1. Handling date, time, text, numeric and boolean values -> [Core Api's](src/coreapis)

## Resources

- [Ocp Oracle Certified Professional Java Se 17 Developer Study Guide: Exam 1z0-829](https://www.amazon.com.br/Oracle-Certified-Professional-Developer-Study/dp/1119864585)
- [OCP JAVA 17 CERTIFICATION 1Z0-829 PRACTICE TESTS - Enthuware](https://enthuware.com/java-certification-mock-exams/oracle-certified-professional/ocp-java-17-exam-1z0-829)
- [Java 17 Masterclass: Start Coding in 2024 - Tim Buchalka](https://www.udemy.com/course/java-the-complete-java-developer-course)
