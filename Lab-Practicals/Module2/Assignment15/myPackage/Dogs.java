package myPackage;

public class Dogs extends Animal {
	public Dogs(String color) {
		super("Dog", 4, color);
	}

	public void bark() { System.out.println("Bark Bark"); }
}
