package ooa_polygonarea;

public class Triangle extends Polygon{
    private Vertex a, b, c;
    private Vertex[] ver;
    private double sideAB, sideBC, sideAC;
    
    public Triangle(String nom, Vertex[] ver) {
        super(nom, 3, ver);
        this.a = ver[0];
        this.b = ver[1];
        this.c = ver[2];
        
        this.sideAB = getSide(this.a, this.b);
        this.sideBC = getSide(this.b, this.c);
        this.sideAC = getSide(this.a, this.c);
    }

    public Vertex getA() {
        return a;
    }

    public void setA(Vertex a) {
        this.a = a;
    }

    public Vertex getB() {
        return b;
    }

    public void setB(Vertex b) {
        this.b = b;
    }

    public Vertex getC() {
        return c;
    }

    public void setC(Vertex c) {
        this.c = c;
    }

    public Vertex[] getVer() {
        return ver;
    }

    public void setVer(Vertex[] ver) {
        this.ver = ver;
    }

    public double getSideAB() {
        return sideAB;
    }

    public void setSideAB(double sideAB) {
        this.sideAB = sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public void setSideBC(double sideBC) {
        this.sideBC = sideBC;
    }

    public double getSideAC() {
        return sideAC;
    }

    public void setSideAC(double sideAC) {
        this.sideAC = sideAC;
    }
    
    
}
