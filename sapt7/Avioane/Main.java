public class Main {
    public static void main(String[] args) {
        Plane boeing = new Boeing();
        Plane concorde = new Concorde();
        Plane mig = new Mig();

        ((FighterPlane)mig).launchMissile();

        boeing.takeOff();
        ((Concorde)concorde).goSubSonic();
        
        System.out.println(concorde.getTotalEnginePower());
        boeing.land();
    }
}
