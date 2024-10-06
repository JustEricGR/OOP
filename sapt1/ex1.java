import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(Math.max(a, b));

        scan.close();
    }
}