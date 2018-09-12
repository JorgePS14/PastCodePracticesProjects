package doublylinkedlist;

import java.util.*;
import java.util.function.Consumer;

public class IterableArray implements Iterable<Integer>{
    
    private int data[];
    
    public IterableArray(int data[]) {
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIterator(this.data);
    }
    
    private static class ArrayIterator implements Iterator<Integer> {
        
        private int pos, data[];
        
        public ArrayIterator(int data[]) {
            this.pos = 0;
            this.data = data;
        }

        @Override
        public boolean hasNext() {
            return pos<this.data.length;
        }

        @Override
        public Integer next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[pos++];
        }
        
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        while(this.iterator().hasNext() == true) {
            this.iterator().next();
        }
    }
    
    private static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20};
        IterableArray iterTable = new IterableArray(arr);
        Iterator<Integer> it = iterTable.iterator();
        
        
    }
    
}
