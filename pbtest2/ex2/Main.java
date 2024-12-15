public class Main {
    public static void main(String[] args) {
        Utilizator u1 = new Utilizator("Dan");
        Utilizator u2 = new Utilizator("Marius");
        Utilizator u3 = new Utilizator("Alex");

        Grup g = new Grup("Carnivorii");

        try {
            g.inscrie(u3);
        } catch (Exista e) {
            System.out.println(e.getMessage());
        }

        try {
            g.inscrie(u3);
        } catch (Exista e) {
            System.out.println(e.getMessage());
        }

        try {
            g.inscrie(u1);
        } catch (Exista e) {
            System.out.println(e.getMessage());
        }

        try {
            g.inscrie(u2);
        } catch (Exista e) {
            System.out.println(e.getMessage());
        }

        //System.out.println(g);
        u3.trimite(g,"Am deschis magazinul");
        //System.out.println(g);
        u2.trimite(g,"Vin acum");
        System.out.println(g);
    }
}
