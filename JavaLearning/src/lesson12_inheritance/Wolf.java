package lesson12_inheritance;

public class Wolf extends Canine{
	protected int rank;
	
	public Wolf(double size, int rank) {
		// refers to a member of the superclass
		// must be the first line of the constructor
		super(size);
		this.rank = rank;
	}
	
	// getter for the rank
	public int getRank() {
		return rank;
	}
	
	// override the bark method from the upper class
	public void bark() {
		for (int i = 1; i <= 3; i++){
			super.bark();
		}
	}
	
	public static void main(String[] args) {
		Wolf alpha = new Wolf (17.1, 1);
		alpha.bark();
	}
}
