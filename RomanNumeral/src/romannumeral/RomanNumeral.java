/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumeral;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author arzatalf
 */
public class RomanNumeral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner rome = new Scanner(System.in);
        out.println("yo enter a number greater than 0 and less than 11");
        int number=rome.nextInt();
        String numeral = "";
        switch (number) {
            case 1: numeral =("I"); 
                break;
            case 2: numeral =("II");
                break;
            case 3: numeral =("III"); 
                break;
            case 4: numeral =("IV"); 
                break;
            case 5: numeral =("V"); 
                break;
            case 6: numeral =("VI"); 
                break;
            case 7: numeral =("VII"); 
                break;
            case 8: numeral =("VIII"); 
                break;
            case 9: numeral =("IX"); 
                break;
            case 10: numeral=("X"); 
                break;
            default: out.println("error enter number less than 10 more than 0");
                break;
        }
        out.printf("%d = %s\n",number,numeral);
    }
    
}

