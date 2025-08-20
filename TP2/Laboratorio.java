
/**
 * Write a description of class Laboratorio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laboratorio
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntero;

    /**
     * Constructor for objects of class Laboratorio
     */
    public Laboratorio(String p_nombre,
                       String p_domicilio,
                       String p_telefono,
                       int p_compraMin,
                       int p_diaEnt)
    {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMinima(p_compraMin);
        setDiaEntero(p_diaEnt);
    }
    
    public Laboratorio(String p_nombre,
                       String p_domicilio,
                       String p_telefono)
    {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
    }
    
    //seteadores y contructores
    private void setNombre(String p_nombre){this.nombre=p_nombre;}
    private void setTelefono(String p_telefono){this.telefono=p_telefono;}
    private void setDomicilio(String p_domicilio){this.domicilio=p_domicilio;}
    private void setCompraMinima(int p_compraMin){this.compraMinima=p_compraMin;}
    private void setDiaEntero(int p_diaEnt){this.diaEntero=p_diaEnt;}
    
    public String getNombre(){return nombre;}
    public String getDomicilio(){return domicilio;}
    public String getTelefono(){return telefono;}
    public int getCompraMinima(){return compraMinima;}
    public int getDiaEntero(){return diaEntero;}
    
    public void nuevaCompraMinima(int p_compraMin){
        
    }
    
    public void diaEntrega(int p_diaEnt){
    }
    
    public String mostrar(){
        return "Laboratorio: " + getNombre() + 
            "\n Domicilio: " + getDomicilio() + " - Telefono: " +getTelefono();
    }




    
    
    

}