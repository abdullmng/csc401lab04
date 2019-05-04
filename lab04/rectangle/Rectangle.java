/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;
//demonstrating using accessor an mutator method
/**
 *
 * @author MUHAMMAD
 */
public class Rectangle {
    private double length, width;
    
    public Rectangle(double rectangleLength, double rectangleWidth) {
        length = rectangleLength;
        width = rectangleWidth;
    }
    public double area(){
        return length * width;
    }
    public double perimeter() {
        return length + width;
    }
    //Accessor method 
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    //mutator method
    public void setRectangleLength(double newLength){
        length = newLength;
    }
    public void setRectangleWidth(float newWidth){
        width = newWidth;
    }
}
