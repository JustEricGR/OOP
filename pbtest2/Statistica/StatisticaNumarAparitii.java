import java.util.*;

public class StatisticaNumarAparitii extends Statistica {

    
    //private String jurnal = new String();

    public StatisticaNumarAparitii(List<String> cautate) {
        super(cautate);
    }

    @Override
    public void calculeaza(List<String> secventa) {
        String jurnal=new String();
        jurnal+="In secventa ";
        for(String s : secventa) {
            jurnal += s + " ";
        }
        jurnal += " apar ";
        int counter=0;
        for(String s : secventa) {
            for(String s1 : super.getCautate()) {
                if(s.equals(s1))counter++;
            }
        }
        jurnal += counter + " stringuri din secventa ";
        for(String s1 : getCautate()) {
            jurnal += s1 + " ";
        }
        super.setJurnal(jurnal);
    }

    public String getJurnal() {
        return super.getJurnal();
    }
    
}
