public class Main {
    
    public static void main(String[] args) {
        Jucator[] titulari = new Jucator[11];
        Jucator[] rezerve = new Jucator[15];

        Jucator[] jucatori = new Jucator[26];

        
        for (int i = 0; i < jucatori.length; i++) {
            String nume = "Jucator" + (i + 1); // Example name for each player
            int numar = i + 1; // Example number for each player
            jucatori[i] = new Jucator(nume, numar);
        }

        for(int i=0;i<11;i++) {
            titulari[i] = jucatori[i];
        }

        for(int i=0;i<15;i++) {
            rezerve[i] = jucatori[i + 11];
        }

        Echipa echipa = new Echipa(titulari, rezerve);

        System.out.println(echipa);

        if(echipa.efectueazaSchimbare(jucatori[10],jucatori[20]))
            System.out.println(echipa);
        else System.out.println("Rau");
    }

    
}
