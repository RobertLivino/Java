/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 0040962123029
 */
public class ListaFunc {
    private Funcionario lista[];
    private int count;
    
    public ListaFunc(int capMax) {
        this.lista = new Funcionario[capMax];
        this.count = 0;
    }
    
    public int buscaCod(int cod) {
        for(int i = 0; i< count; i++) {
            if(lista[i].cod == cod){
                return i;
            }
        }
        return -1;
    }
    
    public boolean addFunc(Funcionario f) {
//        if(count >= lista.length) return false;
        if(buscaCod(f.cod) >=0 ) return false;
        try{
            lista[count] = f;
            count++;
        }
        catch(Exception  exc) {
            System.out.println(exc.getMessage() + "\n");
        }
        return true;
    }
    
    public void printAll() {
        for(int i = 0; i< count; i++) {
            lista[i].holerrith();
        }
    }
    
    public void listagemVendedores(){
        for(int i = 0; i< count; i++) {
            if(lista[i] instanceof Vendedores) {
                lista[i].holerrith();
            }
        }
    }
    
    public void listagemProducao(){
        for(int i = 0; i< count; i++) {
            if(lista[i] instanceof Producao) {
                lista[i].holerrith();
            }
        }
    }
    
    public void listagemAdministradores(){
        for(int i = 0; i < count; i++) {
            if(lista[i] instanceof Administracao) {
                lista[i].holerrith();
            }
        }
    }
    
    public boolean registrarVenda(int cod, double valor) {
        int index = buscaCod(cod);
        if(index < 0) return false;
        if(lista[index] instanceof Vendedores v) {
            v.registrarVenda(valor);
        }
        return true;
    }
    
    public boolean registrarFalta(int cod) {
        int index = buscaCod(cod);
        if(index < 0) return false;
        
        if(lista[index] instanceof Administracao a) {
            a.registrarFalta();
        }
        return true;
    }
    
    public boolean horasDiurnas (int cod, int horas) {
        int index = buscaCod(cod);
        if(index < 0) return false;
        
        if(lista[index] instanceof Producao p) {
            p.horasDiurnas(horas);
        }
        return true;
    }
    
    public boolean horasNoturnas (int cod, int horas) {
        int index = buscaCod(cod);
        if(index < 0) return false;
        
        if(lista[index] instanceof Producao p) {
            p.horasNoturnas(horas);
        }
        return true;
    }
}
