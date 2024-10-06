import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Complex> numere = new ArrayList<>();
        System.out.print("Cate elemente sa se citeasca: ");
        int size = scan.nextInt();
        numere = citire(numere, scan, size);
        afisare(numere);
        List<Double> module = moduleMaker(numere);
        module.stream()
        .forEach(nr -> System.out.print(nr + " "));
        scan.close();
    }

    public static List<Complex> citire(List<Complex> lista, Scanner scan, int size) {
        Complex s = new Complex();
        for(int i=0;i<size;i++) {
            System.out.println("Introduceti partea reala a numarului " + (i+1));
            double a = scan.nextDouble();
            System.out.println("Introduceti partea imaginara a numarului " + (i+1));
            double b = scan.nextDouble();
            lista.add(new Complex(a, b));
            s.suma(s, new Complex(a,b));
        }
        lista.add(s);
        return lista;
    }

    public static void afisare(List<Complex> lista) {
        lista.stream().
        forEach(c -> System.out.println(c));
    }

    public static List<Double> moduleMaker(List<Complex> complexe) {
        List<Double> module = new ArrayList<>();
        complexe.stream()
        .forEach(c -> {
            module.add(c.Modul());
        });

        return module;
    }
}
