public class Main {
    public static void main(String[] args) {
        Portofel portofel = new Portofel("BT");
        Card[] carduri = new Card[4];
        carduri[0] = new Card("cineva", 34);
        carduri[1] = new Card("cncn", 10109.56);
        carduri[2] = new Card("csffs", 4567.54);
        carduri[3] = new Card("cineva", 100);

        for(int i=0;i<4;i++) {
            if(portofel.adaugaCard(carduri[i]))continue;
            break;
        }

        System.out.println(portofel);

        System.out.println(portofel.calculeazaSold());
    }
}
