class Internship {

    String internshipTitle = "AI Software Developer";
    int duration = 6;

    void displayInternship() {
        System.out.println("Internship Title : " + internshipTitle);
        System.out.println("Duration         : " + duration + " Months");
    }
}

class Company extends Internship {

    String companyName = "Infosys";
    String location = "Coimbatore";

    void displayCompany() {
        System.out.println("Company Name     : " + companyName);
        System.out.println("Location         : " + location);
    }
}

class Student extends Company {

    String studentName = "Kanishka";
    int studentId = 101;

    void displayStudent() {
        System.out.println("Student Name     : " + studentName);
        System.out.println("Student ID       : " + studentId);
    }
}

public class InternshipMultilevelInheritance {

    public static void main(String[] args) {

        Student obj = new Student();
        obj.displayInternship();
        System.out.println();
        obj.displayCompany();
        System.out.println();
        obj.displayStudent();
    }
}
