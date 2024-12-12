public class Square extends Form{
    private double side;


    public Square() {
        super();
        side = 0;
    }


    public Square(String color, double side) {
        super(color);
        this.side = side;
    }


    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "This form is a " + getClass().getSimpleName() + " has an area of " + this.getArea() + " and is " + super.getColor();
    }

    
    
}
