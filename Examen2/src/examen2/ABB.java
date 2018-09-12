package examen2;

import java.util.Scanner;

public class ABB <K extends Comparable<K>, V> {
    
    private ABBNode root;
    
    public ABB() {
        
    }
    
    public boolean isEmpty() {
        return this.root == null;
    }
    
    public void add(K key, V val) {
        if(isEmpty()) {
            this.root = new ABBNode(key, val);
        } else {
            add(key, val, this.root);
        }
    }
    
    public void add(K key, V val, ABBNode n) {
        if(n.key.compareTo(key) < 0) {
            if(n.right == null) {
                n.right = new ABBNode(key, val);
            } else
                add(key, val, n.right);
        } else if(n.key.compareTo(key) > 0) {
            if(n.left == null) {
                n.left = new ABBNode(key, val);
            } else
                add(key, val, n.left);
        } else
            n = new ABBNode(key, val);
    }
    
    public void printInorder(){
        printInOrderRec(root);
        System.out.println("");
    }
    
    private void printInOrderRec(ABBNode currRoot){
        if ( currRoot == null ){
          return;
        }
        
        printInOrderRec(currRoot.left);
        System.out.print(currRoot.val.toString());
        printInOrderRec(currRoot.right);
    }
    
    public void printPreorder(){
        StringBuilder sb = new StringBuilder();
        printPreorderRec(root, sb);
        System.out.println("");
    }
    
    private String printPreorderRec(ABBNode currRoot, StringBuilder sb){
        if ( currRoot == null ){
          return "";
        }
        
        
        sb.append(", ");
        printPreorderRec(currRoot.left, sb);
        printPreorderRec(currRoot.right, sb);
        return sb.append(currRoot.val.toString()+", ").toString();
    }
    
    public String printPostorder(){
        StringBuilder sb = new StringBuilder();
        return printPostorderRec(root, sb);
        //System.out.println("");
    }
    
    private String printPostorderRec(ABBNode currRoot, StringBuilder sb){
        if ( currRoot == null ){
          return "";
        }
        
        printPostorderRec(currRoot.left, sb);
        printPostorderRec(currRoot.right, sb);
        sb.append(", ");
        return sb.append(currRoot.val.toString()+", ").toString();
        //System.out.print(currRoot.val.toString()+", ");
        
    }

    private class ABBNode {
        
        K key;
        V val;
        ABBNode left, right;
        
        public ABBNode(K key, V val) {
            this.key = key;
            this.val = val;
        }
        
        @Override
        public String toString() {
            return "[" + key + "-" + val + "]";
        }
    }
    
    public static void main(String[] args) {
        ABB abb = new ABB();
        Scanner r = new Scanner(System.in);
        String select = "";
        String operandtemp = "";
        double operand;
        String operator;
        int i = 1;
        
        while(!select.equals("n")) {
            
            System.out.println("Inserte un numero");
            operandtemp = r.nextLine();
            System.out.println("Inserte el operador");
            operator = r.nextLine();
            
            operand = Double.parseDouble(operandtemp);
            
            abb.add(i+1, operator);
            abb.add(i, operand);
            
            System.out.println("Inserte un numero");
            operandtemp = r.nextLine();
            
            operand = Double.parseDouble(operandtemp);
            
            abb.add(i+2, operand);
            
            System.out.println("Desea seguir ingresando numeros? [y for yes, n for no]");
            select = r.nextLine();
            
            i = i+3;
            
        }
        
        String[] stack = new String[i];
        
        for(int j = 0; j<i; j++) {
            stack[j] = r.nextLine();
            abb.printInorder();
        }
        
        
    }
    
}