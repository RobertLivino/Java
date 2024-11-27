/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package estacionamentoexer;

/**
 *
 * @author Robert
 */
public class VeiculoBloqueado extends Exception {
    private String msg;
    
    public VeiculoBloqueado() {
        this.msg = "Veiculo está bloqueado";
    }
    
    public VeiculoBloqueado(String placa) {
        this.msg = "Veiculo com a placa " + placa + " está bloqueado";
    }
    
    @Override
    public String toString() {
        return msg;
    }
}
