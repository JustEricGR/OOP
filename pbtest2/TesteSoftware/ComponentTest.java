public class ComponentTest extends IntegrationTest {
    private int complexitate;

    public ComponentTest(String nume, int calitate, int complexitate) throws WrongQualityIndicatorException, WrongComponentComplexityIndicatorException{
        super(nume,calitate);
        if(complexitate<=0)throw new WrongComponentComplexityIndicatorException("Complexitate <= 0");
        else this.complexitate = complexitate;
        
    }

    @Override
    public String toString() {
        return super.toString() + " complexitate " + complexitate;
    }

}
