package stackarray;

public class StackArray {
 int size;
 int arr[];
 int top;
 
 StackArray(int size) {
  this.size = size;
  this.arr = new int[size];
  this.top = -1;
 }
 
 public void push(int pushedElement) {
  if (!isFull()) {
   top++;
   arr[top] = pushedElement;
   System.out.println("Pushed element:" + pushedElement);
  } else {
   System.out.println("Stack is full !");
  }
 }
 
 public int pop() {
  if (!isEmpty()) {
   int returnedTop = top;
   top--;
   System.out.println("Popped element :" + arr[returnedTop]);
   return arr[returnedTop];
 
  } else {
   System.out.println("Stack is empty !");
   return -1;
  }
 }
 
 public int peek() {
  return arr[top];
 }
 
 public boolean isEmpty() {
  return (top == -1);
 }
 
 public boolean isFull() {
  return (size - 1 == top);
 }
 
 public static void main(String[] args) {
  StackArray stackarray = new StackArray(10);
  stackarray.pop();
  System.out.println("=================");
  stackarray.push(10);
  stackarray.push(30);
  stackarray.push(50);
  stackarray.push(40);
  System.out.println("=================");
  stackarray.pop();
  stackarray.pop();
  stackarray.pop();
  System.out.println("=================");
 }
}