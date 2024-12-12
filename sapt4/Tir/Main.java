import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Tir tir = new Tir(size);

        Remorca first = new Remorca(10, "TM34FFS");
        if(tir.adaugaRemorca(first)) {
            int aux=0;
            for(int i=0;i<size;i++) {
                
                if(i==0){
                    aux=first.getCutii();
                    
                } 
                else {
                    aux=tir.getRemorca(i).getCutii();
                }

                if(tir.adaugaRemorca(aux, "hjdhbd"))continue;
                    else break;
                
            }
        }
        System.out.println(tir);
        scan.close();

    }
}