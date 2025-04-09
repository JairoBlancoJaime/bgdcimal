package org.iesvdm.AnotacionesPrueba;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Establecemos donde se coloca la anotacion    |   En este caso delante de una clase.
@Target(ElementType.TYPE)
// Establecemos cuando esta disponible      |       En este caso en tiempo de ejecucion.
@Retention(RetentionPolicy.RUNTIME)
// Para crear la anotacion es con el @, sin el @ te crea una interfaz.
public @interface Curso {

    String tutor() default "Jose Manuel";
    String[] value() default {"DWES", "DWEC", "DIW", "DAW"};
    int[] horas() default {8, 8, 6, 4};

}
