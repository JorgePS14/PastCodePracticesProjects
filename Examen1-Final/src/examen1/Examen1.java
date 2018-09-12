package examen1;

import examen1.SinglyLinkedList.Node;

public class Examen1 {
    
    //Clase Main para prueba de casos de detección de Loops
    
    public static void main(String[] args) {
        
        //Prueba de caso 1: Sí hay loop.
        
        SinglyLinkedList case1 = new SinglyLinkedList();
        case1.mainNode = new Node("Perro");
        case1.mainNode.nextNode = new Node("Perro");
        case1.mainNode.nextNode.nextNode = new Node("Perro");
        case1.mainNode.nextNode.nextNode.nextNode = new Node("Perro");
        case1.mainNode.nextNode.nextNode.nextNode.nextNode = new Node("Perro");
 
        case1.mainNode.nextNode.nextNode.nextNode.nextNode.nextNode = case1.mainNode.nextNode.nextNode.nextNode;
        System.out.println("Is there a loop in this list? // Is the list damaged?");
        System.out.println(case1.findLoop(case1.mainNode));
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //Prueba de caso 2: No hay loop
        
        SinglyLinkedList case2 = new SinglyLinkedList();
        case2.mainNode = new Node("Perro");
        case2.mainNode.nextNode = new Node("Perro");
        case2.mainNode.nextNode.nextNode = new Node("Perro");
        case2.mainNode.nextNode.nextNode.nextNode = new Node("Perro");
        case2.mainNode.nextNode.nextNode.nextNode.nextNode = new Node("Perro");

        System.out.println("Is there a loop in this list? // Is the list damaged?");
        System.out.println(case2.findLoop(case2.mainNode));
        
    }
}
