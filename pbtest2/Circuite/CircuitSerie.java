import java.util.*;

public class CircuitSerie implements CircuitElectric {
    private List<CircuitElectric> elemente = new ArrayList<>();

    public CircuitSerie(List<CircuitElectric> elemente) {
        this.elemente=elemente;
    }

    @Override
    public double rezistentaEchivalenta() {
        double total=0;
        Iterator<CircuitElectric> it = elemente.iterator();
        while(it.hasNext()) {
            total+=it.next().rezistentaEchivalenta();
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
