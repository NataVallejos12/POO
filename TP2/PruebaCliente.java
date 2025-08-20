
/**
 * Write a description of class PruebaCliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaCliente
{
    public static void main(String args[])
    {
        // initialise instance variables
        int DNI = Integer.valueOf(args[0]);
        String apellido = args[1];
        String nombre = args[2];
        Double saldo = Double.valueOf(args[3]);
            
        Cliente c = new Cliente(DNI,apellido,nombre,saldo);
        c.mostrar();
    }
}