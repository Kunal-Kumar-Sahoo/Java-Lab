import myPackage.myPackage.Dogs;

public class Main {
    public static void main(String[] args) {
        Dogs d = new Dogs("German shepherd");
        Cats c = new Cats("white");

        d.bark();
        c.meow();
    }
}
