package opps;

import java.util.Scanner;

public class profession_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, ch;
        Person obj = null;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Add Details");
            System.out.println("2. Print details");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int type;
                    System.out.println("Enter your designation");
                    System.out.println("1. Teacher    2. Employee");
                    ch = sc.nextInt();
                    if (ch == 1) {
                        obj = new teacher(sc); // Pass the Scanner object to the teacher constructor
                       
                    } else if (ch == 2) {
                        System.out.println("What type of employee are you: ");
                        System.out.println("1. Permanent   2. Contractor");
                        type = sc.nextInt();
                        if (type == 1) {
                            obj = new employee();
                        } else if (type == 2) {
                            obj = new employee(5); // Assuming 5 is the contract duration
                        } else {
                            System.out.println("Wrong option");
                        }
                    } else {
                        System.out.println("Wrong option");
                    }
                    break;

                case 2:
                    System.out.println("Details: ");
                    System.out.println("1. Teacher");
                    System.out.println("2. Employee");
                    type = sc.nextInt();
                    if (type == 1) {
                        if (obj instanceof teacher) {
                            ((teacher) obj).disp();
                        }
                        else {
                        	System.out.println("Details oare not added yet");
                        }
                    } else if (type == 2) {
                        System.out.println("What type of employee are you: ");
                        System.out.println("1. Permanent   2. Contractor");
                        type = sc.nextInt();
                        if (type == 1) {
                            if (obj instanceof employee) {
                                ((employee) obj).permanent();
                            }
                        } else if (type == 2) {
                            if (obj instanceof employee) {
                                ((employee) obj).contracter();
                            }
                        } else {
                            System.out.println("Wrong option");
                        }
                    } else {
                        System.out.println("Wrong option");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong choice");
                    break;
            }

        } while (choice != 3);
    }
}
