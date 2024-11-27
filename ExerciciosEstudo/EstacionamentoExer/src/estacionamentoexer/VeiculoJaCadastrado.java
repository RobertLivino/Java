/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package estacionamentoexer;

/**
 *
 * @author Robert
 */
public class VeiculoJaCadastrado extends Exception {
    private String msg;
    
    public VeiculoJaCadastrado() {
        this.msg = "Veiculo já está cadastrado";
    }

    public VeiculoJaCadastrado(String placa) {
        this.msg = "Veiculo com a placa " + placa + " já está cadastrado";
    }

    @Override
    public String toString() {
        return msg;
    }
}
