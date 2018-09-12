package hashtabletaller;

import java.util.NoSuchElementException;

public class HashTableTaller<K,V> implements HashTable<K,V>{
    
        /**
         * Declaracion de variables.
         */
        
	private int noElementos = 0;  
	private int size; 
	private Node<K, V>[] hashTable;
	private static final int DEFAULT = 16; 
	private int shift; 
	private int maxSize; 
	
        /**
         * Constructor vacio para la tabla hash
         */
        
	public HashTableTaller(){
		this(DEFAULT);
	}
	
        /**
         * Constructor para la tabla hash.
         * @param size 
         */
        
	public HashTableTaller(int size){
		this.noElementos = 0;
		this.size = size;
		this.hashTable= (Node<K, V>[])new Node[size];
		this.shift = 4;
		this.maxSize = size - 1;
	}
        
        /**
         * Metodo que nos permite saber si un elemento ya se encuentra en la tabla hash.
         * @param key
         * @return 
         */
	
        @Override
	public boolean exists(K key){
		if(isEmpty()){
			throw new NoSuchElementException("Tabla vacia.");
		}
		int h = this.hashFunction(key);
		for(Node<K,V> node = this.hashTable[h]; node!= null; node = node.next){
			if(node.key==key){
				return true;
			}
		}
		return false;
	}
        
        /**
         * Metodo que nos permite conseguir el valor de un elemento en la tabla hash.
         * @param k
         * @return 
         */
        
        @Override
	public V get(K k){
		int h = this.hashFunction(k);
		for(Node<K,V> node = this.hashTable[h]; node!= null; node = node.next){
			if(node.key==k){
				return node.value;
			}
		}
		return null;
	}
        
        /**
         * Metodo que nos permite insertar un nuevo elemento a la tabla hash.
         * @param k
         * @param v 
         */
        
        @Override
	public void insert(K k, V v){
		int h = this.hashFunction(k);
		for(Node<K,V> node = this.hashTable[h]; node!= null; node = node.next){
			if(node.key==k){
				node.value = v;
			}
		}
		Node<K,V> add = new Node<K,V>(k,v,this.hashTable[h]);
		this.hashTable[h] = add;
		this.noElementos++;
		
	}
        
        /**
         * Metodo que nos permite remover un elemento de la tabla hash. 
         * @param key
         * @return 
         */
        
        @Override
	public V remove(K key){
		if(isEmpty()){
			throw new NoSuchElementException("Tabla vacia.");
		}
		int h = this.hashFunction(key);
		Node<K,V> main = this.hashTable[h];
		if(main.key == key){
			V aux = main.value;
			this.hashTable[h] =  main.next; //Cambio de referencias
			this.noElementos--;
			return aux;
		}
		for(Node<K,V> n = main; n.next!= null; n = n.next){ //Se va al siguiente hasta que encuentre un Nodo null
			if(n.key==key){
				V aux = n.next.value;
				n.next = n.next.next;
				this.noElementos--;
				return aux;
			}
		}
		return null;
	}
	
	/**
         * Funcion hash para asignar un lugar a cada nodo en la tabla.
         * @param key
         * @return 
         */
	private int hashFunction(K key){
		final long S = 2654435769L; 
		int k = key.hashCode();
		long r = S * k;
		return (int) ((r >> shift) & maxSize);
	}
        
        /**
         * Metodo que regresa el tamaño de la tabla
         * @return 
         */
	
	public int size(){
		return this.size;
	}
        
        /**
         * Metodo que nos permite saber si la tabla esta vacia.
         * @return 
         */
	
	public boolean isEmpty(){
		return this.noElementos==0;
	}
	
	/**
         * Clase privada Node para implementacion de Quadratic Probing.
         * @param <K>
         * @param <V> 
         */
        
	private class Node<K, V> {
            
                /**
                 * Declaracion de variables.
                 */
            
		private K key;
		private V value;
		private Node<K, V> next;
                
                /**
                 * Constructor para un nodo.
                 * Recibe como parametros una llave, un valor, y un nodo Next.
                 * @param key
                 * @param val
                 * @param next 
                 */
	
		public Node(K key, V val, Node<K, V> next){
			this.key = key;
			this.value = val;
			this.next = next;
		}
	}
        
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < this.size; i++) {
                Node nodo = this.hashTable[i];
                while(nodo != null) {
                    sb.append(nodo.value.toString()).append(", ");
                    nodo = nodo.next;
                }
            }
            
            return sb.toString();
        }
        
        public static void main(String[] args) {
            HashTableTaller htt = new HashTableTaller(21);
            htt.insert(18, "Hola");
            htt.insert(12, 'V');
            htt.insert(73, 17);
            htt.insert(6, 19.21);
            htt.insert(41, "Palabra");
            
            System.out.println(htt.toString());
        }
	
}