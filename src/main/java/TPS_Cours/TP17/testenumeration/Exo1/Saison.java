package TPS_Cours.TP17.testenumeration.Exo1;

public enum Saison
{
    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String libelle;
    private int ordre;

    // Constructor
    Saison(String libelle, int ordre)
    {
        this.libelle = libelle;
        this.ordre = ordre;
    }

    // Getter Libelle
    public String getLibelle()
    {
        return libelle;
    }

    // Getter Ordre
    public int getOrdre()
    {
        return ordre;
    }

    // Method to find a Saison from its Libelle
    public static Saison getSaisonParLibelle(String libelle)
    {
        for (Saison saison : Saison.values())
        {
            if (saison.getLibelle().equalsIgnoreCase(libelle))
            {
                return saison;
            }
        }
        return null;
    }
}
