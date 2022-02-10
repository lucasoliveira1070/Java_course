package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 10;
		Rent[] rent = new Rent[n];
		
		System.out.println("How many rooms will be rented?");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < quantity; i++) {
			System.out.println("Rent #"+i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			sc.nextLine();
			
			
			rent[room] = new Rent(name,email);
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i =0; i<rent.length; i++) {
			
			if (rent[i] != null) {
				System.out.println(i +": "+ rent[i]);
			}
		}
		
		sc.close();

	}

}
