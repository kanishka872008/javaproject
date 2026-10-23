import java.util.Scanner;

class Exceptionhandling {

    static void submitApplication(String name, String email) {

        try {
            if (email == null || !email.contains("@")
                    || !email.contains(".")) {
                throw new IllegalArgumentException(
                    "Invalid email address!"
                );
            }

            System.out.println("\nApplication Submitted Successfully!");
            System.out.println("Student Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Status: Application Pending");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email Address: ");
        String email = sc.nextLine();

        submitApplication(name, email);
        
        System.out.println("Application Process Completed.");
    }
}