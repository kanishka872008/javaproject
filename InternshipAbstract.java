import java.util.Scanner;

abstract class Internship {

    String studentName = "Kanishka";
    String skill="Java Developer";

    void displayStudent() {
        System.out.println("Student Name : " + studentName);
         System.out.println("Skills : " + skill);

    }

    abstract void internshipDetails();
}

class Infosys extends Internship {

    void internshipDetails() {
        System.out.println("Company : Infosys");
    }
}

class TCS extends Internship {

    void internshipDetails() {
        System.out.println("Company : TCS");
    }
}

public class InternshipAbstract {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Internship I;

        System.out.println("Enter the choice:");
      
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                I = new Infosys();
                if(choice == 1) {

                  System.out.println("Role      : AI Software Developer");
                  System.out.println("Duration  : 6 Months");
        }
                break;

            case 2:
                I = new TCS();
                if(choice == 2){
                  System.out.println("Role      : Full Stack Developer");
                  System.out.println("Duration  : 3 Months");
                }
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        I.displayStudent();
        I.internshipDetails();
    }
}