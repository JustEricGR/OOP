public class Tir {
    private final int size = 5;
    private Remorca[] remorci = new Remorca[size];
    private int counter = 0;
    private int totalCutii=0;

    public int getSize() {
        return this.size;
    }


    public Remorca getRemorca(int index) {
        return this.remorci[index];
    }

    public int getTotalCutii() {
        return this.totalCutii;
    }


    public boolean adaugaRemorca(int cutii, String numar) {
        if(counter==size) return false;
        remorci[counter++] = new Remorca(cutii, numar);
        return true;
    }

    public boolean adaugaRemorca(Remorca remorca) {
        if(counter==size) return false;
        remorci[counter++] = remorca;
        return true;
    }

    public void stergeRemorca(String cmp) {
        for(int i=0;i<counter;i++) {
            if(remorci[i].getNumar().equals(cmp)) {
                
                for(int j=counter-1;j>i;j--) {
                    remorci[j-1] = remorci[j];
                }
                counter--;
                i--;
                
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder rezultat = new StringBuilder();
        for(int i=0;i<counter;i++) {
            rezultat.append(remorci[i].toString()).append(" ");
            totalCutii += remorci[i].getCutii();
        }
        return rezultat.toString().trim();
    }
}
