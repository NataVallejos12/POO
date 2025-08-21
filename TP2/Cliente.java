
/**
 * Trabajo Practico 2 - Clase que crea un Cliente.
 * 
 * @author Nataniel Vallejos
 * @version 1.0
 */

public class Cliente
{
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
    /**
     * Constructor completo.
     * @param p_DNI Numero de DNI
     * @param p_apellido Apellido
     * @param p_nombre Nombre
     * @param p_saldo Saldo
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
    
    /** 
     * Agrega un saldo al saldo actual.
     * @param p_importe Importe
     * @return importe actualizado.
     */
    public double agregaSaldo(double p_importe){
        this.saldo += p_importe;
        return this.saldo;
    }
    
    /** 
     * Reemplaza el saldo actual.
     * @param p_importe Importe
     * @return saldo nuevo actualizado.
     */
    public double nuevoSaldo(double p_importe)
    {
        this.saldo = p_importe;
        return this.saldo;
    }
    
    /** 
     * Devuelve el nombre y apellido.
     * @return nombre y apellido.
     */
    public String nomYape(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /** 
     * Devuelve el apellido y nombre.
     * @return apellido y nombre.
     */
    public String apeYnom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    /** 
     * Muestra la información solicitada.
     */
    public void mostrar(){
        System.out.println("- Cliente - "); 
        System.out.println("Nombre y Apellido: " + this.nomYape() + " (" + this.getNroDNI() + ")");
        System.out.println("Saldo: $" + this.getSaldo());
    }




    
    
    

}