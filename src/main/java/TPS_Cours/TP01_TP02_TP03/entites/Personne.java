package TPS_Cours.TP01_TP02_TP03.entites;

// // Import AdressePostale when inside repertories "entites2"
//import entites.AdressePostale;

public class Personne
{
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Contructor without Adresse (TP2)
    public Personne(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Contructor with Adresse (TP1)
    public Personne(String nom, String prenom, AdressePostale adresse)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }


    // GETTERS AND SETTERS (TP3)

    // Displayer Identity
    public void afficherIdentite()
    {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    // Setter LastName
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    // Setter FirstName
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    // Setter Adresse
    public void setAdresse(AdressePostale adresse)
    {
        this.adresse = adresse;
    }

    // Getter LastName
    public String getNom()
    {
        return nom;
    }

    // Getter FirstName
    public String getPrenom()
    {
        return prenom;
    }

    // Getter Adresse
    public AdressePostale getAdresse()
    {
        return adresse;
    }
}
