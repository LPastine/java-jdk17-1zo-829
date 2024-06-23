package coreapis.strings;

public class StringsMain {
    // A string is basically a sequence of characters
    public static void main(String[] args) {
        // Creating a String
        // String class is special and doesn't need to be instantiated with new.
        String name = "Fluffy";
        String secondName = new String("Fluffy");

        // Text Blocks are another way of creating a String
        String thirdName = """
                Fluffy
                """;

        // Since String is a sequence of characters, it implements the interface CharSequence.
        // This interface is a general way of representing several classes, including String and StringBuilder.
    }
}
