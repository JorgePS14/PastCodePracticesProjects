package avltrees.rdc5;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class AVLTree {
        
    private Node root;
    
    private static final int MAX_IMBALANCE = 1;

    public AVLTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root==null; 
    }
    
    public boolean contains(String key) {
        return contains(this.root, key);
    }
    
    public boolean contains(Node n, String key) {
        boolean found = false;
        
        while((n != null) && !found) {
            Subject tmp = n.subject;
            if(key.compareTo(tmp.getId()) < 0)
                n = n.getLeft();
            else if(key.compareTo(tmp.getId()) > 0)
                n = n.getRight();
            else {
                found = true;
                break;
            }
            found = contains(n, key);
        }
        
        return found;    
    }
    
    public Subject find(String key) {
        return find(this.root, key);
    }
    
    public Subject find(Node n, String key) {
        Subject found = null;
        
        while(n!=null) {
            Subject tmp = n.subject;
            if(key.compareTo(tmp.getId()) < 0)
                n = n.getLeft();
            else if(key.compareTo(tmp.getId()) > 0)
                n = n.getRight();
            else  {
                found = tmp;
                break;
            }
        }
        
        return found;
    }
    
    public void insert(Subject elem) {
        this.root = insert(elem, this.root);
    }

    private Node insert(Subject elem, Node n) {
        if(n==null) {
            return new Node(elem);
        }
        
        if(contains(n, elem.getId()) == true)
            return null;
        
        int compare = elem.compareTo(n.subject);
        
        if(compare < 0){
            n.left = insert(elem, n.getLeft());
        }
        else if(compare > 0){
            n.right = insert(elem, n.getRight());
        }
        else{

        }
        return balance(n);
    }

    private int getMax(int left, int right) {
        if(left > right){
            return left;
        }
        return right;
    }

    private int getHeight(Node n) {
        if(n == null){
            return 0;
        }
        return n.height;
    }

    private Node balance(Node n) {
        if(n==null){
            return n;
        }

        if(getHeight(n.getLeft()) - getHeight(n.getRight()) > MAX_IMBALANCE){
            if(getHeight(n.getLeft().getLeft()) >= getHeight(n.getLeft().getRight())){
                    n = leftRotation(n);
            }
            else{
                    n = doubleLeftRotation(n);
            }
        }

        else if(getHeight(n.getRight()) - getHeight(n.getLeft()) > MAX_IMBALANCE){
            if(getHeight(n.getRight().getRight()) >= getHeight(n.getRight().getLeft())){
                n = rightRotation(n);
            }
            else{
                n = doubleRightRotation(n);
            }
        }

        n.height = getMax(getHeight(n.getLeft()),getHeight(n.getRight()))+1;
        return n;
    }

    private Node leftRotation(Node a) {
        Node b = a.getLeft();
        a.left = b.getRight();
        b.right = a;
        a.height = getMax( getHeight(a.getLeft()), getHeight(a.getRight()) ) + 1;
        b.height = getMax( getHeight(b.getLeft()), a.height ) + 1;
        return b;
    }

    private Node rightRotation(Node a) {
        Node b = a.getRight();
        a.right = b.getLeft();
        b.left = a;
        a.height = getMax(getHeight(a.getLeft()), getHeight(a.getRight())) + 1;
        b.height = getMax(getHeight(b.getRight()), a.height) + 1;
        return b;
    }

    private Node doubleLeftRotation(Node x) {
        x.left = rightRotation(x.getLeft());
        return leftRotation(x);
    }

    private Node doubleRightRotation(Node x) {
        x.right = leftRotation(x.getRight());
        return rightRotation(x);
    }

    public String inOrder(Node n) {
        String b = " ";
            if (n != null) {
                inOrder(n.getLeft());
                b += n.toString();
                inOrder(n.getRight());
            }
        return b;
    }

    @Override
    public String toString() {
        if(this.root==null) {
            return "Empty";
        }
        else {
            return inOrder(this.root);
        }
    }
    
    public void loadFile() {
        try {
            this.root = null;

            File f = new File("AVLTree.dat");

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            if(f.exists()) {
                Object obj = ois.readObject();
                while (obj != null) {
                    this.insert((Subject)obj);
                    obj = ois.readObject();
                }
            }

            fis.close();
            ois.close();
        } catch(EOFException e) {
            JOptionPane.showMessageDialog(null, "Archivo AVLTree.dat cargado correctamente");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No hay ningún archivo con el nombre AVLTree.dat disponible");
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo AVLTree.dat");
        }
    }
    
    public void saveFile() {
        if(root != null) {
          try {

            File f = new File("AVLTree.dat");

            if(f.exists())
                f.delete();

            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            saveFile(fos, oos, root);

            fos.close();
            oos.close();
          } catch (IOException e) {
          }
        }
    }

    public void saveFile(FileOutputStream fos, ObjectOutputStream oos, Node node) throws IOException {
        if (node.getLeft() != null) 
            saveFile(fos, oos, node.getLeft());

        oos.writeObject(node.subject);

        if (node.getRight() != null) 
            saveFile(fos, oos, node.getRight());
    }
    
 
    private class Node {
        private Node left;
        private Node right;
        Subject subject;
        int height;

        public Node(Subject elem, Node l, Node r) {
            this.left= l;
            this.right= r;
            this.subject = elem;
            this.height= 1;
        }

        public Node(Subject elem) {
            this(elem,null,null);
        }
        
        @Override
        public String toString() {
            return "[" + subject + " - " + height + "]";
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
        
    }
	
}