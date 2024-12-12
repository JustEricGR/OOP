public class Jucator {
    private String nume = new String();
    private int numar;

    public Jucator(String nume, int numar) {
        this.nume = nume;
        this.numar = numar;
    }

    public String getNume() {
        return this.nume;
    }

    public int getNumar() {
        return this.numar;
    }

    public void setJucator(Jucator src) {
        this.nume = src.nume;
        this.numar = src.numar;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Jucator)) {
            return false;
        }
        Jucator aux = (Jucator) obj;
        return this.nume.equals(aux.nume) && this.numar == aux.numar;
    }

    @Override
    public String toString() {
        return nume +  " , " + numar;
    }
}