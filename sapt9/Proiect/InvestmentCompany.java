import java.util.*;

public class InvestmentCompany {
    private List<Project> proiecte = new ArrayList<>();

    public void addProject(Project p) {
        proiecte.add(p);
    }

    public Project getBestInvestment() {
        Project best = proiecte.get(0);
        for(int i=0;i<proiecte.size();i++) {
            if(proiecte.get(i).getRisk()<best.getRisk())best = proiecte.get(i);
        }
        return best;
    }

    @Override
    public String toString() {
        String rez = new String();
        for(Project p : proiecte) {
            rez += p.toString() + "\n";
        }
        return rez;
    }
}
