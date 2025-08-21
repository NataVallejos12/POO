import java.util.*;
/**
 * Trabajo Practico 2 - Clase que crea una Persona.
 * 
 * @author Nataniel Vallejos
 * @version 1.0
 */

public class Persona
{
    private int nroDNI;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    /**
     * Constructor de Persona
     * @param p_dni DNI
     * @param p_nombre Nombre
     * @param p_apellido Apellido
     * @param p_anio Año de nacimiento
    */
    public Persona(int p_DNI, String p_nombre, String p_apellido, int p_anio)
    {
        this.nroDNI = p_DNI;
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.anioNacimiento = p_anio;
    }
    
    //Setters
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
    
    //Getters
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
    
    /**
     * Devuelve edad considerando solo diferencia de años.
     * @return edad en años
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.anioNacimiento ;
    }
    
    /** @return "Nombre Apellido" */
    public String nomYApe(){
        return getNombre() + " " + getApellido();
    }
    
    /** @return "Apellido, Nombre" */
    public String apeYNom(){
        return getApellido() + " " +getNombre();
    }
    
    /**
     * Imprime la información de la Persona.
     */
    public void mostrar(){
        System.out.println("Nombre y apellido: " + nomYApe());
        System.out.println("DNI: " + getDNI() + "\tEdad: " + edad());
    }
    
} //Fin clase Persona