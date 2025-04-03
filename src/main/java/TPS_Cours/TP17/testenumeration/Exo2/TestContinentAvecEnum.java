package TPS_Cours.TP17.testenumeration.Exo2;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum
{
    public static void main(String[] args)
    {
        // Creation of List
        List<Ville> villes = new ArrayList<>();

        // Adding Ville
        villes.add(new Ville("New York", 8419600, Continent.AMERIQUE));
        villes.add(new Ville("Paris", 2161000, Continent.EUROPE));
        villes.add(new Ville("Pékin", 21540000, Continent.ASIE));
        villes.add(new Ville("Moscou", 11920000, Continent.EUROPE));
        villes.add(new Ville("Berlin", 3769000, Continent.EUROPE));
        villes.add(new Ville("Sydney", 5312163, Continent.OCEANIE));
        villes.add(new Ville("Sao Paulo", 12330000, Continent.AMERIQUE));
        villes.add(new Ville("Dakar", 1146053, Continent.AFRIQUE));

        // Display
        for (Ville ville : villes)
        {
            System.out.println(ville);
        }
    }
}
