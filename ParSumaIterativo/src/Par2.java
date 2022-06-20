package ParSumaIterativo.src;

import java.util.Scanner;

public class Par2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("La suma de números pares desde 0 hasta " + n + " es: " + sumaPar(n));
        sc.close();
    }
    public static int sumaPar(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}