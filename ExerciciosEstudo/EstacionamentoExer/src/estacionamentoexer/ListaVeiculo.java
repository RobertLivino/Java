/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamentoexer;

/**
 *
 * @author Robert
 */
public class ListaVeiculo {
    private Veiculos lista[];
    private int count;
    
    public ListaVeiculo (int capMax) {
        this.lista = new Veiculos[capMax];
        this.count = 0;
    }
    
    public int buscar(String placa) {
        for (int i = 0 ; i < count; i++){
           if(lista[i].getPlaca() == placa) return i;
        }
        return -1;
    }
    public void cadastrar(Veiculos veiculo) throws Exception{
        int index = buscar(veiculo.getPlaca());
        if (count >= lista.length) throw new ListaCheia(count);
        if (index >= 0) throw new VeiculoJaCadastrado(veiculo.getPlaca());
        lista[count] = veiculo;
        count++;
    }
    public void entrada(String placa) throws Exception{
        int index = buscar(placa);
        if (index < 0) throw new VeiculoNaoCadastrado(placa);
        if (lista[index].isBloqueado()) throw new VeiculoBloqueado(placa);
    }
    public void saida(String placa, boolean excedeu) throws Exception{
        int index = buscar(placa);
        if (index < 0) throw new VeiculoNaoCadastrado(placa);
        if (excedeu) lista[index].contarLimit();
    }
    public void liberar(String placa) throws Exception{
        int index = buscar(placa);
        if (index < 0) throw new VeiculoNaoCadastrado(placa);
        lista[index].setBloqueado(false);
    } 
    public void listarCarros(){
        for(int i = 0; i < count; i++){
            if(lista[i] instanceof Carro) lista[i].print();
        }
    }
    public void listarVeiculos() {
        int veiculosBloqueados = 0;
        for(int i = 0; i < count; i++){
            lista[i].print();
            if(lista[i].isBloqueado()) veiculosBloqueados++;
        }
        System.out.println("O total de veiculos bloqueados por limite de tempo foram: " + veiculosBloqueados);
    } 
}
