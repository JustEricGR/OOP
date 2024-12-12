//import java.util.Arrays;

public class Tir {
    private Remorca[] remorca;
    private static int size;


    public Tir(int size) {
        //this.size = size;
        this.remorca = new Remorca[size];
    }


    public Remorca getRemorca(int index) {
        return this.remorca[index];
    }

    // public void setRemorca(Remorca[] remorca) {
    //     this.remorca = remorca;
    // }


    public boolean adaugaRemorca(int cutii, String numar) {
        if(Remorca.counter<size) {
            remorca[Remorca.counter+1] = new Remorca(cutii, numar);
            return true;
        }
        return false;
    }

    public boolean adaugaRemorca(Remorca src) {
        if(Remorca.counter<size) {
            remorca[Remorca.counter] = new Remorca(src);
            return true;
        }
        return false;
    }

    public Remorca stergeRemorca(String numar) {
        for(int i=0;i<remorca.length;i++) {
            if(numar.equals(remorca[i].getNumar())) {
                for(int j=remorca.length;j>i;j--) {
                    remorca[j-1] = remorca[j];
                }
                i--;
            }
            return remorca[i];
        }
        return null;
    }

    

    @Override
    public String toString() {
        String rez = new String();
        rez = "T1";
        for(int i=0;i<size;i++) {
            if(i!=(size-1)) {
                rez.concat(getRemorca(i).toString());
            }
        }

        return rez;
    }

}
