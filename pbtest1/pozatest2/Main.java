public class Main {
    public static void main(String[] args) {
        Benzinarie benzinarie = new Benzinarie(50);
        Masina[] masini = new Masina[10];
        int[] nrPosibile = new int[]{5,10,15};
        for(int i=0;i<10;i++) {
            masini[i] = new Masina("ceva" + i, nrPosibile[(int)(Math.random()*3)]);
        }

        

        for(int i=0;i<10;i++) {
            if(benzinarie.alimenteazaMasina(masini[i]))continue;
            break;

        }

        System.out.println(benzinarie);
        benzinarie.alimenteazaBenzinarie(20);
        System.out.println(benzinarie);
    }
}
