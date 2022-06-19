package PotenciaRecursivo.src;
import java.util.Scanner;

public class Potencia1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("Introduzca un exponente: ");
        int m = sc.nextInt();
        System.out.println("El resultado de " + n + " elevado a " + m + " es: " + potencia(n, m));
        sc.close();
    }

    public static int potencia(int n, int m) {
        //caso base n=0
        if (n == 0) {
            return 0;
        }
        //caso base n=1
        if (n == 1) {
            return 1;
        }
        //caso base m=0
        if (m == 0) {
            return 1;
        }
        //caso base m=1
        if (m == 1) {
            return n;
        }
        //recursivo llamada a la funcion
        if (m > 1) {
            return potencia(n, m - 1) * n;
        }
        return 0;
    }
}
