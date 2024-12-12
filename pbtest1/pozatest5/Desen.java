public class Desen {
    private final int nrMax = 1024;
    private String nume = new String();
    private int counter = 0;
    private Figura[] figuri = new Figura[nrMax];

    public Desen(String nume) {
        this.nume = nume;
    }

    public boolean adaugaFigura(Figura src) {
        if(counter >= nrMax)return false;
        for(int i=0;i<counter;i++) {
            if(figuri[i].getArie() == src.getArie())return false;
            
        }
        figuri[counter++] = src;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder rez = new StringBuilder();
        rez.append(nume + ": ");
        for(int i=0;i<counter;i++) {
            rez.append("Figura" + i + " - " + figuri[i].getArie() + " ");
        }
        return rez.toString();
    }

    public double medieArie() {
        double total = 0;
        for(int i=0;i<counter;i++) {
            total += figuri[i].getArie();
        }
        return total / counter;
    }
    

}
