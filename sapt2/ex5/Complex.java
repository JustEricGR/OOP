public class Complex {
    private double real;
    private double imaginar;

    public Complex() {
        this.real = 0;
        this.imaginar = 0;
    }

    public Complex(double real, double imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginar() {
        return this.imaginar;
    }

    public double Modul() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginar,2));
    }

    @Override
    public String toString() {
        return this.getReal() + "+" + this.getImaginar() + "i";
    }

    public Complex suma(Complex a ,Complex b) {
        a.real += b.getReal();
        a.imaginar += b.getImaginar();
        return a;
    }
}