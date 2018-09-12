package ingsoftwareproject;

/**
Pulsera class:
Refers to all articles that serve as ornament of an outfit.
*/

public class Pulsera extends Joyeria {
    
    /**
    Empty constructor for any item of the pulsera class.
    */
    
    public Pulsera() {
        
    }
    
    /**
    Constructor for items of the pulsera class. Requires all the parameters from the Joyeria class;
     * @param keyArt
     * @param brand
     * @param name
     * @param description
     * @param available
     * @param price
    */
    
    public Pulsera(String keyArt, String brand, String name, String description, int available, double price) {
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
