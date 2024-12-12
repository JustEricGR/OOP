public class Circle extends Form{
    
    private double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "This is a " + getClass().getSimpleName() + " has an area of " + this.getArea() + " and is " + super.getColor();
    }
}
