import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public void Main (String[] args) {
        String[] nombre = {"juan", "ana", "isabel", "maca", "maxito"};
        int size=4;
        //operaciones
        //agregar, eliminar, buscar, obtener
        List<String> misNombre = new LinkedList<String>();
        misNombre.add("juan");
        misNombre.add("maca");
        misNombre.add("maxito");
        misNombre.add("isabel");
        misNombre.add("ana");

        System.out.println(Arrays.toString(nombre));
        System.out.println(Arrays.toString(misNombre.toArray(new String[0])));
        eliminar(nombre, size, 0);
        misNombre.remove(0);


        System.out.print(Arrays.toString(misNombre.toArray(new String[0])));
        misNombre.add(0,"miguel");
        System.out.println(Arrays.toString(misNombre.toArray(new String[0])));



        //__________________________________________________________________
        Lista miLista= new Lista();
        for (int i = 0; i <10 ; i++) {
            miLista.insertarFinal(i);
        }
        Lista miLista2 = new Lista();
        for (int i = 0; i <10 ; i++) {
            miLista2.insertarInicio(i);
        }
        miLista.imprimir();
        miLista2.imprimir();
    }

    public static int eliminar(String[] arr, int size, int pos){
        for (int i = pos; i < size-1 ; i++) {
            arr[i] = arr[i+1];
        }
        return --size;
    }
    public void print(){}

}
