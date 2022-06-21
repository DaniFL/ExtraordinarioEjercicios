package FibonacciIterativo.src;

import java.util.Scanner;

public class Fibonacci2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("El fibonacci de " + n + " es: " + fibonacci(n));
        sc.close();
    }

    public static int fibonacci(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) {
                suma += i;
            } else {
                suma = (i - 1) + (i - 2);
            }
        }
        return suma;
    }
}
