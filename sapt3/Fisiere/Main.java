//import java.util.*;

public class Main {

    public static void main(String[] args) {

        //List<Fisier> versiuni = new LinkedList<Fisier>();
        Fisier fisier = new Fisier("fisier1","cevaqa");

        for(int i=1;i<5;i++) {
            
            Fisier aux = new Fisier(fisier);
            System.out.println(aux.getAnterior());
            

        }


    }
}
