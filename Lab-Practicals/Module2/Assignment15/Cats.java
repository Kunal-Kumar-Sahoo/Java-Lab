import myPackage.myPackage.Animal;

public class Cats extends Animal{
    String color;
    public Cats(String color) {
        super("Cat", 4);
        this.color = color;
    }
    public void meow() {
        System.out.println("Meow Meow");
    }
}
