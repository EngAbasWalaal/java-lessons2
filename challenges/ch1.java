import java.util.Scanner;

public class ch1 {
    public static void main(String[] args) {
        // Write a Java program that accepts a string  return the string as reverse
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string and i will reverse it to you:  ");
        String str=input.nextLine();

        //reverse string
        String reversedString=reverseString(str);


        //print the reversed string

        System.out.println("Reversed text: "+reversedStringhell);

        
    }
    public static String reverseString(String str){
        //create string builder to reverse string
        StringBuilder reversed=new StringBuilder(str);
       
         // Iterate through the characters of the input string in reverse order
         for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        // Convert the StringBuilder to a String and return it
        return reversed.toString();

    }
}