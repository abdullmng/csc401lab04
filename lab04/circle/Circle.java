/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;
//demonstrating the use of static variables;
/**
 *
 * @author MUHAMMAD
 */
public class Circle {
    private static int numberOfCircles = 0; //a static variable
    private double radius; //instance variable
    
    public Circle(double circleRadius) {
        numberOfCircles++;
        radius = circleRadius;
    }
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
    public double circumference() {
        return 2.0 * Math.PI * radius;
    }
    public static int getNumberOfCircles() {
        return numberOfCircles;
    }
}
