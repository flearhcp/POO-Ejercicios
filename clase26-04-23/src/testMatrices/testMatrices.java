package testMatrices;
//import java.util.Scanner;
public class testMatrices{
    public static void main(String[] args) {
        /*double[][]ventas = new double[6][5];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < ventas.length; i++){
            for(int j = 0; j < 5; j++){
                System.out.println("Cargar elementos: ");
                ventas[i][j] = in.nextDouble();
            }
        }*/
        int[][]m = {{1,2,3,4,5},{3,4,5,6,7},{5,6,7,8,9},{5,6,7,8,9},{5,6,7,8,9},{5,6,7,8,9}};
        System.out.println(m.length);
        System.out.println(m[0].length);
        double sum = 0;
        for(int i = 0; i < m[0].length; i++){
            sum += m[1][i];
        }
        System.out.println(sum);
        /*double suma =0;
        for(int i = 0; i < 6; i++){
            suma += ventas[i][4];
        }
        System.out.println("suma total de ventas de 5:"+ suma);
        */
    }
}