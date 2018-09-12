package queuelinkedlist;

public class LinkListQueue {

    QueueLinkedList newLinkList = new QueueLinkedList();

    public <T> void enqueue(T data) {
        newLinkList.addLast(data);
    }

    public void dequeue() {
        if(!newLinkList.isEmpty())
            newLinkList.removeFirst();

    }

    public void displayQueue() {
        newLinkList.displayList();
        System.out.println();
    }

    public boolean isEmpty(){
        return newLinkList.isEmpty();
    }

}