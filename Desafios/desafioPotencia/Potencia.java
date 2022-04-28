package desafioPotencia;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x, y;

        System.out.print("Informe o valor de x: ");
        x = scan.nextInt();

        System.out.print("Informe o valor de y: ");
        y = scan.nextInt();

        double resultado = Math.pow(x, y);
        do {
            System.out.println(resultado);

        } while (resultado ==0 ); {
            System.out.println("Fim do codigo");
        }
        scan.close();
    }
}
