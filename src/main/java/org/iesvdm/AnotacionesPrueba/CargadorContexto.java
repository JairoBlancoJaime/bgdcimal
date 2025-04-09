package org.iesvdm.AnotacionesPrueba;

public class CargadorContexto {

    public static CursoDTO cargadorContexto() {

        Curso curso = Clase.class.getAnnotation(Curso.class);

        CursoDTO cursoDTO = new CursoDTO(curso.tutor(), curso.value(), curso.horas());

        return cursoDTO;

    }

}
