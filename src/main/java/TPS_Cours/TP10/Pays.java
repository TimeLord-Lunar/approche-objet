package TPS_Cours.TP10;

import java.util.Objects;

public class Pays
{
    private String nom;
    private int population;

    // Constructor
    public Pays(String nom, int population)
    {
        this.nom = nom;
        this.population = population;
    }

    // Redefine equals()
    @Override
    public boolean equals(Object obj)
    {
        // If same Reference
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        Pays pays = (Pays) obj;
        return population == pays.population && Objects.equals(nom, pays.nom);
    }

    // ToString
    @Override
    public String toString()
    {
        return "Pays{nom='" + nom + "', population=" + population + "}";
    }
}
