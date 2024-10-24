/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autopeca;

/**
 *
 * @author 0040962123029
 */
public class Autopeca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaPecas lp = new ListaPecas(10);
        lp.adicionarPeça(new Peca(1, 10, 12.33, "Peca1"));
        lp.adicionarPeça(new Peca(2, 11, 10.33, "Peca2"));
        lp.retirarUnidades(1, 5);
        lp.imprimirPeca(0);
        lp.retirarUnidades(0, 3);
        lp.acrescentarUnidades(0, 1);
        lp.relatorioGeral();
        lp.relatorioReposição(6);
    }
    
}
