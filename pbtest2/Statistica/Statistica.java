import java.util.*;

public abstract class Statistica {
    private List<String> cautate = new ArrayList<>();
    private String jurnal=new String();

    public Statistica(List<String> cautate) {
        this.cautate = cautate;
    }


    public List<String> getCautate() {
        return this.cautate;
    }

    public String getJurnal() {
        return this.jurnal;
    }

    public void setJurnal(String jurnal) {
        this.jurnal=jurnal;
    }

    public abstract void calculeaza(List<String> secventa);
}