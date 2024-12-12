public class PassengerPlane extends Plane{
    private int maxPassengers;

    public PassengerPlane(int max) {
        super("Pasageri", 345678);
        this.maxPassengers = max;
    }


    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    

}
