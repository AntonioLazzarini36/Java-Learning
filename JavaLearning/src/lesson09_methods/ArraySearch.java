package lesson09_methods;

//Searches till it finds the word we are looking for
public class ArraySearch {
	 public static void main(String args[]) {
	     String[] concepts = {"abstraction", "polymorphism", "inheritance", "encapsulation"};
	     
	     for (String concept : concepts) {
	    	 if (searchString(concept, concepts)) {
				 System.out.printf("Word %s found\n", concept);
			 }
			 else {
				 System.out.println("Word not found");
			 }
	     }
	 }
	 
	 private static boolean searchString(String target, String[] array) {
		 for (String concept : array ) {
		     if (concept.equals(target) ) {
		         return true;
		     }
		 }
		 return false;
	 }
}
