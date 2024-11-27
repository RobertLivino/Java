/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package estacionamentoexer;

/**
 *
 * @author Robert
 */
public class ListaCheia extends Exception {
    private String msg;
    
    public ListaCheia() {
        this.msg = "A lista de veiculos esta cheia";
    }
    public ListaCheia(int count) {
        this.msg = "A lista de veiculos esta cheia com " + count + " veiculos";
    }
    
    @Override
    public String toString() {
        return msg;
    }
}
