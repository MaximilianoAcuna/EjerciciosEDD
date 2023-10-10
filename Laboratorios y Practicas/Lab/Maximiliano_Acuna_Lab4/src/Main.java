import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada list = new ListaEnlazada();
        ListaEnlazada list2 = new ListaEnlazada();
        ListaEnlazada list3 = new ListaEnlazada();
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            int rndmNum = random.nextInt(100)+1;
            list.agregarElemento( rndmNum);

            rndmNum = random.nextInt(100)+1;
            list2.agregarElemento( rndmNum);
        }

        System.out.println("Lista inicial nro 1: ");
        double prom1 = list.promediarLista();
        list.imprimirLista();
        System.out.println("Promedio de la lsita 1 :" + prom1);


        System.out.println("Lista inicial nro 2: ");
        double prom2 = list2.promediarLista();
        list2.imprimirLista();
        System.out.println("Promedio de la lista 2: " + prom2);


        Nodo actual = list.head;
        while (actual !=null){
            if(actual.data > prom1){
                list3.agregarElemento(actual.data);
            }
            actual=actual.siguiente;

        }
        actual=list2.head;
        while (actual !=null){
            if(actual.data > prom2){
                list3.agregarElemento(actual.data);
            }
            actual=actual.siguiente;

        }
        System.out.println("Tercera Lista De menor a mayor");
        list3.ordenListado();
        list3.imprimirLista();
    }
}