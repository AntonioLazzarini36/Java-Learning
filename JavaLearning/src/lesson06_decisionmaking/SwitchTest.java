package lesson06_decisionmaking;
import java.util.Scanner;

public class SwitchTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your selection (1-5): ");
		int selection = input.nextInt();
		
		String menuOption;
		
		switch (selection) {
		case 1:
			menuOption = "Operator";
			break;
		case 2:
			menuOption = "Customer Service";
			break;
		case 3:
			menuOption = "Technical support";
			break;
		case 4:
			menuOption = "Repeat menu";
			break;
		case 5:
			menuOption = "Hang up";
			break;
		default:
			menuOption = "Retry Selection";
		}
		System.out.println("You selected: " + menuOption);
	}

}