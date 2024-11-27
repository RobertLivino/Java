/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package estacionamentoexer;

/**
 *
 * @author Robert
 */
public class VeiculoNaoCadastrado extends Exception {
    private String msg;
    public VeiculoNaoCadastrado() {
        this.msg = "Veiculo não está cadastrado";
    }

    public VeiculoNaoCadastrado(String placa) {
        this.msg = "Veiculo com a placa " + placa + " não está cadastrado";
    }
    
    @Override
    public String toString() {
        return msg;
    }
}
