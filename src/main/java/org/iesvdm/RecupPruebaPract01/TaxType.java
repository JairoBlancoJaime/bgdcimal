package org.iesvdm.RecupPruebaPract01;

public enum TaxType {

    GENERAL (21),
    REDUCED (10),
    SUPERREDUCED (4);

    public final Integer valor;

    TaxType(Integer valor) {
        this.valor = valor;
    }
}
