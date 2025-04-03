package TPS_Cours.TP11.listes.Exo5;

public class Ville
{
    private String nom;
    private int nbHabitants;

    // Constructor
    public Ville(String nom, int nbHabitants)
    {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    // Getter Nom
    public String getNom()
    {
        return nom;
    }

    // Setter Nom
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    // Getter Number Habitants
    public int getNbHabitants()
    {
        return nbHabitants;
    }

    // toString
    @Override
    public String toString()
    {
        return nom + " - " + nbHabitants + " habitants";
    }
}
