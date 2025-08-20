import java.util.*;

public class Empleado{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    
    Empleado(long p_cuil,String p_apellido,String p_nombre,double p_sueldoBasico,int p_anioIngreso){
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldoBasico(p_sueldoBasico);
        setAnioIngreso(p_anioIngreso);
    }
    
    public long getCuil(){
        return this.cuil;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    
    private void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso = p_anioIngreso;
    }
    
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar(); 
        int anioHoy  = fechaHoy.get(Calendar.YEAR); 
        
        return anioHoy - getAnioIngreso();
    }
    
    private double descuento(){
        return ((getSueldoBasico() * 0.02) + 1500);
    }
    
    private double adicional(){
        if(antiguedad() < 2){
            return (getSueldoBasico() * 0.02);
        }else if(antiguedad() >= 2 && antiguedad() < 10){
            return (getSueldoBasico() * 0.04);
        }else{
            return (getSueldoBasico() * 0.06);
        }
    }
    
    public double sueldoNeto(){
        return getSueldoBasico() + adicional() - descuento();
    }
    
     public String nomYApe(){
        return (getNombre() + "  " + getApellido());
    }
    
    public String apeYNom(){
        return (getApellido() + "," + getNombre());
    }
    
    public void mostrar(){
        System.out.println("Nombre y apellido: " + nomYApe()
                            + "\nCUIL: " + getCuil() + "   Antiguedad: " + antiguedad() + " anio/s de servicio"
                            + "\nSueldo neto: " + sueldoNeto());
    }
    
    public String mostrarLinea(){
        return (getCuil() + "  " + apeYNom() + ".................." + sueldoNeto());
    }
}