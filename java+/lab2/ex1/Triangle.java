import java.util.Objects;

public class Triangle extends Form{
    private double height;
    private double base;

    public Triangle() {
        super("white");
        this.height = 0;
        this.base = 0;
    }

    

    public Triangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }


    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public String toString() {
        return "This form is a " + getClass().getSimpleName() + " has an area of " + this.getArea() + " and is " + super.getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Triangle)) {
            return false;
        }
 
        Triangle triangle = (Triangle)o;
        return this.getArea() == triangle.getArea();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getArea());
    }
    
}
