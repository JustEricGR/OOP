public class Rezistenta implements CircuitElectric{
    private double valoare;

    public Rezistenta(double valoare) {
        this.valoare=valoare;
    }

    @Override
    public double rezistentaEchivalenta() {
        return this.valoare;
    }

    @Override
    public double curent(double tensiune) {
        return tensiune/valoare;
    }



    @Override
    public boolean equals(Object o) {
        if(o instanceof Rezistenta) {
            Rezistenta aux = (Rezistenta)o;
            return this.valoare == aux.rezistentaEchivalenta();
        }
        return false;
    }

    @Override
    public boolean contineCircuit(CircuitElectric subcircuit) {
        return this.equals(subcircuit);
    }
}
