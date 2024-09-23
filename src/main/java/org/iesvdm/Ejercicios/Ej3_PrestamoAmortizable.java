package org.iesvdm.Ejercicios;

import java.math.BigDecimal;

public class Ej3_PrestamoAmortizable {
    public static void main(String[] args) {

        BigDecimal prestamo = new BigDecimal("200000"); // Préstamo

        BigDecimal tasaInteresAnual = new BigDecimal("0.05");// Tasa interés anual
        BigDecimal anyoAMes = new BigDecimal("12");// Meses de un año

        BigDecimal r = tasaInteresAnual.divide(anyoAMes, 2, BigDecimal.ROUND_HALF_UP);// Cálculo de r

        BigDecimal porcentaje = new BigDecimal("100");// Porcentaje de tasa interés anual
        tasaInteresAnual = tasaInteresAnual.multiply(porcentaje);// Resultado del porcentaje anual

        BigDecimal uno = BigDecimal.ONE;

        BigDecimal dividendo = prestamo.multiply(tasaInteresAnual);// Dividendo de la división
        BigDecimal rMasUno = r.add(uno);
        BigDecimal rMasUnoElevadoMenosAnyos =

        System.out.println("Préstamo: " +prestamo);
        System.out.println("Tasa de interés anual: " +tasaInteresAnual);
        System.out.println("Pago mensual: " +pmt);


        System.out.print("Introduzca el valor de la préstamo: ");
        String rPrestamoString = sc.next();
        BigDecimal rPrestamo = new BigDecimal(rPrestamoString);


        /*
        BigDecimal.ONE.divide(BigDecimal.ONE.add(r)).pow(n, MathContext.DECIMAL);
        BigDecimal.ONE.divide(r.MathContext.DECIMAL 128, 10, RoundingMode.Half_Even);

        BigDecimal uno = BigDecimal.ONE;
        BigDecimal uno = new Bigdecimal("1");
         */
    }
}
