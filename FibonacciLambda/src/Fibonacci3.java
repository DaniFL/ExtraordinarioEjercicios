package FibonacciLambda.src;

import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.println("El fibonacci de " + n + " es: " + fibonacci(n));
        System.out.println(lista(n));
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

    public static int lista(int args) {
        String collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .map(String::valueOf) // convert to string
                .collect(Collectors.joining(", "));

        System.out.println("Result : " + collect);
        return collect.length();
    }
}

