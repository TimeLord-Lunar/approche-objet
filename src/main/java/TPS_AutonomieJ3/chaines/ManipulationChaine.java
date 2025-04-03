package TPS_AutonomieJ3.chaines;

public class ManipulationChaine
{
    public static void main(String[] args)
    {
        String chaine = "Durand;Marcel;2 523.5";

        // 1. First character display
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        // 2. Displaying the length of the chain
        int longueur = chaine.length();
        System.out.println("Longueur de la chaîne: " + longueur);

        // 3. Index of the first ";"
        int indexPremierPointVirgule = chaine.indexOf(';');
        System.out.println("Index du premier ';': " + indexPremierPointVirgule);

        // 4. Last name Extraction
        String nom = chaine.substring(0, indexPremierPointVirgule);
        System.out.println("Nom de famille: " + nom);

        // 5. Last name in capital letters
        System.out.println("Nom en majuscules: " + nom.toUpperCase());

        // 6. Last name in lowercase
        System.out.println("Nom en minuscules: " + nom.toLowerCase());

        // 7. Chain cutting with split
        String[] morceaux = chaine.split(";");
        for (String element : morceaux)
        {
            System.out.println("Élément du tableau: " + element);
        }

        // 8. Creating a Salarie instance
        String prenom = morceaux[1];
        String salaireStr = morceaux[2].replace(" ", ""); // Suppression de l'espace
        double salaire = Double.parseDouble(salaireStr);

        // Creation of the Salarie object
        Salarie salarie = new Salarie(nom, prenom, salaire);
        System.out.println("Salarie créé: " + salarie);
    }
}
