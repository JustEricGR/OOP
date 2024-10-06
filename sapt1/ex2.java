public class ex2 {
    public static void main(String[] args) {
        int suma = 0;
        for(int i=0;i<=100;i++) {
            if(i % 2 == 0) {
                suma += i;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Suma: " + suma);
    }
}
