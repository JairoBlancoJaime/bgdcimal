package org.iesvdm.PruebaPráctica01;

import java.util.ArrayList;
import java.util.List;

public class BiMap<K, V> {

    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    public BiMap<K, V> put(K key, V value) {

        for (int i = 0; i ; i++) {
            // Terminar de hacer el metodo
        }

        keys.add(key);
        values.add(value);

        return this; // Devuelves el mismo objeto.
    };

    public V get(K clave) {
        V aux = null;

        for (int i = 0; i < keys.size(); i++) {
            K claveDevuelta = this.keys.get(i);

            if (clave.equals(claveDevuelta)) {
                aux = this.values.get(i);
                break;
            }
        }

        return aux;
    }

    public String toString() {

        String salida = "";

        K clave = null;
        V valor = null;

        for (int i = 0; i < this.keys.size(); i++) {
            // Hacer toString
        }

        return salida;
    }
}
