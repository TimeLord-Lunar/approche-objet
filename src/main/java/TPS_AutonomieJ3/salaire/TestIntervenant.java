package TPS_AutonomieJ3.salaire;

public class TestIntervenant
{
    public static void main(String[] args)
    {
        // Creating a Salarié
        Salarie salarie = new Salarie("Durand", "Marcel", 2500.0);
        salarie.afficherDonnees();

        // Creating a Pigiste
        Pigiste pigiste = new Pigiste("Dupont", "Alice", 15, 100.0);
        pigiste.afficherDonnees();
    }
}
