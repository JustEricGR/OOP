public class Minge {
    private int x,y;
    private static CoordinateGenerator cg = new CoordinateGenerator();

    public Minge(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void suteaza() throws Out, Gol, Corner {
        
        x = cg.generateX();
        y = cg.generateY();
        if(y==0 || y==50) throw new Out("afara");
        else if((x==0 || x==100) && (y>20 && y<30)) throw new Gol("Gooool");
        else if((x==0 || x==100) && (y<=20 && y>=30)) throw new Corner("Corner");
    }

}