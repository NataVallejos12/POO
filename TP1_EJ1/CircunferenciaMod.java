import java.util.Scanner;
/**
 * Write a description of class CircunferenciaMod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircunferenciaMod
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int continuar = 1;
        
        while(continuar == 1){
            System.out.println("Ingrese el radio: ");
            double radio = sc.nextDouble();
            double perimetro = 2 * Math.PI * radio;
            System.out.println("Perimetro: " + perimetro);
            
            System.out.println("¿Desea continuar calcular otra circunferencia? (1-si/2-no): ");
            continuar = sc.nextInt();
        }
    }
}