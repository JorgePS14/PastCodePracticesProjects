package bst;
//BINARY SEARCH TREE

public class BinarySearchTree <K extends Comparable<K>,V> {

	ABBNode root;

	public BinarySearchTree(){
		this.root = null;
	}
/**
 * True si es arbol vacio, false de lo contrario
 */
	public boolean isEmpty(){
		return this.root == null;
	}
/**
 * Devuelve el valor asociado a key si est� en el �rbol, null de lo contrario.
 * 
 */
	public V get(K key){
		ABBNode node = this.root;
		int result;
		while(node != null){
			result = key.compareTo(node.key);
			if(result == 0)
				return node.value;
			else if(result < 0)
				node = node.left;
			else if(result > 0)
				node = node.right;
		}
		return null;
	}
	/**
	 * Devuelve true si existe la llave key en el ABB, false de lo contrario.
	 * 
	 * 
	 */
	public boolean contains(K key){
		return (this.get(key) == null)?false:true;
	}
	/**
	 * Metodo recursivo que nos devuelve la cantidad de nodos en el arbol.
	 * 
	 */
	public int size(){
		if(this.root == null){
			return 0;
		}
		return this.size(this.root);
	}
	private int size(ABBNode node){
		if(node == null)
			return 0;
		int output = this.size(node.left);
		output += this.size(node.right);
		output += 1;
		return output;
	}
	/**
	 * Ingresa el par key-val al ABB, si la llave existe en el arbol, cambia el valor.
	 */
	public void put(K key, V value){
		ABBNode node = this.root;
		ABBNode temp = null;
		int result = 0;
		while(node != null){
			temp = node;
			result = key.compareTo(node.key);
			if(result == 0)
				break;
			else if(result < 0)	
				node = node.left;
			else if(result > 0) 
				node = node.right;
		}
		if(temp == null)
			this.root = new ABBNode(key,value);
		else if(result == 0)
			temp.value = value;
		else if(result > 0)
			temp.right = new ABBNode(key,value);
		else if(result < 0)
			temp.left = new ABBNode(key,value);
	}
	/**
	 * Version recursiva de put, para agregar un elemento al arbol.
	 */
	public void add(K key,V value){
		if(this.root == null){
			this.root = new ABBNode(key,value);
		}
		else{
			this.add(key, value,this.root);
		}
	}
	private void add(K key,V value,ABBNode node){
		int result = key.compareTo(node.key);
		if(result == 0)
			node.value = value;
		else if(result < 0){
			if(node.left == null){
				node.left = new ABBNode(key,value);
				return;
			}
			this.add(key, value,node.left);
		}
		else if(result > 0){
			if(node.right == null){
				node.right = new ABBNode(key,value);
				return;
			}
			this.add(key, value, node.right);
		}
	}
	/**
	 * Metodo recursivo que nos devuelve un String con los pares K-V que son hojas en el arbol
	 */
	public String hojas(){
		if(this.root == null){
			return "";
		}
		return this.hojas(this.root);
	}
	private String hojas(ABBNode node){
		if(node == null){
			return "";
		}
		String output = this.hojas(node.left);
		if(node.left == null && node.right == null){
			output += "[" + node.key.toString() +","+ node.value.toString()+"]";
			
		}
		output += this.hojas(node.right);
		return output;
	}
	/**
	 * Metodo recursivo que nos devuelve el numero de hojas del arbol
	 * 
	 */

	public int cuantasHojas(){
		if(this.root == null){
			return 0;
		}
		return this.cuantasHojas(this.root);
	}
	private int cuantasHojas(ABBNode node){
		if(node == null){
			return 0;
		}
		int output = this.cuantasHojas(node.left);
		if(node.left == null && node.right == null){
			output += 1;
		}
		output += this.cuantasHojas(node.right);
		return output;
	}
	/**
	 * Metodo recursivo que nos devuelve todos los pares K-V cuya clave es mayor a k
	 */
	public String mayoresA(K key){
		if(this.root == null){
			return "";
		}
		return this.mayoresA(key, this.root);
	}
	private String mayoresA(K key, ABBNode node){
		if(node == null)
			return "";
		String output = this.mayoresA(key,node.left);
		output += this.mayoresA(key,node.right);
		if(node.key.compareTo(key) > 0)
			output += "[" + node.key.toString() +","+ node.value.toString()+"]";
		return output;
	}
	/**
	 * Metodo recursivo que devuelve un String con el recorrido inOrder del arbol
	 */
	public String inOrder(){
		if(root != null){
			return this.inOrder(root);
		}
		return "";
	}
	private String inOrder(ABBNode node){
		if(node == null)
			return "";
		String output = this.inOrder(node.left);
		output += "[" + node.key.toString() +","+ node.value.toString()+"]";
		output += this.inOrder(node.right);
		return output;
	}
	/**
	 * Metodo recursivo que devuelve un String con el recorrido preOrden del arbol.
	 */
	public String preOrden(){
		if(this.root != null){
			return this.preOrden(this.root);
		}
		return "";
	}
	private String preOrden(ABBNode node){
		if(node == null)
			return "";
		String output = "[" + node.key.toString() +","+ node.value.toString()+"]";
		output += this.preOrden(node.left);
		output += this.preOrden(node.right);
		return output;
	}
	/**
	 * Metodo recursivo que devuelve un String con el recorrido postOrden del arbol.
	 */
	public String postOrden(){
		if(this.root != null){
			return this.postOrden(this.root);
		}
		return "";
	}
	private String postOrden(ABBNode node){
		if(node == null)
			return "";
		String output = this.postOrden(node.left);
		output += this.postOrden(node.right);
		output += "[" + node.key.toString() +","+ node.value.toString()+"]";
		return output;
	}
	/**
	 * Returns the altura of the tree (the further-most path from root to a leaf).
	 * @return The altura of the tree.
	 */
	public int altura(){
		if(this.root == null){
			return 0;
		}
		return altura(this.root, 0);
	}
	/**
	 * Metodo recursivo que nos devuelve la altura del arbol
	 */
	public int altura(ABBNode node){
		if(node == null){
			return 0;
		}
		return altura(node,0);
	}
	private int altura(ABBNode node, int i){
		if(node != null){
			i++;
			int alturaL = altura(node.left, i);
			int alturaR = altura(node.right, i);
			return Math.max(alturaL, alturaR);
		}
		return i;
	}
	/**
	 * M�todo recursivo que nos indica los pares K-V que se encuentran en el nivel n del �rbol.
	 */
	public String cualesPorNivel(int n){
		if(this.root == null){
			return "";
		}
		return cualesPorNivel(n,this.root , 0);
	}
	private String cualesPorNivel(int theLevel, ABBNode node, int n){
		if(node == null){
			return "";
		}
		n++;
		String output = this.cualesPorNivel(theLevel,node.left,n);
		output += this.cualesPorNivel(theLevel,node.right,n);
		if(n == theLevel)
			output += "[" + node.key.toString() +","+ node.value.toString()+"]";
		return output;
	}
	/**
	 * Metodo recursivo que devuelve un String con contenido (pares K-V) en orden descendente del �rbol
	 * (de acuerdo a las llaves)
	 */
	public String descendente(){
		if(root != null){
			return this.descendente(this.root);
		}
		return "";
	}
	private String descendente(ABBNode node){
		if(node == null)
			return "";
		String output = this.descendente(node.right);
		output += "[" + node.key.toString() +","+ node.value.toString()+"]";
		output += this.descendente(node.left);
		return output;
	}
	/**
	 * Devuelve un String con el recorrido por niveles del �rbol, hace uso de una estructura FIFO.
	 */
	public String levelOrderQ(){
		Queue<String> q = new Queue<String>();
		if(this.root == null){
			return "";
		}
		String output = "";
		int h = this.altura(this.root,0);
		for(int i = 1; i < h+1; i++){
			q.enqueue(this.cualesPorNivel(i));
		}
		while(!q.isEmpty()){
			output += q.dequeue();
		}
		return output;
	}

	
	public ABBNode sucesor(ABBNode nodo) {
		ABBNode actual, anterior;
		if(nodo.right == null && nodo.left == null) {
			nodo = null;	
		}else if(nodo.right == null) {
			nodo = nodo.left;
		}else if(nodo.left == null) {
			nodo = nodo.right;
		}else {
			actual = nodo.right;
			anterior = null;

			while(actual.left	 != null) {
				anterior = actual;
				actual = actual.left;
			}
			nodo.value = actual.value;
			if(anterior == null) {
				nodo.right = actual.right;
			}else {
				anterior.left = actual.right;
			}
		}

		return nodo;
	}
	/**
	 *Remueve la clave key del ABB y devuelve el valor asociado. Si no se encuentra la llave devuelve True.
	 */
	public boolean remove(K key) {
		ABBNode actual = null, anterior = null;
		boolean encontrado = false;
		if(isEmpty()) {
			return false;
		}else {
			actual = this.root;
			anterior = this.root;
			while(actual != null && !encontrado) {
				if(actual.key.equals(key)) {
					encontrado = true;
				}else {
					anterior = actual;
					if(actual.key.compareTo(key)>0) {
						actual = actual.left;
					}else {
						actual = actual.right;
					}
				}
			}
		}
		if(actual == null) {
			return true;
		}else if(encontrado){
			if(actual == this.root) {
				this.root = sucesor(this.root);
			}else if(anterior.key.compareTo(key)>0) {
				anterior.left = sucesor(actual);
			}else {
				anterior.right = sucesor(actual);
			}
		}
		return false;
	}

/**
 *  Clase inner ABBNode indica los nodos del arbol
 */
	private class ABBNode{
		protected K key;
		protected V value;
		ABBNode left, 
		right;
		
		protected ABBNode(K key, V value){
			this.key = key;
			this.value = value;
		}
	}
}