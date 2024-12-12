import java.util.*;

public class Colectie extends Tip {
    List<Tip> lista = new ArrayList<>();

    @Override
    public String getTip() {
        // TODO Auto-generated method stub
        return super.getTip() + getClass();
    }

    @Override
    public String toString() {
        Iterator<Tip> it= lista.iterator();
        String rez1 = new String();
        while(it.hasNext()) {
            //it.next();
            rez1+=it.next().toString()+"\n";
            
        }

        // lista.forEach(t -> {
        //     //String rez=new String();
        //     rez1.append(t);
        //     //rez1=rez;
        // });

        return rez1;
    }

    public void addElement(Tip t) {
        lista.add(t);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Colectie) {
            Colectie col=(Colectie)obj;
            Iterator<Tip> it=lista.iterator();
            Iterator<Tip> it1=col.getColectie().iterator();
            while (it.hasNext()) {
                if(!it1.next().equals(it.next()) || it1.next().hashCode() != it.next().hashCode())return false;
            }
            return true;
        }
        return false;
    }

    public List<Tip> getColectie() {
        return this.lista;
    }
}
