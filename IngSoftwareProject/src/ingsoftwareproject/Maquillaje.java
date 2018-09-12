package ingsoftwareproject;

/**
Maquillaje class:
Refers to all articles that serve as ornament of an outfit.
*/

public class Maquillaje extends CuidadoPersonal {
    
    /**
    Empty constructor for any item of the maquillaje class.
    */
    
    public Maquillaje() {
        
    }
    
    /**
    Constructor for items of the maquillaje class. Requires all the parameters from the Joyeria class;
     * @param keyArt
     * @param brand
     * @param name
     * @param description
     * @param available
     * @param price
    */
    
    public Maquillaje(String keyArt, String brand, String name, String description, int available, double price) {
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
