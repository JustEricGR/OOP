import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> cuvinte = List.of("Ana", "are","mere");
        List<String> cautate = List.of("mere","667","banane");
        List<String> numere = List.of("456","pere","6783");
        List<Statistica> statistici = new ArrayList<>();
        StatisticaNumarAparitii stat1 = new StatisticaNumarAparitii(cuvinte);
        StatisticaNumeraleNonReale stat2 = new StatisticaNumeraleNonReale(numere);
        statistici.add(stat1);
        statistici.add(stat2);
        Executor exec = new Executor(statistici);

        exec.executa(cautate);
    }
}
