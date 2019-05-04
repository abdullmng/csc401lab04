/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author MUHAMMAD
 */
public class RectangleDemo {
    public static void main(String[] args) {
        // Create one rectangle object
        Rectangle rectangle = new Rectangle(20.0,10.0);
        
        //Get and display the perimeter and area of rectangle;
        System.out.printf("The perimeter of rectangle is: %.2f cm\n", rectangle.perimeter());
        System.out.printf("The area of rectangle is: %.2f square cm\n", rectangle.area());
        
        //get and display the length of rectangle.
        System.out.printf("The length of retcangle is: %.2f cm\n", rectangle.getLength());
        
        //use mutator method to modify the length of recatangle to 12.0
        rectangle.setRectangleLength(12.0);
        
        //get and display the new length of rectangle.
        System.out.printf("The new length of rectangle is: %.2f cm\n",rectangle.getLength());
        
        //get and display the new perimeter and area of rectangle.
       System.out.printf("The perimeter of rectangle is: %.2f cm\n", rectangle.perimeter());
        System.out.printf("The area of rectangle is: %.2f square cm\n", rectangle.area());
        
    }
}
