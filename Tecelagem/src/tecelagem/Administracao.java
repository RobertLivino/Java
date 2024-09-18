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
    public Administracao(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        this.faltas = 0;
    }
    
    public void registrarFalta(){
        faltas += 1;
    }
    
    @Override
    public double salarioLiquido(){
        return salarioBase - ((super.salarioBase/30) * faltas);
    }
    
    @Override
    public void novoMes(){
        faltas = 0;
    }
    
    @Override
    public void holerrith(){
        super.holerrith();
        System.out.println("Faltas: " + faltas + "\n" +
                           "Salario Liquido: " + salarioLiquido() + "\n");
    }
}
