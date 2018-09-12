package heapsortrdc4;

/**
Shoes class:
Refers to all clothing items that go on the client's feet, like shoes, sneakers, sandals, etc.
*/

public class Shoes extends Clothes {
    
    /**
    Empty constructor for any item of the Shoes class.
    */
    
    public Shoes() {
        
    }
    
    /**
    Constructor for items of the Shoes class. Requires all the parameters from the clothes class;
    */
    
    public Shoes(String id, String brand, String description, String category, String colour, String fabric, String style, int available, double price) {
        super(id, brand, description, category, colour, fabric, style, available, price);
        
    }
    
    /**
    Method to get all data of an item in the form of a String.
    */
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    /**
    Method to get the fit of an item.
     */

    @Override
    public String getFit() {
        return "Not Available.";
    }


}
