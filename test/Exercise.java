/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ciphe
 */
import java.util.Arrays;
public class Exercise {
    // Define a procedure that takes three numbers as arguments and returns the sum of the squares of the two larger numbers.
    public double getSumOfSquares(double val, double val1, double val2){
        double arrValues[] = {val, val1, val2};
        Arrays.sort(arrValues);
        return Math.sqrt(arrValues[2]) + Math.sqrt(arrValues[1]) ;
    }
    
    public static void main (String[] args){
        Exercise exe = new Exercise();
        System.out.println(exe.getSumOfSquares(3, 2, 7));
    }    
}
