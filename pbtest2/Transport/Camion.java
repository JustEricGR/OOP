import java.util.*;

public class Camion extends Vehicul {
    List<Autoturism> masini = new ArrayList<>();
    public Camion(String numar, double greutate, List<Autoturism> masini) {
        super(numar, greutate);
        this.masini=masini;
    }

    public void adaugaAutoturism(Autoturism a) {
        masini.add(a);
    }

    @Override
    public double calculeazaGreutateTotatala() {
        double tot=0;
        for(Autoturism a : masini) {
            tot+=a.calculeazaGreutateTotatala();
        }
        
        return tot+super.getGreutate();
    }

    @Override
    public String toString() {
        String rez = new String();
        rez+=super.toString() + " masini: ";
        for(Autoturism a : masini) {
            rez+=a.toString()+" ";
        }
        return rez;
    }
}
