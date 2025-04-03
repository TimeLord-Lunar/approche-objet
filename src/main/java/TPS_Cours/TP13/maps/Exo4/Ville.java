package TPS_Cours.TP13.maps.Exo4;

public class Ville
{
    // // // EXERCICE 4 // // //

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

    // GEtter Number Habitants
    public int getNbHabitants()
    {
        return nbHabitants;
    }

    // toString
    @Override
    public String toString()
    {
        return nom + " - Population: " + nbHabitants;
    }
}
