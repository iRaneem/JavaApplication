/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressionstu;

import java.util.Scanner;

/**
 *
 * @author Re110
 */
public class ProgressionStu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner keyboard = new Scanner (System.in);
      System.out.println("This program will calculate the " +
                         "geometric and harmonic progression " +
                         "for the number you enter.");
      System.out.print("Enter an integer that is greater than " +
                       "or equal to 1:  ");
      int input = keyboard.nextInt();

      // Match the method calls with the methods you write 
      int geomAnswer = geometricRecursive(input);
      double harmAnswer = harmonicRecursive(input);

      System.out.println("Using recursion:");
      System.out.println("The geometric progression of " +
                         input + " is " + geomAnswer);
     System.out.println("The harmonic progression of " +
                         input + " is " + harmAnswer);

      // Match the method calls with the methods you write 
      geomAnswer = geometricIterative(input);
      harmAnswer = harmonicIterative(input);

      System.out.println("Using iteration:");
      System.out.println("The geometric progression of " +
                         input + " is " + geomAnswer);
      System.out.println(input +
              "The harmonic progression of " + " is " + harmAnswer);
    }
   
   /**
      This is the geometricRecursive method.
     * @param n
      @return The geometric progression of number.
   */
   
   // ADD LINES FOR TASK #2 HERE 
   public static int geometricRecursive (int n){
       if (n==1){
       return 1;
       }
       return n*geometricRecursive(n-1);
   } 
     public static int geometricIterative (int n){
         int geo = 1;
         while(  n !=0 ){
              geo = geo * n;
              n--;
         }
         return geo;
     } 
   public static double harmonicRecursive (int n){
       if (n==1){
       return 1;}
       return (1.0/n)*harmonicRecursive(n-1);
       
   } 
   public static double harmonicIterative (int n){
         double harmonic = 1.0;
         while(  n != 0 ){
              harmonic = (1.0/n)* harmonic ;
              n--;
         }
         return harmonic;
     } 
   
    
    
}
