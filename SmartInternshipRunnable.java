class ResumeAnalysis implements Runnable {

    public void run() {
        System.out.println("Resume analysis started...");

        String[] skills = {
            "Java",
            "Python",
            "SQL",
            "Flutter"
        };

        for (String skill : skills) {
            System.out.println("Skill found: " + skill);
        }

        System.out.println("Resume analysis completed.");
    }
}

class SkillMatching implements Runnable {

    public void run() {
        System.out.println("Matching skills with internships...");

        String[] jobs = {
            "Java Developer",
            "Python Developer",
            "Database Intern",
            "Flutter Developer"
        };

        for (String job : jobs) {
            System.out.println("Matching: " + job);
        }

        System.out.println("Skill matching completed.");
    }
}

public class SmartInternshipRunnable{

    public static void main(String[] args) {

        ResumeAnalysis resume = new ResumeAnalysis();
        SkillMatching matching = new SkillMatching();

        Thread t1 = new Thread(resume);
        Thread t2 = new Thread(matching);

        t1.start();
        t2.start();
    }
}

