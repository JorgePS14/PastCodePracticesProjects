package ruletadecodigov2;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
Clase RepositorioLibros:
Sirve como un repositorio para los datos de todos los libros de la tienda.
*/

public class RepositorioLibros {
    
    /**
    Declaración de variables necesarias para la creación de un repositorio de libros.
    */
    
    private ArrayList<Libro> libros;
    
    private static final String CSV_SEPARATOR = ",";

    /**
    Constructor de un repositorio de libros.
    Al crearse un repositorio de libros, primero se verifica si ya existe un archivo con otra lista de libros disponible.
    */
    
    public RepositorioLibros() {
        File f = new File("repositoriolibros.dat");
        
        this.libros = new ArrayList<>();
        
        this.cargarArchivo();
    }
    
    /**
    Método que regresa el repositorio de libros en formato ArrayList.
    */
    
    public ArrayList<Libro> getRepositorioLibros() {
        return this.libros;
    }
    
    /**
    Método que ordena a los libros por ISBN utilizando un algoritmo de Insertion Sort.
    */
    
    public void ordenarLibrosISBN() {
        
        Libro temp;
        
        for (int top = 1 ; top < this.getNumLibros() ; top++)
        {
            String isbn = this.getLibro(top).getIsbn();
            int i = top;
            while (i > 0 && isbn.compareToIgnoreCase(this.getLibro(i-1).getIsbn()) < 0)
            {
                temp = this.getLibro(i);
                this.libros.set(i, this.getLibro(i-1));
                this.libros.set(i-1, temp);
                i--;
            }
        }
    }
    
    /**
    Método que ordena a los libros por orden alfabético utilizando un algoritmo de Insertion Sort.
    */
    
    public void ordenarLibrosNom() {
        
        Libro temp;
        
        for (int top = 1 ; top < this.getNumLibros() ; top++)
        {
            String nombre = this.getLibro(top).getNombre();
            int i = top;
            while (i > 0 && nombre.compareToIgnoreCase(this.getLibro(i-1).getNombre()) < 0)
            {
                temp = this.getLibro(i);
                this.libros.set(i, this.getLibro(i-1));
                this.libros.set(i-1, temp);
                i--;
            }
        }
    }
    
    /**
    Método que ordena a los libros por precio de menor a mayor utilizando un algoritmo de Insertion Sort.
    */
    
    public void ordenarLibrosPreciomM() {
        
        Libro temp;
        
        for (int top = 1 ; top < this.getNumLibros() ; top++)
        {
            Double precio = this.getLibro(top).getPrecio();
            int i = top;
            while (i > 0 && precio < this.getLibro(i-1).getPrecio() )
            {
                temp = this.getLibro(i);
                this.libros.set(i, this.getLibro(i-1));
                this.libros.set(i-1, temp);
                i--;
            }
        }
    }
    
    /**
    Método que ordena a los libros por precio de mayor a menor utilizando un algoritmo de Insertion Sort.
    */
    
    public void ordenarLibrosPrecioMm() {
        
        Libro temp;
        
        for (int top = 1 ; top < this.getNumLibros() ; top++)
        {
            Double precio = this.getLibro(top).getPrecio();
            int i = top;
            while (i > 0 && precio > this.getLibro(i-1).getPrecio() )
            {
                temp = this.getLibro(i);
                this.libros.set(i, this.getLibro(i-1));
                this.libros.set(i-1, temp);
                i--;
            }
        }
    }
    
    /**
    Método que carga el archivo repositoriolibros.dat en caso de que esté disponible.
    */
    
    public void cargarArchivo()  {
        try {    
            this.libros.clear();
                
            File f = new File("repositoriolibros.dat");
            
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            if(f.exists()) {
                Object obj = ois.readObject();
                while (obj != null) {
                    this.libros.add((Libro)obj);
                    obj = ois.readObject();
                }
            }
            ois.close();
        } catch(EOFException e) {
            JOptionPane.showMessageDialog(null, "Archivo repositoriolibros.dat cargado correctamente");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No hay ningún archivo con el nombre repositoriolibros.dat disponible");
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo repositoriolibros.dat");
        }
    }
    
    /**
    Método que escribe todos los libros de la lista en un archivo .dat para mantener los datos de la aplicación.
    */
    
    public void guardarArchivo() {
        try {
            File f = new File("repositoriolibros.dat");
            if(f.exists())
                f.delete();
            
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(Libro e:libros){
                oos.writeObject(e);
            }		
            oos.close();
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo");
        }

    }
    
    /**
    Método que regresa un objeto de tipo Libro.
    */
    
    public Libro getLibro(int indice) {
        if(indice<this.libros.size() && indice>=0) {
            return this.libros.get(indice);
        }
        
        return null;
    }
    
    /**
    Método que regresa la posición en el repositorio de libros de algún libro en específico.
    */
    
    public int buscarLibro(String isbn) {
        int pos = -1;
        for(int i=0; i<libros.size(); i++){
            if(libros.get(i).getIsbn().equals(isbn)) {
                pos = i;
                break;
            }
        }
        
        return pos;
    }
    
    /**
    Método que permite agregar un objeto de tipo Libro al repositorio de libros.
    */
    
    public void agregarLibro(Libro e) {
        this.libros.add(e);
    }
    
    /**
    Método que permite eliminar un objeto de tipo Libro del repositorio de libros.
    */
    
    public boolean eliminarLibro(Libro e) {
        int pos = this.buscarLibro(e.getIsbn());
        if(pos != -1) {
            this.libros.remove(pos);
        }
        return pos != -1;
    }
    
    /**
    Método que regresa el número de libros que hay en el repositorio.
    */
        
    public int getNumLibros() {
        return this.libros.size();
    }
    
    /**
    Método que permite exportar los datos de todos los libros en el repositorio en un archivo de formato CSV.
    */
    
    public void generarCSV(ArrayList<Libro> repositorioLibros)
    {
        try
        {
            File f = new File("repositoriolibros.csv");
            if(f.exists())
                f.delete();
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
            
            StringBuffer oneLine = new StringBuffer();
            
            oneLine.append("ISBN");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Nombre");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Precio");
            bw.write(oneLine.toString());
            bw.newLine();
            
            oneLine.delete(0, oneLine.length());
            oneLine.append("");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("");
            bw.write(oneLine.toString());
            bw.newLine();
            
            for (Libro e : repositorioLibros)
            {
                oneLine.delete(0, oneLine.length());
                oneLine.append(e.getIsbn().trim().length() == 0 ? "" : e.getIsbn());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getNombre().trim().length() == 0 ? "" : e.getNombre());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getPrecio() == 0 ? "0.0" : e.getPrecio());
                bw.write(oneLine.toString());
                bw.newLine();
            }
            
            bw.flush();
            bw.close();
        } catch (UnsupportedEncodingException e) {
            JOptionPane.showMessageDialog(null, "Error al generar archivo CSV -- 1");
        }
        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Por favor cierre el archivo CSV si lo tiene abierto.");
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error al generar archivo CSV -- 3");
        }
    }

}
