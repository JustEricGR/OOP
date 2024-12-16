import java.util.*;

public class Main {
    public static void main(String[] args) {
        Autoturism a1 = new Autoturism("Masina1", 4, 0.3);
        Autoturism a2 = new Autoturism("Masina2", 5, 0.25);
        Autoturism a3 = new Autoturism("Masina3", 4.5, 0.15);

        List<Autoturism> masini = new ArrayList<>();

        Camion c1 = new Camion("Camion1", 10, masini);
        c1.adaugaAutoturism(a1);
        c1.adaugaAutoturism(a2);

        //List<Vehicul> vehicule = new ArrayList<>();
        Bac bac = new Bac(20);
        //System.out.println(c1.calculeazaGreutateTotatala());
        bac.adaugaVehicul(c1);
        System.out.println(bac);
        bac.adaugaVehicul(a3);

        System.out.println(bac);
    }
}
