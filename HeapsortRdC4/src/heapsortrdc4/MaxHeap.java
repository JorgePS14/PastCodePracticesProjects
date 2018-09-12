package heapsortrdc4;

import java.util.ArrayList;

public class MaxHeap {
    
    private Clothes[] heap;
    private int size;
    private int maxHeapSize;
 
    private static final int TOP = 1;
    
    /**
    Constructor for a MaxHeap that takes a size and an ArrayList which it will convert to a heap
     */
 
    public MaxHeap(int maxsize, ArrayList<Clothes> clothesDeposit) {
        
        this.maxHeapSize = maxsize;
        this.size = 0;
        this.heap = new Clothes[this.maxHeapSize+1];
        
        for(int i = 0; i < this.maxHeapSize; i++) {
            this.insert(clothesDeposit.get(i));
        }
    }
    
    /**
    Returns the parent of any element in the heap.
     */
 
    private int parent(int pos) {
        
        return pos / 2;
    }
    
    /**
    Returns the left child of any element in the heap.
     */
 
    private int leftChild(int pos) {
        
        return (2 * pos);
    }
    
    /**
    Returns the right child of any element in the heap.
     */
 
    private int rightChild(int pos) {
        
        return (2 * pos) + 1;
    }
    
    /**
    Method to swap two elements of the heap.
     */
 
    private void swap(int pos1, int pos2) {
        
        Clothes tmp;
        tmp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = tmp;
    }
    
    /**
    Method that allows us to maintain the MaxHeap property.
     */
 
    private void maxHeapify(int pos) {
        
        int l = this.leftChild(pos);
        int r = this.rightChild(pos);
        int largest = 0;
        
        if(l <= this.getSize() && this.heap[l].getPrice() > this.heap[pos].getPrice())
            largest = l;
        else 
            largest = pos;
        
        if(r <= this.getSize() && this.heap[r].getPrice() > this.heap[largest].getPrice())
            largest = r;
        
        if(largest != pos) {
            this.swap(pos, largest);
            this.maxHeapify(largest);
        }
    }
    
    /**
    Method to insert an element into the heap. 
    Automatically rearranges the heap to maintain the property.
     */
 
    public void insert(Clothes item) {
        
        size++;
        heap[getSize()] = item;
        int current = getSize();
            
        while (current != 1 && this.heap[current].getPrice() > this.heap[parent(current)].getPrice()) {

            this.swap(current,parent(current));
            current = this.parent(current);
        }
    }
 
    /**
    Method to print the whole heap.
    Primarily used to debug the program.
     */
    
    public void print() {
        
        for (int i = 1; i <= getSize() / 2; i++ ) {
            
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2*i] 
                + " RIGHT CHILD :" + heap[2 * i  + 1]);
            System.out.println();
        } 
    }
    
    /**
    Method that allows us to build a maxHheap out of any normal array.
     */
 
    public void maxHeap() {

        for (int pos = (getSize() / 2); pos >= 1 ; pos--) {
            
            maxHeapify(pos);
        }
    }
    
    /**
    Method that takes out the max element in the heap and rearranges the array to maintain the MaxHeap property.
     */
 
    public Clothes extractMax() {
        
        Clothes pop = heap[TOP];
        heap[TOP] = heap[size--]; 
        this.maxHeapify(TOP);
        return pop;
    }
    
    /**
    Method to get the size of the heap.
     */

    public int getSize() {
        return size;
    }
    
}