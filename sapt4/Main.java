import java.util.*;

public class Main {
    public static void main(String[] args) {
        int m,n,p;
        Scanner scan = new Scanner(System.in);
        System.out.println("cate linii are prima matrice:");
        m = scan.nextInt();
        System.out.println("cate coloane are prima matrice si cate linii a doua matrice:");
        n = scan.nextInt();
        System.out.println("Cate coloane are a doua matrice:");
        p = scan.nextInt();
        int A[][] = new int[m][n];
        int B[][] = new int[n][p];
        int C[][] = new int[m][p];
        scan.close();
    }
}

