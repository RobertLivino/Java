/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamentoexer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robert
 */
public class EstacionamentoExer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ListaVeiculo lv = new ListaVeiculo(5);
            lv.cadastrar(new Carro("00", "Modelo bom", 2018, 4, true));
            lv.cadastrar(new Moto("01", "Modelo bom", 2018, 300, true));
            lv.entrada("00");
            lv.saida("00", true);
            lv.saida("00", true);
            lv.saida("00", true);
            lv.saida("01", true);
            lv.saida("01", true);
            lv.saida("01", true);
            lv.listarVeiculos();
            lv.liberar("01");
            lv.listarVeiculos();
//            lv.listarCarros();
        } catch (Exception ex) {
            Logger.getLogger(EstacionamentoExer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
