package lesson10_writing_classes;

public class Insect {
	// With private we enforce encapsulation
	// Only the methods of the class have access to the private variables
	private double weight;
	private int x, y;
	
	// default or constants
	public static final double DIST_WEIGHT_LOSS_FACTOR = 0.001;
	private static int population = 0;
	private static final String[] FACTS = {
			"There are 2 different groups", "One of them is called Antonio",
			"They die if they sting you", "They hate chocolate"
	};
	public static final int DEFAULT_X = 0;
	public static final int DEFAULT_Y = 0;
	public static final int DEFAULT_WEIGHT = 0;
	
	// default constructor, normal constructor, and another one
	// Overloading constructors
	public Insect() {
		this(DEFAULT_WEIGHT, DEFAULT_X, DEFAULT_Y);
		population++;
	}
	public Insect(double weight, int x, int y) {
		this.weight = weight;
		this.x = x;
		this.y = y;
		population++;
	}
	public Insect(double initWeight) {
		this(initWeight, DEFAULT_X, DEFAULT_Y);
		population++;
	}
	
	// Getters - Access
	public double getWeight() {
		return weight;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// getters for static variables must also be static
	public static int getPopulation() {
		return population;
	}
	
	// Setters - Mutator
	public void setX(int newX) {
		if (isLegalX(newX)) {
			x = newX;
		}
	}
	public void setY(int newY) {
		if (isLegalX(newY)) {
			x = newY;
		}
	}
	public static boolean isLegalX(int newX) {
		return (newX >= 0 ? true : false);
	}
	public static boolean isLegalY(int newY) {
		return (newY >= 0 ? true : false);
	}
	
	// normal methods
	public void eat(double amount) {
		System.out.println("gnam, gnam");
		weight += amount*0.1;
	}
	public void move(int newX, int newY) {
		double distance = calculateDistance(x, y, newX, newY);
		if (distance > 0) {
			x = newX;
			y = newY;
			weight = weight*DIST_WEIGHT_LOSS_FACTOR*distance;
			System.out.printf("Moved %.2f units\n", distance);
		}
		else {
			System.out.println("Staying put");
		}
	}
	public String toString() {
		return "weight: " + weight + ", x: " + x + ", y: " + y;
	}
	
	// methods only used internally
	private static double calculateDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}
	public static String produceRandomFact() {
		int index = (int)(Math.random()*((FACTS.length - 1) + 1));
		return FACTS[index];
	}
	
	// test method
	public static void main(String[] args) {
		// Default constructor created as long as we do not have our own constructor
		// Insect buzz1 = new Insect();
		
		Insect bug1 = new Insect(10, 100, 90);
		Insect bug2 = new Insect(9.5, -300, 400);
		
		bug1.move(1, 10);
		bug2.move(-300, 400);
		
		System.out.println("Insect Population: " + population);
		System.out.println(produceRandomFact());
	}
}