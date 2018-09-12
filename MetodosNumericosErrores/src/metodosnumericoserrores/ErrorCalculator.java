package metodosnumericoserrores;

public class ErrorCalculator {
    
    public ErrorCalculator() {
        
    }
    
    public double absErrorCalc(double trueVal, double aproxVal) {
        return Math.abs(trueVal-aproxVal);
    }
    
    public double relErrorCalc(double trueVal, double aproxVal) {
        if(trueVal > 0)
            return Math.abs((trueVal-aproxVal)/trueVal);
        else
            return -1;
    }
    
    public double normErrorCalc(double actVal, double prevVal) {
        if(actVal > 0)
            return Math.abs((actVal-prevVal)/actVal);
        else
            return -1;
    }
}
