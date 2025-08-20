import java.util.*;
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private int nroDNI;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    

    /**
     * Constructor for objects of class Persona
     */
    public Persona(int p_DNI, String p_nombre, String p_apellido, int p_anio)
    {
        // initialise instance variables
        this.nroDNI = p_DNI;
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.anioNacimiento = p_anio;
    }
    
    private void setDNI(int p_DNI){
        this.nroDNI = p_DNI;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setAnioNacimiento(int p_anio){
        this.anioNacimiento = p_anio;
    }
    
    public int getDNI(){
        return nroDNI;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getAnioNacimiento(){
        return anioNacimiento;
    }
    
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.anioNacimiento ;
    }
    
    public String nomYApe(){
        return getNombre() + " " + getApellido();
    }
    
    public String apeYNom(){
        return getApellido() + " " +getNombre();
    }
    
    public void mostrar(){
        System.out.println("Nombre y apellido: " + nomYApe());
        System.out.println("DNI: " + getDNI() + "\tEdad: " + edad());
    }
    
}