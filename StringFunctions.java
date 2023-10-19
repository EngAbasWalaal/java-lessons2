public class StringFunctions{
    public static void main(String[] args) {
        //charAt(int index): Returns the character at the specified index.
        String mystring="Hello halima";
        char character=mystring.charAt(6);
        System.out.println(character);

        //substring(int beginIndex): Returns a substring from the specified beginning index to the end.
        String mystring2="hello halima";
        String sub=mystring2.substring(4);
        System.out.println(sub);

        //all string functions in java
        //         length(): Returns the length (number of characters) of the string.

        // java
        // Copy code
        // String str = "Hello, World!";
        // int length = str.length();


        //substring(int beginIndex): Returns a substring from the specified beginning index to the end.

        // java
        // Copy code
        // String str = "Hello, World!";
        // String sub = str.substring(7);


            //         substring(int beginIndex, int endIndex): Returns a substring within the specified range.

            // java
            // Copy code
            // String str = "Hello, World!";
            // String sub = str.substring(7, 12);



            //             toLowerCase(): Converts the string to lowercase.

            // java
            // Copy code
            // String str = "Hello, World!";
            // String lower = str.toLowerCase();


            //             toUpperCase(): Converts the string to uppercase.

            // java
            // Copy code
            // String str = "Hello, World!";
            // String upper = str.toUpperCase();


            //             trim(): Removes leading and trailing whitespace.

            // java
            // Copy code
            // String str = "   Hello, World!   ";
            // String trimmed = str.trim();

            //             startsWith(String prefix): Checks if the string starts with the specified prefix.

            // java
            // Copy code
            // String str = "Hello, World!";
            // boolean startsWithHello = str.startsWith("Hello");


            //             endsWith(String suffix): Checks if the string ends with the specified suffix.

            // java
            // Copy code
            // String str = "Hello, World!";
            // boolean endsWithWorld = str.endsWith("World!");


            //             contains(CharSequence sequence): Checks if the string contains the specified sequence.

            // java
            // Copy code
            // String str = "Hello, World!";
            // boolean containsHello = str.contains("Hello"); // true
            // indexOf(String str): Returns the index of the first occurrence of the specified substring.

            // java
            // Copy code
            // String str = "Hello, World!";
            // int indexOfWorld = str.indexOf("World"); // indexOfWorld will be 7
            // replace(CharSequence target, CharSequence replacement): Replaces all occurrences of a specified target with a replacement string.

            // java
            // Copy code
            // String str = "Hello, World!";
            // String replaced = str.replace("World", "Java"); // replaced will be "Hello, Java!"
            // These are just a few of the many methods available for working with strings in Java. The String class provides a rich set of tools for string manipulation, making it versatile for a wide range of tasks.






    }
}