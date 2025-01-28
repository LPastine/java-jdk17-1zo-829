# Review Questions

1. Which of the following are legal entry point methods that can be run from the command line?
   (Choose all that apply)

<ol type="A">
    <li>private static void main(String[] args)</li>
    <li>public static final main(String[] args)</li>
    <li>public void main(String[] args)</li>
    <li>public static final void main(String[] args)</li>
    <li>public static void main(String[] args)</li>
    <li>public static main(String[] args)</li>
</ol>

2. Which answer options represent the order in which the following statements can be
assembled into a program that will compile successfully? (Choose all that apply)

X: class Rabbit {}
<br>
Y: import java.util.*;
<br>
Z: package animals;

<ol type="A">
    <li>X, Y, Z</li>
    <li>Y, Z, X</li>
    <li>Z, Y, X</li>
    <li>Y, X</li>
    <li>Z, X</li>
    <li>X, Z</li>
    <li>None of the above</li>
</ol>

3. Which of the following are true? (Choose all that apply)

```java
public class Bunny {
    pubic static void main(String[] x) {
        Bunny bun = new Bunny();
   }
}
```

<ol type="A">
    <li>Bunny is a class.</li>
    <li>bun is a class.</li>
    <li>main is a class.</li>
    <li>Bunny is a reference to an object.</li>
    <li>bun is a reference to an object.</li>
    <li>main is a reference to an object.</li>
    <li>The main() method doesn't run because the parameter name is incorrect.</li>
</ol>

4. Which of the following are valid Java identifiers? (Choose all that apply)

<ol type="A">
    <li>_</li>
    <li>_helloWorld$</li>
    <li>true</li>
    <li>java.lang</li>
    <li>Public</li>
    <li>1980_s</li>
    <li>_Q2_</li>
</ol>

4. Which statements about the following program are correct? (Choose all that apply.)

```java
2 public class Bear { 
3    private Bear pandaBear;
4    private void roar(Bear b) {
5       System.out.println("Roar!");
6       pandaBear = b;
7    }
8    public static void main(String[] args) {
9       Bear brownBear = new Bear();
10      Bear polarBear = new Bear();
11      brownBear.roar(polarBear);
12      polarBear = null;
13      brownBear = null;
14      System.gc(); }}
```

<ol type="A">
    <li>The object on line 9 is eligible for garbage collection after line 13.</li>
    <li>The object created on line 9 is eligible for garbage collection after line 14.</li>
    <li>The object created on line 10 is eligible for garbage collection after line 12.</li>
    <li>The object created on line 10 is eligible for garbage collection after line 13.</li>
    <li>Garbage collection is guaranteed to run.</li>
    <li>Garbage collection might or might not run.</li>
    <li>The code does not compile.</li>
</ol>

6. Assuming the following class compiles, how many variables defined in the class or method
are in the scope on the line marked on line 14?

```java
1 public class Camel {
2    { int hairs = 3_000_0; }
3    long water, air = 2;
4    boolean twoHumps = true;
5    public void spit(float distance) {
6        var path = "";
7       { double teeth = 32 + distance++; }
8       while(water > 0) {
9           int age = twoHumps ? 1 : 2;
10           short i = -1;
11           for (i = 0; i < 10; i++) {
12               var Private = 2;
13           }
14           // SCOPE
15       }
16    }
17 }
```

<ol type="A">
    <li>2.</li>
    <li>3.</li>
    <li>4.</li>
    <li>5.</li>
    <li>6.</li>
    <li>7.</li>
    <li>None of the above.</li>
</ol>

7. Which are true about this code? (Choose all that apply.)

```java
public class KitchenSink {
    private int numForks;
    
    public static void main(String[] args) {
         int numKnives;
         System.out.print("""
         "# forks = " + numForks +
         " # knives = " + numKnives +
         # cups = 0""");
    }
}
```

<ol type="A">
    <li>The output includes: # forks = 0.</li>
    <li>The output includes: # knives = 0.</li>
    <li>The output includes: # cups = 0.</li>
    <li>The output includes a blank line.</li>
    <li>The output includes one or more lines that begin with whitespace.</li>
    <li>The code does not compile.</li>
</ol>

8. Which of the following code snippets about var compile without issue when used in a
method? (Choose all that apply.)

<ol type="A">
   <li>var spring = null;</li>
   <li>var fall = "leaves";</li>
   <li>var evening = 2; evening = null;</li>
   <li>var night = Integer.valueOf(3);</li>
   <li>var day = 1/0;</li>
   <li>var winter = 12, cold;</li>
   <li>var fall = 2, autumn = 2;</li>
   <li>var morning = "";morning = null;</li>
</ol>

9. Which of the following are correct? (Choose all that apply.)

<ol type="A">
   <li>An instance variable of type float defaults to 0.</li>
   <li>An instance variable of type char defaults to null.</li>
   <li>A local variable of type double defaults to 0.0.</li>
   <li>A local variable of type int defaults to null.</li>
   <li>A class variable of type String defaults to null.</li>
   <li>A class variable of type String defaults to the empty string "".</li>
   <li>None of the above.</li>
</ol>