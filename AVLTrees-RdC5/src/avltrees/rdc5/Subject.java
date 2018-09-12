package avltrees.rdc5;

import java.io.Serializable;

/**
Abstract Class Subject: SuperClass from which every school subject derives.
*/

public class Subject implements Serializable, Comparable {
    
    /**
    Variable declaration.
    */
    
    private String id, name, description, branch, professor;
    
    private int open;
    
    /**
    Empty constructor for any object of the class Subject.
    */
    
    public Subject() {
        
    }
    
    /**
    Constructor for objects of the class Subject. Requires .
    */
    
    public Subject(String id, String name, String description, String branch, String professor, int open) {
        setId(id);
        setName(name);
        setDescription(description);
        setBranch(branch);
        setProfessor(professor);
        setAvailability(open);
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
    Method to get the name of an item.
    */
    
    public String getName() {
        return name;
    }
    
    /**
    Method to set the name of an item.
    */
    
    public void setName(String nombre) {
        this.name = nombre;
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
    Method to get the career of an item.
    */

    public String getBranch() {
        return branch;
    }
    
    /**
    Method to set the career of an item.
    */
    
    public void setBranch(String telefono) {
        this.branch = telefono;
    }

    /**
    Method to get the professor of an item.
     */
    public String getProfessor() {
        return professor;
    }

    /**
    Method to set the professor of an item.
     */
    public void setProfessor(String style) {
        this.professor = style;
    }
    
    /**
    Method to get the availability of an item.
    */

    public int getAvailability() {
        return open;
    }
    
    /**
    Method to set the availability of an item.
    */
    
    public void setAvailability(int open) {
        this.open = open;
    }
    
    /**
    Method to get all data of an item in the form of a String.
    */
    
    @Override
    public String toString() {
        return "Brand: "+this.name
                +"\nDescription: "+this.description
                +"\nCategory: "+this.branch
                +"\nStyle: "+this.professor
                +"\nAvailability: "+this.open;
    }

    @Override
    public int compareTo(Object o) {
        Subject sub = (Subject)o;
        int comparison = this.id.compareTo(sub.id);
        return comparison;
    }


    
}
