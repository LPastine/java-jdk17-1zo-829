# Review Answers - Excercise

1) E.

Wrong!
Correct Answer: D,E.

Observations: Need to have a deeper understanding on the effects of the keywords when
defining a method, for example (private/public, static, final...). There are other sections
that give a deeper understanding on this.

2) C.

Wrong!
Correct Answer: C,D,E.

Observations. Misunderstood the question. The concept of how packages, imports and classes
must be ordered is clear. But, didn't understand that package and imports are optional and
was not clear for me that not all options should be included.

3) A.

Wrong!
Correct Answer: A,E.

Observations: I understood that bun would be a reference to an object, but what seemed wrong
to me is the fact of the class itself being instantiated within itself, without any
constructor methods.

4) B,E.

Wrong!
Correct Answer: B,E,G.

Observations: The fact that a number can't finish with an underscore confused me at the
moment of analyzing if an underscore that has letters and numbers can be at the end of the
identifier.

5) A,F.

Wrong!
Correct Answer: A,D,F.

Observations: I understood that because of line 11, the reference of polarBear, would
persist on pandaBear, because of line 6 on the roar method. I didn't understand that this
reference would become brownBear.pandaBear. Which means it's an instance variable instead
of a class variable.

6) F.

Correct!!

7) C.

Wrong!
Correct Answer: C,E.

Observations: The comments on the review answers claim that E is correct because there is
an indent on " # knives , so this line would be considered as starting with a blank space,
while actually, in my point of view, this is not completely correct as it actually begins
with a " . That's why I did not consider it as correct. Here's an example of the actual output:

```md
"# forks = " + numForks +
" # knives = " + numKnives +
# cups = 0
```

8) A,B,D,E,F,G.

Wrong!
Correct Answer: B,D,E,H.

Observations: There are a few concepts related to var that need to be reinforced for better
understanding. 

A var cannot be initialized with a null value without a type, but it can be assigned a null
value later if the underlying type is not a primitive. This means that it is needed to pay
attention whether the inferred type of the var is a primitive of not, if it's an int, or an
Integer, if it's a char or a String, and so on... in order to know if it can then be assigned
a null value.

Option E is a tricky one, because you need to pay attention if the question asks if the code
compiles or if it would give a runtime error. Because dividing by zero, would actually compile,
but it would give a runtime error, as mathematically speaking, it is not possible to divide 
by zero.

And the other point to reinforce is that var cannot be used for multiple-variable assignment!

9) C,E.

Wrong!
Correct Answer: E.

Observations: I selected C for the wrong reasons. First, for lack of attention, thought it
was referring to a float instead of a double. But still, would have failed, because I
did not remember that local variables don't have default values. I knew this, but it's good
to reinforce that primitives do not default to null, and that String is not a primitive, so
it defaults to null.