public class Joc {
    private Echipa echipa1;
    private Echipa echipa2;


    public Joc() {
        this.echipa1 = new Echipa("echipa1",0,0,0);
        this.echipa2 = new Echipa("echipa2", 0, 0, 0);
    }

    @Override
    public String toString() {
        String rez = new String();
        rez+=echipa1.toString()+"\n";
        rez+=echipa2.toString()+"\n";
        rez+="Scor: " + echipa1.getGoluri() + " - " + echipa2.getGoluri();
        return rez;
    }

    public void simuleaza() {
        Minge minge = new Minge(0,0);
        int flagGol=0,flagOut=0;

        for(int i=0;i<1000;i++) {

            try {
                minge.suteaza();
                System.out.println("pozitia mingii la momentul " + i + " este " +minge.getX() + ":" + minge.getY());
            } catch (Gol g) {
                System.out.println(g.getMessage());
                if(minge.getX()==100)echipa2.setGoluri(echipa2.getGoluri()+1);
                else if(minge.getX()==0)echipa1.setGoluri(echipa1.getGoluri()+1);
                flagGol=1;
                Minge minge1 = new Minge(50, 25);
                minge=minge1;

            } catch (Corner c) {
                System.out.println(c.getMessage());
                if(minge.getX()==100)echipa1.setCorneruri(echipa1.getCorneruri()+1);
                else if(minge.getX()==0)echipa2.setCorneruri(echipa2.getCorneruri()+1);
            } catch (Out o) {
                System.out.println(o.getMessage());
                echipa1.setOuturi(echipa1.getOuturi()+1);
            }
        }
    }
    

}
