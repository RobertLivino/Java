/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamento;

/**
 *
 * @author 0040962123029
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consignado con = new Consignado("Robert", 15000, "ma8b-5555", "12/2/2018", "Ford Ka");
        con.ImprimeDados();
//        System.out.println(con.Oferta(5000));
        con.VenderCarro("Steve", 25000);
        con.ImprimeDados();
        
//        Proprio pro = new Proprio(15000, "12/2/2022", "ma8b-5555", "12/2/2018", "Ford Ka");
//        pro.ImprimeDados();
    }
    
}
