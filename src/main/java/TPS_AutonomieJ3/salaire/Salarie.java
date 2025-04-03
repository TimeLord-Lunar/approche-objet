package TPS_AutonomieJ3.salaire;

public class Salarie extends Intervenant
{
    private double salaireMensuel;

    // Constructor
    public Salarie(String nom, String prenom, double salaireMensuel)
    {
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

    // Getter Salaire
    @Override
    public double getSalaire()
    {
        return salaireMensuel;
    }

    // Getter Statut
    @Override
    public String getStatut()
    {
        return "Salarié";
    }
}
