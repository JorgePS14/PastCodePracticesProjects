package ingsoftwareproject;

/**
CuidadoPersonal class:
Refers to all articles that relate to personal care, such as creams and shampoos.
*/

public class CuidadoPersonal extends Producto{
    
    /**
    Empty constructor for items of the Tops class.
    */

    public CuidadoPersonal() {
        
    }
    
    /**
    Constructor for items of the personalCare class. Requires all the parameters from the Producto class.
     * @param keyArt
     * @param brand
     * @param name
     * @param description
     * @param available
     * @param price
    */
    
    public CuidadoPersonal(String keyArt, String brand, String name, String description, int available, double price) {
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
