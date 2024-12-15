import java.util.*;

public class Grup extends Destinatar {
    private List<Destinatar> destinatari = new ArrayList<>();

    public Grup(String nume) {
        super(nume);
    }

    public String getNume() {
        return this.nume;
    }

    public void inscrie(Destinatar dest) throws Exista {
        Iterator<Destinatar> it = destinatari.iterator();
        while(it.hasNext()) {
            if(it.next().equals(dest))throw new Exista("Utilizatorul exista deja");

        }
        destinatari.add(dest);
    }

    public void receptioneaza(Destinatar dest, String mes) {
        Iterator<Destinatar> it = destinatari.iterator();
        while(it.hasNext()) {
            Destinatar aux = it.next();
            if(!aux.equals(dest))
                aux.receptioneaza(dest,mes);
        }
    }

    public String toString() {
        String rez=new String();
        Iterator<Destinatar> it = destinatari.iterator();
        while(it.hasNext()) {
            rez+=it.next().toString();
        }
        return rez;
    }

}
