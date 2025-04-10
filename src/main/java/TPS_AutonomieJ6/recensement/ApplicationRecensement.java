package TPS_AutonomieJ6.recensement;

import java.util.Scanner;

public class ApplicationRecensement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Load data from file and create census
        Recensement recensement = new Recensement();

        while (true)
        {
            System.out.println("Menu:");
            System.out.println("1. Population d’une ville donnée");
            System.out.println("2. Population d’un département donné");
            System.out.println("3. Population d’une région donnée");
            System.out.println("4. Afficher les 10 régions les plus peuplées");
            System.out.println("5. Afficher les 10 départements les plus peuplés");
            System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix)
            {
                case 1:
                    new RecherchePopulationVille().traiter(recensement, scanner);
                    break;
                case 2:
                    new RecherchePopulationDepartement().traiter(recensement, scanner);
                    break;
                case 3:
                    new RecherchePopulationRegion().traiter(recensement,scanner);
                    break;
                case 4:
                    new AfficherTop10Regions().traiter(recensement, scanner);
                    break;
                case 5:
                    new AfficherTop10Departements().traiter(recensement, scanner);
                    break;
                case 6:
                    new AfficherTop10VillesDepartement().traiter(recensement, scanner);
                    break;
                case 7:
                    new AfficherTop10VillesRegion().traiter(recensement, scanner);
                    break;
                case 8:
                    new AfficherTop10VillesFrance().traiter(recensement, scanner);
                    break;
                case 9:
                    System.out.println("Sortie du programme.");
                    return;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
    }
}