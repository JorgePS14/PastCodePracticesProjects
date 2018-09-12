package bst;
//QUEUE
import java.util.NoSuchElementException;

public class Queue<T> {
	private T[] element;
	public int size;
	private int defaultCap = 5;
	private int front;
	private int rear;

	Queue(){
		this.element = (T[]) new Object[this.defaultCap];
		this.size = 0;
		this.front = 0;
		this.rear = 0;
	}

	
	public Queue(int c){
		this.element = (T[]) new Object[c];
		this.size = 0;
		this.front = 0;
		this.rear = 0;
	}

	
	private void duplica(){
		int sizeG = this.size;
		T[] newArray = (T[]) new Object[this.element.length*2];
		for(int i = 0; i < this.element.length ; i++){
			newArray[i] = this.dequeue();
		}
		this.front = 0;
		this.rear = this.element.length;
		this.element = newArray;
		this.size = sizeG;
	}

	
	boolean isEmpty(){
		return (this.size == 0);
	}

	
	public T dequeue(){
		if(this.isEmpty()){
			throw new NoSuchElementException("No elements in Queue");
		}
		T toReturn = this.element[this.front];
		this.element[this.front] = null;
		this.front = (this.front+1) % this.element.length;
		this.size--;
		return toReturn;
	}

	
	public void enqueue(T item){
		if(this.size == this.element.length){
			this.duplica();
		}
		this.element[this.rear] = item;
		this.rear = (this.rear+1)%this.element.length;
		this.size = this.size + 1;
	}

	
	public T front(){
		if(this.isEmpty()){
			throw new NoSuchElementException("Empty");
		}
		return this.element[this.front];
	}

	
	public T rear(){
		if(this.isEmpty()){
			throw new NoSuchElementException("Empty");
		}
		return this.element[this.rear];
	}
	
}