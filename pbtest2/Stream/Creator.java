import java.util.*;

public class Creator extends Utilizator {
    private List<Subscriber> subcriberi = new ArrayList<>();


    public Creator(String nume, List<Subscriber> subcriberi) {
        super(nume);
        this.subcriberi = subcriberi;
    }

    public void adaugaSubscriber(Subscriber s) {
        subcriberi.add(s);
    }

    @Override
    public double calculeazaVenit(int suma) {
        double s=0;
        Iterator<Subscriber> it = subcriberi.iterator();
        while(it.hasNext()) {
            suma+=it.next().calculeazaVenit(suma);
        }
        return s;
    }

    @Override
    public String toString() {
        String rez=new String();
        rez+="Nume creator: " + super.getNume() + " subscriberi: ";
        Iterator<Subscriber> it = subcriberi.iterator();
        while(it.hasNext()) {
            rez += it.next().toString() + "\n";
        }
        return rez;
    }

}
