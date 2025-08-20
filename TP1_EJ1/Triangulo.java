
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo
{
    public static void main(String[] args)
    {
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        double c = Double.valueOf(args[2]);
        
        double semi = (a+b+c)/2;
        double area = Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
        
        System.out.println("Semiperimetro: " + semi);
        System.out.println("Area del triangulo: " + area);
    }
}