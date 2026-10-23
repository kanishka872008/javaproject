class Internship {

    int id;
    String title;
    String company;
    
    Internship(int i, String t, String c) {
        id = i;
        title = t;
        company = c;    
    }
    void display() {
        System.out.println("Internship ID: " + id);
        System.out.println("Internship Title: " + title);
        System.out.println("Company Name: " + company);
    }
}

public class SmartInternshipMarketplace {

    public static void main(String[] args) {
        Internship obj = new Internship(
            101,
            "Java Developer",
            "ABC Company"
        );
        obj.display();
    }
}
