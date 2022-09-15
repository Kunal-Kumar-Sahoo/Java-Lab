class Main { 
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ram");
        Teacher t1 = new Teacher(2, "Laxman", "KV");
        Engineer en1 = new Engineer(2, "Laxman", "Google");

        e1.display();
        t1.display();
        en1.display();
    }
}
