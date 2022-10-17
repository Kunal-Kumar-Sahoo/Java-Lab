package myPackage;

public class Animal {
	protected String name;
	protected String color;
	protected int noOfLegs;

	public Animal(String name, int noOfLegs, String color) {
		this.name = name;
		this.noOfLegs = noOfLegs;
		this.color = color;
	}

	public void eat(String food) {
		System.out.println(this.name + " is eating " + food);
	}
}