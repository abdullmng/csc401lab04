/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
/**
 *
 * @author MUHAMMAD
 */
public class StudentDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student student = new Student("Abdullahi",1031,57,60,72);
        //System.out.printf("Student Name: %s\n", student.getName());
        //System.out.printf("Student ID: %d\n", student.getIDNum());
        //System.out.printf("Scores for quiz1, quiz2 and quiz3 respectively: %.2f \t %.2f \t %.2f\n\n", student.getQuiz1(),student.getQuiz2(),student.getQuiz3());
        System.out.print(student.printDetails());
        
        //gets and display average
        System.out.printf("Average of three quizes is: %.2f\n\n", student.average());
        
        //set new value for quiz3
        System.out.print("Enter new score for quiz3: ");
        double q3 = input.nextDouble();
        student.setQuiz3(q3);
        
        System.out.print(student.printDetails());        
        //gets and display average after update
        System.out.printf("Average of three quizes is: %.2f\n", student.average());
        
    }
}
