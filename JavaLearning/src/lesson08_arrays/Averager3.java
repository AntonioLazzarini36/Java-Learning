package lesson08_arrays;

// java Averager3 2 5 6 7 ... and prints out the average
public class Averager3 {
	public static void main(String[] args) {
        // initialization
        double sum = 0;
        for (String num : args) {
            sum += Double.parseDouble(num); // Convert string to double
        }
        double average = (args.length > 0) ? (sum/args.length) : 0;
        System.out.println(average);
    }
}