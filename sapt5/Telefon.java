import java.util.Arrays;

public class Telefon {
    private String nume = new String();
    private String[] agenda = new String[100];
    private int counter=0;

    public Telefon(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return this.nume;
    }

    public String[] getAgenda() {
        return Arrays.copyOf(this.agenda,counter);
    }

    public boolean apeleaza(Telefon src) {
        if(src.counter >= 100) return false;
        src.agenda[src.counter++] = this.nume;
        return true;
    }

    public Integer numarDeApeluri(String src) {
        Integer nr=0;
        for(int i=0;i<this.counter;i++) {
            if(this.agenda[i].equals(src))nr++;
        }
        return nr;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.nume + ": ");
        for(int i=0;i<this.counter;i++) {
            result.append(this.agenda[i] + " ");
        }
        return result.toString().trim();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Telefon) {
            Telefon aux = (Telefon) obj;
            if(aux.nume.equals(this.nume))return true;
        }
        return false;
    }

}