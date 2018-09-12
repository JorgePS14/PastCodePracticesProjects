package hashtablepractice;

public class HashTablePractice <K, V> {
    
    static class Node<K, V> {
        
        private K k;
        private V v;
        private Node<K, V> next;
        
        public Node(K k, V v, Node next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }
        
    }
    
    private int m;
    private Node<K, V>[] table;
    private int n;
    private static final int INIT_CAPACITY = 11;
    
    public HashTablePractice() {
        this.m = this.INIT_CAPACITY;
        this.table = (Node<K, V>[])new Node[m];
        this.n = 0;
    }
    
    public HashTablePractice(int m) {
        this.table = (Node<K, V>[])new Node[m];
        this.m = m;
        this.n = 0;
    }
    
    private int hash(K k) {
        int x = (int)((k.hashCode()*(Math.random() * (m)))%this.m);
        return x;
    }
    
    public int size() {
        return n;
    }
    
    public boolean isEmpty() {
        return n==0;
    }
    
    public V getValue(K k) {
        if(k == null) {
            throw new NullPointerException("Clave null.");
        }
        
        int i = hash(k);
        
        for(Node<K, V> x = this.table[i]; x != null; x = x.next) {
            if(k.equals(x))
                return x.v;
        }
        
        return null;
    }
    
    public void put(K k, V v) {
        if(k == null || v == null) {
            throw new NullPointerException("Clave o valor nulo.");
        }
        
        int i = hash(k);
        
        for(Node<K, V> x = this.table[i]; x != null; x = x.next) {
            
        }
    }
    
    
    
    public static void main(String[] args) {
        
    }
    
}
