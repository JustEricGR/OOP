public class Echipa {
    private String nume;
    private int goluri;
    private int outuri;
    private int corneruri;


    public Echipa(String nume, int goluri, int outuri, int corneruri) {
        this.nume = nume;
        this.goluri = goluri;
        this.outuri = outuri;
        this.corneruri = corneruri;
    }


    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGoluri() {
        return this.goluri;
    }

    public void setGoluri(int goluri) {
        this.goluri = goluri;
    }

    public int getOuturi() {
        return this.outuri;
    }

    public void setOuturi(int outuri) {
        this.outuri = outuri;
    }

    public int getCorneruri() {
        return this.corneruri;
    }

    public void setCorneruri(int corneruri) {
        this.corneruri = corneruri;
    }


    @Override
    public String toString() {
        return "Echipa: " + nume + " goluri: " + goluri + " corneruri: " + corneruri + " outuri: " + outuri;
    }

}
