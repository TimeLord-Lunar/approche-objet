package TPS_Cours.TP17.testenumeration.Exo2;

public class Ville
{
    private String nom;
    private int nbHabitants;
    private Continent continent; // Nouvel attribut

    // Constructor
    public Ville(String nom, int nbHabitants, Continent continent)
    {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
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

    // Setter Number Habitants
    public void setNbHabitants(int nbHabitants)
    {
        this.nbHabitants = nbHabitants;
    }

    // Getter Continent
    public Continent getContinent()
    {
        return continent;
    }

    // Setter Continent
    public void setContinent(Continent continent)
    {
        this.continent = continent;
    }

    // toString
    @Override
    public String toString()
    {
        return nom + " - " + nbHabitants + " habitants - Continent : " + continent.getLibelle();
    }
}
