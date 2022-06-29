package MCDRecursivo.src;

import java.util.Scanner;

public class Mcd1 {
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
        if(m==0){
            return n;
        }else {
            return mcd(m, n%m);
        }
    }
}
