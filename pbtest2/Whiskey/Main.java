import java.util.*;

public class Main {
    public static void main(String[] args) {
        Whiskey cw = new ClassicWhiskey("cw",34);
        Whiskey jh = new JackAndHoney("jah",30,10);
        List<Whiskey> lista = new ArrayList<>();
        BlendedWhiskey bl1 = new BlendedWhiskey("Blendded1", lista);
        bl1.adaugaBautura(new ClassicWhiskey("cw11",40));
        bl1.adaugaBautura(new ClassicWhiskey("cw22",50));
        List<Whiskey> lista1 = new ArrayList<>();
        BlendedWhiskey bl2 = new BlendedWhiskey("Blendded2", lista1);
        bl2.adaugaBautura(cw);
        bl2.adaugaBautura(jh);
        bl2.adaugaBautura(bl1);

        System.out.println(bl2);
    }
}
