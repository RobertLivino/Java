/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040962123029
 */
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Ponto p;
//        Ponto p1 = new Ponto(10, 20);
//        System.out.println("p1: " + p1);
        Circulo cl = new Circulo(10, 20, 7);
        cl.isValid();
        cl.perimeter();
        cl.area();
        System.out.println("cl: " + cl);
        
//        p.setXY(2, 9);
//        p.distance(3, 7);
//        p.distance();
//        p.print();
//        p.setXY(2, 9);
//        p.desloc(5, 1);
//        p.print();
//        p.setXY(2, 9);
//        p.escale(2.3);
//        p.print();
    }
    
}
