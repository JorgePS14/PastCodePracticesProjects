package ingsoftwareproject;

/**
Joyeria class:
Refers to all articles that serve as ornament of an outfit.
*/

public class Joyeria extends Producto {
    
    /**
    Empty constructor for any item of the jewelry class.
    */
    
    public Joyeria() {
        
    }
    
    /**
    Constructor for items of the jewelry class. Requires all the parameters from the Producto class;
     * @param keyArt
     * @param brand
     * @param name
     * @param description
     * @param available
     * @param price
    */
    
    public Joyeria(String keyArt, String brand, String name, String description, int available, double price) {
        super(keyArt, brand, name, description, available, price);
    }
    
    /**
    Method to get all data of an item in the form of a String.
     * @return toString
    */
    
    @Override
    public String toString() {
        return super.toString();
    }

}
