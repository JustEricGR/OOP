import java.util.*;

public class ComposedTask extends Task{
    private String nume = new String();
    private List<Task> taskuri = new ArrayList<>();


    public ComposedTask(String nume, List<Task> taskuri) {
        this.nume = nume;
        this.taskuri = taskuri;
    }

    @Override
    public boolean execute(double executie) {
        
        for(Task t : taskuri) {
            if(t.execute(executie/taskuri.size())) continue;
            else return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String rez = new String();
        rez+="Nume: " + nume + " ,Content: ";
        Iterator<Task> it = taskuri.iterator(); 
        while (it.hasNext()) {
            rez+=it.next().toString() + "\n";
        }
        return rez;
    }

}
