package TPS_Cours.TP19.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ToString
{
    // // // EXERCICE 2 // // //
    boolean uppercase() default false;
    String separator() default "";
}
