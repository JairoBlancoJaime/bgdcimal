package org.iesvdm.EjercicioRepasoGenericos;

// Para poder poner directamente assertEquals() en vez de Assertions.asserEquals
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.Collection;

public class MultiMapTest {

    @Test
    void comproBarAdd(){

        MultiMap<String, Integer> multiMap = new MultiMap<>();

        multiMap.add("hola1", 1);
        multiMap.add("hola2", 2);
        multiMap.add("hola3", 3);
        multiMap.add("hola4", 4);

        assertEquals(4, multiMap.totalSize());

        Collection<Integer> collection = multiMap.get("hola3");
        System.out.println(collection.toString());

        assertEquals("[3, 4]", collection.toString());
    }

    @Test
    void comprobarIfAbsent(){
        MultiMap<String, Integer> multiMap = new MultiMap<>();

        multiMap.addIfAbsent("hola1", 1);
        multiMap.addIfAbsent("hola1", 1); // Este no se añade
        multiMap.addIfAbsent("hola1", 2);
        multiMap.addIfAbsent("hola3", 3);

        assertEquals(3, multiMap.get("hola1").size());

    }

    @Test
    void testRemove(){

        MultiMap<String, Integer> multiMap = new MultiMap<>();

        multiMap.add("1", 1);
        multiMap.add("2", 2);
        multiMap.add("3", 3);
        multiMap.add("4", 4);

        multiMap.remove("4", 4);
        System.out.println(multiMap.toString());
        assertEquals(6, multiMap.totalSize());
    }
}
