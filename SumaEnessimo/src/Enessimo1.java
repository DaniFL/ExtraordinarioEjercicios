package SumaEnessimo.src;

import java.util.Scanner;

public class Enessimo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("La suma desde 1 hasta " + n + " es: " + suma(n));
        sc.close();
    }

    public static int suma(int n) {
        //caso base n=0
        if( n== 0){
            return 0;
        }
        //caso base n=1
        if ( n==1){
            return 1;
        }
        //recursivo llamada a la funcion
        else if (n > 1){
            return suma(n-1) + n;
        }
        return 0;
    }
}
