// import java.util.Scanner;

// public class LogIn {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter two integers:");
//         int num1 = input.nextInt();
//         int num2 = input.nextInt();

// import java.util.Scanner;

// public class LoginProgram {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             // Fixed the quotation marks issue
//             System.out.println("Welcome to the Login Program!");
//             System.out.print("Please enter your username: ");
//             String username = scanner.nextLine();

//             System.out.print("Please enter your password (an integer): ");
//             // Fixed the data type declaration from 'Int' to 'int'
//             int password = scanner.nextInt();

//             // Fixed the case of 'If' to 'if' and 'Public' to 'public' and 'Return' to 'return'
//             if (isValidLogin(username, password)) {
//                 System.out.println("Login successful! You are now logged in.");
//             } else {
//                 System.out.println("Invalid username or password. Please try again.");
//             }
//         }
//     }

//     public static boolean isValidLogin(String username, int password) {
//         // Fixed the logic to compare username and password correctly
//         // Assuming password is a numeric representation of username for demonstration
//         // This is a placeholder logic. You should implement actual authentication logic here.
//         return username.equals(String.valueOf(password));
//     }
// }



import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Login Program!");
        System.out.print("Please enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Please enter your password: ");
        String password = scanner.nextLine(); // Accepting password as a String

        // Assuming a simple validation for demonstration: username is "user" and password is "pass"
        // You should replace this with your actual authentication logic
        if (isValidLogin(username, password)) {
            System.out.println("Login successful! You are now logged in.");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    public static boolean isValidLogin(String username, String password) {
        // Example validation logic
        return username.equals("user") && password.equals("pass");
    }
}
