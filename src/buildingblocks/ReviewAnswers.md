# Review Answers

1. D,E.

- Option E is the canonical main() method signature. You need to memorize it.
- Option D is an alternate form with the redundant final.
- Option A is incorrect because the main() method must be public.
- Options B and F are incorrect because the main() method must have a void return type.
- Option C is incorrect because the main() method must be static

2. C,D,E.

- The package and import statement are both optional.
- If both are present, the order must be package, then import, then class.
- Option A is incorrect because class is before package and import.
- Option B is incorrect because import is before package.
- Option F is incorrect because class is before package.

3. A,E.

- Bunny is a class, which can be seen from the declaration: public class Bunny.
- The variable bun is a reference to an object.
- The method main() is the standard entry point to a program.
- Option G is incorrect because the parameter type matters, not the parameter name.

4. B,E,G.

- Option A is invalid because a single underscore is not allowed.
- Option C is not a valid identifier because true is a Java reserved word.
- Option D is not valid because a period (.) is not allowed in identifiers.
- Option F is not valid because the first character is not a letter, dollar sign ($), or
underscore (_).
- Option B, E, and G are valid because they contain only valid characters.

5. A,D,F.

- Garbage collection is never guaranteed to run, making option F correct and option E incorrect.
- Next, the class compiles and runs without issue, so option G is incorrect.
- The Bear object created on line 9 is accessible until line 13 via the brownBear reference
variable, which is option A.
- The Bear object created on line 10 is accessible via both the polarBear reference and
the brownBear.pandaBear reference.
- After line 12, the object is still accessible via brownBear.pandaBear.
- After line 13, though, it is no longer accessible since brownBear is no longer accessible,
which makes option D the final answer.

6. F.

- To solve this problem, you need to trace the braces {} and see when variables go in
and out of scope.
- The variables on lines 2 and 7 are only in scope for a single line block.
- The variable on line 12 is only in scope for the for loop.
- None of these are in scope in line 14.
- By contrast, the three instance variables on lines 3 and 4 are available in all instance methods.
- Additionally, the variables on lines 6, 9, and 10 are available since the method and while
loop are still in scope.
- This is a total of 7 variables, which is option F.

7. C,E.

- The first thing to recognize is that this is a text block and the code inside the """ is just text.
- Options A and B are incorrect because the numForks and numKnives variables are not used.
- This is convenient since numKnives is not initialized and would not compile if it were referenced.
- Option C is correct as it is a matching text.
- Option D is incorrect because the text block does not have a trailing blank line.
- Finally, option E is also an answer since " # knives is indented.

8. B,D,E,H.

- A var cannot be initialized with a null value without a type, but it can be assigned a null
value later if the underlying type is not a primitive.
- For these reasons, option H is correct, but options A and C are incorrect.
- Options B and D are correct as the underlying types are String and Integer, respectively.
- Option E is correct as this is a valid numeric expression. You might know that dividing
by zero produces a runtime exception, but the question was only about whether the code compiled.
- Finally, options F and G are incorrect as var cannot be used in a multiple-variable assignment.

9. E.

- Options C and D are incorrect because local variables don't have default values.
- Option A is incorrect because float should have a decimal point.
- Option B is incorrect because primitives do not default to null.
- Option E is correct and option F is incorrect because reference types in class variables
default to null.