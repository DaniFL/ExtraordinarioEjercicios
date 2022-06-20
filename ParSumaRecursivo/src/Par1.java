package ParSumaRecursivo.src;

import java.util.Scanner;

public class Par1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("La suma de números pares desde 0 hasta " + n + " es: " + sumaPar(n));
        sc.close();
    }
    public static int sumaPar(int n) {
        //caso base:
        if (n == 0 || n == 1) {
            return 0;
        }
        //recursividad: nº par(2*n)
        else if (n % 2 == 0) {
            return n + sumaPar(n - 1);
        } else {
            return sumaPar(n - 1);
        }

    }
}
