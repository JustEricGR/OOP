public class GreutateDubla implements Greutate{
    
    private Greutate g1;
    private Greutate g2;

    public GreutateDubla(Greutate w1, Greutate w2) {
        this.g1 = w1;
        this.g2 = w2;
    }

    public void setGreutate1(Greutate g) {
        this.g1 = g;
    }

    public void setGreutate2(Greutate g) {
        this.g2 = g;
    }


    @Override
    public int getCapacitate() {
        return g1.getCapacitate() + g2.getCapacitate();
    }
}
