import java.util.*;

public class Open_source extends Project{
    private String mailing;
    private List<Member> membrii = new ArrayList<Member>();

    public Open_source(String titlu, String obiectiv, long fonduri, String mailing) {
        super(titlu, obiectiv, fonduri);
        this.mailing = mailing;
        
    }

    @Override
    public void addMember(Member m) {
        membrii.add(m);
    }

    @Override
    public double getRisk() {
        return (double)membrii.size()/getFonduri();
    }
}
