package Ejercicio2;

public class Surtidor {
    private int cargaMax;
    private int ultraDiesel;
    private int euroDiesel;
    private int naftaSuper;
    private int naftaInfinia;

    public Surtidor(){
        this.cargaMax = 20000;
        this.ultraDiesel = 20000;
        this.euroDiesel = 20000;
        this.naftaSuper = 20000;
        this.naftaInfinia = 20000;
    }

    public void llenarDepositoUDiesel(){
        this.ultraDiesel = this.cargaMax;
    }
    public void llenarDepositoEDiesel(){
        this.euroDiesel = this.cargaMax;
    }
    public void llenarDepositoNSuper(){
        this.naftaSuper = this.cargaMax;
    }
    public void llenarDepositoNInfinia(){
        this.naftaInfinia = this.cargaMax;
    }
    public void cargarUDiesel(int litros){
        if(litros<this.cargaMax){
            this.ultraDiesel -= litros;
            System.out.println("No se lleno. Se cargo: "+litros+"litros.");
        }else if(litros > this.cargaMax){
            llenarDepositoUDiesel();
        }
    }   
    public void cargarEDiesel(int litros){
        if(litros<=this.cargaMax){
            this.euroDiesel -= litros;
        }else if(litros > this.cargaMax){
            llenarDepositoEDiesel();
        }
    }
    public void cargarNSuper(int litros){
        if(litros<=this.cargaMax){
            this.naftaSuper -= litros;
        }else if(litros > this.cargaMax){
            llenarDepositoNSuper();
        }
    }
    public void cargarNInfinia(int litros){
        if(litros<=this.cargaMax){
            this.naftaInfinia -= litros;
        }else if(litros > this.cargaMax){
            llenarDepositoNInfinia();
        }
    }
    public int getCantUDiesel(){
        return this.ultraDiesel;
    }
    public int getCantEDiesel(){
        return this.euroDiesel;
    }
    public int getCantNSuper(){
        return this.naftaSuper;
    }
    public int getCantInfinia(){
        return this.naftaInfinia;
    }
}
