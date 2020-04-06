
package Clases;
import Clases.CB;
import Interfaz.IA;
import Interfaz.IB;
import Interfaz.IC;
/**
 *
 * @author alexl
 */
public class CA implements IA,IB,IC, Comparable<CA> {
     
   public int x,y;
    private int suma;

    public CA() {
        x=0;
        y=0;      
    }
    public CA(int x, int y) {
       this.x=x;
        this.y=y; 
    }   
   @Override
    public int Suma(){
        return x+y;    
    }
    public int Mayor() {
        return Math.max(x, y);       
    }
    public int Suma(int c) {       
       return x + y;       
    }
    @Override
    public int Multi(int a) {
       return x*y ;      
    }
    public int Multi() {
       return x*y;      
    }
    public int Sumar() {
       return x+y;     
    }
    public int CompareTo(CA t) {
        return x==t.x?1:x>t.x?-1:0;
    }
    
}

        
    
