public class Firma {
    private final int size = 30;
    private String nume = new String();
    private int buget;
    private Angajat[] angajati = new Angajat[size];
    private int counter=0;

    public Firma(String nume, int buget) {
        this.nume = nume;
        this.buget = buget;
        for(int i=0;i<size;i++) {

        }
    }

    public String getNume() {
        return this.nume;
    }

    public boolean adaugaAngajat(Angajat angajat) {
        if(counter >= size)return false;
        for(int i=0;i<counter;i++) {
            if(counter==0)break;
            if(angajati[i].equals(angajat))return false;
        }
        angajati[counter++] = angajat;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder rezultat = new StringBuilder();
        for(int i=0;i<counter;i++) {
            rezultat.append("<" + angajati[i].getNume() + "> - <" + angajati[i].getSalariu() + ">");
        }
        return rezultat.toString().trim();
    }

    public int platesteSalarii() {
        int nrTotal=0;
        for(int i=0;i<counter;i++) {
            nrTotal += angajati[i].getSalariu();
        }
        return buget - nrTotal;
    }


}