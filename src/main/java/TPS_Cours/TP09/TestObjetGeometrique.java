package TPS_Cours.TP09;

public class TestObjetGeometrique
{
    public static void main(String[] args)
    {
        // Array of ObjetGeometrique
        ObjetGeometrique[] objets = new ObjetGeometrique[2];

        // Creation Objects
        objets[0] = new Cercle(5);
        objets[1] = new Rectangle(10, 4);

        // Loop for Display each object
        for (ObjetGeometrique obj : objets)
        {
            System.out.println(obj + " -> Périmètre: " + obj.perimetre() + ", Surface: " + obj.surface());
        }
    }
}