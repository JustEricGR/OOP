public class Mig extends FighterPlane {

    public Mig() {
        super.setPlaneID("Mig");
    }
    
    public void highSpeedGeometry() {
        System.out.println(super.getPlaneID() + " - High speed geometry selected");
    }

    public void normalSpeedGeometry() {
        System.out.println(super.getPlaneID() + " - Normal speed geometry selected");
    }
}
