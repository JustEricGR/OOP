public abstract class Whiskey {
    private String nume = new String();
    private double concentratie;

    public Whiskey(String nume, double concentratie) {
        this.nume=nume;
        this.concentratie=concentratie;
    }

    public abstract double getNrCalorii(double cantitate);

    public double getConcentratieAlcool() {
        return this.concentratie;
    }

    public void setConcentratieAlcool(double concentratie) {
        this.concentratie=concentratie;
    }

    public String getNume() {
        return this.nume;
    }


    @Override
    public String toString() {
        return "Nume: " + nume + " concentratie: " + concentratie + "%";
    }
}
