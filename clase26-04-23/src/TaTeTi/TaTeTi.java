package TaTeTi;
import java.util.Random;
import java.util.Scanner;

public class TaTeTi {
    protected String [][] tablero;

    public TaTeTi() {
        this.tablero = new String[3][3];
        for(int i = 0;i < this.tablero.length;i++){
            for(int j = 0;j < this.tablero[0].length;j++){
                this.tablero[i][j] = " ";
            }
        }
    }
    public void setPosicion(int fila,int columna){
        if(this.tablero[fila][columna]!= "X" || this.tablero[fila][columna]!= "O" ){
            this.tablero[fila][columna]= "X";
        }else{
            System.out.println("Elija otra posicion:");
        }
    }
    private void computadora(){
        Random f = new Random();Random c = new Random();
        int fila = 0; int columna = 0;boolean band = false;
        while(!band){
            fila = f.nextInt() *2;columna = c.nextInt() *2;
            if(this.tablero[fila][columna]!= "X"||this.tablero[fila][columna]!= "O"){
                this.tablero[fila][columna] = "O";
                band = true;
            }
        }
    }
    private void dibujarTablero(){
        System.out.println(this.tablero[0][0]+"|"+this.tablero[0][1]+"|"+this.tablero[0][2]);
        System.out.println("-----");
        System.out.println(this.tablero[1][0]+"|"+this.tablero[1][1]+"|"+this.tablero[1][2]);
        System.out.println("-----");
        System.out.println(this.tablero[2][0]+"|"+this.tablero[2][1]+"|"+this.tablero[2][2]);
    }
    private boolean verifColum(){
        boolean band = false;int j=0;
        int contX = 0;int contO=0;
        while(!band || j < this.tablero[0].length){
            for(int i=0; i < this.tablero.length;i++){
                if(this.tablero[j][i] == "X"){
                    contX++;
                }else if(this.tablero[j][i] == "O"){
                    contO++;
                }
            }
            if(contX == 3 || contO == 3){
                band = true;
            }else{
                contX=0;contO=0;j++;
            }
        }
        return band;
    }
    private boolean verifFila(){
        boolean band = false;int j=0;
        int contX = 0;int contO=0;
        while(!band || j < 2){
            for(int i=0; i< 3;i++){
                if(this.tablero[i][j] == "X"){
                    contX++;
                }else if(this.tablero[i][j] == "O"){
                    contO++;
                }
            }
            if(contX == 3 || contO == 3){
                band = true;
            }else{
                contX=0;contO=0;j++;
            }
        }
        return band;
    }
    private boolean verifDiagonal(){
        boolean band = false;
        if((this.tablero[0][0]=="X" && this.tablero[1][1]=="X" &&this.tablero[2][2]=="X") || (this.tablero[0][0]=="O" && this.tablero[1][1]=="O" &&this.tablero[2][2]=="O")){
            band = true;
        }else if((this.tablero[2][0]=="X" && this.tablero[1][1]=="X" &&this.tablero[0][2]=="X") || (this.tablero[2][0]=="O" && this.tablero[1][1]=="O" &&this.tablero[0][2]=="O")){
            band = true;
        }
        return band;
    }
    private boolean ganador(){
        if(verifColum() ==true){
            return true;
        }else if(verifFila() == true){
            return true;
        }else if(verifDiagonal() == true){
            return true;
        }else{
            return false;
        }
    }
    private boolean verifTablero(){
        int cont = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                if(this.tablero[i][j]!= " "){
                    cont++;
                }
            }
        }
        if(cont == 9){
            return true;
        }else{
            return false;
        }
    }
    public void Jugar(){
        Scanner n = new Scanner(System.in);int f = 0; int c = 0;
        while(ganador() == true || verifTablero() == false){
            dibujarTablero();
            f = 0; c = 0;
            System.out.println("Posicion a colocar(Posiciones validas del 0 al 2): ");
            System.out.println("Posicion Fila: ");f=n.nextInt();System.out.println("\nPosicion Columna: ");c = n.nextInt();
            setPosicion(f, c);
            computadora();
        }
    }
}
