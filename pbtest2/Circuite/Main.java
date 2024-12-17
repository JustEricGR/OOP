import java.util.*;

public class Main {
    public static void main(String[] args) {
        Rezistenta r1 = new Rezistenta(2);
        Rezistenta r2 = new Rezistenta(1);
        Rezistenta r3 = new Rezistenta(4);
        Rezistenta r4 = new Rezistenta(2);

        CircuitSerie serie1 = new CircuitSerie(List.of(r1,r2));
        CircuitSerie serie2 = new CircuitSerie(List.of(r3,r4));

        CircuitParalel paralel1 = new CircuitParalel(List.of(serie1,serie2));

        System.out.println("Rezistenta echivalenta pe tot circuitul: " + paralel1.rezistentaEchivalenta());
        System.out.println("Curentul prin tot circuitul: " + paralel1.curent(9));
        System.out.println("Este r1 in circuitul serie1: " + serie1.contineCircuit(r1));
    }
}
