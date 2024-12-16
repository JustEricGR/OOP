public abstract class Vehicul {
    private String numar = new String();
    private double greutate;

    public Vehicul(String nume, double greutate) {
        this.numar=nume;
        this.greutate=greutate;
    }

    public abstract double calculeazaGreutateTotatala();

    @Override
    public String toString() {
        return "Numar: " + numar + " greutate: " + greutate + " ";
    }

    public double getGreutate() {
        return this.greutate;
    }

    public String getNumar() {
        return this.numar;
    }
}