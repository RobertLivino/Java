/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploexc;

/**
 *
 * @author 0040962123029
 */
public class ExemploExc {

    public static int div(int a, int b) {
        return a/b;
    }
    public static void main(String[] args) {
        int a = 10, b = 0;
        
        int r = 0;
        
        try {
            r = div(a,b);
        }
        catch(ArithmeticException exc) {
            System.out.println(exc.getMessage());
        }
        
        System.out.println("r = " + r);
    }
    
}
