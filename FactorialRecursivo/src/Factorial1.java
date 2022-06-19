package FactorialRecursivo.src;

import java.util.Scanner;

public class Factorial1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("El factorial de " + n + " es: " + factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        //caso base n=0 OR n=1
        if (n == 0 || n == 1) {
            return 1;
        }
        //recursivo llamada a la funcion
        else if (n > 1) {
            return factorial(n - 1) * n;
        }
        return 0;
    }
}
