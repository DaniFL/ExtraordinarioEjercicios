package MediaIterativo.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un conjunto de numeros: ");
        List<Integer> lista = new ArrayList<Integer>();
        for(int i = 1; i<=5; i++){
            lista.add(sc.nextInt());
        }
        System.out.println("La media se los elementos de la lista es: " + media(lista));
        sc.close();
    }

    public static int media (List  <Integer> lista) {
        int suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma+=lista.get(i);
        }
        return suma/lista.size();
    }
}
