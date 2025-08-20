import java.util.Scanner;

public class EjecutableEmpleado{
    
    public static void main (String args[]){
        Scanner leer = new Scanner(System.in);
        int masEmpleados = 1;
        
        while(masEmpleados == 1){
            System.out.println("Ingrese cuil: ");
            long cuil = leer.nextLong();
 
            System.out.println("Ingrese el apellido: ");
            String apellido = leer.next();
        
            System.out.println("Ingrese el nombre: ");
            String nombre = leer.next();
        
            System.out.println("Ingrese el sueldo basico: ");
            double sueldoBasico = leer.nextDouble();
        
            System.out.println("Ingrese el anio de ingreso: ");
            int anioIngreso = leer.nextInt();
        
            Empleado NuevoEmpleado = new Empleado (cuil,apellido,nombre,sueldoBasico,anioIngreso);
            
            NuevoEmpleado.mostrar();
            System.out.println("\n" + NuevoEmpleado.mostrarLinea());
            
            System.out.println("\nDesea ingresar otro empleado? (1-Si, 0-No): ");
            masEmpleados = leer.nextInt();
        }
    }
}