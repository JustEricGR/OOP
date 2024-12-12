public class Main {
    public static void main(String[] args) {
        Intreg i=new Intreg(0);
        Intreg i1=new Intreg(1);
        Sir s=new Sir("hdhjdh");
        Sir s1=new Sir("hdjdjdvhgvhb h");
        Colectie col=new Colectie();
        Colectie col1=new Colectie();
        col.addElement(i);
        col.addElement(s);
        col.addElement(i1);
        col.addElement(s1);

        col1.addElement(i);
        col1.addElement(s);
        col1.addElement(i1);
        col1.addElement(s1);

        
        // try {
        //     col1.addElement((Intreg)i.clone());
        //     col1.addElement((Sir)s.clone());
        //     col1.addElement((Intreg)i1.clone());
        //     col1.addElement((Sir)s1.clone());
        // } catch (CloneNotSupportedException e) {
        //     e.getMessage();
        // }

        System.out.println(col.toString());
        System.out.println(col1.toString());
        System.out.println(col.equals(col1));
    }
}
