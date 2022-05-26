package classes;

public class LionTester {

	public static void main(String[] args) {
		Lion a = new Lion("Leo", 25);
		Lion b = new Lion("King", 19);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a.AgeCalc());
		System.out.println(b.AgeCalc());
		a.action();
		b.action();
	}

}
