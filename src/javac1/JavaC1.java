/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javac1;

/**
 *
 * @author moloranemothusimichael
 */

public class JavaC1 {
    
    public static void go(Long n) 
        {System.out.println("Long ");}
    public static void go(Short n) {System.out.println("Short ");}
    public static void go(int n) {System.out.println("int ");}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y = 6;
        long z = 7;
        go(y);
        go(z);
    }
    
}