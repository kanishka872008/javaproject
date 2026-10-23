class InternshipMarketplace {

    private String projectTitle;
    public InternshipMarketplace(String title) {
        projectTitle = title;
    }
    public void displayProject() {
        System.out.println("Project Title: " + projectTitle);
    }
    public void displayProject(String companyName) {
        System.out.println("Project Title: " + projectTitle);
        System.out.println("Company Name: " + companyName);
    }

    public static void displayMessage() {
        System.out.println("Welcome to Smart Internship Project Marketplace");
    }
}

public class SmartInternship {

    public static void main(String[] args) {
        InternshipMarketplace.displayMessage();
        InternshipMarketplace project =new InternshipMarketplace("Java Developer Internship");
        project.displayProject();
        System.out.println();
        project.displayProject("Tech Solutions");
    }
}