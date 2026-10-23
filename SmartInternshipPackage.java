package Sample.Internship;

import java.util.*;

class Student {
    String name, department, skill, email;
    int rollNo;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        name = sc.nextLine();

        System.out.println("Enter Roll Number:");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Department:");
        department = sc.nextLine();

        System.out.println("Enter Skill:");
        skill = sc.nextLine();

        System.out.println("Enter Email:");
        email = sc.nextLine();
    }
}

class Company extends Student {
    String companyName, jobRole;

    public void getinput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Company Name:");
        companyName = sc.nextLine();

        System.out.println("Enter Job Role:");
        jobRole = sc.nextLine();
    }
}

public class SmartInternship extends Company {

    String status;

    public void apply() {
        status = "Application Submitted";
    }

    public void display() {
        System.out.println("================================");
        System.out.println("     INTERNSHIP DETAILS");
        System.out.println("================================");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Department : " + department);
        System.out.println("Skill      : " + skill);
        System.out.println("Email      : " + email);
        System.out.println("Company    : " + companyName);
        System.out.println("Job Role   : " + jobRole);
        System.out.println("Status     : " + status);
    }
}