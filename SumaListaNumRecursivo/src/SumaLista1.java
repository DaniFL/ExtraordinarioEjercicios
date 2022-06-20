package SumaListaNumRecursivo.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaLista1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un conjunto de numeros: ");
        List<Integer> lista = new ArrayList<Integer>();
        for(int i = 1; i<=5; i++){
            lista.add(sc.nextInt());
        }
        System.out.println("La suma se los elementos de la lista es: " + sumaLista(lista));
        sc.close();
    }

    public static int sumaLista(List<Integer> lista) {
        //caso base lista vacia
        if (lista.isEmpty()) {
            return 0;
        }
        //recursivo llamada a la funcion
        else if (lista.size() > 1) {
            return lista.get(0) + sumaLista(lista.subList(1, lista.size()));
        }
        return lista.get(0);
    }
}
