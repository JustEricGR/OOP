import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subscriber> l = new ArrayList<>();
        Creator c1 = new Creator("Creator1", l);
        Creator c2 = new Creator("Creator2", List.of(new Subscriber("s2c1", 6), new Subscriber("s2c2", 20)));
        Subscriber s1 = new Subscriber("Subscriber", 12);

        
        Subscriber s1c1 = new Subscriber("s1c1", 10);
        Subscriber s1c2 = new Subscriber("s2c1", 20);
        Subscriber s1c3 = new Subscriber("s1c1", 10);
        c1.adaugaSubscriber(s1c1);
        c1.adaugaSubscriber(s1c2);
        c1.adaugaSubscriber(s1c3);
        Platforma pl = new Platforma(new ArrayList<>());
        pl.adaugaUtilizator(c1);
        pl.adaugaUtilizator(c2);
        pl.adaugaUtilizator(s1);

        System.out.println(pl);
        System.out.println(pl.determinaVip(30));
    }
}
