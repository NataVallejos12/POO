

public class Ecuacion
{
    public static void main(String[] args)
    {
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        double c = Double.valueOf(args[2]);
        
        double discriminante = Math.pow(b,2)-4*a*c;
        
        if(discriminante > 0){
            double x1 = (-b + Math.sqrt(discriminante))/2*a;
            double x2 = (-b - Math.sqrt(discriminante))/2*a;
            System.out.println("x1 = " + x1 + " y x2 = " + x2);
        }else if(discriminante == 0){
            double x = (-b + Math.sqrt(discriminante))/2*a;
            System.out.println("x1=x2, x=" + x);
        }else{
            System.out.println("Se encuentra frente a una solucion compleja(numero imaginario)");
        }
    }
}