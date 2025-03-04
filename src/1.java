import java.util.Scanner;

public class Java {
	public static void main(String[] args) {
		System.out.println("What is the area of this rectangle?");

		// Create a scanner object to read user input
		Scanner reader = new Scanner(System.in);

		// Read the length and width of the rectangle from the user
		System.out.print("Length: ");
		double length = reader.nextDouble();
		System.out.print("Width: ");
		double width = reader.nextDouble();

		// Calculate the area of the rectangle
		double area = length * width;

		// Print the result to the console
		System.out.println("The area of the rectangle is " + area);

		// Close the scanner object
		reader.close();
	}
} 