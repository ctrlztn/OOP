package activity;

import java.util.Scanner;

class Person {

public static void main (String [] args) {
		Student s = new Student();
		Faculty f = new Faculty();
		String greeting = "I'm a Faculty Member!";
			
		 Scanner scan = new Scanner(System.in);
		 System.out.println("1 - Student \n2 - Faculty \n");
		 int i = scan.nextInt();
		 switch (i) {
		 	case 1: 
		 		s.studentInfo();
				break;
			case 2: 
				f.facultyInfo();
				f.greet(greeting);
				break;
		 }
		 scan.close();
		 
	}
	
	void name(String name) {
		System.out.println("Name: " + name);
	}
	
	void age(int age) {
		System.out.println("Age: " + age);
	}
	
	void gender(String gen) {
		System.out.println("Gender: " + gen);
	}
	
	void greet(String x, String y) {
		x = "Hello";
		y = "Hi";
		System.out.println(y + "! " + x + "!");
	}

}

class Student extends Person{
	void studentInfo() {
		System.out.println("STUDENT");
		name("Leah");
		age(20);
		gender("Female");
		String a = null;
		String b = null;
		greet(a,b);
	}
	

	
}

class Faculty extends Person{
	void facultyInfo() {
		System.out.println("FACULTY");
		name("Leo");
		age(32);
		gender("Male");
	}
	
	void greet(String a) {
		System.out.println(a);
	}

	
}
