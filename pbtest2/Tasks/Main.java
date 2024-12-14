import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComposedTask ct = new ComposedTask("composed1", List.of(new SimpleTask("t1", 5), new SimpleTask("t2", 10)));
        Procesor pr = new Procesor(List.of(ct));
        System.out.println(pr);
        pr.finishAllTasks();
        System.out.println(pr);
    }
}
