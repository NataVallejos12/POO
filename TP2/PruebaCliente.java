
/**
 * Ejecutable para probar la clase Laboratorio.
 */
public class PruebaCliente
{
    public static void main(String args[])
    {
        //Ingreso de parametros por el metodo main.
        int DNI = Integer.valueOf(args[0]);
        String apellido = args[1];
        String nombre = args[2];
        Double saldo = Double.valueOf(args[3]);
            
        Cliente c = new Cliente(DNI,apellido,nombre,saldo);
        c.mostrar();
        //Prueba de agregar saldo.
        c.agregaSaldo(500);
        c.mostrar();
        //Prueba de reemplazar el saldo.
        c.nuevoSaldo(300);
        c.mostrar();
    }
}