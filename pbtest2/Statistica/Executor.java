import java.util.*;

public class Executor {
    List<Statistica> secventa = new ArrayList<>();


    public Executor(List<Statistica> secventa) {
        this.secventa = secventa;
    }

    public void executa(List<String> deAplicat) {
        for(Statistica s : secventa) {
            s.calculeaza(deAplicat);
            System.out.println(s.getJurnal());
            
        }
    }


}
