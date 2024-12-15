public class Utilizator extends Destinatar {

    private String jurnal = new String();

    public Utilizator(String nume) {
        super(nume);
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public void receptioneaza(Destinatar dest, String mesaj) {
        jurnal+="Primit de la " + dest.getNume() + " mesajul: " + mesaj + "\n";
    }

    public void trimite(Destinatar dest, String mesaj) {
        jurnal+="Trimis catre " + dest.getNume() + " mesajul: " + mesaj + "\n";
        dest.receptioneaza(this,mesaj);
    }



    @Override
    public String toString() {
        return nume + "\n" + jurnal;
    }
}
