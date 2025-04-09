package org.iesvdm.AnotacionesPrueba;

import java.util.Arrays;
import java.util.Objects;

@Curso(tutor= "Manuel", value = {"PI", "EC", "SI"}, horas = {6, 4, 6})
public class Clase {

    private String[] materias;
    private int[] horas;



    // CONSTRUCTOR VACIO PARA PODER LLAMAR A LA CLASE SIN TENER QUE INSTANCIAR NADA.
    public Clase() {
    }

    // CONSTRUCTOR
    public Clase(String[] materias, int[] horas) {
        this.materias = materias;
        this.horas = horas;
    }



    // GETTERS y SETTERS
    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public int[] getHoras() {
        return horas;
    }

    public void setHoras(int[] horas) {
        this.horas = horas;
    }



    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clase clase = (Clase) o;
        return Objects.deepEquals(materias, clase.materias) && Objects.deepEquals(horas, clase.horas);
    }



    // HASHCODE
    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(materias), Arrays.hashCode(horas));
    }



    // TOSTRING
    @Override
    public String toString() {
        return "Clase{" +
                "materias=" + Arrays.toString(materias) +
                ", horas=" + Arrays.toString(horas) +
                '}';
    }
}