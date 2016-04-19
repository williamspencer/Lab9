import java.util.Scanner;

import shapes.Circle;

public class CircleApp {

	public static void main(String[] args) {
		String user = "y";
		Scanner scan1 = new Scanner(System.in);
		double input = 0.0;
		
		System.out.println("Welcome to the Circle Tester");
		do {
		System.out.print("Enter a radius: ");
		input = Validator.getValidDouble(0, Double.MAX_VALUE);
		
		Circle c1 = new Circle(input);
		
		System.out.println("Circumference: " +c1.getFormattedCircumference());
		System.out.println("Area: \t" + c1.getFormattedArea());
		System.out.print("Continue? (y/n): ");
		user = scan1.nextLine();
				
		} while (user.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");
		scan1.close();
	}
}
