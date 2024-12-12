public class Complex {
    private double real, imaginar;
    public static int counter = 0;


    public Complex(double real, double imaginar) {
        this.real = real;
        this.imaginar = imaginar;
        if((real != 0) && (imaginar != 0))
            counter++;
    }


    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginar() {
        return this.imaginar;
    }

    public void setImaginar(double imaginar) {
        this.imaginar = imaginar;
    }

    public double modul() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginar, 2));
    }

    @Override
    public String toString() {
        return real + "+" + imaginar + "i";
    }

    public void adunare(Complex adder1, Complex adder2) {
        this.real = adder1.real + adder2.real;
        this.imaginar = adder1.imaginar + adder2.imaginar;
    }
}
