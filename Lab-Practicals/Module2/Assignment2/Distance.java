public class Distance {
    public int feet, inch;

    public Distance() {
        this.feet = 5;
        this.inch = 7;
    }

    public Distance(int feet, int inch) {
        this.inch = inch % 12;
        this.feet = feet + inch / 12;
    }

    public Distance(Distance d) {
        this.feet = d.feet;
        this.inch = d.inch;
    }

    public void display() {
        System.out.println(this.feet + "'" + this.inch);
    }

    public void sum(Distance d) {
        this.inch = (this.inch + d.inch) % 12;
        this.feet = (this.feet + d.feet) + d.inch / 12;
    }

}

