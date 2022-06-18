package SumaEnesimo; 
import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un numero: ");
    int n = sc.nextInt();
    System.out.println("La suma desde 1 hasta " + n + "es: " + sumaEnesimo(n));
    sc.close(); 
}
    
    public static int SumaEnesimo(int n){

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
        return SumaEnesimo(n-1) + n;
    }
}

