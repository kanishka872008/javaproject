import java.util.Scanner;

class Internship {

    void display() {

        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter Internship Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Company Name: ");
        String company = sc.nextLine();

        System.out.println("\nInternship Title: " + title);
        System.out.println("Company Name: " + company);
    }
}

public class Input
 {

    public static void main(String[] args) {
        Internship obj = new Internship();
        obj.display();
    }
}