import java.util.*;

public class Procesor {
    private static final int time = 5;
    private List<Task> taskuri = new ArrayList<>();


    public Procesor(List<Task> taskuri) {
        this.taskuri = taskuri;
    }

    public void finishAllTasks() {
        int counter=0;
        while(true) {
            for(Task t : taskuri) {
                if(t.execute(time)) {
                    counter++;
                    continue;
                }
                break;
            }
            if(counter == taskuri.size()) break;
            else continue;
        }
               
    }

    @Override
    public String toString() {
        
        String rez = new String();
        rez+="Procesor: ";
        Iterator<Task> it = taskuri.iterator();
        while (it.hasNext()) {
            rez+=it.next().toString();
        }
        return rez;
    }
}
