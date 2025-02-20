package lesson05_IO;
import java.util.Locale;
import  java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat; // To set up your own format


public class NumberFormatt {
	public static void main(String[] args) {
		// Create the scanner for the input and ask for the items and the price
		Scanner input = new Scanner(System.in);
		System.out.print("Number of items: ");
		int number = input.nextInt();
		System.out.print("Insert price: ");
		double number2 = input.nextDouble();
		// Calculate result
		double result = number * number2;
		// Print it like normal
		System.out.println("Unformatted result: " + result);
		// Print result in a formatted way: symbol 61.60
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("Formatted result: " + currency.format(result));
		// Set up your own format
		DecimalFormat myFormat = new DecimalFormat("00.00 \u20AC");
		System.out.println("With my format: " + myFormat.format(result));
	}
}
