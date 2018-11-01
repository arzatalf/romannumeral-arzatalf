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
        switch (number) {
            case 1: out.println("1=I"); break;
            case 2: out.println("2=II"); break;
            case 3: out.println("3=III"); break;
            case 4: out.println("4=IV"); break;
            case 5: out.println("5=V"); break;
            case 6: out.println("6=VI"); break;
            case 7: out.println("7=VII"); break;
            case 8: out.println("8=VIII"); break;
            case 9: out.println("9=IX"); break;
            case 10: out.println("10=X"); break;
            default: out.println("error enter number less than 10 more than 0");
            break;
        }
    }
    
}
