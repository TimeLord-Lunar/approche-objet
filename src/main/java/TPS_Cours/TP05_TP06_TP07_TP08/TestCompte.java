package TPS_Cours.TP05_TP06_TP07_TP08;

public class TestCompte
{
    public static void main(String[] args)
    {
        // // // TP 5 // // //

        // Account Creation
        Compte monCompte = new Compte("123456789", 1000.50);

        // Modification Values with Setter
        monCompte.setNumeroCompte("987654321");
        monCompte.setSolde(2500.75);

        // Getting Values with Getter
        System.out.println("Numéro de compte : " + monCompte.getNumeroCompte());
        System.out.println("Solde du compte : " + monCompte.getSolde() + " €");
    }
}
