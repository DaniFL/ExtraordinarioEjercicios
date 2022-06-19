package PotenciaIterativo.src;
import java.util.Scanner;

public class Potencia2 {
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
        int exponente = 1;
        for(int i = 1; i<= m; i++){
            exponente*= n;
        }
        return exponente;
    }
}
