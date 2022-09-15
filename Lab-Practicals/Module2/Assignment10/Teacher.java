public class Teacher extends Employee{
    protected String school;
    protected int teacherCount = 0;

    public Teacher() {
        teacherCount++;
    } 

    public Teacher(int ID, String name, String school) {
        super(ID, name);
        accept(school);
        teacherCount++;
    }

    public void accept(String school) {
        this.school = school;
    }

    public void display() {
        super.display();
        System.out.println("School: " + this.school);
    }
}
