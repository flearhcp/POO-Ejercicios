package Precipitacion;

public class PrecipitacionAnual {
    private double[] listaPrecipitaciones;
    private int indiceACargar;

    public PrecipitacionAnual(){
        this.listaPrecipitaciones = new double[12];
        this.indiceACargar = 0;
    }
    public void cargarPrecipitacionActual(double valor){
        this.listaPrecipitaciones[this.indiceACargar] = valor;
        this.indiceACargar++;
    }
    public void cargarPrecipitacionMes(int indice, double valor){
        if(indice <= this.indiceACargar){
            this.listaPrecipitaciones[indice]=valor;
        }else{
            if(indice == this.indiceACargar){
                cargarPrecipitacionActual(valor);
            }else{
            System.out.println("No se puede cargar la precipitacion del mes "+ indice);
            }
        }
    }
    public double calcularPromedioActual(){
        double suma = 0;
        for(int i = 0; i < this.indiceACargar;i++){
            suma = suma + this.listaPrecipitaciones[i];
        }
        return suma/this.indiceACargar;
    }
    public double calcularPromedioAnual(){
        if(this.indiceACargar == 12){
            double suma = 0;
            for(int i = 0; i < this.listaPrecipitaciones.length;i++){
                suma = suma + this.listaPrecipitaciones[i];
            }
            return suma/this.listaPrecipitaciones.length;
        }else{
            System.out.println("No se a cargado las precipitaciones del anio");
            return 0;
        }
    }
    public double[] calcularListaDesvios(){
        double[] listaDesvios = new double[this.indiceACargar];
        double promedioAnual = calcularPromedioActual();
        for(int i = 0; i < this.indiceACargar;i++){
            listaDesvios[i] = Math.abs(this.listaPrecipitaciones[i] - promedioAnual);
        }
        return listaDesvios;
    }

}
