package ParSumaListaRecursivo.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParLista1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un conjunto de números a la lista: ");
        List <Integer> lista = new ArrayList<>();
        for(int i = 1; i<= 5; i++){
            lista.add(sc.nextInt());
        }
        sc.close();
        System.out.println("La suma de los números pares de la lista es: " + sumaParLista(lista));
    }

    public static int sumaParLista(List<Integer> lista){

        //caso base: si la lista está vacía
        if(lista.isEmpty()){
            return 0;
        }
        //recursividad: si la lista tiene un solo elemento
        else if(lista.size() == 1) {
            if (lista.get(0) % 2 == 0) {
                return lista.get(0);
            }else {
                return 0;
            }
        }
        //recursividad: si la lista tiene mas de un elemento
        else{
            if (lista.get(0) % 2 == 0) {
                return lista.get(0) + sumaParLista(lista.subList(1, lista.size()));
            } else {
                return sumaParLista(lista.subList(1, lista.size()));
            }
        }
    }
}
