public class GreutateMultimpla implements Greutate{
    private final int max = 10;
    //List<Greutate> greutati = new ArrayList<>();
    Greutate[] greutati = new Greutate[max];


    public GreutateMultimpla() {
        for(int i=0;i<max;i++) {
            if(i%2==0)
                greutati[i] = new GreutateSimpla(i);
            else 
                greutati[i] = new GreutateDubla(new GreutateSimpla(i), new GreutateSimpla(i*2));
        }
    }

    @Override
    public int getCapacitate() {
        int total=0;
        //greutati.stream().forEach(g -> total.addAndGet(g.getCapacitate()));
        for(Greutate g : greutati) {
            total += g.getCapacitate();
        }
        return total;
    }
}
