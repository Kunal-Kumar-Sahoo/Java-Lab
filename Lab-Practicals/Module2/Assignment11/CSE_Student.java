public class CSE_Student extends EngineeringStudent{
    protected static int cseStudentCount = 0;
    protected String favouriteProgrammingLanguage;

    public CSE_Student() {cseStudentCount++;}

    public CSE_Student(int rollNo, String name, String favouriteProgrammingLanguage) {
        super(rollNo, name, "Computer Science & Engineering");
        this.accept(favouriteProgrammingLanguage);
    }

    public void accept(String favouriteProgrammingLanguage) {
        this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
    }

    public void display() {
        System.out.println("Display method of CSE_Student class");
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
        System.out.println("Favourite Programming Language: " + this.favouriteProgrammingLanguage);
    }

}
