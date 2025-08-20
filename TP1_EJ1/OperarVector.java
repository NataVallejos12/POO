import java.util.Scanner;

public class OperarVector{
    public static void main (String [] args){
        Scanner texto = new Scanner(System.in);
        int [] nota = new int[5];
        float promedio = 0;
        int mayorNota = Integer.MIN_VALUE;
        
        for (int i = 0; i < 5; i++){
           System.out.println("Ingrese la nota nro " + (i+1)  + ":");
           nota[i] = texto.nextInt();
        }
               
        for (int j = 0; j < 5; j++){
            promedio += nota[j];
        }
        
        for (int k = 0; k < 5; k++){
            if(nota[k] > mayorNota){
                mayorNota = nota[k];
            }
        }
        
        System.out.println("Promedio: " + (promedio / 5) + "\n La mayor nota es: " + mayorNota);
        
        for (int i = 0; i < 5; i++) {
            System.out.print(nota[i] + "\t");
        }
    }
}