import java.util.*;

public class StatisticaNumeraleNonReale extends Statistica{
    
    
    //String jurnal = new String();

    public StatisticaNumeraleNonReale(List<String> cautate) {
        super(cautate);
    }


    @Override
    public void calculeaza(List<String> secventa) throws NumberFormatException {
        String jurnal = new String();
        jurnal+="In secventa ";
        int counter=0;
        for(String s : secventa) {
            jurnal += s + " ";
        }

        for(String s : secventa) {
            try {
                double d = Double.parseDouble(s);
                counter++;
            } catch (NumberFormatException e) {
                e.getMessage();
            }
        }

        jurnal += counter + " numere reale\n";
        super.setJurnal(jurnal);
    }

    public String getJurnal() {
        return super.getJurnal();
    }


    public List<String> getCautate() {
        return this.getCautate();
    }

    

}
