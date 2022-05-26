package syntax;

import java.util.ArrayList;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		//instance variables		
		ArrayList<Double> array = new ArrayList<Double>();
		Scanner input = new Scanner(System.in);
		String userinput = "";
		Double num;
		Double sum = 0.0;
		
		//user input
		System.out.println("Enter a number:");
		userinput = input.next();
		//enter 'done' if you are finished adding numbers to the array
		while (!"done".equals(userinput)) { 
			num = Double.parseDouble(userinput);
			array.add(num);
			System.out.println("Enter a number:");
			userinput = input.next();
		}

			
		
		//print all numbers in array
		System.out.println("Numbers in array:");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		//prints sum of all numbers in array
		System.out.println("Sum of array:");
		for (int i = 0; i < array.size(); i++) {
			sum = sum + array.get(i);
		}
		System.out.println(sum);
		
		
		
		
		input.close();
		
	}

}

