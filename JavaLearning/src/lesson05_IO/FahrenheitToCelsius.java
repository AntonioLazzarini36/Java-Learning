package lesson05_IO;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //read keyboard input
        System.out.print("Enter an integer in fahrenheit: ");
        int fahrenheit = input.nextInt();
        input.nextLine(); // Clears the input for the next line
        System.out.print("Day, month and year: ");
        String day = input.nextLine();
        System.out.print("Choose one: C, Celsius, Centigrade: ");
        String cText = input.next();
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.printf("Temperature at %s in Fahrenheit: %d\n", day, fahrenheit);
        System.out.printf("Temperature at %s in %10s: %.1f\n", day, cText, celsius); // width of 10 as minimum
    }
}
