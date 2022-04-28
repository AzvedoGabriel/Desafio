package desafioPotencia;

import java.util.Scanner;

public class Potencia2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x, y;
        int fatorial = 1;
        System.out.print("Informe o valor de x: ");
        x = scan.nextInt();

        System.out.print("Informe o valor de y: ");
        y = scan.nextInt();

        for (int i = y; i >= 1; i--) {
            fatorial = fatorial * x;
        }
        System.out.println("Resultado: " + fatorial );
        scan.close();
    }
}
