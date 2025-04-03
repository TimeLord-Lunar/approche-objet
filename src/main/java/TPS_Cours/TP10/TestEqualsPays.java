package TPS_Cours.TP10;

public class TestEqualsPays
{
    public static void main(String[] args)
    {
        // Create 2 Country with same attributes
        Pays france1 = new Pays("France", 67000000);
        Pays france2 = new Pays("France", 67000000);

        // Create one Country with differents attributes
        Pays usa = new Pays("USA", 331000000);

        // Test equals()
        System.out.println("france1.equals(france2) ? " + france1.equals(france2)); // ✅ true
        System.out.println("france1.equals(usa) ? " + france1.equals(usa)); // ❌ false

        // Test with ==
        System.out.println("france1 == france2 ? " + (france1 == france2)); // ❌ false
        System.out.println("france1 == france1 ? " + (france1 == france1)); // ✅ true (même référence)
    }
}
