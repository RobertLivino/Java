/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartesiano;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 0040962123029
 */
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            Poligono pl = new Poligono();
            pl.addVertex(new Ponto());
            pl.addVertex(new Ponto(10,10));
            pl.addVertex(new Ponto(20,20));
            pl.addVertex(new Ponto(30,20));
            pl.addVertex(new Ponto(40,20));
            pl.addVertex(new Ponto(50,20));
            pl.print("");
        } catch (Exception ex) {
            Logger.getLogger(Cartesiano.class.getName()).log(Level.SEVERE, null, ex);
        }
            //        Ponto p;
//        Ponto p1 = new Ponto(10, 20);
//        System.out.println("p1: " + p1);
        
//        Segmento sg1 = new Segmento();
//        Segmento sg2 = new Segmento(1, 3, 4, 6);
//        Segmento sg3 = new Segmento(sg2);
//        
//        System.out.println("sgl: " + sg1);
//        System.out.println("sg2: " + sg2);
//        System.out.println("sg3: " + sg3);

//        Circulo cl1 = new Circulo();
//        Circulo cl2 = new Circulo(10, 20, 7);
//        Circulo cl3 = new Circulo(cl2);
//        
//        System.out.println("c1 == c2 " + cl1.equals(cl2));
//        System.out.println("c2 == c3 " + cl2.equals(cl3));
//        
//        System.out.println("cl: " + cl1);
//        System.out.println("cl: " + cl2);
//        System.out.println("cl: " + cl3);

//        Poligono pl2 = new Poligono();
//        pl2.addVertex(new Ponto());
//        pl2.addVertex(new Ponto(15,15));
//        pl2.addVertex(new Ponto(25,25));
        
//        System.out.println(pl.distance(pl2));
        
//        Circulo cl1 = new Circulo();
//        cl.isValid();
//        cl.perimeter();
//        cl.area();
//        System.out.println("cl: " + cl);
//        System.out.println("cl: " + cl1);
        
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
