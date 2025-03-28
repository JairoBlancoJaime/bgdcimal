package org.iesvdm.EjercicioRepasoGenericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MultiMap<K, V> {

    private final List<K> keys = new ArrayList<>();
    private final List<List<V>> values = new ArrayList<>();

    public void addWithAbsentMode (K key, V value, boolean checkIfAbsent) {

        // Recorre el ArrayList
        int i = this.keys.indexOf(key);
        // Key inexistente -> No existe ArrayList<V> asociado.
        if (i == -1) {
            this.keys.add(key);
            List<V> ListAux = new ArrayList<>(); // Lo crea estando vacio.
            ListAux.add(value);

            this.values.add(ListAux);
        } else {
            if (checkIfAbsent) {
                if (!this.values.contains(value)) {
                    this.values.get((i)).add(value);
                };
            } else {
                this.values.get(i).add(value);
            }
        }
    }

    public void add(K key, V value) {
        addWithAbsentMode(key, value, false);
    }

    public void addIfAbsent(K key, V value) {
        addWithAbsentMode(key, value, true);
    }

    public Collection<V> get(K key) {

        Collection<V> salida = null;

        int i = this.keys.indexOf(key);
        salida = this.values.get(i);

        return salida;

        // return this.values.get(this.keys.indexof(key));
    }

    public boolean remove(K key, V value) {

        boolean salida = false;

        int i = this.keys.indexOf(key);
        List<V> listValues = this.values.get(i);

        for (Iterator<V> it = listValues.iterator(); it.hasNext(); ) {
            V vAux = it.next();
            if (value.equals(vAux)) {
                salida = true;
                it.remove();
            }
        }

        if ((listValues.size() == 0)) {
            this.keys.remove(i);
            this.values.remove(i);
        }

        return salida;
    }

}
