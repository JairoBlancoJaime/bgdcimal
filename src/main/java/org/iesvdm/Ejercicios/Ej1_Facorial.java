package org.iesvdm.Ejercicios;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ej1_Facorial {
    public static void main(String[] args) {

        BigInteger n = new BigInteger("4");
        BigInteger acue = BigInteger.ONE;

        while (n.compareTo(BigInteger.ZERO) > 0) {
            acue = acue.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        System.out.println("El factoria de " +n+ "es: " +acue+ ".");

    }
}
