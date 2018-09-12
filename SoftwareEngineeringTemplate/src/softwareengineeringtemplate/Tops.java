package softwareengineeringtemplate;

/**
Tops class:
Refers to all clothing items that go on top, like t-shirts, blouses, etc.
*/

public class Tops extends Clothes{
    
    /**
    Variable declaration.
    */
    
    private String fit;
    
    /**
    Empty constructor for items of the Tops class.
    */

    public Tops() {
        
    }
    
    /**
    Constructor for items of the Tops class. Requires all the parameters from the clothes class, plus an extra String for fit.
    */
    
    public Tops(String id, String brand, String description, String category, String colour, String fabric, String style, String fit, int available, double price) {
        super(id, brand, description, category, colour, fabric, style, available, price);
        setFit(fit);
    }
    
    /**
    Method to get the fit of an item.
     */
    
    @Override
    public String getFit() {
        return fit;
    }

    /**
    Method to set the fit of an item.
     */
    
    public void setFit(String fit) {
        this.fit = fit;
    }
        
    /**
    Method to get all data of an item in the form of a String.
    */
    
    @Override
    public String toString() {
        return super.toString()+"\nFit: "+this.getFit();
    }

    
    
}
