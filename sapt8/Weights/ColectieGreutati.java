public class ColectieGreutati {
    private final int size=10;
    private Greutate[] greutati = new Greutate[size];
    private int counter=0;

    public void adauga(Greutate g) {
        if(counter>=size)return;

        greutati[counter++]=g;
    }

    public double medie() {
        int total=0;
        for(int i=0;i<counter;i++) {
            total += greutati[i].getCapacitate();
        }
        return total/counter;
    }

    public int getCounter() {
        return this.counter;
    }


    public int getSize() {
        return this.size;
    }


    public Greutate[] getGreutati() {
        return this.greutati;
    }

    

}
