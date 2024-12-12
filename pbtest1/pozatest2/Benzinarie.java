public class Benzinarie {
    private int cantitate;
    private Masina[] masini = new Masina[10];
    private int counter = 0;

    public Benzinarie(int cantitate) {
        this.cantitate = cantitate;
    }

    public boolean alimenteazaMasina(Masina masina) {
        if(cantitate - masina.getCantitate() > 0) {
            cantitate -= masina.getCantitate();
            return true;
        } else {
            if(counter < 10) {
                masini[counter++] = masina;
                return true;
            }
            return false;
        }

    }

    @Override
    public String toString() {
        StringBuilder rez = new StringBuilder();
        rez.append("Coada benzinarie: ");
        for(int i=0;i<counter;i++) {
            rez.append(" " + masini[i].getNumar() + " - " + masini[i].getCantitate() + " ");
        }
        return rez.toString();
    }

    public void alimenteazaBenzinarie(int cantitate) {
        this.cantitate += cantitate;
        for(int i=0;i<counter;i++) {
            if(masini[i].getCantitate() > this.cantitate)break;
            this.cantitate -= masini[i].getCantitate();
            if(alimenteazaMasina(masini[i])) {
                for(int j=i;j<counter-1;j++) {
                    masini[j] = masini[j+1];
                }
                masini[counter-1] = null;
                i--;
                counter--;
            }
        }
    }
}
