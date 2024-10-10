/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 0040962123029
 */
public class Administracao extends Funcionario {
    
    public int faltas;
    public Administracao(String nome, String rg, double salarioBase, int cod) {
        super(nome, rg, salarioBase, cod);
        this.faltas = 0;
    }
    
    public void registrarFalta(){
        faltas ++;
    }
    
    private double desconto(){
        return (salarioBase/30) * faltas;
    }
    
    @Override
    public double salarioLiquido(){
        return salarioBase - desconto();
    }
    
    @Override
    public void novoMes(){
        faltas = 0;
    }
    
    @Override
    public void holerrith(){
        super.holerrith();
        System.out.println("Faltas: " + faltas + "\n" +
                           "Disconto por faltas: " + desconto() + "\n" +
                           "Salario Liquido: " + salarioLiquido() + "\n");
    }
}
