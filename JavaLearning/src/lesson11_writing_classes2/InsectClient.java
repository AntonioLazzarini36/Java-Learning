package lesson11_writing_classes2;
import lesson10_writing_classes.Insect;


public class InsectClient {
	public static void main(String[] args) {
		System.out.println(Insect.produceRandomFact());
		Insect bug1 = new Insect(13, 31, 0);
		// not possible bug1.weight = -1;
		System.out.println("Weight: " + bug1.getWeight());
		System.out.println(bug1.toString());
	}
}
