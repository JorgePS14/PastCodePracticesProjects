package heapsortrdc4;

import java.io.Serializable;

/**
Abstract Class Clothes: SuperClass from which every piece of clothing derives.
*/

public abstract class Clothes implements Serializable {
    
    /**
    Variable declaration.
    */
    
    private String id, brand, description, category, colour, fabric, style;
    
    private int available;
    
    private double price;
    
    /**
    Empty constructor for any object of the class Clothes.
    */
    
    public Clothes() {
        
    }
    
    /**
    Constructor for objects of the class clothes. Requires brand, description, category, colour, fabric, style, availability, and price.
    */
    
    public Clothes(String id, String brand, String description, String category, String colour, String fabric, String style, int available, double price) {
        setId(id);
        setBrand(brand);
        setDescription(description);
        setCategory(category);
        setColour(colour);
        setFabric(fabric);
        setStyle(style);
        setAvailability(available);
        setPrice(price);
    }
    
    /**
    Method to get the id of an item.
    */
    
    public String getId() {
        return id;
    }

    /**
    Method to set the id of an item.
    */
    
    public void setId(String id) {
        this.id = id;
    }
    
    /**
    Method to get the brand of an item.
    */
    
    public String getBrand() {
        return brand;
    }
    
    /**
    Method to set the brand of an item.
    */
    
    public void setBrand(String nombre) {
        this.brand = nombre;
    }
    
    /**
    Method to get the description of an item.
    */

    public String getDescription() {
        return description;
    }
    
    /**
    Method to set the description of an item.
    */
    
    public void setDescription(String direccion) {
        this.description = direccion;
    }
    
    /**
    Method to get the category of an item.
    */

    public String getCategory() {
        return category;
    }
    
    /**
    Method to set the category of an item.
    */
    
    public void setCategory(String telefono) {
        this.category = telefono;
    }
    
    /**
    Method to set the colour of an item.
     */
    
    public String getColour() {
        return colour;
    }

    /**
    Method to set the colour of an item.
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    /**
    Method to get the fabric of an item.
     */
    public String getFabric() {
        return fabric;
    }

    /**
    Method to set the fabric of an item.
     */
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    /**
    Method to get the style of an item.
     */
    public String getStyle() {
        return style;
    }

    /**
    Method to set the style of an item.
     */
    public void setStyle(String style) {
        this.style = style;
    }
    
    /**
    Method to get the availability of an item.
    */

    public int getAvailability() {
        return available;
    }
    
    /**
    Method to set the availability of an item.
    */
    
    public void setAvailability(int servicio) {
        this.available = servicio;
    }
    
    /**
    Method to get the price of an item.
    */

    public double getPrice() {
        return price;
    }
    
    /**
    Method to set the price of an item.
    */
    
    public void setPrice(double sueldoBase) {
        this.price = sueldoBase;
    }
    
    /**
    Method to get all data of an item in the form of a String.
    */
    
    @Override
    public String toString() {
        return "Brand: "+this.brand
                +"\nDescription: "+this.description
                +"\nCategory: "+this.category
                +"\nColour: "+this.colour
                +"\nFabric: "+this.fabric
                +"\nStyle: "+this.style
                +"\nAvailability: "+this.available
                +"\nPrice: $"+this.price;
    }

    /**
    Method to get the fit of an item.
     */
    
    public abstract String getFit();


    
}
