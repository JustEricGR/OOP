import java.util.*;

public class Main {
    public static void main(String[] args) throws WrongComponentComplexityIndicatorException{
        List<Teste> lista = new ArrayList<>();
        TesteSuita suita = new TesteSuita(lista);

        suita.addNewIntegrationTest("Integrare1", 4);
        suita.addNewIntegrationTest("Integrare2", 6);
        

        suita.addNewComponentTest("Component1", 1, 8);
        
        

        suita.addNewComponentTest("Component2", 0, 7);
        

        System.out.println(suita);
    }
}
