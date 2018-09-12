package examen1;

public class SinglyLinkedList {
    
    //Clase con constructor para crear un nodo
 
    public static class Node {
        
        Node nextNode;
        String animal;
 
        Node(String n) {
            animal = n;
            nextNode = null;
        }
    }
    
    //Creaión del primer nodo
    
    public static Node mainNode;
    
    //Clase para encontrar Loop: basado en el algoritmo de Floyd "tortoise and hare algorithm"

    public boolean findLoop(Node mainNode) {
        Node tortoiseNode = mainNode, hareNode = mainNode;
        while (tortoiseNode != null && hareNode != null && hareNode.nextNode != null) {
            tortoiseNode = tortoiseNode.nextNode;
            hareNode = hareNode.nextNode.nextNode;
 
            if (tortoiseNode == hareNode) {
                return true;
            }
        }
        return false;
    }
 
}