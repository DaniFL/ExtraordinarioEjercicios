package FactorialIterativo.src;
import java.util.Scanner;

public class Factorial2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("El factorial de " + n + " es: " + factorial(n));
        sc.close();
    }
    public static int factorial (int n){
        int factorial = 1;
        for(int i = 1; i<=n ; i++){
            factorial *= i;
        }
        return factorial;
    }
}
