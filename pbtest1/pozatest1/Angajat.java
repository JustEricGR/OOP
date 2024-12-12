public class Angajat {
    private String nume = new String();
    private int salariu;
    
    public Angajat(Angajat src) {
        this.nume = src.nume;
        this.salariu = src.salariu;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSalariu() {
        return this.salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }


    public Angajat(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public Angajat () {
        this.nume = "";
        this.salariu = 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Angajat)) return false;
        Angajat aux = (Angajat) obj;
        return this.nume == aux.nume && this.salariu == aux.salariu;
    }
    
}
