/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author MUHAMMAD
 */
public class CircleDemo {
    public static void main(String[] args) {
        //the static method getNumberIOfCircles can be called before creating any object
        System.out.printf("The number of circles is: %d\n",Circle.getNumberOfCircles());
        
        Circle circle1 = new Circle(8.5);
        System.out.printf("The number of circles is: %d\n", Circle.getNumberOfCircles());
        
        Circle circle2 = new Circle(5.0);
        System.out.printf("The number of circles is: %d\n\n", Circle.getNumberOfCircles());
        
        System.out.printf("The area of the first circle is: %.2f square cm\n", circle1.area());
        System.out.printf("The circumference of the first circle is: %.2f cm\n\n", circle1.circumference());
        
        System.out.printf("The area of second circle is: %.2f square cm\n", circle2.area());
        System.out.printf("The circumference of the second circle is: %.2f cm\n", circle2.circumference());
    }
}
