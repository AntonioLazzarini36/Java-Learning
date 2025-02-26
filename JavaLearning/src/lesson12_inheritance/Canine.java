package lesson12_inheritance;

public class Canine {
	// not private or not public
	// protected members can only be accessed by its sub-classes and any other class
	// within the class's package
	protected double size;
	public Canine(double size) {
		this.size = size;
	}
	public void bark() {
		System.out.println("Woof woof");
	}
}
