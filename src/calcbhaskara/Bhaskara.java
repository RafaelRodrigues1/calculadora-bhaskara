package calcbhaskara;

/**
 * @author RafaelRodrigues1
 */
public class Bhaskara {
    
    private Double a;
    private Double b;
    private Double c;

    public Bhaskara(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Double calcularDelta(){
        double delta = (Math.pow(getB(), 2)-(4 * getA() * getC()));
        if(delta<0){
            return null;
        }
        return delta;
    }
    
    public Double calcularX1(){
        if(calcularDelta()==null){
            return null;
        }
        return calcularNum1()/calcularDen();
    }
    
    public Double calcularX2(){
        if(calcularDelta()==null){
            return null;
        }
        return calcularNum2()/calcularDen();
    }
    
    public Double calcularNum1(){
        if(calcularDelta()==null){
            return null;
        }
        return (-(getB()))+(Math.sqrt(this.calcularDelta()));
    }
    
    public Double calcularNum2(){
        if(calcularDelta()==null){
            return null;
        }
        return (-(getB()))-(Math.sqrt(this.calcularDelta()));
    }
    
    public Double calcularDen(){
        return 2 * getA();
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
    
}
