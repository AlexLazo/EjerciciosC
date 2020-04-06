
package EjVirtual;
import Clases.CA;
import Clases.CB;
import Clases2.CD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author alexl
 */
public class EjVirtual {
    private static ArrayList CA = new ArrayList<>();
  
    public static void main(String[] args) {         
        CB a = new CB(1, 2, 3);
        CD d = new CD(1, 2);
        CA ca = new CA(1, 3);
        
        System.out.println("La suma es: " + a.sumar());
        System.out.println("La suma es: " + d.suma());
        System.out.println("La suma es: " + ca.Sumar());
        System.out.println("La multiplicacion es: " + ca.Multi());
        System.out.println("El valor mayor es: " + ca.Mayor());
        
        ArrayList<CA> Clase1 = new ArrayList<CA>();
        Clase1.add(new CA(7, 5));
        Clase1.add(new CA(6, 5));
        Clase1.add(new CA(2, 4));
        Clase1.add(new CA(35, 78));
        
        for (CA auxiliar : Clase1) {
            System.out.println("\nLos elementos oredenados de mayor a menor X son: " + auxiliar.x + 
                    " \nNumeros en Y son:  " + auxiliar.y);   
        }
    }
}