/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 0040962123029
 */
public class Vendedores extends Funcionario{
    protected double vendas;

    public Vendedores(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        this.vendas = 0; 
    }
    
    public void registrarVenda (int valor){
        vendas += valor;
    }
    
    @Override
    public double salarioLiquido(){
        return salarioBase + (vendas * 0.03);
    }
    
    @Override
    public void novoMes(){
        vendas = 0;
    }
    
    @Override
    public void holerrith(){
        super.holerrith();
        System.out.println("Valor total de vendas:" + vendas + "\n" +
                           "Salario Liquido: " + salarioLiquido() + "\n");
    }
}
