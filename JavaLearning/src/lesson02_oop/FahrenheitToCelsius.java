package lesson02_oop;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		// Create the variables
		int saturdayFahrenheit = 78;
		int sundayFahrenheit = 81;
		// Transform them to Celsius using the formula
		double saturdayCelsius = (5.0/9) * (saturdayFahrenheit - 32);
		double sundayCelsius = (5.0/9) * (sundayFahrenheit - 32);
		// Print them
		System.out.println("Weekend Averages:");
		System.out.println("Saturday: " + saturdayCelsius);
		System.out.println("Sunday: " + sundayCelsius);
		
	}
}
