package FibonacciLambda.src;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;

public class Fibonacci3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("El fibonacci de " + n + " es: " + fibonacci(n));
        sc.close();
    }
    public static int fibonacci(int n){
        //sucesion de fibonacci con expresiones lambda
        IntFunction<Integer> integerIntFunction = (int x) -> {
            if (x == 0) {
                return 0;
            } else if (x == 1) {
                return 1;
            } else {
                return fibonacci(x - 1) + fibonacci(x - 2);
            }
        };
        return integerIntFunction.apply(n);
    }
}

