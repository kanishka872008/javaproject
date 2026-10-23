class Internship {

    String internshipTitle = "AI Software Developer";
    int duration = 6;

    void displayDuration() {
        System.out.println("Internship Title : " + internshipTitle);
        System.out.println("Duration         : " + duration + " Months");
    }
}

class Company extends Internship {

    String companyName = "Infosys";
    String location = "Coimbatore";

    void displayDetails() {
        System.out.println("Company Name     : " + companyName);
        System.out.println("Location         : " + location);
    }
}

public class  InternshipSingleInheritance {

    public static void main(String[] args) {

        Company obj = new Company();

        obj.displayDuration();
        obj.displayDetails();
    }
}