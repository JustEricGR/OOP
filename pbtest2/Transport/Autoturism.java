public class Autoturism extends Vehicul {

    private double greutatePasageri;

    public Autoturism(String numar, double greutate, double greutatePasageri) {
        super(numar, greutate);
        this.greutatePasageri = greutatePasageri;
    }

    @Override
    public double calculeazaGreutateTotatala() {
        return super.getGreutate()+greutatePasageri;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " greutate pasageri: " + greutatePasageri;
    }
    
}
