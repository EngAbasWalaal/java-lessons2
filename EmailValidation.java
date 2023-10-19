import java.util.Scanner;

public class EmailValidation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }

        scanner.close();
    }

    public static boolean isValidEmail(String email) {
        // Regular expression for email validation
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        // Check if the email matches the regex pattern
        return email.matches(regex) && (email.endsWith(".com") || email.endsWith(".org") || email.endsWith(".co"));
    }

}