package org.iesvdm.AnotacionesPrueba;

import java.util.Arrays;
import java.util.Objects;

public class CursoDTO {

    private String tutor;
    private String[] value;
    private int[] horas;

    public CursoDTO() {
    }

    public CursoDTO(String tutor, String[] value, int[] horas) {
        this.tutor = tutor;
        this.value = value;
        this.horas = horas;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String[] getValue() {
        return value;
    }

    public void setValue(String[] value) {
        this.value = value;
    }

    public int[] getHoras() {
        return horas;
    }

    public void setHoras(int[] horas) {
        this.horas = horas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursoDTO cursoDTO = (CursoDTO) o;
        return Objects.equals(tutor, cursoDTO.tutor) && Objects.deepEquals(value, cursoDTO.value) && Objects.deepEquals(horas, cursoDTO.horas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tutor, Arrays.hashCode(value), Arrays.hashCode(horas));
    }

    @Override
    public String toString() {
        return "CursoDTO{" +
                "tutor='" + tutor + '\'' +
                ", value=" + Arrays.toString(value) +
                ", horas=" + Arrays.toString(horas) +
                '}';
    }
}
