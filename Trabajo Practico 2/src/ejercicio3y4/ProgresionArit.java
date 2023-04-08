package ejercicio3y4;

public class ProgresionArit extends Progresion {
    protected long incr;
    
    ProgresionArit(){
        this.incr =1;
    }
    ProgresionArit(long vincr){
        this.incr=vincr;
    }
    protected long sgteValor(){ 
        this.actual += this.incr;
        return this.actual;
    }
}
