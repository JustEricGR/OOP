import java.util.Arrays;

public class Polygon {
    private int nrLaturi;
    private Point[] puncte;

    public Polygon(int nrLaturi, Point[] puncte) {
        this.nrLaturi = nrLaturi;
        this.puncte = Arrays.copyOf(puncte,nrLaturi);
    }


    public int getNrLaturi() {
        return this.nrLaturi;
    }

    public void setNrLaturi(int nrLaturi) {
        this.nrLaturi = nrLaturi;
    }

    public Point getPunct(int index) {
        return this.puncte[index];
    }

    public void setPunct(int index, Point punct) {
        this.puncte[index] = new Point(punct);
    }

    public Point[] getPoints() {
        return Arrays.copyOf(this.puncte, nrLaturi);
    }

}



