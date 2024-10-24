/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autopeca;

/**
 *
 * @author 0040962123029
 */
public class ListaPecas implements ListaControl{
    private Peca lista[];
    private int count;
    
    public ListaPecas(int capMax) {
        this.lista = new Peca[capMax];
        this.count = 0;
    }
    
    public int buscaPeca(int codigo) {
        for(int i=0; i<count; i++){
            if(lista[i].getCodigo() == codigo) return i;
        }
        return -1;
    }
    @Override
    public int adicionarPeça(Peca pc) {
        if (count >= lista.length) return -1;
        lista[count] = pc;
        count++;
        return count-1;
    }
    
    public int adicionarPeça(int codigo, int estoque, double peso, String descricao) {
        Peca p = new Peca(codigo, estoque, peso, descricao);
        if (count >= lista.length) return -1;
        if (buscaPeca(p.getCodigo()) >= 0) return -1;
        lista[count] = p;
        count++;
        return count-1;
    }
    @Override
    public boolean retirarUnidades(int index, int quantidade) {
        if (index >= count || index < 0) return false;
        if (lista[index].getEstoque() - quantidade < 0) return false;
        lista[index].setEstoque(lista[index].getEstoque() - quantidade);
        return true;
    }
    @Override
    public boolean acrescentarUnidades(int index, int quantidade){
        if (index >= count) return false;
        lista[index].setEstoque(lista[index].getEstoque() + quantidade);
        return true;
    }
    @Override
    public boolean imprimirPeca(int index) {
        if (index >= count) return false;
        lista[index].print();
        return true;
    }
    @Override
    public void relatorioGeral() {
        for(int i=0; i<count; i++){
            lista[i].print();
        }
    }
    @Override
    public void relatorioReposição(int qtdMinima) {
        for(int i=0; i<count; i++){
            if (lista[i].getEstoque() <= qtdMinima)
                lista[i].print();
        }
    }
}
