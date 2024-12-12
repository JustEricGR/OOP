public class Main {
    public static void main(String[] args) {
        Desen desen = new Desen("Patrat");
        for(int i=0;i<3;i++) {
            
            if(desen.adaugaFigura(new Figura((i+1)*3.5)))continue;
            else break;
            
        }
        desen.adaugaFigura(new Figura(7.0));
        System.out.println(desen);
        System.out.println(desen.medieArie());
    }
}
