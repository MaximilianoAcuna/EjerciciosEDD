public class ListaEnlazada {
    Nodo head;

    public ListaEnlazada() {
        this.head = null;
    }

    public void agregarElemento(int data) {
        Nodo nuevoNodo = new Nodo(data);
        if (head == null) {
            head = nuevoNodo;
        } else {
            Nodo temp = head;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public void imprimirLista() {
        Nodo temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    public void ordenListado() {
        Nodo nodoActual = head;
        while (nodoActual != null) {
            Nodo nodoMenor = nodoActual;
            Nodo nodoTemporal = nodoActual.siguiente;
            while (nodoTemporal != null) {
                if (nodoTemporal.data < nodoMenor.data) {
                    nodoMenor = nodoTemporal;
                }
                nodoTemporal = nodoTemporal.siguiente;
            }
            int temporal = nodoActual.data;
            nodoActual.data = nodoMenor.data;
            nodoMenor.data = temporal;
            nodoActual = nodoActual.siguiente;
        }
    }
    public double promediarLista(){
        if (head == null) {
            return 0.0;
        }

        Nodo actual = head;
        int suma = 0;
        int contador = 0;

        while (actual != null) {
            suma += actual.data;
            contador++;
            actual = actual.siguiente;
        }

        return (double) suma / contador;
    }

}
