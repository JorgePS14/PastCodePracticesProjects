package doublylinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;

public class DoublyLinkedList<T> implements Iterable<T>{
    
    /**
     *Declaration of variables: 
     * int size
     * Node<T> head, tail
     */

    private int size;
    private Node<T> head;
    private Node<T> tail;
    
    /**
     * Constructor for an empty linked list
     */
    
    public DoublyLinkedList() {
        
        this.head = null;
        this.tail = null;
        this.size = 0;
    
    }
    
    /**
     * Method that allows us to know if the list is empty.
     * @return true or false
     */
    
    public boolean isEmpty() {
        
        if(this.size == 0)
            return true;
        
        return false;
        
    }
    
    /**
     * Method that allows us to get the actual size of our list.
     * @return size
     */
    
    public int getSize() {
        
        return this.size;
    
    }
    
    /**
     * Method that lets you know if the list contains a certain element.
     * @param t
     * @return true or false
     */
    
    public boolean contains(T t) {
        Node current = head;
        while(current != null) {
            if(current.data.toString().equals(t.toString())) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    /**
     * Method to create a new iterator for the linked list.
     * @return new Iterator
     */
    
    @Override
    public Iterator<T> iterator() {
        return new dllIterator<>(this.head);
    }

    /**
     * This method lets us traverse throug the list element by element.
     * @param action 
     */
    @Override
    public void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for(T t : this) {
            action.accept(t);
        }
    }
    
    /**
     * Private static class for an iterator.
     * @param <T> 
     */
    
    private static class dllIterator<T> implements Iterator<T> {
        
        /**
         * Declaration of variables:
         * Node<T> current, lastReturned.
         */
        
        private Node<T> current, lastReturned;
        
        /**
         * Constructor for an iterator.
         * Takes in the first node of a linked list.
         * @param n 
         */
        
        public dllIterator(Node<T> n) {
            this.current = n;
            this.lastReturned = null;
        }
        
        /**
         * Method that lets the iterator know if the list has another element.
         * @return true or false
         */

        @Override
        public boolean hasNext() {
            return this.current != null;
        }
        
        /**
         * Method that allows us to get the next element in the list.
         * @return this.lastReturned.data
         */

        @Override
        public T next() {
            if(this.current == null) {
                throw new NoSuchElementException();
            }
            this.lastReturned = this.current;
            this.current = this.current.next;
            return this.lastReturned.data;
        }
        
    }
    
    /**
     * Private static class for a node.
     * @param <T> 
     */
    
    private static class Node<T>{
        
        /**
         * Declaration of variables:
         * T data
         * Node next, previous
         */
        
        T data;
        Node next;
        Node previous;
        
        /**
         * Constructor for a node.
         * @param data 
         */

        public Node(T data) {
            
            this.data = data;
            next = null;
            previous = null;
            
        }   
        
        /**
         * Method that allows us to get the data of a node in the form of a String.
         * @return data.toString
         */
        
        @Override
        public String toString() {
            
            return data.toString();
        
        }
        
    }
    
    /**
     * Method that allows us to get the first element of the list.
     * @return this.head.data
     */
    
    public T getFirst() {
        
        System.out.println("Getting data from the first node.");
        
        if(this.isEmpty() == true) {
            
            throw new NoSuchElementException("There are no elements in this list.");
        
        } else {
            
            return this.head.data;
        
        }
        
    }
    
    /**
     * Method that allows us to get the last element of the list.
     * @return this.tail.data
     */
    
    public T getLast() {
        
        System.out.println("Getting data from the last node.");
        
        if(this.isEmpty() == true) {
            
            throw new NoSuchElementException("There are no elements in this list.");
        
        } else {
            
            return this.tail.data;
        
        }
        
    }
    
    /**
     * Method that allows us to add an element in the beginning of the list.
     * @param data 
     */

    public void addAtStart(T data) {
        
        System.out.println("Adding Node " + data + " at the beginning.");
        Node<T> n = new Node<>(data);
        
        if(this.isEmpty() == true){
            
            head = n;
            tail = n;
            
        } else {
            
            n.next = head;
            head.previous = n;
            head = n;
            
        }
        
        size++;
    
    }
    
    /**
     * Method that allows us to add an element in the end of the list.
     * @param data 
     */

    public void addAtEnd(T data) {
        
        System.out.println("Adding Node " + data + " at the end.");
        Node n = new Node(data);
        
        if(this.isEmpty() == true) {
            
            head = n;
            tail = n;
        
        } else {
            
            tail.next = n;
            n.previous = tail;
            tail = n;
        
        }
        
        size++;
        
    }
    
    /**
     * Method that allows us to add an element in a specific index.
     * @param data
     * @param index
     * @return true or false
     */

    public boolean addAt(T data, int index) {
        
        if(index>=size) {
            
            System.out.println("Index is larger than the list size.");
            return false;
        
        } else if(index == size-1) {
            
            this.addAtEnd(data);
            return true;
        
        } else {
            
            System.out.println("Adding node in position no. "+index);
            
            Node n = new Node(data);
       
            Node nextNode = elementAt(index-1).next;

            n.next = nextNode;

            elementAt(index-1).next = n;

            nextNode.previous = n;

            n.previous = elementAt(index-1);
            size++;
            
            return true;
        
        }
        
    }
    
    /**
     * Method that lets us delete the first element of the list.
     */

    public void deleteFromStart(){
        if(this.isEmpty() == true) {
            
            System.out.println("\nThis list is empty.");
        
        } else {
            
            System.out.println("\nDeleting node " + head.data + " from the beginning.");
            head = head.next;
            size--;
        
        }
    }
    
    /**
     * Method that lets us delete the last element of the list.
     */

    public void deleteFromEnd(){
        if(this.isEmpty() == true) {
            
            System.out.println("\nThis list is empty.");
        
        } else if(size == 1) {
            
            deleteFromStart();
        } else {

            String x = tail.data.toString();
            Node prevTail = tail.previous;

            tail = prevTail;
            tail.next=null;
            
            System.out.println("\nDeleting node " + x + " from the end.");
            size--;
        
        }
        
    }
    
    /**
     * Method that lets us get the element in any given index of the list.
     * @param index
     * @return Node at given index
     */

    public Node elementAt(int index) {
        
        if(index>=size) {
            
            throw new ArrayIndexOutOfBoundsException("The index is larger than the array size.");
        
        }
        
        Node n = head;
        
        while(index-1>=0) {
            
            n=n.next;
            index--;
        
        }
        
        return n;
    
    }
    
    /**
     * Method that gets the index of an element in the list.
     * @param t
     * @return index
     */
    
    public int indexOf(T t) {
        
        Node current = head;
        int index = 0;
        
        while(current!=null) {
            if(current.data.toString().equals(t.toString()))
                return index;
            current = current.next;
            index++;
        }
        
        return -1;
    }
    
    /**
    * Method that utilizes a StringBuilder to generate a String that
    * contains all the elements of the list.
    * @return sb.toString
    */

    @Override
    public String toString() {
        
        Node temp = head;
        System.out.print("List elements:");
        StringBuilder sb = new StringBuilder(size*8);
        while(temp!=null) {
            
            sb.append(temp.data.toString());
            temp = temp.next;
        
        }
        
        return sb.toString();
    
    }

    public static void main(String[] args) {
        
        DoublyLinkedList d = new DoublyLinkedList();
        
        d.addAtStart("estas? ");
        d.addAtStart("¿cómo ");
        d.addAtStart("Hola ");
        d.addAt("amigo ", 1);
        d.deleteFromStart();
        d.addAtEnd("espero ");
        d.addAtEnd("que ");
        d.addAtEnd("bien ");
        d.addAtEnd("\n");
        
        System.out.println(d.contains("espero "));
        
        System.out.println(d.elementAt(3).toString());
        
        System.out.println(d.indexOf("estas? "));
        
        
        
        Iterator<String> it = d.iterator();
        
        System.out.println("With iterator class.");
        
        while(it.hasNext()) {
            System.out.print(it.next());
        }
        
        System.out.println("With forEach method.");
        
        Consumer<String> action = (String t) -> {
            System.out.print(t);
        };
        
        d.forEach(action);

    }
}