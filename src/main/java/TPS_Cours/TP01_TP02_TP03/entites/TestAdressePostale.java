package TPS_Cours.TP01_TP02_TP03.entites;

public class TestAdressePostale
{
    public static void main(String[] args)
    {
        // Create 2 Adresses
        AdressePostale adresse1 = new AdressePostale(10, "Rue des Lilas", 75000, "Paris");
        AdressePostale adresse2 = new AdressePostale(25, "Avenue des Champs", 13000, "Marseille");

        // Display Adresses
        System.out.println("Adresse 1 : " + adresse1.numRue + " " + adresse1.libelleRue + ", " + adresse1.codePostal + " " + adresse1.ville);
        System.out.println("Adresse 2 : " + adresse2.numRue + " " + adresse2.libelleRue + ", " + adresse2.codePostal + " " + adresse2.ville);
    }
}
