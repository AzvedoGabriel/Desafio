package desafiosInicio;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numero = 1;
        int sequencia = 0;
        int armazenar;
        int limite;

        System.out.println("digite o limite desejado: ");
        limite =scan.nextInt();

        System.out.print("Informe um valor: ");
        numero = scan.nextInt();

        for (int i = 0; i < limite; i++) {

            System.out.println(numero);
            armazenar = numero;
            numero = numero + sequencia;
            sequencia = armazenar;
        }
        scan.close();
    }
}
