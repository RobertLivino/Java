/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author 0040962123029
 */
public abstract class Carros {
    protected String placa, anoFab, modelo, vendedor;
    protected boolean disponivel;

    public Carros(String placa, String anoFab, String modelo) {
        this.placa = placa;
        this.anoFab = anoFab;
        this.modelo = modelo;
        this.disponivel = true;
        this.vendedor = "";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(String anoFab) {
        this.anoFab = anoFab;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public boolean Disponvel(){
        return disponivel;
    }
    public abstract boolean Oferta(double valor);
    public boolean VenderCarro(String vendedor, double valorVenda){
        if(!disponivel){
            return false;
        }
        if(!Oferta(valorVenda)){
            return false;
        }
        disponivel = false;
        this.vendedor = vendedor;
        return true;
    }
    public void ImprimeDados(){
        System.out.println("Paca do carro: " + placa + "\n" + 
                           "Ano de fabricação: " + anoFab + "\n" +
                           "Modelo do carro: " + modelo + "\n" +
                           "Disponivel: " + (this.Disponvel()? "Sim":"Não") + "\n" +
                           (!this.Disponvel() ? "vendedor: " + vendedor : ""));
    }
}
