package gmstecno.poo_dos;

/*
 * @author greivin
 */

public class Poo_dos 
{
    //función Princial.
    public static void main(String[] args) 
    {
        //Se crea el objeto, en este caso "mi_auto". Los parámetros se han llamado del constructor.
        ob_auto mi_auto = new ob_auto(666666, 2022, "Isuzu");
        
        System.out.println("*************************************");
        System.out.println(" Datos de mi auto: " + mi_auto.id + " " + mi_auto.modelo + " " + mi_auto.marca);
        System.out.println("*************************************");
    }
}
