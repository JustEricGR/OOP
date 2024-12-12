public class Portofel {
    private final int size = 6;
    private String nume = new String();
    private Card[] carduri = new Card[size];
    private int counter = 0;

    public Portofel(String nume) {
        this.nume = nume;
    }

    public boolean adaugaCard(String numar, double sold) {
        if(counter <= size) {
            Card aux = new Card(numar, sold);
            for(int i=0;i<counter;i++) {
                if(carduri[i].getNumar().equals(aux.getNumar())) return false;
            }
            carduri[counter++] = aux;
            return true;
        }
        return false;
    }

    public boolean adaugaCard(Card src) {
        if(counter <= size) {
            //Card aux = new Card(numar, sold);
            for(int i=0;i<counter;i++) {
                if(carduri[i].getNumar().equals(src.getNumar())) return false;
            }
            carduri[counter++] = src;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder rez = new StringBuilder();
        rez.append(this.nume + ": ");
        for(int i=0;i<counter;i++) {
            rez.append(carduri[i].toString() + "; ");
        }
        return rez.toString().trim();
    }

    public double calculeazaSold() {
        double suma=0;
        for(int i=0;i<counter;i++) {
            suma += carduri[i].getSold();
        }
        return suma;
    }

}
