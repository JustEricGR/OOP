public class Card {
    private String numar = new String();
    private double sold;

    public Card(String numar, double sold) {
        this.numar = numar;
        this.sold = sold;
    }

    public String getNumar() {
        return this.numar;
    }

    public double getSold() {
        return this.sold;
    }

    @Override
    public String toString() {
        return this.numar + " - " + this.sold;
    }
}