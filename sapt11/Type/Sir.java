public class Sir extends Tip implements Cloneable{
    private String value;


    public Sir(String value) {
        this.value = value;
    }


    @Override
    public String getTip() {
        return super.getTip() + getClass();
    }

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Sir) {
            Sir aux=(Sir)obj;
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


