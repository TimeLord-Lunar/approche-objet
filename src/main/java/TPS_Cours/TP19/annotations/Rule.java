package TPS_Cours.TP19.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Rule
{
    // Minimum value rule
    int min() default Integer.MIN_VALUE;

    // Maximum value rule
    int max() default Integer.MAX_VALUE;

    // Non-nullity rule
    boolean notNull() default true;
}
