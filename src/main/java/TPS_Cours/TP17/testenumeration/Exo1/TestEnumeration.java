package TPS_Cours.TP17.testenumeration.Exo1;

public class TestEnumeration
{
    public static void main(String[] args)
    {
        // Displaying all Saisons
        System.out.println("Liste des saisons :");
        for (Saison saison : Saison.values())
        {
            System.out.println(saison + " - " + saison.getLibelle() + " (Ordre: " + saison.getOrdre() + ")");
        }

        // Search for a Saison by Nom
        String nom = "ETE";
        Saison saisonNom = Saison.valueOf(nom);
        System.out.println("\nSaison trouvée par nom : " + saisonNom.getLibelle());

        // Search for a Saison by it's Libelle
        String libelle = "Hiver";
        Saison saisonLibelle = Saison.getSaisonParLibelle(libelle);
        if (saisonLibelle != null)
        {
            System.out.println("\nSaison trouvée par libellé : " + saisonLibelle);
        } else
        {
            System.out.println("\nAucune saison trouvée pour le libellé " + libelle);
        }
    }
}
