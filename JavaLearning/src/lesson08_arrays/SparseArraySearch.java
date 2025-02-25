package lesson08_arrays;

// If there is a null value inside an array, you can not use it with the for-loop
// in that case, use the line shown, so that we jump the null value
public class SparseArraySearch {
	public static void main(String args[]) {
        String[] concepts = new String[5];
        concepts[0] = "abstraction";
        concepts[2] = "polymorphism";
        concepts[3] = "inheritance";
        concepts[4] = "encapsulation";
        String result = "not found";
        for (String concept : concepts ) {
        	System.out.println(concept);
        	if ((concept != null) && (concept.equals("polymorphism"))) {
                result = "found";
                break;
            }
            // if(concept.equals("polymorphism") instead of doing this
        }
        System.out.println(result);
    }
 }
