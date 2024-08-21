/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

/**
 *
 * @author 0040962123029
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Ponto p;
        p = new Ponto();
        p.setXY(2, 9);
        p.distance(3, 7);
        p.print();
        p.setXY(2, 9);
        p.desloc(5, 1);
        p.print();
        p.setXY(2, 9);
        p.escale(2.3);
        p.print();
    }
    
}
