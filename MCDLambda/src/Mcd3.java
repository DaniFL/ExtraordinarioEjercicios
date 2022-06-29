package MCDLambda.src;

import java.util.Scanner;

public class Mcd3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("Introduzca otro numero: ");
        int m = sc.nextInt();
        System.out.println("El MCD de " + n + " y " + m + " es: " + mcd(n, m));
        sc.close();
    }

    public static int mcd(int n, int m) {
        return m == 0 ? n : mcd(m, n%m);
    }
}
