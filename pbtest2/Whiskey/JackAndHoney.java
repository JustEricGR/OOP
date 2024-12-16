public class JackAndHoney extends Whiskey {
    private int indulcitor;

    public JackAndHoney(String nume, double concentratie, int indulcitor) {
        super(nume, concentratie);
        this.indulcitor=indulcitor;
    }

    @Override
    public double getNrCalorii(double cantitate) {
        return cantitate*super.getConcentratieAlcool()*5 + cantitate*indulcitor*15;
    }

    @Override
    public String toString() {
        return super.toString() + " Calorii pe 100ml:" + this.getNrCalorii(100) + " Cantitate indulcitor: " + indulcitor + "g";
    }
}
