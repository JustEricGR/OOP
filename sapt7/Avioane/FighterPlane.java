public class FighterPlane extends Plane{
    public FighterPlane() {
        super("Fighter", 234);
    }

    public void launchMissile() {
        System.out.println(super.getPlaneID() + " - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
    }
}
