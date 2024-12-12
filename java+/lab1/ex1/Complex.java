public class Complex{
    private int real;
    private int imaginary;


    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(Complex source) {
        this.real = source.real;
        this.imaginary = source.imaginary;
    }

    public int getReal() {
        return this.real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return this.imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public Complex addNumber(Complex adder) {
        return new Complex(this.real + adder.real, this.imaginary + adder.imaginary);
    }

    
}
