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
    protected double salarioBase;

    public Funcionario(String nome, String rg, double salarioBase) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
    }
    
    public abstract double salarioLiquido();
    public void holerrith(){
        System.out.println("Nome:" + nome + "\n" +
                           "Rg: " + rg + "\n" +
                           "Salario Base: " + salarioBase);
    }
    public abstract void novoMes();
}
