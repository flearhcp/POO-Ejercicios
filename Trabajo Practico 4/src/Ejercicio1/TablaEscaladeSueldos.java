package Ejercicio1;

public class TablaEscaladeSueldos{
    private double[][] lista;

    public TablaEscaladeSueldos(){
        this.lista = new double[4][5];
    }
    public void agregarSueldos(double[][]lista){
        this.lista = lista;
    }
    public double promPagaHabilidad(int grado){
        double suma = 0;
        for(int i = 0;i < this.lista[0].length;i++){
            suma += this.lista[grado][i];
        }
        return suma/this.lista[0].length;
    }
    public double diferenciaMayorMenor(int grado){
        double dif = (mayor(grado) - menor(grado));
        return Math.abs(dif);
    }
    private double mayor(int grado){
        double may = 0;
        for(int i=0;i<this.lista.length-2;i++){
            for(int j = i++;j<this.lista.length-1;j++){
                if(this.lista[grado][i] >= this.lista[grado][j] && this.lista[grado][i] > may){
                    may = this.lista[grado][i];
                }
            }
        }
        /*while(i < this.lista.length-1)/*for(int i = 0; i < this.lista.length-2;i++){
            if(this.lista[grado][i] > this.lista[grado][i++]){
                may = this.lista[grado][i];
                i++;
            }else /*if(this.lista[grado][i++] > this.lista[grado][i]){
                //may = this.lista[grado][i++];
                i++;
            }
        }*/
        return may;
    }
    private double menor(int grado){
        double men = this.lista[1][1];
        for(int i = 0 ;i<this.lista.length-2;i++){
            for(int j = i++;j<this.lista.length-1;j++){
                if(this.lista[grado][i]<this.lista[grado][j] && this.lista[grado][i] < men){
                    men = this.lista[grado][i];
                }else if(this.lista[grado][j]<this.lista[grado][i] && this.lista[grado][j] < men){
                    men = this.lista[grado][j];
                }
            }
        }
        return men;
    }
    public void aumentarPrecio(int grado, double Nprecio){
        for(int i = 0; i < this.lista[0].length;i++){
            this.lista[grado][i] += Nprecio;
        }
    }

    public String toString(){
        String cadena = "";
        for(int i = 0;i<this.lista[0].length;i++){
            for(int j = 0;j<this.lista.length;j++){
                cadena += "\t"+this.lista[j][i];
            }
            cadena += "\n";
        }
        return cadena;
    }
}