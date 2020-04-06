
package Clases;
import Clases.CA;
/**
 *
 * @author alexl
 */
public class CB extends CA {

  public  int Z;
    private int z;
    
    public CB(int z, int x, int y) {
        super(x, y);
        this.z = z;
        Z=0;
    }
    public int sumar() {
      return x+y+z;
    }   
}

