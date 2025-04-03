package TPS_AutonomieJ3.operations;

public class TestMoyenne
{
    public static void main(String[] args)
    {
        // First test
        CalculMoyenne cm1 = new CalculMoyenne();
        cm1.ajout(10);
        cm1.ajout(15);
        cm1.ajout(20);
        System.out.println("Moyenne du premier test : " + cm1.calcul());

        // Second Test
        CalculMoyenne cm2 = new CalculMoyenne();
        cm2.ajout(5);
        cm2.ajout(7);
        cm2.ajout(8);
        cm2.ajout(10);
        System.out.println("Moyenne du deuxième test : " + cm2.calcul());

        // Test with empty array
        CalculMoyenne cm3 = new CalculMoyenne();
        System.out.println("Moyenne du test avec tableau vide : " + cm3.calcul());
    }
}
