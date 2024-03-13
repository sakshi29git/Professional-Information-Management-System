package opps;

import java.util.Scanner;

public class Person {
	String name;
	int age;
	
	Person(Scanner sc)
	{
//		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=sc.next();
		System.out.println("Enter your Age");
		age=sc.nextInt();
	}

}

	

