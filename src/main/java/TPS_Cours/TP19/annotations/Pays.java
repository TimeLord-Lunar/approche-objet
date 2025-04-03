package TPS_Cours.TP19.annotations;

import java.lang.reflect.Field;
import TPS_Cours.TP19.annotations.StringUtils;

import TPS_Cours.TP19.annotations.Validator;

public class Pays
{
    // // // EXERCICE 4 // // //
    @Rule(min = 1, notNull = true)
    private String nom;

    @Rule(min = 1, max = 1000000000)
    private long pibParHabitant;

    @Rule(notNull = true)
    private String continent;

    // Constructor
    public Pays(String nom, long pibParHabitant, String continent)
    {
        this.nom = nom;
        this.pibParHabitant = pibParHabitant;
        this.continent = continent;

        // Validation of the object after initialization
        Validator.validate(this);
    }

    // Getter Continent
    public String getContinent()
    {
        return continent;
    }

    // toString method that uses StringUtils for string generation
    @Override
    public String toString()
    {
        return StringUtils.generateToString(this);
    }



    // // // EXERCICE 1-2-3 // // //

//    @ToString(uppercase = false, separator = " -> ")
//    private String nom;
//
//    @ToString(separator = " $")
//    private long pibParHabitant;
//
//    @ToString
//    private int nbHabitants;
//
//    private String continent;
//
//    // Constructor
//    public Pays(String nom, long pibParHabitant, int nbHabitants, String continent)
//    {
//        this.nom = nom;
//        this.pibParHabitant = pibParHabitant;
//        this.nbHabitants = nbHabitants;
//        this.continent = continent;
//    }
//
//    // Getter Continent
//    public String getContinent()
//    {
//        return continent;
//    }

    // New implementation of toString() with reflection

    // // // EXERCICE 1 // // //
//    @Override
//    public String toString()
//    {
//        StringBuilder result = new StringBuilder();
//
//        // Retrieving the class fields
//        Field[] fields = this.getClass().getDeclaredFields();
//
//        for (Field field : fields)
//        {
//            // Checks if the field is annotated with @ToString
//            if (field.isAnnotationPresent(ToString.class))
//            {
//                // Allows access to private fields
//                field.setAccessible(true);
//                try
//                {
//                    result.append(field.getName()).append(": ").append(field.get(this)).append(" | ");
//                } catch (IllegalAccessException e)
//                {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        // Removes the last " | " and returns the string
//        return result.length() > 0 ? result.substring(0, result.length() - 3) : "Aucun attribut annoté";
//    }


    // // // EXERCICE 2 // // //
//    @Override
//    public String toString()
//    {
//        StringBuilder result = new StringBuilder();
//
//        // Retrieving the class fields
//        Field[] fields = this.getClass().getDeclaredFields();
//
//        for (Field field : fields)
//        {
//            // Checks if the field is annotated with @ToString
//            if (field.isAnnotationPresent(ToString.class))
//            {
//                ToString annotation = field.getAnnotation(ToString.class);
//
//                // Allows access to private fields
//                field.setAccessible(true);
//                try
//                {
//                    Object value = field.get(this);
//                    String strValue = value.toString();
//
//                    // If the uppercase parameter is true, the value is capitalized.
//                    if (annotation.uppercase() && value instanceof String)
//                    {
//                        strValue = strValue.toUpperCase();
//                    }
//
//                    // Adding the value to the result string
//                    result.append(field.getName()).append(": ").append(strValue)
//                            .append(annotation.separator());
//                } catch (IllegalAccessException e)
//                {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        // Removes the last separator and returns the string
//        if (result.length() > 0)
//        {
//            result.setLength(result.length() - 0);
//        }
//
//        return result.length() > 0 ? result.toString() : "Aucun attribut annoté";
//    }
//}
//    @Override
//    public String toString()
//    {
//        return StringUtils.generateToString(this);
//    }
}