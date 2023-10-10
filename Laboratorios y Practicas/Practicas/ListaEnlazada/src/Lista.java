


public class Lista{
    Nodo head;
    public Lista(){

    }

    public void insertarInicio(int num){
        Nodo nuevo = new Nodo(num, head);
        head = nuevo;
    }

    //t(n)= n+1 O(n)
    private Nodo ultimo(){
        if (head==null){
            return null;
        }
        Nodo p=head;
        while (p.next!=null){
            p=p.next;

        }
        return p;
    }

    //t(n)= n+1+0

    //agregar puntero al back
    //agregar una referencia al ultimo para que sea
    public void insertarFinal(int num){
        Nodo nuevo = new Nodo(num);
        Nodo back= ultimo();
        if (back==null) {
            head=nuevo;
        }
        back.next=nuevo;

    }


    public void imprimir(){
        Nodo p= head;
        System.out.print("[ ");
        while (p!= null){
            System.out.print(p.data + ", ");
        }
        System.out.print("]");
    }
}