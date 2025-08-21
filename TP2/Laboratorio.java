
/**
 * Trabajo Practico 2 - Clase que crea un Laboratorio.
 * 
 * @author Nataniel Vallejos
 * @version 1.0
 */

public class Laboratorio
{

    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor completo.
     * @param p_nombre Nombre
     * @param p_domicilio Domicilio
     * @param p_domicilio Telefono
     * @param p_compraMin Compra minima
     * @param p_diaEnt Dia ede entrega
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
        setDiaEntrega(p_diaEnt);
    }
    
    /**
     * Constructor parcial (sin compra mínima ni día de entrega).
     * @param p_nombre Nombre
     * @param p_domicilio Domicilio
     * @param p_domicilio Telefono
     */
    public Laboratorio(String p_nombre,
                       String p_domicilio,
                       String p_telefono)
    {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        this.compraMinima=0;
        this.diaEntrega=0;
    }
    
    //Seteadores
    private void setNombre(String p_nombre){this.nombre=p_nombre;}
    private void setTelefono(String p_telefono){this.telefono=p_telefono;}
    private void setDomicilio(String p_domicilio){this.domicilio=p_domicilio;}
    private void setCompraMinima(int p_compraMin){this.compraMinima=p_compraMin;}
    private void setDiaEntrega(int p_diaEnt){this.diaEntrega=p_diaEnt;}
    
    //Constructores
    public String getNombre(){return nombre;}
    public String getDomicilio(){return domicilio;}
    public String getTelefono(){return telefono;}
    public int getCompraMinima(){return compraMinima;}
    public int getDiaEntrega(){return diaEntrega;}
    
    //atributos no incluidos en constructor pueden cambiar por política, son metodos públicos. 
    public void nuevaCompraMinima(int p_compraMin){
        this.compraMinima=p_compraMin;
    }
    
    public void nuevoDiaEntrega(int p_diaEnt){
        this.diaEntrega=p_diaEnt;
    }
    
    /**
     * Devuelve la cadena de presentación con el formato pedido.
     * @return String 
     */
    public String mostrar(){
        return "\nLaboratorio: " + this.getNombre() + 
            "\n Domicilio: " + this.getDomicilio() + " - Telefono: " + this.getTelefono();
    }




    
    
    

}