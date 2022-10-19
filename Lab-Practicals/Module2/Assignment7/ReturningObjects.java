class Complex {
    public int real, imaginary;
    public Complex() {
        this.real = this.imaginary = 0;
    }
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public static Complex add(Complex c1, Complex c2) {
        return new Complex((c1.real + c2.real), (c1.imaginary + c2.imaginary));
    }
}

class ReturningObjects {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        Complex c3 = Complex.add(c1, c2);
        System.out.println("Sum: " + c3.real + " + " + c3.imaginary + "j");
    }
}
