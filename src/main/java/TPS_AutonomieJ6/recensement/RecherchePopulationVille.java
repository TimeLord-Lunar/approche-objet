package TPS_AutonomieJ6.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService
{
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        System.out.println("Entrez le nom de la ville : ");
        String villeRecherchee = scanner.nextLine();
        for (Ville ville : recensement.getVilles())
        {
            if (ville.getNomCommune().equalsIgnoreCase(villeRecherchee))
            {
                System.out.println("Population de " + villeRecherchee + " : " + ville.getPopulationTotale());
                return;
            }
        }
        System.out.println("TPS_Cours.TP18.entites.Ville non trouvée.");
    }
}
