package Ejercicio2;

public class Produccion {
    private double[][] prod;

    public Produccion(){
        this.prod = new double[4][12];
    }

    public void agregarProd(double[][] tablaProd){
        this.prod = tablaProd;
    }
    public double promedioAnual(String cereal){
        double promedio = 0;
        switch(cereal){
            case "arroz": promedio = prom(0);break;
            case "avena": promedio = prom(1);break;
            case "cebada": promedio = prom(2);break;
            case "trigo": promedio = prom(3);break;
        }
        return promedio;
    }
    private double prom(int pos){
        double prom = 0;
        for(int i = 0;i<this.prod[0].length;i++){
            prom += this.prod[pos][i];
        }
        return prom/this.prod[0].length;
    }
    public int cosechasSuperiorAnual(){
        int cont = 0;
        for(int i = 0;i < this.prod.length;i++){
            double promAnual = prom(i);
            for(int j = 0; j < this.prod[0].length;j++){
                if(this.prod[i][j] > promAnual){
                    cont ++;
                }
            }
        }
        return cont;

    }
    public int cosechasInferiorAnual(){
        int cont = 0;
        for(int i=0; i < this.prod.length;i++){
            double promAnual = prom(i);
            for(int j=0;j < this.prod[0].length;j++){
                if(this.prod[i][j] < promAnual){
                    cont++;
                }
            }
        }
        return cont;        
    }
    public void mayorToneladaxMes(){
        int pos = 0;
        for(int i = 0;i < this.prod.length;i++){
            pos = getMayor(i);
            System.out.println("Mes que produjo mas toneladas del cereal "+ getCereal(i)+": "+ pos);
        }
    }
    private int getMayor(int pos){
        int may = 0;
        for(int i = 0;i < this.prod[0].length-2;i++){
            for(int j = i++;j < this.prod[0].length-1;j++){
                if(this.prod[pos][i] > this.prod[pos][j] && this.prod[pos][i] > may){
                    may = i;
                }
            }
        }
        return may;
    }
    private String getCereal(int pos){
        String cadena = "";
        switch(pos){
            case 0 : cadena = "arroz";break;
            case 1 : cadena = "avena";break;
            case 2 : cadena = "cebada";break;
            case 3 : cadena = "trigo"; break;
        }
        return cadena;
    }

    public String toString(){
        String cadena ="";
        for(int i = 0;i<this.prod.length;i++){
            for(int j = 0;j<this.prod[0].length;j++){
                cadena += "\t" + this.prod[i][j];
            }
            cadena += "\n";
        }
        return cadena;
    }
}
