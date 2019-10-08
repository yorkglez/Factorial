/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author York
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Factorial 1x2x3x4x5x6...n
        Scanner in = new Scanner(System.in);
        double fact = 1;
        double number = 0;
        
        System.out.println("Number: ");
        number = in.nextDouble();
        
        while(number != 0){
            fact = fact * number; 
            number--;
        }
        System.out.println("The factorial is: "+fact);
        
    }
    
}
