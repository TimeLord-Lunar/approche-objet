package TPS_Cours.TP01_TP02_TP03.entites;

public class TestPersonne
{
    public static void main(String[] args)
    {
        // // // TP 1 // // //

/*        // Create 2 Adresses
        AdressePostale adresse1 = new AdressePostale(10, "Rue des Lilas", 75000, "Paris");
        AdressePostale adresse2 = new AdressePostale(25, "Avenue des Champs", 13000, "Marseille");

        // Create 2 Personne
        Personne personne1 = new Personne("Dupont", "Jean", adresse1);
        Personne personne2 = new Personne("Martin", "Sophie", adresse2);

        // Display
        System.out.println("Personne 1 : " + personne1.nom + " " + personne1.prenom + ", " + personne1.adresse.ville);
        System.out.println("Personne 2 : " + personne2.nom + " " + personne2.prenom + ", " + personne2.adresse.ville);*/

        // // // ------------------------------------------------------------------------------------------------------------------- // // //

        // // // TP 2 // // //

        /*// Create Adresse
        AdressePostale adresse1 = new AdressePostale(10, "Rue des Lilas", 75000, "Paris");

        // Using Constructor without Adresse
        Personne personne1 = new Personne("Dupont", "Jean");

        // Using Constructor with Adresse
        Personne personne2 = new Personne("Martin", "Sophie", adresse1);

        // Display
        System.out.println("Personne 1 : " + personne1.nom + " " + personne1.prenom);
        System.out.println("Personne 2 : " + personne2.nom + " " + personne2.prenom + ", " + personne2.adresse.ville);*/

        // // // ------------------------------------------------------------------------------------------------------------------- // // //

        // // // TP 3 // // //

        // Create Adresse
        AdressePostale adresse1 = new AdressePostale(10, "Rue des Lilas", 75000, "Paris");

        // Using Constructor without Adresse
        Personne personne1 = new Personne("Dupont", "Jean");

        // Display Personne Informations
        System.out.println("Identité avant modification :");
        personne1.afficherIdentite();

        // Using Setter Adresse
        personne1.setAdresse(adresse1);

        // Display Personne Adresse
        System.out.println("Nouvelle adresse : " + personne1.getAdresse().ville);

        // Using Setter LastName FirstName
        personne1.setNom("Durand");
        personne1.setPrenom("Paul");

        // Display Personne Informations
        System.out.println("Identité après modification :");
        personne1.afficherIdentite();
    }
}
