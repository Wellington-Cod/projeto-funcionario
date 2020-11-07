package br.com.projetofuncionario.main;

import java.text.NumberFormat;

public class DevMidia {

    public static void main(String[] args) {
        double n[] = {523.34, 54344.23, 95845.223, 1084.895};

        NumberFormat z = NumberFormat.getCurrencyInstance();

        for (int a = 0; a < n.length; a++) {
            if (a != 0) {
                System.out.print(" - ");
            }
            System.out.print(z.format(n[a]));
        }
        System.out.println();
  /*
  Imprime:
  R$ 523,34, R$ 54.344,23, R$ 95.845,22, R$ 1.084,90
  */
    }
}

