public class IntegrationTest extends Teste {
    

    public IntegrationTest(String nume, int calitate) throws WrongQualityIndicatorException{
        super(nume,0);
        if(calitate>=1 && calitate<=10)
            super.setCalitate(calitate);
        else {
            //this.calitate=1;
            throw new WrongQualityIndicatorException("Valoare in afara intervalului 1 10");
        }
    }

    @Override
    public int getNumar() {
        return 1;
    }

    @Override
    public String toString() {
        return "Nume: " + super.getNume() + " quality: " + super.getCalitate();
    }
}
