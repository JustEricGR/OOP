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


        for(int i=0;i<nrApeluri;i++) {
            int index1=0,index2=0;
            while(true) {
                index1 = (int)(Math.random()*size);
                index2 = (int)(Math.random()*size);
                if(index1 == index2)continue;
                break;
            }
            
            if(telefoane[index1].apeleaza(telefoane[index2]))continue;
            break;
        }
         
        for(int i=0;i<size;i++) {
            System.out.println(telefoane[i]);
        }
       
        numaratoare(telefoane, size);

        scan.close();
    }

    public static void numaratoare(Telefon[] telefoane, int size) {
        for(int i=0;i<size;i++) {
            System.out.println(telefoane[i].getNume() + " apeleaza pe:");
            for(int j=0;j<telefoane[i].getAgenda().length;j++) {
                Integer nrapeluri = telefoane[i].numarDeApeluri(telefoane[j].getNume());
                System.out.println("pe " + telefoane[j].getNume() + " de " + nrapeluri + " ori;");
            }
        }
    }
}
