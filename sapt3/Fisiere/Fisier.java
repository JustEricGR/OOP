public class Fisier {

    private String nume;
    private String continut;
    private int id;
    private Fisier anterior;

    public static int counter=0;

    public Fisier(String nume, String continut) {
        this.nume = nume +(counter+1);
        this.continut = continut;
        this.id = 123456;
        this.anterior = null;
        counter++;
    }

    public Fisier(Fisier src) {
        
        setAnterior(src);
        this.nume = src.nume + counter;
        //this.continut.set = src.continut.setContinut() + "bak";
        setContinut(src.getContinut() + "bak");
        this.id = src.id++;
        counter++;
    }

    public void setAnterior(Fisier back) {
        if(counter!=1) {
            this.anterior = back;
        }
    }

    public Fisier getAnterior() {
        return this.anterior;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getContinut() {
        return this.continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    public int getID() {
        return this.id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    // public Fisier salveazaVersiune() {
    //     String aux = getContinut + "bak";
    //     return new Fisier(getNume,aux,getID);
    // }


    @Override
        public String toString() {
            return "Nume: " + getNume() + " continut " + getContinut();
        }




}
