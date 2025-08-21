/**
 * Ejecutable para probar la clase Laboratorio.
 */
public class PruebaLaboratorio
{
    public static void main(String args[]){
        Laboratorio lab1 = new Laboratorio("Jesus", "Junin 1945", "3794-pipipipi", 1645646546, 2);
        Laboratorio lab2 = new Laboratorio("Diosito", "Junin 1946", "3794-papa");
        //Prueba de mensajes.
        System.out.println(lab2.getDiaEntrega());
        System.out.println(lab2.getCompraMinima());
        
        //Ajustes de politica
        lab2.nuevaCompraMinima(500);
        lab2.nuevoDiaEntrega(4);
        
        //Prueba de mensajes nuevamente.
        System.out.println(lab2.getDiaEntrega());
        System.out.println(lab2.getCompraMinima());
        
        //Muestra de información solicitada.
        System.out.print(lab1.mostrar());
        System.out.print(lab2.mostrar());
    }
}
    