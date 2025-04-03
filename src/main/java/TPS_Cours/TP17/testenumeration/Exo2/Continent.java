package TPS_Cours.TP17.testenumeration.Exo2;

public enum Continent
{
    AMERIQUE("Amérique"),
    EUROPE("Europe"),
    ASIE("Asie"),
    AFRIQUE("Afrique"),
    OCEANIE("Océanie");

    private String libelle;

    // Constructor
    Continent(String libelle)
    {
        this.libelle = libelle;
    }

    // Getter Libelle
    public String getLibelle()
    {
        return libelle;
    }
}
