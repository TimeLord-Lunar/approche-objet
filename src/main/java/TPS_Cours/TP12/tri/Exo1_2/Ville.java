package TPS_Cours.TP12.tri.Exo1_2;

public class Ville implements Comparable<Ville>
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

    // Comparator Functions

    // // // EXERCICE 1 // // //
//    @Override
//    public int compareTo(Ville other)
//    {
//        // Sort by name (alphabetical order)
//        return this.nom.compareTo(other.nom);
//    }

    // // // EXERCICE 2 // // //
    @Override
    public int compareTo(Ville other)
    {
        // Sort by number of inhabitants
        return Integer.compare(this.nbHabitants, other.nbHabitants);
    }
}