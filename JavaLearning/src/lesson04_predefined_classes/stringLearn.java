package lesson04_predefined_classes;

public class stringLearn {
	public static void main(String[] args) {
		String me = "Antonio";
		String mila = "Mila";
		String and = " & ";
		
		String couple = me.concat(and.concat(mila));
		System.out.println("Antonio: " + me + " " + me.length() + "characters" + "\n" + "Mila: " + mila + " " + mila.length() + "characters");
		System.out.println("Concatination: " + couple);
		System.out.println("Lower: " + couple.toLowerCase());
		System.out.println("Substring from 2 to 13 " + couple.substring(2, 13));
	}
}
