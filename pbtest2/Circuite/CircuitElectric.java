public interface CircuitElectric {
    double rezistentaEchivalenta();
    double curent(double tensiune);
    boolean contineCircuit(CircuitElectric subcircuit);

}
