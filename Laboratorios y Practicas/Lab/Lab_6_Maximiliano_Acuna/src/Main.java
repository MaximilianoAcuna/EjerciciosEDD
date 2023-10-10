public class Main {
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);
        Nodo nodo4 = new Nodo(4);
        Nodo nodo5 = new Nodo(5);
        Nodo nodo6 = new Nodo(6);
        Nodo nodo7 = new Nodo(7);

        nodo1.hijos.add(nodo2);
        nodo1.hijos.add(nodo3);
        nodo2.hijos.add(nodo4);
        nodo2.hijos.add(nodo5);
        nodo3.hijos.add(nodo6);
        nodo3.hijos.add(nodo7);


        arbolNArio arbol = new arbolNArio(nodo1);
        int numeroDeNodos = arbol.contarNodos();
        System.out.println("Número de nodos en el árbol: " + numeroDeNodos);
        }
    }