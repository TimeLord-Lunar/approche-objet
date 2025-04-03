package TPS_AutonomieJ3.chaines;

public class Salarie
{
    private String nom;
    private String prenom;
    private double salaire;

    // Constructor
    public Salarie(String nom, String prenom, double salaire)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    // toString
    @Override
    public String toString()
    {
        return "Salarie {nom='" + nom + "', prenom='" + prenom + "', salaire=" + salaire + "}";
    }
}
