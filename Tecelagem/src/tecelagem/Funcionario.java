/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 0040962123029
 */
public abstract class Funcionario {
    protected String nome, rg;
    protected int cod;
    protected double salarioBase;

    public Funcionario(String nome, String rg, double salarioBase, int cod) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
        this.cod = cod;
    }
    
    public abstract double salarioLiquido();
    public void holerrith(){
        System.out.println("Nome:" + nome + "\n" +
                           "Rg: " + rg + "\n" +
                           "Salario Base: " + salarioBase + "\n" +
                           "Codigo do funcionario: " + cod);
    }
    public abstract void novoMes();
}
