package myPackage.myPackage;

public class Dogs extends Animal{
    String breed;
    public Dogs(String breed) {
        super("Dog", 4);
        this.breed = breed;
    }    
    public void bark() {
        System.out.println("Bow Bow");
    }
}
