package ooatriangle_v2;

public class OOATriangle {

    public static void main(String[] args) {
        
        Vertex a = new Vertex(0.0, 4.0);
        Vertex b = new Vertex(0.0, 0.0);
        Vertex c = new Vertex(3.0, 0.0);
        Vertex[] ver = {a, b, c};
                
        Triangle t = new Triangle("Test Triangle", ver);
        
        System.out.println("Name: " + t.getName());
        
        System.out.println("Number of vertices: " + t.getNumVertices());
        
        System.out.println("First vertex: " + t.getA().getX() + ", " + t.getA().getY());
        System.out.println("Second vertex: " + t.getB().getX() + ", " + t.getB().getY());
        System.out.println("Third vertex: " + t.getC().getX() + ", " + t.getC().getY());
        
        System.out.println("Perimeter: " + t.getPerimeter());
        
        System.out.println("Area: " + t.area());
        
        
        System.out.println("\n\n\\n");
        
        
        Vertex a2 = new Vertex(0.0, 8.0);
        Vertex b2 = new Vertex(0.0, 0.0);
        Vertex c2 = new Vertex(6.0, 0.0);
        Vertex[] ver2 = {a2, b2, c2};
                
        Triangle t2 = new Triangle("Test Triangle 2", ver2);
        
        System.out.println("Name: " + t2.getName());
        
        System.out.println("Number of vertices: " + t2.getNumVertices());
        
        System.out.println("First vertex: " + t2.getA().getX() + ", " + t2.getA().getY());
        System.out.println("Second vertex: " + t2.getB().getX() + ", " + t2.getB().getY());
        System.out.println("Third vertex: " + t2.getC().getX() + ", " + t2.getC().getY());
        
        System.out.println("Perimeter: " + t2.getPerimeter());
        
        System.out.println("Area: " + t2.area());
        
    }
    
}
