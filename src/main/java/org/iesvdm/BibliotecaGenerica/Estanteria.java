package org.iesvdm.BibliotecaGenerica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Estanteria<T extends Item> {

    private List<Balda<T>> baldas = new ArrayList<>();

    public Estanteria(int numBaldas) {
        this.baldas = new ArrayList<>(numBaldas);

        IntStream.range(0,numBaldas).forEach(i -> {
            this.baldas.add(new Balda<>());
        });

    }

    public void agregar(int numBalda, T t) {

        this.baldas.get(numBalda-1).agregar(t);

    }

}

