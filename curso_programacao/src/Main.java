import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x, y, z;

		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();

		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
	}

}
