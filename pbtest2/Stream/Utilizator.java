public abstract class Utilizator {
    private String nume = new String();


    public Utilizator(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return this.nume;
    }
    public abstract double calculeazaVenit(int suma);
}