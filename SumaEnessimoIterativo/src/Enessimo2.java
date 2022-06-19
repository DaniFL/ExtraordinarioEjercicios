package SumaEnessimoIterativo.src;

import java.util.Scanner;

public class Enessimo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("La suma desde 1 hasta " + n + " es: " + sumaiterativa(n));
        sc.close();
    }

    public static int sumaiterativa(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
