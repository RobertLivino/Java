/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamentoexer;

/**
 *
 * @author Robert
 */
public abstract class Veiculos {
    private String placa, modelo ;
    private int ano, limite;
    private boolean bloqueado;
    
    public Veiculos (String placa, String modelo, int ano){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.limite = 0;
        this.bloqueado = false;
    }
    
    public void contarLimit() {
        limite++;
        if(limite >= 3) bloqueado = true;
    }
    
    public void print() {
        System.out.println("Placa: " + placa + "\n" +
                           "Modelo: " + modelo + "\n" +
                           "Ano: " + ano + "\n" +
                           "Vezes limite de permanencia exedido: " + limite + "\n" +
                           "Veiculo bloqueado: " + (bloqueado ? "Sim" : "Não"));
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    
}
