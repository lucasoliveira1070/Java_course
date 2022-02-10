package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		
		List<Employee> list = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #"+i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			
			System.out.print("Salary :");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id,name,salary));
			
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (employee == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		}
		
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee obj: list) {
			System.out.println(obj);
			
		}
		
		
		
		sc.close();

	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
