import java.util.*;

public class BlendedWhiskey extends Whiskey {
    private List<Whiskey> whiskey = new ArrayList<>();

    public BlendedWhiskey(String nume, List<Whiskey> lista) {
        super(nume,0);
        this.whiskey=lista;

    }

    public void adaugaBautura(Whiskey w) {
        whiskey.add(w);
        setConcentratie();
    }

    public void setConcentratie() {
        double concentratie=0;
        Iterator<Whiskey> it = whiskey.iterator();

        while(it.hasNext()) {
            concentratie+=it.next().getConcentratieAlcool();
        }

        super.setConcentratieAlcool(concentratie/whiskey.size());
    }

    public double getNrCalorii(double cantitate) {
        double total=0;
        for(Whiskey w : whiskey) {
            total+=w.getNrCalorii(cantitate/whiskey.size());
        }
        return total;
    }

    @Override
    public String toString() {
        String rez=new String();
        rez += "Nume: " + super.getNume() + " concentratie: " + super.getConcentratieAlcool() + " calorii: " + getNrCalorii(100) + " Componente";
        for(Whiskey w : whiskey) {
            rez+=w.toString();
        }
        return rez;
    }

}
