/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases2;

/**
 *
 * @author alexl
 */
public class CD extends CC{ 
    public int X,Y;
    
    public CD(int x, int y) {
        this.X=x;
        this.Y=y;      
    }
    @Override
    public int suma() {
        return X+Y;
    }       
}
