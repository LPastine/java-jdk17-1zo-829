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

**Topics:**

[String](strings)
 - [Creating and Manipulating Strings](strings/StringsMain.java) 

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