
public class TrianguloRectangulo
{
    public static void main(String[] args)
    {
        double h = Double.valueOf(args[0]);
        double c1 = Double.valueOf(args[1]);
        double c2 = Double.valueOf(args[2]);
        
        double izq = Math.pow(h,2);
        double der = Math.pow(c1,2)+Math.pow(c2,2);
        
        if(izq == der){
            System.out.println("EL triangulo es rectangulo");
        }else{
            System.out.println("EL triangulo no es rectangulo");
        }
    }
}