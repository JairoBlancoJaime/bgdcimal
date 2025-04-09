package org.iesvdm.Anotaciones;

public class CargadorDeContexto {

    public static OrigenDeDatosDto contexto() {

        // NO ITERAR QUIERO UNA EN CONCRETO
        // Annotation[] annotations = repositorio.getClass().getAnnotations()

        Repositorio repositorio = new Repositorio();
        OrigenDeDatos origenDeDatos = repositorio.getClass().getAnnotation(OrigenDeDatos.class);

        return new OrigenDeDatosDto(origenDeDatos.user(), origenDeDatos.password(), origenDeDatos.url(), origenDeDatos.driverClassName());

//        OrigenDeDatos origenDeDatos = repositorio.getClass().getAnnotation(OrigenDeDatos.class);
//
//        OrigenDeDatosDto origenDeDatosDto = new OrigenDeDatosDto(
//                origenDeDatos.user(),
//                origenDeDatos.password(),
//                origenDeDatos.url(),
//                origenDeDatos.driverClassName()
//        ) ;

    }

}
