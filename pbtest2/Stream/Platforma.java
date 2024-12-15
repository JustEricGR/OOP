import java.util.*;

public class Platforma {
    private List<Utilizator> utilizatori = new ArrayList<>();


    public Platforma(List<Utilizator> utilizatori) {
        this.utilizatori = utilizatori;
    }


    public boolean adaugaUtilizator(Utilizator u) throws PreaMare {
        if(utilizatori.size()>=1000) {
            throw new PreaMare("S au depasit 1k utlizatori");
            
        }
        utilizatori.add(u);
        return true;
    }

    public Utilizator determinaVip(int minute) {
        
        if(utilizatori.size()==0)return null;
        Utilizator s = new Subscriber(null, 0);
        for(Utilizator u : utilizatori) {
            if(s.calculeazaVenit(minute)<u.calculeazaVenit(minute))s=u;
        }

        return s;
    }

    @Override
    public String toString() {
        String rez=new String();
        //rez+="Nume creator: " + super.getNume() + " subscriberi: ";
        Iterator<Utilizator> it = utilizatori.iterator();
        while(it.hasNext()) {
            rez += it.next().toString();
        }
        return rez;
    }
}
