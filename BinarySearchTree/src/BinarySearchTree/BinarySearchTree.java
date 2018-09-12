package BinarySearchTree;

/**
 * BinarySearchTree class.
 * Made for the Data Structures workshop.
 * 
 * @param <K>
 * @param <V>
 */
public class BinarySearchTree <K extends Comparable<K>, V>{
	
	/**
	 * Variable declaration.
	 */

	private ABBNode root, foundNode;

	/**
	 * Method that checks if the binary search tree is empty or not.
	 * 
	 * @return
	 */
	
	public boolean isEmpty() {
		return this.root == null;
	}

	/**
	 * If the given key is in the tree, this method will return the value associated to it.
	 * Otherwise, it will return a null value.
	 * 
	 * @param key
	 * @return
	 */
	
	public V get(K key) {
		if(this.root.key.equals(key)) {
			return this.root.value;
		}
		if(contains(key)) {
			return this.foundNode.value;
		}
		return null;
	}

	/**
	 * Add method which calls for the recursive version of the same method.
	 * 
	 * @param key
	 * @param value
	 * @param node
	 */
	
	public void add(K key, V value) {
		if(isEmpty()) {
			this.root = new ABBNode(key, value);
		}else {
			add(key, value, this.root);
		}
	}
	
	/**
	 * Recursive version of the add method.
	 * First it creates a new node, it then verifies the value of the given key, and finds its place in the BST afterwards.
	 * 
	 * @param key
	 * @param value
	 */
	
	public void add(K key, V value, ABBNode node) {
		
		if(key.compareTo(node.key) > 0) {
			if(node.right != null) {
				add(key, value, node.right);
			}else {
				node.right = new ABBNode(key, value);
			}
		}else if(key.compareTo(node.key) < 0) {
			if(node.left != null) {
				add(key, value, node.left);
			}else {
				node.left = new ABBNode(key, value);
			}
		}else {
			node = new ABBNode(key, value);
		}
	}

	/**
	 * This method prints out the inOrder version of the BST.
	 * 
	 * @return
	 */
	
	public String inOrder(){
		if(this.root != null) {
			return inOrder(this.root);
		}else {
			return "";
		}
	}

	/**
	 * Recursive version of the inOrder method.
	 * This method goes through all the elements in the binary tree in inOrder and returns a string with all the elements.
	 * 
	 * @param node
	 * @return
	 */
	
	public String inOrder(ABBNode node) {
		String salida = "";
		if(node.left != null) {
			salida += inOrder(node.left) + " ";
		}
		salida += node;
		if(node.right != null) {
			salida += " " +inOrder(node.right);
		}
		return salida;
	}

	/**
	 * This method prints out the preOrder version of the BST.
	 * 
	 * @param node
	 * @return
	 */
	
	public String preOrder() {
		if(this.root != null) {
			return preOrder(this.root);
		}else {
			return "";
		}
	}
	
	/**
	 * Recursive version of the preOrder method.
	 * This method goes through all the elements in the binary tree in preOrder and returns a string with all the elements.
	 * 
	 * @return
	 */
	
	public String preOrder(ABBNode node) {
		String salida = "" + node;
		if(node.left != null) {
			salida += " " + preOrder(node.left);
		}
		if(node.right != null) {
			salida += " " + preOrder(node.right);
		}
		return salida;
	}

	/**
	 * This method prints out the postOrder version of the BST.
	 * 
	 * @return
	 */
	
	public String postOrder() {
		if(this.root != null) {
			return postOrder(this.root);
		}else {
			return "";
		}
	}

	/**
	 * Recursive version of the postOrder method.
	 * This method goes through all the elements in the binary tree in postOrder and returns a string with all the elements.
	 * 
	 * @param node
	 * @return
	 */
	
	public String postOrder(ABBNode node) {
		String cadena = "";
		if(node.left != null) {
			cadena += " " + postOrder(node.left);
		}
		if(node.right != null) {
			cadena += " " + postOrder(node.right);
		}
		cadena += node;
		return cadena;
	}
	
	/**
	 * Method that returns the node values by levels.
	 * 
	 * @return
	 */
	
	public String levelOrderQ(){
		Queue<String> q = new Queue<String>();
		if(this.root == null){
			return "";
		}
		String output = "";
		int h = this.getHeight(this.root);
		for(int i = 1; i < h+1; i++){
			q.enqueue(this.levelValues(i));
		}
		while(!q.isEmpty()){
			output += q.dequeue();
		}
		return output;
	}

	/**
	 * This method returns a boolean value to know if a key is already in the BST.
	 * It will return true if the key is already associated to a value in the tree. False otherwise.
	 * 
	 * @param key
	 * @return
	 */
	
	public boolean contains(K key) {
		if(this.root != null) {
			if(this.root.key.equals(key)){
				return true;
			}
			return contains(key, this.root);
		}
		return false;
	}

	/**
	 * Recursive version of the contains method.
	 * This method goes through the tree to tell whether a given key is already in the BST or not.
	 * It will return true if the key is already associated to a value in the tree. False otherwise.
	 * 
	 * 
	 * @param key
	 * @param node
	 * @return
	 */
	
	public boolean contains(K key, ABBNode node) {
		boolean find = false;
		
		while (node != null && !find) {
			K tmp = node.key;
			if(key.compareTo(tmp) < 0) {
				node = node.left;
			} else if(key.compareTo(tmp) > 0) {
				node = node.right;
			} else {
				find = true;
				this.foundNode = node;
				break;
			}
		}
		
		return find;
	}

	/**
	 * This method counts the number of leaves in the tree and returns said value.
	 * 
	 * @return
	 */
	
	public int countLeaves() {
		if(this.root != null) {
			return countLeaves(this.root);
		}
		return 0;
	}

	/**
	 * Recursive version of the countLeaves method.
	 * This method gets the number of leaves of the tree and returns said value.
	 * 
	 * @param node
	 * @return
	 */
	
	public int countLeaves(ABBNode node) {
		int cont = 0;
		if(node.left != null) {
			if(node.left.left == null && node.left.right == null) {
				cont++;
			}
			cont += countLeaves(node.left);
		}
		if(node.right != null) {
			if(node.right.left == null && node.right.right == null) {
				cont++;
			}
			cont += countLeaves(node.right);
		}
		return cont;
	}

	/**
	 * Method that gets all the key-value pairs of all leaves in the BST and returns them in the form of a String.
	 * 
	 * @return
	 */
	
	public String getLeaves() {
		if(this.root != null) {
			return getLeaves(this.root);
		}
		return "";
	}

	/**
	 * Recursive version of the getLeaves method.
	 * This method gets all the key-value pairs of all leaves in the BST and returns them in the form of a String.
	 * 
	 * @param node
	 * @return
	 */
	
	public String getLeaves(ABBNode node) {
		String leaves = "";
		if(node.left != null) {
			if(node.left.left == null && node.left.right == null) {
				leaves += node.left;
			}
			leaves += getLeaves(node.left);
		}
		if(node.right != null) {
			if(node.right.left == null && node.right.right == null) {
				leaves += node.right;
			}
			leaves += getLeaves(node.right);
		}

		return leaves;
	}
	
	/**
	 * This method prints out the BST in descendant order.
	 * 
	 * @return
	 */

	public String descendant() {
		if (this.root!=null) {
			return descendant(this.root);
		}
		else
			return "";
	}
	
	/**
	 * Recursive version of the descendant method.
	 * This method prints out the BST in descendant order.
	 * 
	 * @param node
	 * @return
	 */
	
	public String descendant(ABBNode node) {
		String output = "";
		
		if(node.right!=null) {
			output  += descendant(node.right) + "";
		}
		
		output +=node.toString();
		
		if(node.left!=null) {
			output  += "" + descendant(node.left);
		}
		return output ;
	}
	
	/**
	 * Method that returns which key-value pairs are found in a given level of the BST.
	 * 
	 * @param level
	 * @return
	 */
	public String levelValues(int level) {
		if(this.root != null) {
			if(getHeight() + 1 == 1) {
				return this.root + "";
			}
			return levelValues(level);
		}
		return "";
	}
	
	/**
	 * Recursive version of the levelValues method.
	 * Method that returns which key-value pairs are found in a given level of the BST.
	 * 
	 * @param node
	 * @param level
	 * @return
	 */
	
	public String levelValues(ABBNode node, int level) {
		if(node==null) {
			return "";
		}
		if(level==1) {
			return node.value+"";
		}
		return levelValues(node.left, level-1)+levelValues(node.right, level-1);
	}
	
	/**
	 * Method that returns all the key-value pairs whose key is greater than a given key.
	 * 
	 * @param key
	 * @return
	 */
	
	public String greaterThan(K key) {
		if(this.root != null) {
			if(this.root.key.compareTo(key) > 0) {
				return this.root + greaterThan(key, this.root);
			}else {
				return greaterThan(key, this.root);
			}
		}
		return "";
	}

	/**
	 * Recursive version of the greaterThan method
	 * Method that returns all the key-value pairs whose key is greater than a given key.
	 * 
	 * @param key
	 * @param nodo
	 * @return
	 */
	
	public String greaterThan(K key, ABBNode nodo) {
		String cadena = "";

		if(nodo.left != null) {
			if(nodo.left.key.compareTo(key) > 0) {
				cadena += nodo.left;
			}
			cadena += greaterThan(key, nodo.left);
		}
		if(nodo.right != null) {
			if(nodo.right.key.compareTo(key) > 0) {
				cadena += nodo.right;
			}
			cadena += greaterThan(key, nodo.right);
		}
		return cadena;
	}

	/**
	 * Method that returns the number of nodes in the BST.
	 * 
	 * @return
	 */
	
	public int size() {
		if(this.root != null) {
			return size(this.root);
		}
		return 0;
	}

	/**
	 * Recursive version of the size method.
	 * Method that returns the number of nodes in the BST.
	 * 
	 * @param node
	 * @return
	 */
	public int size(ABBNode node) {
		int cont = 1;
		if(node.left != null) {
			cont += size(node.left);
		}
		if(node.right != null) {
			cont += size(node.right);
		}

		return cont;
	}

	/**
	 * Method that adds a new node to the BST.
	 * This method searches for the position that this new node should go in.
	 * In case the key of this new node already exists in the BST, this new node will take its place.
	 * 
	 * @param key
	 * @param value
	 */
	
	public void put(K key, V value) {
		ABBNode nodo = this.root;
		ABBNode tmp = null;
		int comp;

		while(nodo != null) {
			tmp = nodo;
			comp = key.compareTo(nodo.key);
			if(comp < 0) {
				nodo = nodo.left;
			}else if(comp > 0) {
				nodo = nodo.right;
			}else {
				nodo.value = value;
				return;
			}
		}

		if(tmp == null) {
			this.root = new ABBNode(key, value);
		}else {
			if(key.compareTo(tmp.key) > 0) {
				tmp.right = new ABBNode(key, value);
			}else {
				tmp.left = new ABBNode(key, value);
			}
		}
	}
	
	/**
	 * This method gets the successor of a given node.
	 * 
	 * @param node
	 * @return
	 */

	public ABBNode getSuccessor(ABBNode node) {
		ABBNode actual, anterior;
		if(node.right == null && node.left == null) {
			node = null;	
		}else if(node.right == null) {
			node = node.left;
		}else if(node.left == null) {
			node = node.right;
		}else {
			actual = node.right;
			anterior = null;

			while(actual.left	 != null) {
				anterior = actual;
				actual = actual.left;
			}
			node.value = actual.value;
			if(anterior == null) {
				node.right = actual.right;
			}else {
				anterior.left = actual.right;
			}
		}

		return node;
	}

	/**
	 * This method removes the node in the tree that contains a given key.
	 * In case the given key is found and removed, its value will be printed.
	 * 
	 * @param key
	 * @return
	 */
	public boolean remove(K key) {
		ABBNode actual = null,
				anterior = null;
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
				this.root= getSuccessor(this.root);
			}else if(anterior.key.compareTo(key)>0) {
				anterior.left = getSuccessor(actual);
			}else {
				anterior.right = getSuccessor(actual);
			}
		}
		return false;
	}

	/**
	 * This method returns the height of the BST.
	 * 
	 * @return
	 */
	
	public int getHeight() {
		if(this.root != null) {
			return getHeight(this.root) -1;
		}
		return -1;
	}

	/**
	 * Recursive version of the getHeight method.
	 * This method returns the height of the BST.
	 * 
	 * @param node
	 * @return
	 */
	public int getHeight(ABBNode node) {
		int laltura = 0,
			raltura = 0;
		
		if(node.left != null) {
			laltura = getHeight(node.left);
			System.out.print(node.left);
		}
		if(node.right != null) {
			raltura = getHeight(node.right);
			System.out.print(node.right);
		}
		
		
		if (laltura > raltura) {
			return laltura + 1;
		} else {
			return raltura + 1;
		}
	}

	
	/**
	 * Private Node class.
	 */
	
	private class ABBNode{
		
		/**
		 * Variable declaration.
		 */
		
		K key;
		V value;
		ABBNode left, right;
		
		/**
		 * Constructor for an ABBNode.
		 * 
		 * @param key
		 * @param value
		 */

		public ABBNode(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		/**
		 * This method returns the key and value of a node in the form of a String.
		 */

		public String toString() {
			return "[" + this.key + " - " + this.value + "]";
		}
	}

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree<>();
		
		bst.add(10, "Jorge");
		bst.add(8 ,"Andrés");
		bst.add(16, "Diego");
		bst.add(9, "David");
		bst.add( 7, "Luis");
		bst.add( 20, "Mario");
		bst.add( 15, "Eduardo");
		bst.add(14, "Victoria");
		bst.add(13, "Eugenio");
		bst.add(6, "Braulio");
		
		System.out.println("inOrder: " + bst.inOrder());
		
		System.out.println("preOrder: " + bst.preOrder());
		
		System.out.println("postOrder: " + bst.postOrder());
		
		System.out.println("Contains 14: " + bst.contains(14));
		
		System.out.println("Contains 12: " + bst.contains(12));
		
		System.out.println("No. of leaves: " + bst.countLeaves());
		
		System.out.println("Leaves: " + bst.getLeaves());
		
		System.out.println("Tree size: " + bst.size());
		
		System.out.println("Tree height: " + bst.getHeight());
		
		System.out.println("Values greater than 7: " + bst.greaterThan(7));
		
		System.out.println("Getting 15: " + bst.get(15));
		
		System.out.println("Descendant: " + bst.descendant());
		
		System.out.println("Removing 7: " + bst.remove(7));
		
		System.out.println("Removing 35: " + bst.remove(35));
		
		System.out.println("BST in order after modifications: " + bst.inOrder());
		
		System.out.println("No. of leaves after modifications: " + bst.countLeaves());
		
		System.out.println("Leaves after modifications: " + bst.getLeaves());
	}
}
