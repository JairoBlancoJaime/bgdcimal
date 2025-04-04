package org.iesvdm.Anotaciones;

@OrigenDeDatos (
        user="root",
        password="secret",
        url="jdbc:mysql://localhost:3306/mi_bbdd",
        driverClassName="com.mysql.cj.jdbc.Driver")
public class Repositorio {

    private OrigenDeDatosDto origenDeDatosDto;

    public Repositorio(OrigenDeDatosDto origenDeDatosDto) {
        this.origenDeDatosDto = origenDeDatosDto;
    }

    public OrigenDeDatosDto getOrigenDeDatosDto() {
        return origenDeDatosDto;
    }

    public void setOrigenDeDatosDto(OrigenDeDatosDto origenDeDatosDto) {
        this.origenDeDatosDto = origenDeDatosDto;
    }

    @Override
    public String toString() {
        return "Repositorio{" +
                "origenDeDatosDto=" + origenDeDatosDto +
                '}';
    }

    public void cargarContexto() {

        OrigenDeDatos origenDeDatos = this.getClass().getAnnotation(OrigenDeDatos.class);

        OrigenDeDatosDto origenDeDatosDto = new OrigenDeDatosDto(
                origenDeDatos.user(),
                origenDeDatos.password(),
                origenDeDatos.url(),
                origenDeDatos.driverClassName()
        ) ;

    }
}
