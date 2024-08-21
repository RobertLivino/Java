/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiro;

/**
 *
 * @author 0040962123038
 */
public class Primeiro {
    
    public static void main(String[] args) 
    {
        Pessoa p;
        
        p = new Pessoa("Cristiano", "Messi");

//        Caso não haja construtores
//        p = new Pessoa();        
//        p.setNome("Cristiano");
//        p.setSobrenome("Cristiano");
        
//        (new Pessoa("Cristiano", "Messi")).print();
        p.print();
    }
    
}
