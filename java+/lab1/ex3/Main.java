import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nrLaturi = 0;
        System.out.print("Cate laturi are poligonul: ");
        nrLaturi = scan.nextInt();
        Polygon polygon = new Polygon(nrLaturi, new Point[nrLaturi]);
        
        polygon = citire(polygon, scan);
        afisare(polygon);


        scan.close();
    }

    public static Polygon citire(Polygon polygon, Scanner scan) {
        for(int i=0;i<polygon.getNrLaturi();i++) {
            double x = 0, y = 0;
            System.out.print("Introduceti x-ul punctului " + (i+1) + ":");
            x = scan.nextDouble();
            System.out.print("Introduceti y-ul punctului " + (i+1) + ":");
            y = scan.nextDouble();
            Point aux = new Point(x, y);
            polygon.setPunct(i, aux);
        }

        return polygon;
    }

    public static void afisare(Polygon polygon) {
        for(Point punct : polygon.getPoints()) {
            System.out.println(punct);
        }
    }
}