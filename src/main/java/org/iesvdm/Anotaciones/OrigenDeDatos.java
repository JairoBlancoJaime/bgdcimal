package org.iesvdm.Anotaciones;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
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


    String user() default "user";
    String password() ;
    String url();
    String driverClassName();

}
