/**
 *
 * Prompts user to enter a value, checks if negative -- if not, prints out the square root
 *
 * @author <Will Fox>
 * @version <12th October 2014>
 *
 */

import java.util.Scanner;
public class SquareRootChecker {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter an number.");
        double sqrtx2 = 0.0;
        
        double x2 = scnr.nextDouble();
        
        if (x2 >= 0) {
            sqrtx2 = Math.sqrt(x2);
            System.out.println("The square root of " + x2 + " is " + sqrtx2);
        }
        
        else {
            System.out.println("CAN NOT COMPUTE SQUARE ROOT OF A NEGATIVE INTEGER.");
        }
        
        return;
    }
    
}
