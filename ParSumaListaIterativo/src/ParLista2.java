package ParSumaListaIterativo.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParLista2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un conjunto de números a la lista: ");
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            lista.add(sc.nextInt());
        }
        sc.close();
        System.out.println("La suma de los números pares de la lista es: " + sumaParLista(lista));
    }

    public static int sumaParLista(List<Integer> lista) {
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                suma += lista.get(i);
            }
        }
        return suma;
    }
}
