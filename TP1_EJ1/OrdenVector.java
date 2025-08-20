import java.util.Scanner;
/**
 * Write a description of class OrdenVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrdenVector
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[4];
        
        for(int i=0;i<4;i++){
            System.out.println("Ingrese el valor " + (i+1) +": ");
            vector[i]= sc.nextDouble();
        }
        
        double menor = Double.MAX_VALUE;
        for(int i=0;i<4;i++){
            if(menor > vector[i]){
                menor = vector[i];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    double temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
        
        
        for(int i = 0; i < 4; i++){
            System.out.print("| " + vector[i] + "\t");
        }
        System.out.println();
        System.out.println("El valor menor del vector es: " + menor);
               

    }
}