import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Cate nume sa se citeasca:");
        size = scan.nextInt();
        Telefon[] telefoane = new Telefon[size];
        String[] nume = {
            "Andrei", "Mihai", "Alexandru", "Cristian", "Bogdan",
            "Florin", "Radu", "Vlad", "Cosmin", "Sorin",
            "Gabriel", "Daniel", "Stefan", "Ciprian", "Ionut",
            "Ion", "Rares", "Vasile", "Ilie", "Constantin",
            "Marian", "Victor", "Petru", "Robert", "Dumitru",
            "Emil", "George", "Sergiu", "Razvan", "Paul",
            "Valentin", "Claudiu", "Eugen", "Silviu", "Cezar",
            "Mircea", "Grigore", "Ovidiu", "Alin", "Tudor",
            "Calin", "Laurentiu", "Nicusor", "Marius", "Adrian",
            "Ioan", "Costin", "Emanuel", "Dorian", "Liviu",
            "Ana", "Maria", "Elena", "Ioana", "Cristina",
            "Gabriela", "Andreea", "Raluca", "Diana", "Mihaela",
            "Simona", "Oana", "Daniela", "Florentina", "Laura",
            "Georgiana", "Roxana", "Nicoleta", "Bianca", "Alina",
            "Alexandra", "Loredana", "Magdalena", "Violeta", "Carmen",
            "Monica", "Mariana", "Cecilia", "Claudia", "Elisabeta",
            "Valentina", "Sorina", "Antonia", "Iulia", "Nadia",
            "Adriana", "Silvia", "Corina", "Eugenia", "Larisa",
            "Paula", "Veronica", "Ilinca", "Petronela", "Anamaria"
        };

        for(int i=0;i<size;i++) {
            telefoane[i] = new Telefon(nume[(int)(Math.random()*nume.length)]);
        }

        System.out.print("Cate apeluri sa se efectueze:");
        int nrApeluri = scan.nextInt();

        for(int i=0;i<size;i++) {
            for(int j=0;j<nrApeluri;j++) {
                if(telefoane[i].apeleaza(telefoane[(int)(Math.random()*size)]))continue;
                break;
            }
        }
         
        for(int i=0;i<size;i++) {
            System.out.println(telefoane[i]);
        }
       

        scan.close();
    }
}
