public class Comerciale extends Project{
    private String deadline;
    private static final int size=15;
    private Member[] membrii = new Member[size];
    private long marketing;
    private int counter=0;
    private int echipe;


    public Comerciale(String titlu, String obiectiv, long fonduri, String deadline, int echipe) {
        super(titlu, obiectiv, fonduri);
        this.deadline = deadline;
        this.marketing = super.getFonduri()/2;
        this.echipe = echipe;
    }
    

    @Override
    public void addMember(Member m) {
        if(counter>=size)return;
        membrii[counter++]=m;
    }

    @Override
    public double getRisk() {
        return (double)3*echipe/counter/(getFonduri()-marketing);
    }
}
