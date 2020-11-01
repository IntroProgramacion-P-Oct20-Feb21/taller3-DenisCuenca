/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean n1 = ((Math.sqrt(81)+9)/3)==9;
        boolean n2 = 10>1;
        boolean n3  = 100/25+Math.sqrt(100)>=14;
        System.out.println(n1||n2&&n3);
    }
    
}
