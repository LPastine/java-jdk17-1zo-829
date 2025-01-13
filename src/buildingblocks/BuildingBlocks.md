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