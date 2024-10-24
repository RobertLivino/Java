/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package autopeca;

/**
 *
 * @author 0040962123029
 */
public interface ListaControl {
    int adicionarPeça(Peca pc);
    boolean retirarUnidades(int index, int quantidade);
    boolean acrescentarUnidades(int index, int quantidade);
    boolean imprimirPeca(int index);
    void relatorioGeral();
    void relatorioReposição(int qtdMinima);
}
