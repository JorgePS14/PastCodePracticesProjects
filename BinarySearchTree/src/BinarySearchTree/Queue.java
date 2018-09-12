package BinarySearchTree;

import java.util.NoSuchElementException;

public class Queue<V> {
	private V[] elementArray;
	public int size;
	private int dCap = 5;
	private int head;
	private int tail;

	Queue(){
		this.elementArray = (V[])new Object[this.dCap];
		this.size = 0;
		this.head = 0;
		this.tail = 0;
	}

	
	public Queue(int maxSize){
		this.elementArray = (V[]) new Object[maxSize];
		this.size = 0;
		this.head = 0;
		this.tail = 0;
	}

	
	private void duplicate(){
		int sizeG = this.size;
		V[] array = (V[]) new Object[this.elementArray.length*2];
		for(int i = 0; i < this.elementArray.length ; i++){
			array[i] = this.dequeue();
		}
		this.head = 0;
		this.tail = this.elementArray.length;
		this.elementArray = array;
		this.size = sizeG;
	}

	
	boolean isEmpty(){
		return (this.size == 0);
	}

	
	public V dequeue(){
		if(this.isEmpty()){
			throw new NoSuchElementException("No elements in Queue");
		}
		V toReturn = this.elementArray[this.head];
		this.elementArray[this.head] = null;
		this.head = (this.head+1) % this.elementArray.length;
		this.size--;
		return toReturn;
	}

	
	public void enqueue(V item){
		if(this.size == this.elementArray.length){
			this.duplicate();
		}
		this.elementArray[this.tail] = item;
		this.tail = (this.tail+1)%this.elementArray.length;
		this.size = this.size + 1;
	}

	
	public V getHead(){
		if(this.isEmpty()){
			throw new NoSuchElementException("Empty");
		}
		return this.elementArray[this.head];
	}

	
	public V getTail(){
		if(this.isEmpty()){
			throw new NoSuchElementException("Empty");
		}
		return this.elementArray[this.tail];
	}
	
}