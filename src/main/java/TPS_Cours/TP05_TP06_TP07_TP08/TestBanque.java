package TPS_Cours.TP05_TP06_TP07_TP08;

public class TestBanque
{
    public static void main(String[] args)
    {
        // // // TP 6 - 7 // // //

        // Create Account Array
        Compte[] comptes = new Compte[2];

        // Add Account Classic (Compte)
        comptes[0] = new Compte("123456789", 1500.00);

        // Add Account with Remuneration (CompteTaux)
        comptes[1] = new CompteTaux("987654321", 5000.00, 1.5);

        // Display Accounts
        for (Compte compte : comptes)
        {
            System.out.println(compte);
        }
    }
}
