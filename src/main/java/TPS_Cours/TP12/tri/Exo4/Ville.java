package TPS_Cours.TP12.tri.Exo4;

public class Ville implements Comparable<Ville>
{
    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int populationTotale;

    // Constructor
    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale)
    {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    // Getter Nom
    public String getNom()
    {
        return nom;
    }

    // Getter CodeDepartement
    public String getCodeDepartement()
    {
        return codeDepartement;
    }

    // Getter NomRegion
    public String getNomRegion()
    {
        return nomRegion;
    }

    // Getter PopulationTotale
    public int getPopulationTotale()
    {
        return populationTotale;
    }

    // toString
    @Override
    public String toString()
    {
        return nom + " (Dépt: " + codeDepartement + ", Région: " + nomRegion + ", Population: " + populationTotale + ")";
    }

    // Compare
    @Override
    public int compareTo(Ville autreVille)
    {
        // Sort by descending population
        return Integer.compare(autreVille.populationTotale, this.populationTotale);
    }
}
