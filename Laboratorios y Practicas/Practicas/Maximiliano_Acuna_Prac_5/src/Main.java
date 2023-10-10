import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada list = new ListaEnlazada();
        Random random = new Random();
        int max = 10;



        for (int i = 1; i <= 10; i++) {
            list.agregarElemento(i);
        }


        for (int i = 0; i < 10; i++) {
            int rndmNum = random.nextInt(100);
            list.agregarElemento( rndmNum);
        }
        System.out.println("Lista inicial");
        list.imprimirLista();
        System.out.println("Ornenando lista...");
        list.ordenListado();
        System.out.println("Lista ordenada");
        list.imprimirLista();
    }
}