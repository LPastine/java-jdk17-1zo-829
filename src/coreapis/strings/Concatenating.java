package coreapis.strings;

public class Concatenating {
    public static void main(String[] args) {
        /* Concatenating Rules:
            1) If both operands are numeric, + means numeric addition
            2) If either operand is a String, + means concatenation
            3) The expression is evaluated left to right
        */

        // First ruled applied - both operands are numbers
        System.out.println(1 + 2); // 3

        // Simple String concatenation
        System.out.println("a" + "b"); // ab

        // Second and third rule combined
        System.out.println("a" + "b" + 3); // ab3

        // Starts with First and Third rule combined, then Second rule applied
        System.out.println(1 + 2 + "c"); // 3c

        // Applies the Third and Second rule on each step
        System.out.println("c" + 1 + 2); // c12

        // Even null is represented as a String when concatenated or printed
        System.out.println("c" + null); // cnull

        // Trickery Example
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64

        // In this case we start with the Third rule, adding 1 + 2 = 3
        // Then we have 3 + three, still applying the Third rule, as three is an int we have 6
        // Then we have, 6 + four. Since four is of type String, we switch to the Second rule and
        // get final answer 64.


        // += Operator -> Keep in mind that s += "2" means the same as = s + "2"
        var s = "1";
        s += "2"; // 12
        s += 3; // 123
        System.out.println(s);
    }
}
