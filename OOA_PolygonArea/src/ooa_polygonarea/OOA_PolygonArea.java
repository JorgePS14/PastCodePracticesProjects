package ooa_polygonarea;

import java.util.Scanner;

public class OOA_PolygonArea {

    public static void main(String[] args) {
        
        Scanner r = new Scanner(System.in);
        int numVertices;
        String name;
        
        System.out.println("What will be the name of this polygon?");
        name = r.nextLine();
        
        System.out.println("How many vertices does your figure have?");
        numVertices = r.nextInt();
        Vertex[] vertices = new Vertex[numVertices];
        
        
        for(int i = 1; i <= numVertices; i++) {
            System.out.println("Insert X value for vertex no. "+i);
            double x = r.nextDouble();
            System.out.println("Insert Y value for vertex no. "+i);
            double y = r.nextDouble();
            
            vertices[i-1] = new Vertex(x, y);
        }
        
        Polygon figure = new Polygon(name, numVertices, vertices);
        
        System.out.println("The perimeter of "+name+" is: "+figure.getPerimeter());
        System.out.println("The area of "+name+" is: "+figure.area());
    }
    
}
