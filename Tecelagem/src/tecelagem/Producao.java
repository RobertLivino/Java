/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 0040962123029
 */
public class Producao extends Funcionario{
    protected double horasDiurnas, horasNoturnas;

    public Producao(String nome, String rg, double salarioBase, int cod) {
        super(nome, rg, salarioBase, cod);
        this.horasDiurnas = 0;
        this.horasNoturnas = 0;
    }
    
    public void horasDiurnas (int horas){
        horasDiurnas += horas;
    }
    public void horasNoturnas (int horas){
        horasNoturnas += horas;
    }
    
    @Override
    public double salarioLiquido(){
        return (horasDiurnas * super.salarioBase) + ((horasNoturnas * super.salarioBase) * 1.30);
    }
    
    @Override
    public void novoMes(){
        horasDiurnas = 0;
        horasNoturnas = 0;
    }
    
    @Override
    public void holerrith(){
        super.holerrith();
        System.out.println("Horas Diurnas:" + horasDiurnas + "\n" +
                           "Horas Noturnas:" + horasNoturnas + "\n" +
                           "Salario Liquido: " + salarioLiquido()+ "\n");
    }
}
