package com.LinkedListNodeExample;

public class LinkedListDemo {
    LLNode head;

    //Insertar al inicio de la lista
    LLNode insertIniciolist(int datoIngresado, LLNode head) {
        LLNode temp = new LLNode(datoIngresado);
        if (head == null)//Lista está vacía
            head = temp;
        else//lista no vacia
        {
            temp.next = head;
            head = temp;
        }
        return head;
    }

    //Insertar al final de la lista
    LLNode insertFinalLista(int datoIngresado, LLNode head) {
        LLNode temp = new LLNode(datoIngresado);
        LLNode tempHead = head;
        if (tempHead == null)
            head = temp;
        else  //Lista ya contiene nodos
        {
            while (tempHead.next!=null)
                tempHead=tempHead.next;
            tempHead.next=temp;
        }
        return head;
    }

    //Insertar en una posicion X de la lista
    LLNode insertPosicionXLista(int datoIngresado, LLNode head, int posicion){
        LLNode temp=new LLNode(datoIngresado);
        if(posicion==1){
            temp.next=head;
            head=temp;
        }
        //para casos donde la posicion no sea 1,recordemos que head no se mueve
        else {
            LLNode tempHead=head;
            for (int i=1; tempHead!=null && i<posicion-1;i++)
                tempHead = tempHead.next;
            temp.next=tempHead;
            tempHead.next=temp;
        }
        return head;
    }

    //Borrar en una posicion X de la lista
    LLNode eliminarNodo(int posicion, LLNode head) {
        LLNode tempHead = head;
        if (posicion ==1 )
            head = tempHead.next;
        else {
            for (int i = 1; tempHead !=null && i<posicion -1; i++)
                tempHead=tempHead.next;
        }
        return head;
    }

    //Implementar una revercion de la lista

    //Visualizar la lista
    void VisualizarLista(LLNode head){
        LLNode temp=head;
        while (temp!=null){
            System.out.print(temp.dato+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {

    }

}
