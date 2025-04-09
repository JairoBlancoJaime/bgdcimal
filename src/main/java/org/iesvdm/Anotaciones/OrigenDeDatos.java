package org.iesvdm.Anotaciones;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Target se coloca delante de la anotacion.
// Para establecer donde se puede poner la anotacion, en este caso delante de una clase.
@Target({ElementType.TYPE})
// Disponible en tiempo de ejecucion (RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
public @interface OrigenDeDatos {

    // No hay ambitos (public, private, package, protected...)
    // Los nombres de los campos son en notacion CammelCase y terminado en () y puedes inicializarlos por defecto mediante default

    // CAMMEL CASE -> nombre atributos, var Java
    // estoEsunEjemploCammelCase

    // PASCAL CASE -> nombre de clases Java/Javascript
    // EstoEsUnEjemploPascalCase

    // SNAKE CASE -> C, bbdd
    // esto_es_un_ejemplo_snake_case

    // Solo se pueden poner tipos primitivos (String, int, double...)

    String user() default "user";
    String password() ;
    String url();
    String driverClassName();

}
