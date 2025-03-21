package org.iesvdm.PruebaPráctica01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class UtilEstadistica {

    public static BigDecimal media(double[] x, int escala, RoundingMode redondeo) {

      BigDecimal suma = BigDecimal.ZERO;

      for (int i=0; i < x.length; i++) {
          suma = suma.add(BigDecimal.valueOf(x[i]));;
      }

      return suma.divide(suma, escala, redondeo);

    };
}
