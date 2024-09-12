/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author 0040962123029
 */
public class Proprio extends Carros{
    private double valorCompra;
    private String dataCompra;

    public Proprio(double valorCompra, String dataCompra, String placa, String anoFab, String modelo) {
        super(placa, anoFab, modelo);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    @Override
    public void ImprimeDados(){
        System.out.println("Valor de compra: " + valorCompra + "\n" +
                           "Data da compra: " + dataCompra + "\n");
        super.ImprimeDados();
    }
    
    @Override
    public boolean Oferta(double valor){
        return valor >= (valorCompra * 1.1);
    }
}
