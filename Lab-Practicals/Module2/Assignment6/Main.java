import java.util.*;

class Main {
    static void varArgs(String ...names) {
        System.out.println("Number of names passed: " + names.length);
        for(String name: names) 
            System.out.println(name);
    }

    public static void main(String[] args) {
        varArgs("Kunal", "Dev", "Tanish"); 
        varArgs("Madhurma", "Parshad");
        varArgs();
    }
}
