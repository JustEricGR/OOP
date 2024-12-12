public class Remorca {
    
    private int cutii;
    private String numar;

    public static int counter=0;


    public Remorca(int cutii, String numar) {
        this.cutii = cutii;
        this.numar = numar;
        counter++;
    }

    public Remorca(Remorca src) {
        this.cutii = src.cutii;
        this.numar = src.numar;
        counter++;
    }

    // public Remorca(String numar, int cutii) {
    //     this.numar = numar;
    //     this.cutii = cutii++;
    // }

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
        return 
            " cutii='" + getCutii() + "'" +
            ", numar='" + getNumar() + "'"  ;
    }


}
