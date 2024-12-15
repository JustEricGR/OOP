public class Subscriber extends Utilizator {
    private int subscriptie;

    public Subscriber(String nume, int subscriptie) {
        super(nume);
        this.subscriptie=subscriptie;
    }

    @Override
    public double calculeazaVenit(int suma) {
        return suma*1.5*subscriptie;
    }

    @Override
    public String toString() {
        return "Nume: " + super.getNume() + " subscriber level: " + subscriptie;
    }


    public int getSubscriptie() {
        return this.subscriptie;
    }

    

}
