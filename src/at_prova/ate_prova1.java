
package at_prova;

import java.io.IOException;
import java.util.Scanner;

public class ate_prova1 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int ID, COUNT;

        ID = entrada.nextInt();
        COUNT = entrada.nextInt();

        if (ID == 1) {
            System.out.printf("Cachorro Quente \n Valor: R$ %.2f\n :",COUNT*4.00);
        }
        if (ID == 2) {
            System.out.printf("X-Salada \n Valor: R$ %.2f\n",COUNT*4.50);
        }
        if (ID == 3) {
            System.out.printf("X-Bacon \n Valor: R$ %.2f\n",COUNT*5.00);
        }
        if (ID == 4) {
            System.out.printf("Torrada simples \n Valor: R$ %.2f\n",COUNT*2.00);
        }
        if (ID == 5) {
            System.out.printf("Refrigerante \n Valor: R$ %.2f\n",COUNT*1.50);
        }
    }

}
