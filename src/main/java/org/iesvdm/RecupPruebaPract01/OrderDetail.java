package org.iesvdm.RecupPruebaPract01;

import java.math.BigDecimal;

public class OrderDetail {

    public int quantity;
    public TaxType taxtype;

    public BigDecimal calcSubTotal() {

        int iva = TaxType.SUPERREDUCED.valor;
        BigDecimal subTotal = new BigDecimal();


        return null;
    }

    public BigDecimal calcWeight() {

        return null;
    }

}
