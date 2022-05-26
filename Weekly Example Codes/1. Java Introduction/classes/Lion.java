package classes;

public class Lion {
	private String name;
	private int age;
	
	public Lion(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int a) {
		this.age = a;
	}

	
	public String toString() {
		String output = this.getName() + " is " + this.getAge() + " years old.";
		return output;
	}
	
	public int AgeCalc() {
		int ageDoubled = this.getAge() * 2;
		return ageDoubled;
	}
	
	public void action() {
		System.out.println(this.getName() + " has roared.");
	}
}
