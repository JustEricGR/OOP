public class Main {
    public static void main(String[] args) {
        Greutate g1 = new GreutateSimpla(100);
        Greutate g2 = new GreutateSimpla(50);
        Greutate g3 = new GreutateDubla(g1, g2); 
        Greutate g4 = new GreutateDubla(g2, g3);
        Greutate g5 = new GreutateSimpla(20);
        

        ColectieGreutati colectie = new ColectieGreutati();
        
        Greutate g6 = new GreutateMultimpla();
        colectie.adauga(g1);
        colectie.adauga(g2);
        colectie.adauga(g6);

        System.out.println(colectie.medie());

        for (int i=0;i<colectie.getCounter();i++ ) {
            System.out.println(colectie.getGreutati()[i].getCapacitate());
        }

    }
}
