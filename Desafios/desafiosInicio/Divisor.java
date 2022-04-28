package desafiosInicio;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i;
        int numero;


        System.out.print("Informe o numero: ");
        numero = entrada.nextInt();

        int primos =0;

        entrada.close();

        for (i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                primos++;
                System.out.println("Divisão: " + i);
            }

        }
        if (primos == 2) {
            System.out.println("Ele é número primo");
        }else {
            System.out.println("Não é numero primo");
        }
    }
}
