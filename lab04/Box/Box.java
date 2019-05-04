/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box;

/**
 *
 * @author MUHAMMAD
 */
public class Box {
    private double length, width, height; //instance variables 
    /**
     * @param args the command line arguments
     */
    
    public Box(double boxLength, double boxWidth, double boxHeight){//constructor
        length = boxLength;
        width = boxWidth;
        height = boxHeight;
    }
    public double volume() { //instance methods
        return length * width * height;
    }
    public double surfaceArea () {
       return 2*((length * width) + (length * height) + (width * height) );
    }
}