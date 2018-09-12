package graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    String name;
    List<Edge> adjacency;
    short color;
    double dist;
    Vertex pi;

    public Vertex(String name) {
    	
        this.name = name;
        adjacency = new ArrayList<Edge>();
    }
}
