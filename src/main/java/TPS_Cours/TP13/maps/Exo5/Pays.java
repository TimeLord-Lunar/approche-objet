package TPS_Cours.TP13.maps.Exo5;

public class Pays
{
    // // // EXERCICE 5 // // //

    private String nom;
    private int nbHabitants;
    private String continent;

    // Constructor
    public Pays(String nom, int nbHabitants, String continent)
    {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    // Getter Continent
    public String getContinent()
    {
        return continent;
    }

    // toString
    @Override
    public String toString()
    {
        return nom + " - Population: " + nbHabitants + " millions - Continent: " + continent;
    }
}
