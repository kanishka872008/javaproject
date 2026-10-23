class Internship {

    String internshipTitle = "AI Software Developer";
    int duration = 6;

    void displayDetails() {
        System.out.println("Internship Title : " + internshipTitle);
        System.out.println("Duration         : " + duration + " Months");
    }
}

class Company extends Internship {

    String companyName = "Infosys";
    String location = "Coimbatore";

    void displayDetails() {
        super.displayDetails();
        System.out.println("Company Name     : " + companyName);
        System.out.println("Location         : " + location);
    }
}

class Student extends Company {

    String studentName = "Kanishka";
    int studentId = 101;

    void displayDetails() {
        super.displayDetails();  
        System.out.println("Student Name     : " + studentName);
        System.out.println("Student ID       : " + studentId);
    }
}

public class  InternshipMethodOverriding {

    public static void main(String[] args) {

        Student obj = new Student();
        obj.displayDetails();
    }
}