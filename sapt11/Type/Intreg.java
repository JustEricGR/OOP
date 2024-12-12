public class Intreg extends Tip implements Cloneable {
    private int value;


    public Intreg(int value) {
        this.value = value;
    }


    @Override
    public String getTip() {
        return super.getTip() + getClass();
    }

    @Override
    public String toString() {
        String rez = new String();
        rez += this.value;
        return rez;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Intreg) {
            Intreg aux=(Intreg)obj;
            return this.value==aux.value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}
