/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 0040962123029
 */
public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Administracao adm = new Administracao("Carlos", "55560698009", 1314);
//        adm.registrarFalta();
//        adm.holerrith();
//        adm.novoMes();
//        adm.holerrith();
        
//        Producao prd = new Producao("Carlos", "55560698009", 13);
//        prd.horasDiurnas(230);
//        prd.holerrith();
//        prd.horasNoturnas(10);
//        prd.holerrith();
//        prd.novoMes();
//        prd.holerrith();
        
        Vendedores vnd = new Vendedores("Carlos", "55560698009", 1300);
        vnd.registrarVenda(13);
        vnd.holerrith();
        vnd.registrarVenda(150);
        vnd.holerrith();
        vnd.novoMes();
        vnd.registrarVenda(350);
        vnd.holerrith();
        
    }
    
}
