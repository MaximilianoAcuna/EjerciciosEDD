public class arbolNArio {
    Nodo raiz;

    public arbolNArio(Nodo raiz) {
        this.raiz = raiz;
    }

    public int contarNodos() {
        return contarNodos(raiz);
    }

    private int contarNodos(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }

        int contador = 1; // Inicializamos el contador con 1 para contar el nodo actual

        for (Nodo hijo : nodo.hijos) {
            contador += contarNodos(hijo); // Recursivamente contamos los nodos de cada hijo
        }

        return contador;
    }
}

