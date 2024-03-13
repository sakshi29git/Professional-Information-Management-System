package opps;

import java.util.Scanner;

public class teacher extends Person {
    
    int std;
    int salary;
    String subject;
    String designation;

    // Constructor for the teacher class
    public teacher(Scanner sc) {
        super(sc); // Call the constructor of the superclass Person
        System.out.println("Enter the standard you teach: ");
        std = sc.nextInt();
        System.out.println("Enter the subject: ");
        subject = sc.next();
        System.out.println("Enter the salary: ");
        salary = sc.nextInt();
        System.out.println("Enter the designation: ");
        designation = sc.next();
    }

    // Method to display teacher details
    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Standard of teaching: " + std);
        System.out.println("Subject: " + subject);
    }
}
