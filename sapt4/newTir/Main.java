public class Main {
    public static void main(String[] args) {
        Tir[] tiruri = new Tir[2];
        for(int i=0;i<2;i++) {
            tiruri[i] = new Tir();
        }
        tiruri[0] = citire(tiruri[0]);
        tiruri[1] = citire(tiruri[1]);
        System.out.println(tiruri[0]);
        //System.out.println(tiruri[0].getTotalCutii());
        System.out.println(tiruri[1]);
        if(tiruri[0].getTotalCutii()==tiruri[1].getTotalCutii()) {
            System.out.println("Egale");
        } else {
            System.out.println("Diferite");
        }
        tiruri[0].stergeRemorca("gsdhj4");
        System.out.println(tiruri[0]);
        
    }

    public static Tir citire(Tir tir) {
        Remorca remorca = new Remorca(10,"TM21ROC");
        for(int i=0;i<5;i++) {
            if(i==0) {
                if(tir.adaugaRemorca(remorca))continue;
                break;
            }
            else {
                if(tir.adaugaRemorca(new Remorca(tir.getRemorca(i-1),"gsdhj" + i)))continue;
                break;
            }
        }
        return tir;
    }
}
