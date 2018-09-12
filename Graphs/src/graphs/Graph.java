package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Graph {

    HashMap<String, Vertex> vMap;
    
    final double max = Double.MAX_VALUE;

    public Graph() {
    	
        vMap = new HashMap<String, Vertex>();
    }

    public Vertex getVertex(String name) {
    	
        Vertex found = this.vMap.get(name);
        if (found != null)
            return found;
        Vertex add = new Vertex(name);
        this.vMap.put(name, add);
        return add;
    }

    public void addEdge(String from, String to, double cost) {
    	
        Vertex x = this.getVertex(from);
        Vertex y = this.getVertex(to);
        x.adjacency.add(new Edge(y, cost));
    }

    public String bfSearch(String from) {
    	
        StringBuilder print = new StringBuilder();
        Vertex origin = this.getVertex(from);
        
        for (Map.Entry<String, Vertex> x : this.vMap.entrySet()) {
            Vertex v = x.getValue();
            v.color = 1;
            v.pi = null;
            v.dist = this.max;
        }
        origin.color = 0;
        origin.dist = 0;
        origin.pi = null;

        Queue<Vertex> queue = new LinkedList<Vertex>();
        queue.add(origin);
        
        while (!queue.isEmpty()) {
            Vertex x = queue.poll();
            print.append(x.name);
            int size = x.adjacency.size();
            for (int i = 0; i < size; i++) {
                Vertex y = x.adjacency.get(i).destination;
                if (y.color == 1) {
                    y.color = 0;
                    y.dist = x.dist + 1;
                    y.pi = x;
                    queue.add(y);
                }
            }
            x.color = -1;
        }

        return print.toString();
    }

    public String dfSearch(String origin) {
    	
        String print = "";
        Vertex x = this.getVertex(origin);
        for (Map.Entry<String, Vertex> y : this.vMap.entrySet()) {
            Vertex v = y.getValue();
            v.color = 1;
            v.pi = null;
            v.dist = this.max;
        }
        
        int t = 0;
        print += visit(t, x);
        return print;
    }

    public String visit(int t, Vertex x) {
    	
        StringBuilder print = new StringBuilder();
        t = t + 1;
        x.dist = t;
        x.color = 0;
        int size = x.adjacency.size();
        
        for (int i = 0; i < size; i++) {
            Vertex v = x.adjacency.get(i).destination;
            if (v.color == 1) {
                v.pi = x;
                print.append(visit(t, v));
            }
        }
        
        x.color = -1;
        t = t + 1;
        x.dist = t;
        print.append(x.name);
        
        return print.toString();
    }
}
