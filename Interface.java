import java.util.Scanner;

interface InternshipInfo {
    void displayInternships();
}

interface Apply {
    void applyInternship(int choice);
}
class Marketplace implements InternshipInfo, Apply {

    String I[] = {
            "Software Developer - Infosys",
            "Web Developer - Zoho",
            "Java Developer - TCS",
            "Cloud Engineer - Wipro"
    };

    public void displayInternships() {
        System.out.println("\nAvailable Internships");

        for (int i = 0; i < I.length; i++) {
            System.out.println((i + 1) + ". " + I[i]);
        }
    }

    public void applyInternship(int choice) {

        switch (choice) {

            case 1:
                System.out.println("Applied for " + I[0]);
                System.out.println("Company   : Infosys");
                System.out.println("Role      : Java Developer");
                System.out.println("Duration  : 6 Months");
                System.out.println("Stipend   : Rs.15,000/Month");
                System.out.println("Location  : Bangalore");
               
                break;

            case 2:
                System.out.println("Applied for " + I[1]);
                System.out.println("Company   : Zoho");
                System.out.println("Role      : Web Developer");
                System.out.println("Duration  : 4 Months");
                System.out.println("Stipend   : Rs.18,000/Month");
                System.out.println("Location  : Chennai");
                break;

            case 3:
                System.out.println("Applied for " + I[2]);
                System.out.println("Company   : TCS");
                System.out.println("Role      : Java Developer");
                System.out.println("Duration  : 6 Months");
                System.out.println("Stipend   : Rs.15,000/Month");
                System.out.println("Location  : Mumbai");
                break;

            case 4:
                System.out.println("Applied for " + I[3]);
                System.out.println("Company   : Wipro");
                System.out.println("Role      : Cloud Engineer");
                System.out.println("Duration  : 6 Months");
                System.out.println("Stipend   : Rs.20,000/Month");
                System.out.println("Location  : Hyderabad");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}

public class InternshipMarketplace {

    static void studentDetails(Marketplace m) {

        System.out.println("\nStudent Name : Kanishka");
        System.out.println("Department   : Information Technology");

        m.displayInternships();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Marketplace M = new Marketplace();

        studentDetails(M);
        System.out.print("\nSelect Internship (1-4): ");
        int choice = sc.nextInt();

        M.applyInternship(choice);
    }
}