import java.util.Scanner;

public class Validator {
	static Scanner scan = new Scanner(System.in);


	public static double readValidDouble() {
		while (!scan.hasNextDouble()) {
			scan.nextLine();
			System.out.println("Please enter a valid radius: ");
		}
		double x = scan.nextDouble();
		scan.nextLine();
		return x;
	}

	public static double getValidDouble(double min, double max) {
		double i = readValidDouble();
		while (i < min || i > max) {
			System.out.println("Please put a number within range!");
			i = readValidDouble();
		}
		return i;
	}
}
