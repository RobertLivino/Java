/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamentoexer;

/**
 *
 * @author Robert
 */
public class Moto extends Veiculos{
    private int cilindrada;
    private boolean bagageiro;

    public Moto(String placa, String modelo, int ano, int cilindrada, boolean bagageiro) {
        super(placa, modelo, ano);
        this.cilindrada = cilindrada;
        this.bagageiro = bagageiro;
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Cilindrada: " + cilindrada + "\n" +
                           "Tem Bagageiro: " + (bagageiro ? "Sim" : "Não") + "\n");
    }
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }
}
