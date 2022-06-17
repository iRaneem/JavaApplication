/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionstu;

/**
 *
 * @author Re110
 */
public class RecursionStu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 7;

      // Test out the factorial
      System.out.println(n + " factorial equals ");
      System.out.println(RecursionStu.factorial(n));
      System.out.println();
   }
   
   /**
      This is the factorial method.
      @param n A number.
      @return The factorial of n.
   */
   
   public static int factorial(int n)
   {
       int temp; 
 System.out.println("Method call -- " + 
 "calculating " + 
"Factorial of: " + n); 
      
      if (n == 0)
      {
         return 1;
      }
      else
      {
         temp = factorial(n - 1); 
 System.out.println("Factorial of: " + 
(n - 1) + " is " + 
temp); 
 return (temp * n);  
        
      }
   }
}
    
    

