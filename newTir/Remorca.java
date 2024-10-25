public class Remorca {
    private int cutii;
    private String numar;


    public Remorca(int cutii, String numar) {
        this.cutii = cutii;
        this.numar = numar;
    }

    public Remorca(Remorca src, String numar) {
        this.cutii = src.cutii + 1;
        this.numar = numar;
    }

    public int getCutii() {
        return this.cutii;
    }

    public void setCutii(int cutii) {
        this.cutii = cutii;
    }

    public String getNumar() {
        return this.numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "(" + cutii + "," + numar + ")";
    }

}