package MediaRecursivo.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un conjunto de numeros: ");
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            lista.add(sc.nextInt());
        }
        System.out.println("La media se los elementos de la lista es: " + media(lista)/lista.size());
        sc.close();
    }
    public static int media (List <Integer> lista){
        //caso base
        if (lista.isEmpty()){
            return 0;
        }
        //recursivo llamada a la funcion
        else if (lista.size() > 1){
            return (lista.get(0) + media(lista.subList(1, lista.size())));
            //return media((lista.get(0) + lista.get(1) + lista.get(2) + lista.get(3) + lista.get(4)))/lista.size();
        }
        return lista.get(0);
    }
}

