package EjercicioEmpresa;

public class Vehiculo {
    private String matricula;
    private String modelo;
    private String marca;

    public Vehiculo(String matricula, String modelo, String marca) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
    }
    //getters y setters
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String toString(){
        String cadena = "";
        cadena = "Matricula: " + getMatricula() + "\nMarca: " + getMarca() + "\nModelo: "+ getModelo();
        return cadena; 
    }
}
