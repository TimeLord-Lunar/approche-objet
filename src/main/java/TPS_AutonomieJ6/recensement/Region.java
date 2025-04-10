package TPS_AutonomieJ6.recensement;

public class Region
{
    private String codeRegion;
    private String nomRegion;
    private int populationTotale;

    // Constructor
    public Region(String codeRegion, String nomRegion, int populationTotale)
    {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    // Getter CodeRegion
    public String getCodeRegion()
    {
        return codeRegion;
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

    // Setter PopulationTotale
    public void setPopulationTotale(int populationTotale)
    {
        this.populationTotale = populationTotale;
    }
}
