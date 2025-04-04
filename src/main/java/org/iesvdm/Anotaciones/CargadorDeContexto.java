package org.iesvdm.Anotaciones;

public class CargadorDeContexto {

    public static OrigenDeDatosDto cargadorContexto(Repositorio repositorio) {

        // NO ITERAR QUIERO UNA EN CONCRETO
        // Annotation[] annotations = repositorio.getClass().getAnnotations()

        OrigenDeDatos origenDeDatos = repositorio.getClass().getAnnotation(OrigenDeDatos.class);

        OrigenDeDatosDto origenDeDatosDto = new OrigenDeDatosDto(
                origenDeDatos.user(),
                origenDeDatos.password(),
                origenDeDatos.url(),
                origenDeDatos.driverClassName()
        ) ;

    }

}
