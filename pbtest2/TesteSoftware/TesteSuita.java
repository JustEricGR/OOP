import java.util.*;

public class TesteSuita {
    
    private List<Teste> teste = new ArrayList<>();


    public TesteSuita(List<Teste> teste) {
        this.teste=teste;
    }

    public int getNumar() {
        return teste.size();
    }

    public boolean addNewIntegrationTest(String name, int indicator) {
        try {
            IntegrationTest it = new IntegrationTest(name, indicator);
            teste.add(it);
            return true;
        } catch (WrongQualityIndicatorException w) {
            System.out.println(w);
            return false;
        }
        
    }

    public boolean addNewComponentTest(String name, int indicator, int complexity){
        try {
            ComponentTest ct = new ComponentTest(name, indicator, complexity);
            teste.add(ct);
            return true;
        } catch (WrongQualityIndicatorException w) {
            System.out.println(w);
            return false;
        } catch (WrongComponentComplexityIndicatorException w) {
            return false;
        }
    }

    @Override
    public String toString() {
        String rez = new String();
        Iterator<Teste> it = teste.iterator();
        while(it.hasNext()) {
            rez+=it.next()+"\n";
        }
        return rez;
    }

}
