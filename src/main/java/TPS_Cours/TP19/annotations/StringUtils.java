package TPS_Cours.TP19.annotations;

import TPS_Cours.TP19.annotations.ToString;
import java.lang.reflect.Field;

public class StringUtils
{
    // Generate String
    public static String generateToString(Object obj)
    {
        StringBuilder result = new StringBuilder();

        // Retrieves the fields of the object's class
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields)
        {
            // Checks if the field is annotated with @ToString
            if (field.isAnnotationPresent(ToString.class))
            {
                ToString annotation = field.getAnnotation(ToString.class);

                // Allows access to private fields
                field.setAccessible(true);
                try
                {
                    Object value = field.get(obj);

                    String strValue = value.toString();

                    // If the attribute is of type String and uppercase is true, the value is capitalized.
                    if (annotation.uppercase() && value instanceof String)
                    {
                        strValue = strValue.toUpperCase();
                    }

                    // Adding the attribute value to the string with the separator
                    result.append(field.getName()).append(": ").append(strValue)
                            .append(annotation.separator());
                } catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                }
            }
        }

        // Remove the last separator if necessary
        if (result.length() > 0)
        {
            result.setLength(result.length() - 2);
        }

        return result.length() > 0 ? result.toString() : "Aucun attribut annoté";
    }
}
