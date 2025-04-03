package TPS_AutonomieJ3.salaire;

public abstract class Intervenant
{
    protected String nom;
    protected String prenom;

    // Constructor
    public Intervenant(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Abstract method for recovering Salaire
    public abstract double getSalaire();

    // Abstract method to retrieve Statut
    public abstract String getStatut();

    // Method to display Intervenant data
    public void afficherDonnees()
    {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Statut : " + getStatut());
        System.out.println("Salaire : " + getSalaire() + " €");
        System.out.println("--------------------------------");
    }
}
