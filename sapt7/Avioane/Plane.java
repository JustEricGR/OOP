public class Plane {

    private String ID;
    private int totalEnginePower;

    public Plane(String ID, int total) {
        this.ID = ID;
        this.totalEnginePower = total;
    }


    public String getPlaneID() {
        return this.ID;
    }

    public void setPlaneID(String src) {
        this.ID = src;
    }


    public int getTotalEnginePower() {
        return this.totalEnginePower;
    }

    public void takeOff() {
        System.out.println(ID + " - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
    }

    public void fly() {
        System.out.println(ID + " fly");
    }

    public void land() {
        System.out.println(ID + " - Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
    }
}