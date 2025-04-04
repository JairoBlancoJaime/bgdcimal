package org.iesvdm.Anotaciones;

public class App {

    public static void main(String[] args) {

        Repositorio repositorio = new Repositorio();
        Repositorio.cargarContexto(repositorio);

        System.out.println(repositorio);

    }

}
