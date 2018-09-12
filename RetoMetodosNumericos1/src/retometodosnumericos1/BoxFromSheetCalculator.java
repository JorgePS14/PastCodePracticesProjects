package retometodosnumericos1;

public class BoxFromSheetCalculator {
    
    private double base, height;
    
    public BoxFromSheetCalculator() {
        
    }
    
    public String getMaxVol(double b, double h) {
        double volAct = 0.0001;
        double volPrev = 0;
        double cut = 0.00001;
        
        while(volAct > volPrev) {
            volPrev = volAct;
            volAct = (b-2*cut)*(h-2*cut)*cut;
            cut += 0.01;
        }
        
        return "El mayor volumen posible es: "+Math.round(volAct)+
                " cortando "+Math.round(cut)+" de cada lado";
    }
}
