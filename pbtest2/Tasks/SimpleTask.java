public class SimpleTask extends Task {
    private String nume = new String();
    private double timp;


    public SimpleTask(String nume, double timp) {
        this.nume = nume;
        this.timp = timp;
    }

    @Override
    public boolean execute(double executie) {
        if(timp>executie){
            timp-=executie;
            return false;
        }
        else return true;

    }

    @Override
    public String toString() {
        String rez=new String();
        rez += "Nume: " + this.nume;
        rez += " Timp: " + this.timp;
        return rez;
    }
}
