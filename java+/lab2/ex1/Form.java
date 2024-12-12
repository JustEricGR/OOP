public class Form {
    private String color;

    public Form() {
        this.color = "white";
    }


    public Form(String color) {
        this.color = color;
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "This form has the color: " + this.color;
    }

    


}
