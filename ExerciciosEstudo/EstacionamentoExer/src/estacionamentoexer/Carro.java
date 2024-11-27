/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamentoexer;

/**
 *
 * @author Robert
 */
public class Carro extends Veiculos{
    private int portas;
    private boolean arCondicionado;

    public Carro(String placa, String modelo, int ano, int portas, boolean arCondicionado) {
        super(placa, modelo, ano);
        this.portas = portas;
        this.arCondicionado = arCondicionado;
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Portas: " + portas + "\n" +
                           "Tem ar-condicionado: " + (arCondicionado ? "Sim" : "Não") + "\n");
    }
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
}
