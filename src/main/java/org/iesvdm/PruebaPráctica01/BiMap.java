package org.iesvdm.PruebaPráctica01;

import java.util.ArrayList;
import java.util.List;

public class BiMap<K, V> {

    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    public BiMap<K, V> putWithForceMode(K key, V value, boolean force) {

        for (int i = 0; i < keys.size() ; i++) {
            // Terminar de hacer el metodo
            K keyAux = keys.get(i);
            V valueAux = values.get(i);

            if (keyAux.equals(key) && !valueAux.equals(value)) {
                values.set(i, value);
                return this;
            } else if (keyAux.equals(key) && valueAux.equals(value)) {
                return this;
            } else if (!keyAux.equals(key) && (valueAux.equals(value))) {
                if (force) {
                    keys.set(i, key);
                } else {
                    throw new IllegalArgumentException("Ya esta presente");
                }
            }
        }

        keys.add(key);
        values.add(value);

        return this; // Devuelves el mismo objeto.
    };

    public BiMap<K, V> put(K key, V value) {
        return putWithForceMode(key, value, false);
    }

    public BiMap<K, V> forcePut(K key, V value) {
        return putWithForceMode(key, value, true);
    }

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

    public BiMap<V, K> inv() {

        BiMap<V, K> BiMapinv = new BiMap<>();

        BiMapinv.keys = new ArrayList<>(this.values);
        BiMapinv.values = new ArrayList<>(this.keys);

        for (int i = 0; i < keys.size(); i++) {
            K key = keys.get(i);
            V value = values.get(i);

            BiMapinv;
        }

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
