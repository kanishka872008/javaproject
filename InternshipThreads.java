class InternshipSearch extends Thread {

    public void run() {
        System.out.println("Searching for internships...");

        String[] internships = {
            "AI Software Developer - Infosys",
            "Full Stack Developer - TCS",
            "Software Developer - Zoho"
        };

        for (String internship : internships) {
            System.out.println("Available: " + internship);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ApplicationProcess extends Thread {

    public void run() {
        System.out.println("Processing applications...");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Application " + i + " processed");

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class InternshipThreads{

    public static void main(String[] args) {

        InternshipSearch search = new InternshipSearch();
        ApplicationProcess application = new ApplicationProcess();

        System.out.println("=== Smart Internship Marketplace ===");

        search.start();
        application.start();
    }
}