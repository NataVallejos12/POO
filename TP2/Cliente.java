
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
    /**
     * Constructor for objects of class Laboratorio
     */
    Cliente(int p_DNI, String p_apellido, String p_nombre, double p_saldo)
    {
        setDNI(p_DNI);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSaldo(p_saldo);
    }
    
    //seteadores y contructores
    private void setDNI(int p_DNI){this.nroDNI = p_DNI;}
    private void setNombre(String p_nombre){this.nombre = p_nombre;};
    private void setApellido(String p_apellido){this.apellido = p_apellido;}
    private void setSaldo(double p_saldo){this.saldo = p_saldo;}
    
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public int getNroDNI(){return this.nroDNI;}
    public double getSaldo(){return this.saldo;}
    
    public double agregaSaldo(double p_importe){
        this.saldo += p_importe;
        return this.saldo;
    }
    
    public double nuevoSaldo(double p_importe)
    {
        this.saldo = p_importe;
        return this.saldo;
    }
    
    public String nomYape(){
        return getNombre() + " " + getApellido();
    }
    
    public String apeYnom(){
        return getApellido() + " " +getNombre();
    }
    
    public void mostrar(){
        System.out.println("- Cliente - "); 
        System.out.println("Nombre y Apellido: " + nomYape() + " (" + getNroDNI() + ")");
        System.out.println("Saldo: $" + getSaldo());
    }




    
    
    

}