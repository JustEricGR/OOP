import java.util.Arrays;

public class Echipa {
    private final int nrTitulari = 11;
    private final int nrRezerve = 15;
    private Jucator[] titulari = new Jucator[nrTitulari];
    private Jucator[] rezerve = new Jucator[nrRezerve];

    public Echipa(Jucator[] titulari, Jucator[] rezerve) {
        this.titulari = Arrays.copyOf(titulari, nrTitulari);
        this.rezerve = Arrays.copyOf(rezerve, nrRezerve);
    }

    public boolean efectueazaSchimbare(Jucator titular, Jucator rezerva) {
        int pozitieTitular=0, pozitieRezerva=0;
        for(int i=0;i<nrTitulari;i++) {
            if(titulari[i].equals(titular)) {
                pozitieTitular = i;
                break;
            }
            else if(i == nrTitulari - 1)return false;
        }

        for(int i=0;i<nrRezerve;i++) {
            if(rezerve[i].equals(rezerva)) {
                pozitieRezerva = i;
                break;
            }
            else if(i == nrRezerve - 1)return false;
        }

        Jucator aux = new Jucator(titular.getNume(), titular.getNumar());
        titulari[pozitieTitular].setJucator(rezerve[pozitieRezerva]);
        rezerve[pozitieRezerva].setJucator(aux);

        return true;
    }

    @Override
    public String toString() {
        // StringBuilder rez = new StringBuilder();
        // StringBuilder rez1 = new StringBuilder();
        // StringBuilder rez2 = new StringBuilder();
        String rez = new String();
        rez += "Titulari: ";

        //rez1.append("Titulari: ");
        for(int i=0;i<nrTitulari;i++) {
            //rez1.append(titulari[i].toString() + "; ");
            rez += titulari[i];
            rez += "; ";
        }
        rez += "\n";

        //rez2.append("Rezerve: ");
        rez += "Rezerve:";
        for(int i=0;i<nrRezerve;i++) {
            //rez2.append(rezerve[i].toString() + "; ");
            rez += rezerve[i];
            rez += "; ";
        }

        //rez.append(rez1 + "\n" + rez2);
        rez += "\n";
        //return rez.toString().trim();
        return rez;
    }
}
