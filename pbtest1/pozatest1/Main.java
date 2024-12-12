public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma("UPT", 10000);
        Angajat angajat1 = new Angajat("Valy",3000);
        // Angajat angajat2 = new Angajat("Popa", 10);
        Angajat angajat3 = new Angajat("Paul", 1);
        Angajat[] angajati = new Angajat[3];
        angajati[0] = new Angajat("Valy",3000);
        angajati[1] = new Angajat("Popa", 10);
        angajati[2] = new Angajat("Paul", 1);
        firma.adaugaAngajat(angajat1);
        // firma.adaugaAngajat(angajat2);
        // firma.adaugaAngajat(angajat3);
        for(int i=1;i<3;i++) {
            if(firma.adaugaAngajat(angajati[i]))continue;
            break;
        }

        System.out.println(firma);

        firma.adaugaAngajat(angajat3);

        System.out.println(firma.platesteSalarii());
    }
}
