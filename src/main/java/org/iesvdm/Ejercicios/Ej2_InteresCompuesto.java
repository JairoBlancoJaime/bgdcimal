package org.iesvdm.Ejercicios;

import java.util.Scanner;
import java.math.BigDecimal;

public class Ej2_InteresCompuesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Monto invertido.
        System.out.print("Monto invertido originalmente: ");
        String pString = sc.next();
        BigDecimal p = new BigDecimal(pString);

        //Numero de anyos.
        System.out.print("Numero de anyos: ");
        String nString = sc.next();
        BigDecimal n = new BigDecimal(nString);

        //Tasa de interes anual.
        BigDecimal r = new BigDecimal("0.05");

        //Cantidad depositada del año enesimo.
        BigDecimal c = new BigDecimal("0.01");

        System.out.println("El resultado de la opración es de: " +c);
    }
}
