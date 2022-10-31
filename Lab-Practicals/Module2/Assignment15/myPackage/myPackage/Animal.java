package myPackage.myPackage;

public class Animal {
    String name;
    int noOfLegs;

    public Animal(String name, int noOfLegs) {
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    public void walk() {
        System.out.println("Walking");
    }
}
