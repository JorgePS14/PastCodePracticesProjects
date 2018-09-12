package ooatriangle_v2;

import static java.lang.Math.sqrt;

public class Polygon extends Figure{
    
    private int numVertices;
    private Vertex[] vertices;
    
    public Polygon() {
        
    }
    
    public Polygon(String name, int num, Vertex[] ver) {
        super(name);
        this.numVertices = num;
        this.vertices = ver;
    }
    
    public double getSide(Vertex x, Vertex y) {
        double side = sqrt(Math.pow((y.getY()-x.getY()), 2)+Math.pow((y.getX()-x.getX()), 2));
        
        if(side < 0)
            side = side*(-1);
        
        return side;
    }
    
    public double getPerimeter() {
        double perimeter = 0;
        
        for(int i = 0; i <= this.numVertices-1; i++) {
            if(i == this.numVertices-1) {
                perimeter += getSide(vertices[0], vertices[i]);
                break;
            }
            
            perimeter += getSide(vertices[i], vertices[i+1]);
        }
        
        return perimeter;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public Vertex[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertex[] vertices) {
        this.vertices = vertices;
    }
    
}
