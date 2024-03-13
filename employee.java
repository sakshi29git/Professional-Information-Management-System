package opps;

import java.util.Scanner;

public class employee extends Person {
    String designation;
    int salary;
    int time;

    // Default constructor
    public employee() {
        super(new Scanner(System.in)); // Call the constructor of the superclass Person
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your designation: ");
        designation = sc.next();
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
    }

    // Constructor with contract duration parameter
    public employee(int time) {
        super(new Scanner(System.in)); // Call the constructor of the superclass Person
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your designation: ");
        designation = sc.next();
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
        this.time = time;
    }

    // Method for displaying contract employee details
    void contracter() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Contract Duration: " + time + " years");
    }

    // Method for displaying permanent employee details
    void permanent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
