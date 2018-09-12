package ingsoftwareproject;

import java.io.Serializable;

/**
Abstract Class Producto: SuperClass from which every piece of clothing derives.
*/

public abstract class Producto implements Serializable {
    
    /**
    Variable declaration.
    */
    
    private String keyArt, brand, name, description;
    
    private int available;
    
    private double price;
    
    /**
    Empty constructor for any object of the class cristianLay.
    */
    
    public Producto() {
        
    }
    
    /**
    Constructor for objects of the class cristianLay. Requires keyArt, brand, description, name, availability, and price.
     * @param keyArt
     * @param brand
     * @param name
     * @param description
     * @param available
     * @param price
    */
    
    public Producto(String keyArt, String brand, String name, String description, int available, double price) {
        setKeyArt(keyArt);
        setBrand(brand);
        setDescription(description);
        setName(name);
        setAvailability(available);
        setPrice(price);
    }
    
    /**
    Method to get the keyArt of an item.
     * @return keyArt
    */
    
    public String getKeyArt() {
        return keyArt;
    }

    /**
    Method to set the keyArt of an item.
     * @param keyArt
    */
    
    public void setKeyArt(String keyArt) {
        this.keyArt = keyArt;
    }
    
    /**
    Method to get the brand of an item.
     * @return brand
    */
    
    public String getBrand() {
        return brand;
    }
    
    /**
    Method to set the brand of an item.
     * @param nombre
    */
    
    public void setBrand(String nombre) {
        this.brand = nombre;
    }
    
    /**
    Method to get the description of an item.
     * @return description
    */

    public String getDescription() {
        return description;
    }
    
    /**
    Method to set the description of an item.
     * @param description
    */
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
    Method to get the name of an item.
     * @return name
    */

    public String getName() {
        return name;
    }
    
    /**
    Method to set the name of an item.
     * @param name
    */
    
    public void setName(String name) {
        this.name = name;
    }
    
    /**
    Method to get the availability of an item.
     * @return available
    */

    public int getAvailability() {
        return available;
    }
    
    /**
    Method to set the availability of an item.
     * @param available
    */
    
    public void setAvailability(int available) {
        this.available = available;
    }
    
    /**
    Method to get the price of an item.
     * @return price
    */

    public double getPrice() {
        return price;
    }
    
    /**
    Method to set the price of an item.
     * @param price
    */
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
    Method to get all data of an item in the form of a String.
    */
    
    @Override
    public String toString() {
        return "Brand: "+this.brand
                +"\nDescription: "+this.description
                +"\nCategory: "+this.name
                +"\nAvailability: "+this.available
                +"\nPrice: $"+this.price;
    }
}
