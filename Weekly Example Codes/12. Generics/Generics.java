package generics;

public class Generics {
	
	public static <T> void arrayContents(T[] array) {
		for (T element: array) {
			System.out.print(element + " ");
		}
		System.out.println("");
	}
	
	public static <T extends Comparable<T>> T largest (T[] array) {
		T max = array[0];
		for (T element : array) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
	    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5};
	    String[] stringArray = {"sandwich", "lunch", "chicken", "kbbq"};
		
		System.out.println("Testing arrayContents(): ");
		arrayContents(intArray);
		arrayContents(doubleArray);
		arrayContents(stringArray);
		
		System.out.println("\nTesting largest(): ");
		System.out.println("The largest in the Integer array is " + largest(intArray));
		System.out.println("The largest in the Double array is " + largest(doubleArray));
		System.out.println("The largest in the String array is " + largest(stringArray));
		
	}

}
