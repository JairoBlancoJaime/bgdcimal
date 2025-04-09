package org.iesvdm.AnotacionesPrueba;

public class Main {

    public static void main(String[] args) {

        CursoDTO cursoDTO = CargadorContexto.cargadorContexto();

        System.out.println(cursoDTO);

    }
}
