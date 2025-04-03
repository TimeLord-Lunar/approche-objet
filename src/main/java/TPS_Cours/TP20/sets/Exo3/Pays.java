package TPS_Cours.TP20.sets.Exo3;

public class Pays
{
    String nom;
    long population;
    double pibParHabitant;

    // Constructor
    public Pays(String nom, long population, double pibParHabitant)
    {
        this.nom = nom;
        this.population = population;
        this.pibParHabitant = pibParHabitant;
    }

    // Getter PibTotal
    public double getPibTotal()
    {
        return population * pibParHabitant;
    }

    // toString
    @Override
    public String toString()
    {
        return String.format("%-10s - Population: %,-15d - PIB Total: %,.0f",
                nom, population, getPibTotal());
    }
}
