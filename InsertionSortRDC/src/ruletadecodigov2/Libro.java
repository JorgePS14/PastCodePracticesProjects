package ruletadecodigov2;

import java.io.Serializable;

/**
Clase Libro:
Clase del objeto Libro que contiene todos los datos y métodos escenciales del objeto libro
*/

public class Libro implements Serializable {
    
    /**
    Declaración de variables:
    Se declaran las variables que comparten todos los libros.
    */
    
    private String nombre, isbn;
    
    private double precio;
    
    /**
    Constructor vacío del objeto Libro.
    */
    
    public Libro() {
        
    }
    
    /**
    Constructor parametrizado del objeto Libro.
    Requiere el nombre, isbn y precio de un libro.
    */
    
    public Libro(String nombre, String isbn, double precio) {
        setNombre(nombre);
        setIsbn(isbn);
        setPrecio(precio);
    }
    
    /**
    Método para conseguir el nombre de un libro.
    */
    
    public String getNombre() {
        return nombre;
    }
    
    /**
    Método para asignar el nombre a un libro.
    */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
    Método para conseguir el ISBN de un libro.
    */

    public String getIsbn() {
        return isbn;
    }
    
    /**
    Método para asignar el ISBN de un libro.
    */
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    /**
    Método para conseguir el precio de un libro.
    */

    public double getPrecio() {
        return precio;
    }
    
    /**
    Método para asignar el precio de un libro.
    */
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
    Método para conseguir los datos de un libro en forma de String.
    */
    
    @Override
    public String toString() {
        return "Nombre: "+this.nombre
                +"\nISBN: "+this.isbn
                +"\nPrecio: $"+this.precio;
    }
}
