/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loja;

/**
 *
 * @author 0040962123029
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l = new Lista(10);
        l.add(new Roupa("Shorts", 34, 80));
        
        l.listAll();
    }
    
}
