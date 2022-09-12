public class Teacher extends Employee {
    protected String qualification;

    public Teacher() {
        this.qualification = "not assigned";
    }

    public Teacher(int ID, String name, String qualification) {
        super(ID, name);
        this.qualification = qualification;
    }

    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String toString() {
        return super.toString() + "\tQualification: " + this.qualification;
    }
}