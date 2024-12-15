public abstract class Teste {
    private String nume = new String();
    private int calitate;

    public Teste(String nume, int calitate) {
        this.nume=nume;
        this.calitate=calitate;
    }

    public abstract int getNumar();

    public String getNume() {
        return this.nume;
    }

    public int getCalitate() {
        return this.calitate;
    }

   public void setCalitate(int calitate) {
        this.calitate=calitate;
   }

}