import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        List<Complex> numere = new ArrayList<>();

        for(int i=0;i<2;i++) {
            int a,b;
            System.out.println("Introduceti partea reala a numarului " + (i+1));
            a = scan.nextInt();
            System.out.println("Introduceti partea imaginara a numarului " + (i+1));
            b = scan.nextInt();
            Complex aux = new Complex(a, b);
            numere.add(new Complex(aux));
        }

        numere.add(new Complex(numere.get(0).addNumber(numere.get(1))));

        AtomicInteger index = new AtomicInteger(0);

        numere.stream().
        forEach(numar -> {
            int i = index.getAndIncrement();
            if(i == 2) {
                if(numere.get(2).getImaginary() > 0) {
                    System.out.println(numar.getReal() + " + " + numar.getImaginary() + "i");
                }
                else if(numere.get(2).getImaginary() < 0) {
                    System.out.println(numar.getReal() + " - " + numar.getImaginary() + "i");
                }
                else if(numere.get(2).getImaginary() == 0) {
                    System.out.println(numar.getReal());
                }
            }
            else {
                System.out.println(numar.getReal() + " + " + numar.getImaginary() + "i");
            }
            
        });

        // for(Complex numar : numere) {
        //     System.out.println(numar.getReal() + " + " + numar.getImaginary() + "i");
        // }

        scan.close();
        
    }
}


