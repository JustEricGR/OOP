import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// Complex comp new Complex(21,6); // Complex compl- new Complex(34,7); // Complex comp2 comp.adunare(comp1); // System.out.println(comp); // System out.println(comp1): System.out.println(comp2):
        List<Complex> lista = new ArrayList<Complex> ();
        lista = citire(scan, lista);
        lista.stream().
        forEach(c -> {
            System.out.println(c);
            System.out.println(c.modul());
        });
        System.out.println("Sunt " + lista.get(0).counter + " numere");
        scan.close();
    }
 

    public static List<Complex> citire (Scanner scan, List<Complex> complexe) {
        for(int i=0;i<2;i++) {
            System.out.println("Introduceti partea reala a numarului " + (i+1));
            double a = scan.nextDouble(); 
            System.out.println("Introduceti partea imaginara a numarului " + (i+1));
            double b = scan.nextDouble();
            complexe.add(new Complex (a,b));            
        }
        complexe.add(new Complex(0, 0));
        Complex aux = new Complex(0, 0);
        aux.adunare(complexe.get(0), complexe.get(1));
        complexe.set(2, aux);

        return complexe;
    }

}