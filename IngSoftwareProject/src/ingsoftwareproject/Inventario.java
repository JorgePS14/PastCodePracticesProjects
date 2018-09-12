package ingsoftwareproject;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
Inventario class:
This serves as a repository for all items related to the Producto superclass.
*/

public class Inventario {
    
    /**
    Variable declaration.
    */
    
    private ArrayList<Producto> inventario;
    
    private static final String CSV_SEPARATOR = ",";

    /**
    Constructor for a Producto Deposit.
    */
    
    public Inventario() {
        
        this.inventario = new ArrayList<>();
    }
    
    public Inventario(boolean loadFile) {
        
        this.inventario = new ArrayList<>();
        
        this.loadFile();
    }
    
    /**
    Method that returns the inventario in the form of an arrayList.
     * @return inventario
    */
    
    public ArrayList<Producto> getInventario() {
        return this.inventario;
    }
    
    /**
    Method that loads the InventarioCL.dat in case it is available.
    */
    
    public void loadFile() {
        try {    
            this.inventario.clear();
                
            File f = new File("InventarioCL.dat");
            
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            if(f.exists()) {
                Object obj = ois.readObject();
                while (obj != null) {
                    this.inventario.add((Producto)obj);
                    obj = ois.readObject();
                }
            }
            ois.close();
        } catch(EOFException e) {
            JOptionPane.showMessageDialog(null, "Archivo InventarioCL.dat cargado correctamente.");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No existe un archivo con el nombre 'InventarioCL.dat' disponible.");
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo InventarioCL.dat // Puede ser que otro programa esté utilizando el archivo.");
        }
    }
    
    /**
    Method that writes all available items in the Producto inventario in a .dat file.
    */
    
    public void saveFile() {
        try {
            File f = new File("InventarioCL.dat");
            if(f.exists())
                f.delete();
            
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(Producto e:inventario){
                oos.writeObject(e);
            }		
            oos.close();
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió algún error al momento de guardar, intente de nuevo más tarde.");
        }

    }
    
    /**
    Method that returns an item of the class Producto.
     * @param index
     * @return CLarticle
    */
    
    public Producto getArticle(int index) {
        if(index<this.inventario.size() && index>=0) {
            return this.inventario.get(index);
        }
        
        return null;
    }
    
    /**
    Method that returns the position in the Producto inventario array list of items of a certain brand.
     * @param brand
     * @return pos
    */
    
    public int searchBrand(String brand) {
        int pos = -1;
        for(int i=0; i<inventario.size(); i++){
            if(inventario.get(i).getBrand().equals(brand)) {
                pos = i;
                break;
            }
        }
        
        return pos;
    }
    
    /**
    Method that returns the position in the Producto inventario array list of a particular item.
     * @param keyArt
     * @return pos
    */
    
    public int searchId(String keyArt) {
        int pos = -1;
        for(int i=0; i<inventario.size(); i++) {
            if(inventario.get(i).getKeyArt().equals(keyArt)) {
                pos = i;
                break;
            }
        }
        
        return pos;
    }
    
    /**
    Method that allows the user to add an object of the class Producto to the Producto inventario.
     * @param e
    */
    
    public void addItem(Producto e) {
        this.inventario.add(e);
        
    }
    
    /**
    Method that allows the user to delete an object of the class Producto from the Producto Deposit.
     * @param e
     * @return true or false
    */
    
    public boolean removeItem(Producto e) {
        int pos = this.searchBrand(e.getBrand());
        if(pos != -1) {
            this.inventario.remove(pos);
        }
        return pos != -1;
    }
    
    /**
    Method that returns the number of clothing items available in the Producto Deposit.
     * @return size
    */
        
    public int getNoOfItems() {
        return this.inventario.size();
    }
    
    /**
    Method that allows the user to export the Producto inventario items to a CSV file.
     * @param clothesStore
    */
    
    public void generateCSV(ArrayList<Producto> clothesStore)
    {
        try
        {
            File f = new File("InventarioCL.csv");
            if(f.exists())
                f.delete();
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
            
            StringBuilder oneLine = new StringBuilder();
            
            oneLine.append("Clave de articulo: ");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Marca: ");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Nombre: ");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Descripcion: ");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Disponibilidad: ");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Precio: ");
            bw.write(oneLine.toString());
            bw.newLine();
            
            oneLine.delete(0, oneLine.length());
            oneLine.append("");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("");
            bw.write(oneLine.toString());
            bw.newLine();
            
            for (Producto e : clothesStore)
            {
                oneLine.delete(0, oneLine.length());
                oneLine.append(e.getKeyArt().trim().length() == 0 ? "" : e.getKeyArt());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getBrand().trim().length() == 0 ? "" : e.getBrand());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getName().trim().length() == 0 ? "" : e.getName());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getDescription().trim().length() == 0 ? "" : e.getDescription());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getAvailability() == 0 ? "Ninguno" : e.getAvailability());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getPrice() == 0 ? "0.0" : e.getPrice());
                bw.write(oneLine.toString());
                bw.newLine();
            }
            
            bw.flush();
            bw.close();
        } catch (UnsupportedEncodingException e) {
            JOptionPane.showMessageDialog(null, "Error al generar archivo CSV -- 1");
        }
        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado -- Puede que tenga el archivo abierto");
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo InventarioCL.csv // Puede ser que otro programa esté utilizando el archivo.");
        }
    }

}
