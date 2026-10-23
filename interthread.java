class Internship {

    boolean applicationReady = false;
    synchronized void submitApplication() {
        System.out.println("Student: Application submitted");
        applicationReady = true;
        notify();
    }

    synchronized void checkApplication() {
        while (!applicationReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Company: Application received");
    }
}

class Student extends Thread {

    Internship internship;

    Student(Internship internship) {
        this.internship = internship;
    }

    public void run() {
        internship.submitApplication();
    }
}

class Company extends Thread {

    Internship internship;

    Company(Internship internship) {
        this.internship = internship;
    }

    public void run() {
        internship.checkApplication();
    }
}

public class inter-communication {

    public static void main(String[] args) {

        System.out.println("Smart Internship Marketplace");

        Internship internship = new Internship();

        Student student = new Student(internship);
        Company company = new Company(internship);

        company.start();
        student.start();
    }
}

