/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author MUHAMMAD
 */
public class Student {
    String name;
    int IDNumber;
    double quiz1, quiz2, quiz3;
    public Student(String studentName, int id, double q1, double q2, double q3) {
        name = studentName;
        IDNumber = id;
        quiz1 = q1;
        quiz2 = q2;
        quiz3 = q3;
    }
    public String getName() {
         return name;
    }
    public int getIDNum() {
        return IDNumber;
    }
    public double getQuiz1() {
        return quiz1;
    }
    public double getQuiz2() {
        return quiz2;
    }
    public double getQuiz3() {
        return quiz3;
    }
    
    public void setQuiz1(double newQuiz1) {
        quiz1 = newQuiz1;
    }
    public void setQuiz2(double newQuiz2) {
        quiz2 = newQuiz2;
    }
    public void setQuiz3(double newQuiz3) {
        quiz3 = newQuiz3;
    }
    public double average() {
        return (quiz1 + quiz2 + quiz3)/3;
    }
    public String printDetails() {
        String details = "Student Name: " + name + "\n" + "Student ID: " + IDNumber + "\n" + "Scores for quiz1, quiz2 and quiz3 respectively is: " + quiz1 + "\t\t" + quiz2 + "\t\t" + quiz3 + "\n";;
        return details;
    }
}
