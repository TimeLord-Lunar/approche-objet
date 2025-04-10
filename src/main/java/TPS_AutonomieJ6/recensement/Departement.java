package TPS_AutonomieJ6.recensement;

public class Departement
{
    private String codeDepartement;
    private int populationTotale;

    // Constructor
    public Departement(String codeDepartement, int populationTotale)
    {
        this.codeDepartement = codeDepartement;
        this.populationTotale = populationTotale;
    }

    // Getter CodeDepartement
    public String getCodeDepartement()
    {
        return codeDepartement;
    }

    // Getter PopulationTotale
    public int getPopulationTotale()
    {
        return populationTotale;
    }

    // Setter PopulationTotale
    public void setPopulationTotale(int populationTotale)
    {
        this.populationTotale = populationTotale;
    }

}
