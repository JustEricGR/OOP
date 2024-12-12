public class Militare extends Project {
    private String deadline;
    private String parola;
    private static final int size=15;
    private Member[] membrii = new Member[size];
    private int counter=0;

    public Militare(String titlu, String obiectiv, long fonduri, String deadline, String parola) {
        super(titlu, obiectiv, fonduri);
        this.deadline = deadline;
        this.parola = parola;
        
    }

    @Override
    public void addMember(Member m) {
        if(counter>=size)return;
        membrii[counter++]=m;
    }

    @Override
    public double getRisk() {
        return (double)counter/parola.length()/getFonduri();
    }
}
