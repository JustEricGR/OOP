public class ClassicWhiskey extends Whiskey {
    public ClassicWhiskey(String nume, double concentratie) {
        super(nume,concentratie);
    }

    @Override
    public double getNrCalorii(double cantitate) {
        return cantitate*super.getConcentratieAlcool()*5;
    }

    @Override
    public String toString() {
        return super.toString() + " Calorii pe 100ml:" + this.getNrCalorii(100);
    }
}
