package TPS_Cours.TP05_TP06_TP07_TP08;

public class CompteTaux extends Compte
{
    private double tauxRemuneration;

    // Constructor with Super for calling Compte's Constructor
    public CompteTaux(String numeroCompte, double solde, double tauxRemuneration)
    {
        super(numeroCompte, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    // Getter tauxRemuneration
    public double getTauxRemuneration()
    {
        return tauxRemuneration;
    }

    // Setter tauxRemuneration
    public void setTauxRemuneration(double tauxRemuneration)
    {
        this.tauxRemuneration = tauxRemuneration;
    }

    // toString with Override Super
    @Override
    public String toString()
    {
        return super.toString() + ", taux=" + tauxRemuneration + "%";
    }
}
