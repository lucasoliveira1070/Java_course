package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter the student name: ");
		student.name = sc.nextLine();
		System.out.println();
		
		System.out.println("Enter the 3 student grades: ");
		student.score1 = sc.nextDouble();
		student.score2 = sc.nextDouble();
		student.score3 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();

	}

}
