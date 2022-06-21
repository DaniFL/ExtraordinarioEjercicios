package FibonacciRecursivo.src;

import java.util.Scanner;

public class Fibonacci1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("El fibonacci de " + n + " es: " + fibonacci(n));
        sc.close();
    }
    public static int fibonacci(int n) {
        //caso base:
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        //recursivo llamada a la funcion
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
