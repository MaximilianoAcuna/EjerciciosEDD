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

            // Intercambiar los datos de nodoActual y nodoMenor
            int temporal = nodoActual.data;
            nodoActual.data = nodoMenor.data;
            nodoMenor.data = temporal;

            nodoActual = nodoActual.siguiente;
        }
    }
}
