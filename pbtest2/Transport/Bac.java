import java.util.*;

public class Bac {
    private double greutateMaxima;
    private List<Vehicul> vehicule = new ArrayList<>();
    private static double greutateCurenta=0;

    public Bac(double greutateMaxima) throws GreutateMaximaDepasita {
        this.greutateMaxima = greutateMaxima;
        //this.vehicule = vehicule;
    }

    public void adaugaVehicul(Vehicul v) {
        
        greutateCurenta+=v.calculeazaGreutateTotatala();
        //System.out.println("Aux:" + aux);
        if(greutateCurenta>=greutateMaxima)throw new GreutateMaximaDepasita("S-a depasit greutatea");
        vehicule.add(v);
    }

    @Override
    public String toString() {
        String rez = new String();
        rez+="Greutate maxima bac: " + greutateMaxima + " vehicule: ";
        for(Vehicul v : vehicule) {
            rez+=v.toString();
        }
        return rez;
    }

}
