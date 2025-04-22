package org.iesvdm.BibliotecaGenerica;

import java.util.ArrayList;
import java.util.List;

public class Estanteria<T> {

    /*
    ArrayList<Estanteria<T>> estanteria;
     */

    List<T> lista = new ArrayList<>();

    public void agregar(T elemento) {

        lista.add(elemento);
        System.out.println("Se ha añadido correctamente.");

    }

    public T obtenerPrimero() {

        lista.getFirst();
        System.out.println("Este es el primer elemento.");
        return null;    // Aqui habria que devolver el lista.getFirst para que devuelva el primer elemento y no devolver null, no?

    }

    public void mostrarTodo() {

        System.out.println("La lista completa:\n" + lista); // Esto no le haria falta un toString a la lista?

    }

    public boolean estaVacia() {

        if (lista.isEmpty()) {

            return true;

        } else {

            return false;

        }

    }

}
