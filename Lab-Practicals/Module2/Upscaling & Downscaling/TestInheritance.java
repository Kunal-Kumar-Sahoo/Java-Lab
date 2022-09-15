class Animal {  
    public Animal() {
        System.out.println("Animal is created");
    }
    void eat() {
        System.out.println("eating...");
    }  
    void disp() {
        System.out.println("Base Class method");
    }
}

class Dog extends Animal {  
    public Dog() {
        System.out.println("Dog is created");
    }
    void bark() {
        System.out.println("barking...");
    }
    void disp() {
        super.disp();
        System.out.println("derived Class method");
    }  
}

class TestInheritance {  
    public static void main(String[] args) {  
        Animal d = new Dog();  
        Dog a = (Dog) d;
        a.disp();  
        a.eat();  
        a.bark();
    }
}  