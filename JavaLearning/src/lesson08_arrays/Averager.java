package lesson08_arrays;
import java.util.Scanner;

public class Averager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many siblings do you have?: ");
		int brothers = input.nextInt();
		input.nextLine();
		
		String[] names = new String[brothers];
		for (int i = 0; i < brothers; i++) {
			System.out.printf("Name of sibling number %d: ", i + 1);
			names[i] = input.nextLine();
		}
		
		if (brothers > 0) {
            System.out.printf("Your siblings are: %s%n", String.join(", ", names));
        } else {
            System.out.println("You have no siblings.");
        }

        input.close(); // Always close Scanner when done
	}
}
