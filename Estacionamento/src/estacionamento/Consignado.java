/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author 0040962123029
 */
public class Consignado extends Carros {
    private String nomeProprietario;
    private double valorProprietario;

    public Consignado(String nomeProprietario, double valorProprietario, String placa, String anoFab, String modelo) {
        super(placa, anoFab, modelo);
        this.nomeProprietario = nomeProprietario;
        this.valorProprietario = valorProprietario;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getValorProprietario() {
        return valorProprietario;
    }

    public void setValorProprietario(double valorProprietario) {
        this.valorProprietario = valorProprietario;
    }
    
    @Override
    public void ImprimeDados(){
        System.out.println("Nome do proprietario: " + nomeProprietario + "\n" +
                           "valor que ele deseja receber pelo carro: " + valorProprietario + "\n");
        super.ImprimeDados();
    }
    
    @Override
    public boolean Oferta(double valor){
        return valor >= (valorProprietario * 1.05);
    }
}
