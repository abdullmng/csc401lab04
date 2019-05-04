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
public class BoxDemo {
    public static void main(String[] args) {
        //create two box object;
        Box box1 = new Box(20.0, 10.0, 15.0);
        Box box2 = new Box(6.0, 4.0, 2.0);
        double volume, area;
        
        //get and display volume and surface area of box1
        volume = box1.volume();
        area = box1.surfaceArea();
        
        System.out.printf("the volume of box1 is : %.2f cubic cm \n", volume);
        System.out.printf("The surface Area of box1 is: %.2f square cm \n",area);
        
        //get and display volume and surface area of box2;
         System.out.printf("The volume of box2 is: %.2f cubic cm \n", box2.volume());
         System.out.printf("The surface area of box2 is: %.2f square cm\n", box2.surfaceArea());
    }
}
