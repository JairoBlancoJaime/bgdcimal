package org.iesvdm.BibliotecaGenerica;

import org.junit.jupiter.api.Test;

public class EstanteriaTest {


    @Test
    void estanteriaTest() {

        Estanteria<Documento> estanteriaDoc = new Estanteria<>(10);

        estanteriaDoc.agregar(1, new Libro());

        Estanteria<Item> estanteriaItem = new Estanteria<>(4);
        estanteriaItem.agregar(1, new Pisapapel());
        estanteriaItem.agregar(1, new Libro());

    }

}
