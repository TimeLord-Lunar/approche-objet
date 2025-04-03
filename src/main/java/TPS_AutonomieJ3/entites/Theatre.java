package TPS_AutonomieJ3.entites;

public class Theatre
{
    private String nom;
    private int capaciteMax;
    private int totalClients;
    private double recetteTotale;

    // Constructor
    public Theatre(String nom, int capaciteMax)
    {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClients = 0;
        this.recetteTotale = 0.0;
    }


    // Inscription
    public void inscrire(int nbClients, double prixPlace)
    {
        if (totalClients + nbClients > capaciteMax)
        {
            System.out.println(" Capacité maximale atteinte ! Impossible d'inscrire " + nbClients + " clients.");
        } else
        {
            totalClients += nbClients;
            recetteTotale += nbClients * prixPlace;
            System.out.println(nbClients + " clients inscrits. Nouvelle capacité : " + totalClients + "/" + capaciteMax);
        }
    }

    // Getter TotalClients
    public int getTotalClients()
    {
        return totalClients;
    }

    // Getter RecetteTotale
    public double getRecetteTotale()
    {
        return recetteTotale;
    }
}
