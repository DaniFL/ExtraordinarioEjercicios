package SumaListaNumIterativo.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaLista2 {

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
    public static int sumaLista (List<Integer> lista) {
          int suma = 0;
            for(int i = 0; i<lista.size(); i++){
                suma+=lista.get(i);
            }
            return suma;
        }
    }
