package TPS_AutonomieJ6.recensement;

public class Ville
{
    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeCommune;
    private String nomCommune;
    private int populationTotale;

    // Constructor
    public Ville(String codeRegion, String nomRegion, String codeDepartement,
                 String codeCommune, String nomCommune, int populationTotale)
    {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
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

    // Getter CodeDepartement
    public String getCodeDepartement()
    {
        return codeDepartement;
    }

    // Getter CodeCommune
    public String getCodeCommune()
    {
        return codeCommune;
    }

    // Getter NomCommune
    public String getNomCommune()
    {
        return nomCommune;
    }

    // Getter PopulationTotale
    public int getPopulationTotale()
    {
        return populationTotale;
    }

    // Setter CodeRegion
    public void setCodeRegion(String codeRegion)
    {
        this.codeRegion = codeRegion;
    }

    // Setter NomRegion
    public void setNomRegion(String nomRegion)
    {
        this.nomRegion = nomRegion;
    }

    // Setter CodeDepartement
    public void setCodeDepartement(String codeDepartement)
    {
        this.codeDepartement = codeDepartement;
    }

    // Setter CodeCommune
    public void setCodeCommune(String codeCommune)
    {
        this.codeCommune = codeCommune;
    }

    // Setter NomCommune
    public void setNomCommune(String nomCommune)
    {
        this.nomCommune = nomCommune;
    }

    // Setter PopulationTotale
    public void setPopulationTotale(int populationTotale)
    {
        this.populationTotale = populationTotale;
    }

    @Override
    public String toString()
    {
        return "TPS_Cours.TP18.entites.Ville{" +
                "codeRegion='" + codeRegion + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", codeCommune='" + codeCommune + '\'' +
                ", nomCommune='" + nomCommune + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }
}
