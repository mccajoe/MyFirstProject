/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.joey.myfirstproject;

/**
 *
 * @author mccajoey711
 */
public class MyFirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*INSERT TITLE HERE*");
        
        int number1 = 5;
        int number2 = 4;
        
        System.out.println("Addition: " + DoMath(number1, number2));        
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
        System.out.println("Exponentation: " + Math.pow(number1, number2));
        System.out.println("Magic: " + (number1 % number2));
        
        if (IsEvenNumber(74)) {
            System.out.println("That number is even! YEEEEAH!");
        } else {
            System.out.println("That number wasn't true, you suck!");
        }
    }
    
    public static Integer DoMath(int num1, int num2){
        return num1 + num2;
    }
        
    public static Boolean IsEvenNumber(int number){
//         if (number % 2 == 0) {
//             return true;
//         } else {
//             return false; 
//         } 
        return (number % 2 == 0);
    }   
}

