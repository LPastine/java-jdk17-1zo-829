package coreapis.strings;

public class StringMethods {
    public static void main(String[] args) {
        /*
            Important things to remember about Strings:
                - A String is a sequence of characters and Java counts from 0 when indexed.
                - A String is immutable, or unchangeable. This means calling a method on as String
                will return a different String object rather than changing the value of the reference.
        */

        /* Determining Length
            length() -> returns the number of characters in the String
            Method Signature:
            public int length()
        */
        var name = "animals";
        System.out.println(name.length()); // 7

        /* We said that Java counts from 0 when indexed. Zero counting happens only when you're using
            indexes, or positions withing a list. When determining the total size or length, Java
            uses normal counting again.
        */

        /* Getting a Single Character
            charAt() -> lets you query the string to find out what character is at a specific index
            Method Signature:
            public char charAt(int index)
        */
        var secondName = "animals";
        System.out.println(secondName.charAt(0)); // a
        System.out.println(secondName.charAt(6)); // s
        System.out.println(secondName.charAt(7)); // exception

        /*  Finding an Index
            indexOf() -> looks at the character in the string and finds the first index that matches the desired value
            Method Signatures:
            public int indexOf(int ch)
            public int indexOf(int ch, int fromIndex)
            public int indexOf(String str)
            public int indexOf(String str, int fromIndex)

            The indexOf method can work with an individual character or a whole String as input. It can also start
            from a requested position. Remember that a char can be passed to an int parameter type.
        */

        var thirdName = "animals";

        // Since indexes begin with 0, the first 'a' matches that position
        System.out.println(thirdName.indexOf('a')); // 0
        // This statement looks for a more specific string, so it matches later
        System.out.println(thirdName.indexOf("al")); // 4
        // This statement says Java shouldn't even look at the characters until it gets to the index 4
        System.out.println(thirdName.indexOf('a', 4)); // 4
        // This statement doesn't find anything because it starts looking after the match occurred.
        // Unlike charAt(), the indexOf() method doesn't throw an exception if it can't find a match.
        // instead returns -1. Because indexes start with 0, the caller knows that -1 couldn't be a
        // valid index. This makes it a common value for a method to signify to the caller that no match is found.
        System.out.println(thirdName.indexOf("al", 5)); // -1

        /*
            Getting a Substring
            The method substring() also looks for characters in a string. It returns part of the string.
            The first parameter is the index to start with for the returned string. As usual, this is a
            zero-based index. There is an optional second parameter, which is the end index you want to
            stop at. This means the endIndex parameter is allowed to be one past the end of the sequence
            if you want to stop at the end of the sequence.
            Method Signatures:
            public String substring(int beginIndex)
            public String substring(int beginIndex, int endIndex)
         */

        var fourthName = "animals";

        // This first example says to take the characters starting with index 3 through the end
        System.out.println(fourthName.substring(3)); // "mals"
        // This does the same thing, but it calls indexOf() to get the index
        System.out.println(fourthName.substring(fourthName.indexOf('m'))); // "mals"
        // This says to take the characters starting with index 3 until, but not including, index 4
        System.out.println(fourthName.substring(3, 4)); // "m"
        // This says to take the characters starting with index 3 until we get to index 7
        System.out.println(fourthName.substring(3, 7)); // "mals"


        // Since we start and end at the same index there are no characters in between
        System.out.println(fourthName.substring(3,3)); // empty string
        // Throws an exceptions because the indexes can't be backward
        System.out.println(fourthName.substring(3,2)); // exception
        // There is no eight position, so Java throws an exception
        System.out.println(fourthName.substring(3,8)); // exception
    }
}
