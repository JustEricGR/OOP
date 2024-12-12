public class Concorde extends PassengerPlane{

    public Concorde() {
        super(2345);
        super.setPlaneID("Concorde");
    }
    
    public void goSuperSonic() {
        System.out.println(super.getPlaneID() + " supersonic mode activated");
    }

    public void goSubSonic() {
        System.out.println(super.getPlaneID() + " supersonic mode deactivated");
    }
}
