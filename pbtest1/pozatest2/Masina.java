public class Masina {
    private String numar = new String();
    private int cantitate;

    public Masina(String numar, int cantitate) {
        this.numar = numar;
        this.cantitate = cantitate;
    }

    public int getCantitate() {
        return this.cantitate;
    }

    public String getNumar() {
        return this.numar;
    }
}