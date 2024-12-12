public class SimpleWeight implements Greutate {
    private double cantitate;


    public SimpleWeight(double cantitate) {
        this.cantitate = cantitate;
    }


    @Override
    public double getGreutate() {
        
        return this.cantitate;
    }
}
