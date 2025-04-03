package TPS_AutonomieJ3.salaire;

public class Pigiste extends Intervenant
{
    private int joursTravailles;
    private double remunerationJour;

    // Constructor
    public Pigiste(String nom, String prenom, int joursTravailles, double remunerationJour)
    {
        super(nom, prenom);
        this.joursTravailles = joursTravailles;
        this.remunerationJour = remunerationJour;
    }

    // Getter Salaire
    @Override
    public double getSalaire()
    {
        return joursTravailles * remunerationJour;
    }

    // Getter Statut
    @Override
    public String getStatut()
    {
        return "Pigiste";
    }
}
