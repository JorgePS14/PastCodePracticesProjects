package hashtabletaller;

public interface HashTable<K,V>{
	public boolean exists(K key);
	public V get(K key);
	public void insert(K key, V value);
	public V remove(K key);
}