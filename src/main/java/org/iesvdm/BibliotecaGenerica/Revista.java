package org.iesvdm.BibliotecaGenerica;

public class Revista {

    String nombre;
    int numeroEdicion;

    public Revista() {
    }

    public Revista(String nombre, int numeroEdicion) {
        this.nombre = nombre;
        this.numeroEdicion = numeroEdicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nombre='" + nombre + '\'' +
                ", numeroEdicion=" + numeroEdicion +
                '}';
    }

}
