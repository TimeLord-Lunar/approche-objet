package TPS_Cours.TP19.annotations;

import TPS_Cours.TP19.annotations.Rule;

import java.lang.reflect.Field;

public class Validator
{
    // Validate
    public static void validate(Object obj) throws IllegalArgumentException
    {
        // Retrieves the fields of the object
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields)
        {
            // Checks if the field has the @Rule annotation
            if (field.isAnnotationPresent(Rule.class))
            {
                Rule rule = field.getAnnotation(Rule.class);
                field.setAccessible(true);

                try
                {
                    // Retrieves the value of the field
                    Object value = field.get(obj);

                    // If the notNull rule is true, we check that the value is not null
                    if (rule.notNull() && value == null)
                    {
                        throw new IllegalArgumentException(field.getName() + " ne peut pas être null.");
                    }

                    // If the min rule is defined, we check that the value is greater than or equal to min
                    if (value instanceof Integer)
                    {
                        int intValue = (int) value;
                        if (intValue < rule.min())
                        {
                            throw new IllegalArgumentException(field.getName() + " doit être supérieur ou égal à " + rule.min() + ".");
                        }
                    }

                    // If the max rule is defined, we check that the value is less than or equal to max
                    if (value instanceof Integer)
                    {
                        int intValue = (int) value;
                        if (intValue > rule.max())
                        {
                            throw new IllegalArgumentException(field.getName() + " doit être inférieur ou égal à " + rule.max() + ".");
                        }
                    }
                } catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
