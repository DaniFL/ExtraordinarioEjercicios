package MCDIterativo.src;

import java.util.Scanner;

public class Mcd2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("Introduzca otro numero: ");
        int m = sc.nextInt();
        System.out.println("El MCD de " + n + " y " + m + " es: " + mcd(n, m));
        sc.close();
    }

    public static int mcd(int n, int m){
        int valor = 0;
        if(n>m){
            valor = m;
        }else{
            valor = n;
        }
        for(int i = valor; i>=1; i--){
            if(n%i==0 && m%i==0){
                return i;
            }
        }
        return 1;
    }
}
