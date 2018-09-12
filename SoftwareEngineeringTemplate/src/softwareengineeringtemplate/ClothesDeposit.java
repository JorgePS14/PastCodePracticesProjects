package softwareengineeringtemplate;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
ClothesDeposit class:
This serves as a repository for all items related to the Clothes superclass.
*/

public class ClothesDeposit {
    
    /**
    Variable declaration.
    */
    
    private ArrayList<Clothes> clothesStore;
    
    private static final String CSV_SEPARATOR = ",";

    /**
    Constructor for a Clothes Deposit.
    */
    
    public ClothesDeposit() {
        
        this.clothesStore = new ArrayList<>();
    }
    
    public ClothesDeposit(boolean loadFile) {
        File f = new File("clothesdeposit.dat");
        
        this.clothesStore = new ArrayList<>();
        
        this.cargarArchivo();
    }
    
    /**
    Method that returns the clothes deposit in the form of an arrayList.
    */
    
    public ArrayList<Clothes> getClothesDeposit() {
        return this.clothesStore;
    }
    
    /**
    Method that loads the clothesdeposit.dat in case it is available.
    */
    
    public void cargarArchivo()  {
        try {    
            this.clothesStore.clear();
                
            File f = new File("clothesdeposit.dat");
            
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            if(f.exists()) {
                Object obj = ois.readObject();
                while (obj != null) {
                    this.clothesStore.add((Clothes)obj);
                    obj = ois.readObject();
                }
            }
            ois.close();
        } catch(EOFException e) {
            JOptionPane.showMessageDialog(null, "File clothesdeposit.dat loaded correctly.");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "There's no file with the name 'clothesdeposit.dat' available.");
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Unable to load clothesdeposit.dat // the file may be open somewhere else.");
        }
    }
    
    /**
    Method that writes all available items in the Clothes Deposit in a .dat file.
    */
    
    public void guardarArchivo() {
        try {
            File f = new File("clothesdeposit.dat");
            if(f.exists())
                f.delete();
            
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for(Clothes e:clothesStore){
                oos.writeObject(e);
            }		
            oos.close();
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, "An error occured while saving the document.");
        }

    }
    
    /**
    Method that returns an item of the class Clothes.
    */
    
    public Clothes getClothingItem(int index) {
        if(index<this.clothesStore.size() && index>=0) {
            return this.clothesStore.get(index);
        }
        
        return null;
    }
    
    /**
    Method that returns the position in the Clothes Deposit array list of a particular clothing item.
    */
    
    public int searchBrand(String brand) {
        int pos = -1;
        for(int i=0; i<clothesStore.size(); i++){
            if(clothesStore.get(i).getBrand().equals(brand)) {
                pos = i;
                break;
            }
        }
        
        return pos;
    }
    
    public int searchId(String id) {
        int pos = -1;
        for(int i=0; i<clothesStore.size(); i++) {
            if(clothesStore.get(i).getId().equals(id)) {
                pos = i;
                break;
            }
        }
        
        return pos;
    }
    
    /**
    Method that allows the user to add an object of the class Clothes to the Clothes Deposit.
    */
    
    public void addItem(Clothes e) {
        this.clothesStore.add(e);
        
    }
    
    /**
    Method that allows the user to delete an object of the class Clothes from the Clothes Deposit.
    */
    
    public boolean removeItem(Clothes e) {
        int pos = this.searchBrand(e.getBrand());
        if(pos != -1) {
            this.clothesStore.remove(pos);
        }
        return pos != -1;
    }
    
    /**
    Method that returns the number of clothing items available in the Clothes Deposit.
    */
        
    public int getNoOfClothes() {
        return this.clothesStore.size();
    }
    
    /**
    Method that allows the user to export the Clothes Deposit items to a CSV file.
    */
    
    public void generateCSV(ArrayList<Clothes> clothesStore)
    {
        try
        {
            File f = new File("clothesreport.csv");
            if(f.exists())
                f.delete();
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
            
            StringBuffer oneLine = new StringBuffer();
            
            oneLine.append("Item no.");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Clothing brand");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Description");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Category");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Colour");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Fabric");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Style");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Availability");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Fit");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Price");
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
            
            for (Clothes e : clothesStore)
            {
                oneLine.delete(0, oneLine.length());
                oneLine.append(e.getId().trim().length() == 0 ? "" : e.getId());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getBrand().trim().length() == 0 ? "" : e.getBrand());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getDescription().trim().length() == 0 ? "" : e.getDescription());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getCategory().trim().length() == 0 ? "" : e.getCategory());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getColour().trim().length() == 0 ? "" : e.getColour());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getFabric().trim().length() == 0 ? "" : e.getFabric());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getStyle().trim().length() == 0 ? "0" : e.getStyle());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getAvailability() == 0 ? "Ninguno" : e.getAvailability());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(e.getFit().trim().length() == 0 ? "" : e.getFit());
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
            JOptionPane.showMessageDialog(null, "Error al generar archivo CSV -- 3");
        }
    }

}
