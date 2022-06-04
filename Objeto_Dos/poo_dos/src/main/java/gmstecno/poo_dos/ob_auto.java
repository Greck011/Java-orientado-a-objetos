/*
 * @author greivin
 */

package gmstecno.poo_dos;

public class ob_auto 
{
    // Declaración de variables para la creación del objeto.
    int id;
    int modelo;
    String marca;
    
    //Constructor. Aquí es donde se crea el objeto (sus atributos por decirlo de alguna manera).
    public ob_auto(int placa, int año, String nombre)
    {
        id = placa;
        modelo = año;
        marca = nombre;
    }
}
