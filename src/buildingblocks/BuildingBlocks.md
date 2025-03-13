# Building Blocks

Exam's Objectives Covered in this section:

<ol>
    <li>
        Handling date, time, text, numeric and boolean values
        <ol>
            <li>Use primitives and wrapper classes including Math API, parentheses, type promotion, and casting to evaluate arithmetic and boolean expressions</li>
        </ol>
    </li>
    <li>
        Utilizing Java Object-Oriented Approach
        <ol>
            <li>
                Declare and instantiate Java objects including nested class objects, and explain the object life-cycle
                including creation, reassigning references, and garbage collection
            </li>
            <li>
                Understand variable scopes, use local variable type inference, apply encapsulation, and make objects
                immutable
            </li>
        </ol>
    </li>
</ol>

## Understanding Data Types

Java applications contain two types of data:
- Primitive Types
- Reference Types

### Primitive Types

Java has eight built-in data types, referred to as the Java primitive types.

These eight data types represent the building blocks for Java Objects, because all
Java objects are just a complex collection of these primitive data types. That said,
a primitive is not an object in Java, nor does it represent an object. A primitive
is just a single value in memory, such as a number or character.

#### The Primitive Types

| Keyword | Type                        | Min value       | Max value          | Default value | Example |
|---------|-----------------------------|-----------------|--------------------|---------------|---------|
| boolean | true or false               | n/a             | n/a                | false         | true    |
| byte    | 8-bit integral value        | -128            | 127                | 0             | 123     |
| short   | 16-bit integral value       | -32,768         | 32,767             | 0             | 123     |
| int     | 32-bit integral value       | -2,147,483,648  | 2,147,483,647      | 0             | 123     |
| long    | 64-bit integral value       | -2<sup>63</sup> | 2<sup>63</sup> - 1 | 0L            | 123L    |
| float   | 32-bit floating value       | n/a             | n/a                | 0.0f          | 123.45f |
| double  | 64-bit floating-point value | n/a             | n/a                | 0.0           | 123.456 |
| char    | 16-bit Unicode value        | 0               | 65,535             | \u0000        | 'a'     |

**Is String a primitive?**

No, it is not. It's an object, not a primitive. More on Chapter 4 (Core Apis)

**Signed and Unsigned: short and char**

For the exam, you should be aware that short and char are closely related, as both are stored as integral types
with the same 16-bit length. The primary difference is that short is signed, which means it splits its range
across the positive and negative integers. Alternatively, char is unsigned, which means its range is strictly
positive, including 0. Often, short and char values can be cast to one another because the underlying data
size is the same. You learn more about casting in Chapter 2 (Operators)

### Writing literals

When a number is present in the code, it is called a literal. By default, Java assumes you are defining an int
value with a numeric literal.

Examples:

```java
long max = 3_123_456_789; // DOES NOT COMPILE
```

Java complains the number is out of range. And it is --- for an int. However, we don't have an int.
The solution is to add the character L to the number.

```java
long max = 3_123_456_789L; // Now java knows it is a long
```

Another way to specify numbers is to change the "base". The decimal number system that goes from digits 0-9 is called
base 10.

Java allows you to specify digits in several other formats:
- Octal (digits 0-7), which uses the number 0 as a prefix --- for example, 017.
- Hexadecimal (digits 0-9 and letters A-F/a-f), which uses 0x or 0X as a prefix --- for example, 0xFF, 0xFF, 0xff, 0XFf. Hexadecimal is case insensitive.
- Binary (digits 0-1), which uses the number 0 followed by b or B as a prefix --- for example, 0b10, 0B10.

### Literals and the Underscore Character

The last thing you need to know about numeric literals is that you can have underscore in numbers to make them
easier to read:

```java
int million1 = 1000000;
int million2 = 1_000_000;
```

You can add underscores anywhere except at the beginning of a literal, the end of a literal, right before a decimal
point, or right after a decimal point. You can even place multiple underscore characters next to each other,
although we don't recommend it.

Examples:

```java
double notAtStart = _10000.00; // DOES NOT COMPILE
double notAtEnd = 10000.00_; // DOES NOT COMPILE
double notByDecimal = 1000_.00; // DOES NOT COMPILE
double annoyingButLegal = 1_00_0.0_0; // UGLY BUT COMPILES
double reallyUgly = 1_________2; // ALSO COMPILES
```

### Using Reference Types

A reference type refers to an object (an instance of a class). Unlike primitive types that hold their values in
the memory where the variable is allocated, references do not hold the value of the object they refer to. Instead,
a reference "points" to an object by storing the memory address, where the object is located, a concept reffered
to as a pointer. Unlike other languages, Java does not allow you to learn what the physical memory address is.
You can only use the reference to refer to the object.

Examples:

```java
String greeting;
```

The greeting variable is a reference that can only point to a String object. A value is assigned to a reference
in one of two ways:
- A reference can be assigned to another object of the same or compatible type
- A reference can be assigned to a new object using the new keyword.

Example where reference is assigned to a new object.

```java
greeting = new String("How are you?");
```
The greeting reference points to a new String object, "How are you?". The String object does not have a name and
can be accessed only via a corresponding reference.

### Distinguishing between Primitive and Reference types

First, all primitive types have lowercase type names. All classes that come with Java begin with uppercase. Although
not required, it is a standard practice, and you should follow this convention for classes you create as well.

Next, reference types can be used to call methods, assuming the reference is not null. Primitives do not have
methods declared on them.

Finally, reference types can be assigned null, which means they do not currently refer to an object. Primitive
types will give you a compiler error if you attempt to assign them null.

What if you don't know the value of an int and want to assign it to null? In that case, you should use a numeric
wrapper class, such as Integer, instead of int.

### Creating Wrapper Classes

Each primitive type has a wrapper class, which is an object type that corresponds to the primitive.

| Primitive type | Wrapper class | Wrapper class inherits Number? | Example of creating        | 
|----------------|---------------|--------------------------------|----------------------------|
| boolean        | Boolean       | No                             | Boolean.valueOf(true)      |
| byte           | Byte          | Yes                            | Byte.valueOf((byte) 1)     |
| short          | Short         | Yes                            | Short.valueOf((short) 1)   |
| int            | Integer       | Yes                            | Integer.valueOf(1)         |
| long           | Long          | Yes                            | Long.valueOf(1)            |
| float          | Float         | Yes                            | Float.valueOf((float) 1.0) |
| double         | Double        | Yes                            | Double.valueOf(1.0)        | 
| char           | Character     | No                             | Character.valueOf('c')     |

There is also a valueOf() variant that converts a String into the wrapper class. For example:

```java
int primitive = Integer.parseInt("123");
Integer wrapper = Integer.valueOf("123");
```

### Defining Text Blocks

Example:

```java
String textBlock = """
        "Java Study Guide"
          by Scott and Jeanne""";
```

## Declaring Variables

A variable is a name for a piece of memory that stores data. When you declare a variable, you need to state the
variable type along with giving it a name. Giving a variable a value is called initializing a variable. To
initialize a variable, you just type the variable name followed by an equal sign, followed by the desired value.

Example:

```java
String zooName = "The Best Zoo";
```

### Identifying Identifiers

An identifier is the name of a variable, method, class, interface, or package. Luckily, the rules for identifiers
for variables apply to all the other types that you are free to name.

- Identifiers must begin with a letter, a currency symbol, or a _ symbol. Currency symbols include dollar($)...
- Identifiers can include numbers but not start with them
- A single underscore _ is not allowed as an identifier
- You cannot use the same name as a Java reserved word. A reserved word is a special word that Java has held aside so that you are not allowed to use it.

**Camel Case and Snake Case** 

Java has conventions so that code is readable and consistent. For example, camel case has the first letter of each
word capitalized.

Method and variable names are typically written in camel case with the first letter lowercase, such as toUpperCase().

Class and interface names are also written in camel case, with the first letter uppercase, such as ArrayList.

Another style is called snake case. It simply uses an underscore (_) to separate words. Java generally uses
uppercase snake case for constant and enum values, such as NUMBER_FLAGS.

### Declaring Multiple Variables

You can also declare and initialize multiple variables in the same statement.

```java
void sandFence() {
    String s1, s2;
    String s3 = "yes", s4 = "no";
    // The four string variables are declared. Only s3 and s4 were initialized
    int i1, i2, i3 = 0;
    // These three variables were declared, only i3 was initialized
};
```
That's the trick, each snippet separated by a comma is a little declaration of its own.

Another way the exam could try to trick you is to show you code like this line:

```java
int num, String value; // DOES NOT COMPILE
```

This code doesn't compile because it tries to declare multiple variables of different types in the same statement.

## Initializing Variables

Before you can use a variable, it needs a value. Some types of variables get this
value set automatically, and others require the programmer to specify it.

### Creating Local Variables

A local variable is a variable defined within a constructor, method or initializer
block.

### Final local variables

The final keyword can be applied to local variables and is equivalent to 
declaring constants in other languages. For example:

```java
final int y = 10;
int x = 20;
y = x + 10; // DOES NOT COMPILE
```

Both variables are set, but y uses the final keyword. That's why it triggers
a compiler error since the value cannot be modified.

The final modifier can also be applied to local variable references. For example:

```java
final int[] favoriteNumbers = new int[10];
favoriteNumbers[0] = 10;
favoriteNumbers[1] = 20;
favoriteNumbers = null; // DOES NOT COMPILE
```

Notice that we can modify the content, or data, in the array. The compiler error
isn't until we try to change the value of the reference favoriteNumbers.

### Uninitialized Local Variables

Local variables do not have a default value and must be initialized before use.
Furthermore, the compiler will report an error if you try to read an initialized
value. For example:

```java
public int notValid() {
    int y = 10;
    int x;
    int reply = x + y; // DOES NOT COMPILE
    return reply;
}
```

The y variable is initialized to 10. By contrast, x is not initialized before
it is used, and the compiler generates an error. The compiler is smart enough 
to recognize variables that have been initialized after their declaration
but before they are used.

```java
public int valid() {
    int y = 10;
    int x; // x is declared here
    x = 3; // x is initialized here
    int z; // z is declared here but never initialized or used
    int reply = x + y;
    return reply;
}
```

In this example, x is declared, initialized, and used in separate lines. Also,
z is declared but never used, so it is not required to be initialized.

The compiler is also smart enough to recognize initializations that are more complex.
In this example, there are two branches of code:

```java
public void findAnswer(boolean check) {
    int answer;
    int anotherAnswer;
    int onlyOneBranch;
    if (check) {
        onlyOneBranch = 1;
        answer = 1;
    } else {
        answer = 2;
    }
    System.out.println(answer);
    System.out.println(onlyOneBranch); // DOES NOT COMPILE
}
```

The answer variable is initialized in both branches of the if statement,
so the compiler is perfectly happy. It knows that regardless of whether check
is true or false, the value answer will be set to something before it is used.
The otherAnswer variable is not initialized but never used, and the compiler
is equally happy. Remember, the compiler is only concerned if you try
to use uninitialized local variables; it doesn't mind the ones you never use.

The onlyOneBranch variable is initialized only if check happens to be true.
The compiler knows there is a possibility for check to be false, resulting in
uninitialized code, and gives a compiler error.

### Passing Constructor and Method Parameters

Variables passed to a constructor or method are called constructor parameters
or method parameters, respectively. These parameters are like local variables
that have been pre-initialized. The rules for initializing constructor and
method parameters are the same, so we focus primarily on method parameters.

Example:

```java
public void findAnswer(boolean check) {};
```

Take a look at the following method checkAnswer() in the same class:

```java
public void checkAnswer() {
    boolean value;
    findAnswer(value); // DOES NOT COMPILE
}
```

The call to findAnswer() does not compile because it tries to use a variable
that is not initialized. While the caller of a method checkAnswer() needs to
be concerned about the variable being initialized, once inside the method
findAnswer(), we can assume the local variable has been initialized to some value.

### Defining Instance and Class variables

Variables that are not local variables are defined either as instance variables
or as class variables. An instance variable, often called a field, is a value
defined within a specific instance of an object.

On the other hand, a class variable is one that is defined on the class level
and shared among all instances of the class. It can even be publicly accessible
to classes outside the class and doesn't require an instance to use. You can tell
a variable is a class variable because it has the keyword static before it.

Instance and class variables do not require you to initialize them. As soon as
you declare these variables, they are given a default value. The compiler doesn't
know what value to use and so wants the simplest value it can give the type:
null for an object, zero for the numeric types, and false for a boolean.

### Inferring the Type with var

You have the option of using the keyword var instead of the type when declaring 
local variables under certain conditions. To use this feature, you just type var
instead of the primitive or reference type. Example:

```java
public class Zoo {
    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }
}
```

The formal name of this feature is local variable type inference. First comes 
local variable. This means that you can only use this feature for local variables.
The exam may trick you with code like this:

```java
public class VarKeyWord {
    var tricky = "Hello"; // DOES NOT COMPILE
}
```

We just learned the difference between instance and local variables. The
variable tricky is an instance variable. Local variable type inference works
with local variables and not instance variables.

### Type Inference of var

When you type var, you are instructing the compiler to determine the type for you.
The compiler looks at the code on the line of the declaration and uses it to
infer the type. For example:

```java
public void reassignment() {
    var number = 7;
    number = 4;
    number = "five"; // DOES NOT COMPILE
}
```

First, the compiler determines that we want an int variable. On the next line,
we have no trouble assigning a different int to it. On the following line, Java
has a problem. We've asked it to assign a String to an int variable. This is not
allowed.

### Examples with var

```java
public void doesThisCompile(boolean check) {
    var question;
    question = 1;
    var answer;
    if (check) {
        answer = 2;
    } else {
        answer = 3;
    }
    System.out.println(answer);
}
```

The code does not compile. Remember that for local variable type inference, the
compiler looks only at the line with the declaration. Since question and answer
are not assigned values on the lines where they are defined, the compiler does
not know what to make of them. For this reason, both lines do not compile.

```java
public void twoTypes() {
    int a, var b = 3; // DOES NOT COMPILE
    var n = null; // DOES NOT COMPILE
}
```

The first line wouldn't work even if you replaced var with a real type. All
the types declared on a single line must be the same type and share the same
declaration. We couldn't write int a, int v = 3; either.

The following line, is a single line. The compiler is being asked to infer the
type of null. This could be any reference type. The only choice the compiler
could make is Object. However, that is almost certainly not what the author
of the code intended. The designers of Java decided it would be better not to
allow var for null than to have to guess at intent.

While a var cannot be initialized with a null value without a type, it can be
reassigned a null value after it is declared, provided that the underlying
data type is a reference type.

```java
public int addition(var a, var b) { // DOES NOT COMPILE
    return a + b;
}
```

In this example, a and b are method parameters. These are not local variables.
Be on the lookout for var used with constructors, method parameters, or
instance variables. Using var in one of these places is a good exam trick to
see if you are paying attention. Remember that var is only used for local variable
type inference!

There's one last rule you should be aware of: var is not a reserved word and
allowed to be used as an identifier. It is considered a reserved type name. A
reserved type name means it cannot be used to define a type, such as a class,
interface or enum.

```java
package var;

public class Var {
    public void var() {
        var var = "var";
    }
    public void Var() {
        Var var = new Var();
    }
}
```

Believe it or not, this code does compile. Java is case-sensitive, so Var doesn't
introduce any conflicts as a class name. Naming a local variable var is legal.

## Managing Variable Scope

How many variables do you see that are scoped to this method?

```java
public void eat(int piecesOfCheese) {
    int bitesOfCheese = 1;
}
```

There are two variables with local scope. The bitesOfCheese variable is inside
the method. The piecesOfCheese variable is a method parameter. Neither variable
can be used outside where it is defined.

### Limiting Scope

Local variables can never have a scope larger than the method they are defined in.
However, they can have a smaller scope. Consider this example:

```java
public void eatIfHungry(boolean hungry) {
    if (hungry) {
        int bitesOfCheese = 1;
    } // bitesOfCheese goes out of scope here
    System.out.println(bitesOfCheese); // DOES NOT COMPILE
}
```

The variable hungry has a scope of the entire method, while the variable
bitesOfCheese has a smaller scope. It is only available for use in the if
statement because it is declared inside of it. When you see a set of braces ({})
in the code, it means you have entered a new block of code. Each block of code
has its own scope. When there are multiple blocks, you match them from the inside
out.

Since bitesOfCheese is declared in an if statement block, the scope is limited
to that block.

Remember that blocks can contain other blocks. These smaller contained blocks
can reference variables defined in the larger scoped blocks, but not vice versa.
Here's an example:

```java
public void eatIfHungry(boolean hungry) {
    if (hungry) {
        int bitesOfCheese = 1;
        {
            var teenyBit = true;
            System.out.println(bitesOfCheese);
        }
    }
    System.out.println(teenyBit); // DOES NOT COMPILE
}
```

The bitesOfCheese variable is in scope until the if block statement ends. Using
it in the smaller block that follows its declaration is fine. The teenyBit
variable goes out of scope after its block is closed. Using it outside this scope
is not allowed.

### Applying Scope to Classes

All of that was for local variables. Luckily, the rule for instance variables is
easier: they are available as soon as they are defined and last for the entire
lifetime of the object itself. The rule for class, aka static, variables is
even easier: they go into scope when declared like the other variable types.
However, they stay in scope for the entire life of the program.

Example:

```java
public class Mouse {
    final static int MAX_LENGTH = 5;
    int length;
    public void growt(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}
```

In this class, we have one class variable, MAX_LENGTH; one instance variable, length;
and two local variables, inches and newSize. The MAX_LENGTH variable is a class
variable because it has the static keyword in its declaration. In this case,
MAX_LENGTH goes into scope where it is declared. It stays in scope
until program ends.

Next, length goes into scope where it is declared. It stays in scope as long as
this Mouse object exists. inches goes into scope where it is declared. It goes
out of scope at the end of the method. newSize goes into scope where it is
declared. Since it is defined inside the if statement block, it goes out of
scope when that block ends.

### Reviewing Scope

- Local variables: In scope from declaration to the end of the block
- Method parameters: In scope for the duration of the method
- Instance variables: In scope from declaration until the object is eligible for garbage collection
- Class variables: In scope from declaration until the program ends

## Destroying Objects

The JVM takes care of destroying objects. Java provides a garbage collector
to automatically look for objects that aren't needed anymore.

Remember, your code isn't the only process running in your Java program.
Java code exists inside a JVM, which includes numerous processes independently
of your application code. One of the most important of those is a built-in
garbage collector.

All Java objects are stored in your program memory's heap. The heap, which is
also referred to as the free store, represents a large pool of unused memory
allocated to your Java application. If your program keeps instantiating objects
and leaving them on the heap, eventually it will run out of memory and crash.
Luckily, garbage collection solves this problem.

### Understanding Garbage Collection

Garbage collection refers to the process of automatically freeing memory on the
heap by deleting objects that are no longer reachable in your program. There
are many different algorithms for garbage collection, but you don't need to
know any of them for the exam.

As a developer, the most interesting part of garbage collection is determining
when the memory belonging to an object can be reclaimed. In Java and other
languages, eligible for garbage collection refers to an object's state of no
longer being accessible in a program and therefore able to be garbage collected.

Does this mean an object that's eligible for garbage collection will be immediately
garbage collected? Definitely not. When the object actually is discarded is not
under your control, but for the exam, you will need to know at any given moment
which objects are eligible for garbage collection.

Think of garbage-collection eligibility like shipping a package. You can take
an item, seal it in a labeled box, and put it in your mailbox. This is analogous
to making an item eligible for garbage collection. When the mail carrier comes
by to pick it up, though, is not in your control. For example, it may be a
postal holiday, or there could be a severe weather event. You can even call
the post office and ask them to come pick it up right away, but there's no way
to guarantee when and if this will actually happen. Hopefully, they will come
by before your mailbox fills with packages!

Java includes a built-in method to help support garbage collection where you
can suggest that garbage collection run.

```java
System.gc();
```

Just like the post office, Java is free to ignore you. This method is not
guaranteed to do anything.

### Tracing Eligibility

How does the JVM know when an object is eligible for garbage collection? The
JVM waits patiently and monitors each object until it determines that the code
no longer needs that memory. An object will remain on the heap until it is no
longer reachable. An object is no longer reachable when one of two situations
occurs:

- The object no longer has any references pointing to it.
- All references to the object have gone out of scope.

### Objects vs. References

Do not confuse a reference with the object that it refers to; they are two
different entities. The reference is a variable that has a name and can be
used to access the contents of an object. A reference can be assigned to another
reference, passed to a method, or returned from a method. All references are
the same size, no matter what their type is.

An object sits on the heap and does not have a name. Therefore, you have no way
to access an object except through a reference. Objects come in all different
shapes and sizes and consume varying amounts of memory. An object cannot be
assigned to another object, and an object cannot be passed to a method or returned
from a method. It is the object that gets garbage collected, not its reference.

Realizing the difference between a reference and an object goes a long way toward
understanding garbage collection, the new operator, and many other facets of the
Java language. Look at this code and see whether you can figure out when each
object first becomes eligible for garbage collection:

```java
public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }
}
```

On one = two; we got rid of the only reference to "a", making that object eligible
for garbage collection. "b" has references pointing to it until it goes out of
scope. This means that "b" doesn't go out of scope until the end of the method.

### Code formatting on the exam

Not all questions will include package declarations and imports. Don't worry
about missing package statements or imports unless you are asked about them.
The following are common cases where you don't need to check the imports:

- Code that begins with a class name
- Code that begins with a method declaration
- Code that begins with a code snippet that would normally be inside a class or method
- Code that has line numbers that don't begin with 1

You'll see code that doesn't have a method. When this happens, assume any necessary
plumbing code like the main() method and class definition were written correctly.
You're just being asked if the part of the code you're shown compiles when dropped
into valid surrounding code. Finally, remember that extra whitespace doesn't matter
in Java syntax. The exam may use varying amounts of whitespace to trick you.

## Summary

Java begins program execution with a main() method. The most common signature
for this method run from the command line is public static void main(String[] args).
Arguments are passed in after the class name, as in java NameOfClass firstArgument.
Arguments are indexed starting with 0.

Java code is organized into folders called packages. To reference classes in other
packages, you use an import statement. A wildcard ending an import statement means
you want to import all classes in that package. It does not include packages that
are inside that one. The package java.lang is special in that it does not need
to be imported.

For some class elements, order matters within the file. The package statement
comes first if present. Then come the import statements if present. Then comes
the class declaration. Fields and methods are allowed to be in any order
within the class.

Primitive types are the basic building blocks of Java types. They are assembled
into reference types. Reference types can have methods and be assigned a null
value. Numeric literals are allowed to contain underscores (_) as long as they do
not start or end the literal and are not next to a decimal point (.). Wrapper
classes are reference types, and there is one for each primitive. Text blocks
allow creating a String on multiple lines using """.

Declaring a variable involves stating the data type and giving the variable a
name. Variables that represent fields in a class are automatically initialized
to their corresponding 0, null, or false values during object instantiation.
Local variables must be specifically initialized before they can be used.
Identifiers may contain letters, numbers, currency symbols, or _. Identifiers
may not begin with numbers. Local variable declarations may use the var keyword
instead of the actual type. When using var, the type is set once at compile
time and does not change.

Scope refers to that portion of code where a variable can be accessed. There are
three kinds of variables in Java, depending on their scope: instance variables,
class variables, and local variables. Instance variables are the non-static fields
of your class. Class variables are the static fields within a class. Local variables
are declared within a constructor, method, or initializer block.

Constructors create Java objects. A constructor is a method matching the class name
and omitting the return type. When an object is instantiated, fields and blocks
of code are initialized first. Then the constructor is run. Finally, garbage
collection is responsible for removing objects from memory when they can never
be used again. An object becomes eligible for garbage collection when there are
no more references to it or its references have all gone out of scope.

## Exam essentials

**Be able to write code using a main() method**. A main() method is usually written
as public static void main(String[] args). Arguments are referenced starting with
args[0]. Accessing an argument that wasn't passed in will cause the code to throw
an exception.

**Understand the effect of using packages and imports**. Packages contain Java
classes. Classes can be imported by class name or wildcard. Wildcards do not look
at subdirectories. In the event of a conflict, class name imports take precedence.
Package and import statements are optional. If they are present, they both go
before the class declaration in that order.

**Be able to recognize a constructor**. A constructor has the same name as the class.
It looks like a method without a return type.

**Be able to identify legal and illegal declarations and initialization**. Multiple
variables can be declared and initialized in the same statement when they share a type.
Local variables require an explicit initialization; others use the default value
for that type. Identifiers may contain letters, numbers, currency symbols, or _,
although they may not begin with numbers. Also, you cannot define an identifier
that is just a single underscore character _. Numeric literals may contain underscores
between two digits, such as 1_000, but not in other places, such as _100_.0_.

**Understand how to create text blocks**. A text block begins with """ on the first
line. On the next line begins the content. The last line ends with """. If """ is
on its own line, a trailing line break is included.

**Be able to use var correctly**. A var is used for a local variable. A var is
initialized on the same line where it is declared, and while it can change value,
it cannot change type. A var cannot be initialized with a null value without a type,
nor can it be used in multiple variable declarations.

**Be able to determine where variables go into and out of scope**. All variables
go into scope when they are declared. Local variables go out of scope when the block
they are declared in ends. Instance variables go out of scope when the object is
eligible for garbage collection. Class variables remain in scope as long as the
program is running.

**Know how to identify when an object is eligible for garbage collection**. Draw
a diagram to keep track of references and objects as you trace the code. When no
arrows point to a box (object), it is eligible for garbage collection.
