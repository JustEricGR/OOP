public class Main {
    public static void main(String[] args) {
        //Form form = new Form();
        Form[] forms = new Form[3];

        for(int i=0;i<3;i++) {
            forms[i] = new Form();
        }


        forms[0] = new Circle("black" , 4.55);
        //forms[1] = new Triangle("", 30.10,20.20);
        forms[1] = new Triangle();
        forms[2] = new Square("white", 10.10);
        // forms[0].setColor("blue");
        // forms[1].setColor("pink");

        //System.out.println(forms[0].equals(forms[1]));
        for(Form form : forms) {
            System.out.println(form);
        }
    }
}