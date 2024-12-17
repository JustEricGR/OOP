import java.util.*;

public class CircuitParalel implements CircuitElectric {
    List<CircuitElectric> elemente = new ArrayList<>();

    public CircuitParalel(List<CircuitElectric> elemente) {
        this.elemente=elemente;
    }

    @Override
    public double rezistentaEchivalenta() {
        double total=0;
        Iterator<CircuitElectric> it = elemente.iterator();
        while(it.hasNext()) {
            total+=1/it.next().rezistentaEchivalenta();
        }
        return total;
    }

    @Override
    public double curent(double tensiune) {
        return tensiune/rezistentaEchivalenta();
    }

    @Override
    public boolean contineCircuit(CircuitElectric subcircuit) {
        Iterator<CircuitElectric> it = elemente.iterator();
        while(it.hasNext()) {
            if(it.next().equals(subcircuit))return true;
        }
        return false;
    }
}
