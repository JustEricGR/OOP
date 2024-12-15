public abstract class Destinatar {

    protected String nume = new String();
    public Destinatar(String nume) {
        this.nume=nume;
    }
    public abstract void receptioneaza(Destinatar expeditor, String mesaj);

    public abstract String getNume();

    @Override
    public boolean equals(Object o) {
        if(o instanceof Destinatar) {
            Destinatar aux=(Destinatar)o;
            return this.nume.equals(aux.getNume());
        }
        return false;
    }
}
