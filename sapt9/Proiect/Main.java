public class Main {
    public static void main(String[] args) {
        Project p1 = new Comerciale("Proiect1", "vhdchjvdc", 345678, "33.336732.3278978", 20);
        Project p2 = new Militare("Project2", "fhgjkhgcf", 123456789, "67367.2787.516", "30");

        InvestmentCompany company = new InvestmentCompany();
        company.addProject(p1);
        company.addProject(p2);

        System.out.println(company);
        System.out.println(company.getBestInvestment());
    }
}
