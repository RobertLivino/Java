/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962123029
 */
public class ListaUsuario {
    private Usuario lista[];
    private int count;
    
    public ListaUsuario(int capMax) {
        this.lista = new Usuario[capMax];
        this.count = 0;
    }
    
    public int buscar(int cod){
        for(int i = 0; count > i; i++){
            if(lista[i].getCodigo() == cod){
                return i;
            }
        }
        return -1;
    }
    public void cadastrar(Usuario us) throws Exception{
        if(count >= lista.length) throw new ListaCheia(count);
        if(buscar(us.getCodigo()) >= 0) throw new UsuarioJaCadastrado(us.getCodigo());
        lista[count] = us;
        count++;
    }
    public void retirar(int cod) throws Exception{
        int usuario = buscar(cod);
        if(usuario < 0) throw new UsuarioNaoCadastrado(cod);
        if(lista[usuario].isBloqueado()) throw new UsuarioBloqueado(cod);
    }
    public void devolver(int cod, boolean emAtraso) throws Exception{
        int usuario = buscar(cod);
        if(usuario < 0) throw new UsuarioNaoCadastrado(cod);
        if(emAtraso){
            lista[usuario].cadastrarAtraso();
        }
    }
    public void liberar(int cod) throws Exception{
        int usuario = buscar(cod);
        if(usuario < 0) throw new UsuarioNaoCadastrado(cod);
        lista[usuario].setAtraso(0);
        lista[usuario].setBloqueado(false);
    }
    public void listarAlunos(){
        for(int i = 0; i <= count-1; i++){
            if(lista[i] instanceof Aluno){
                lista[i].Print();
            }
        }
    }
    public void listarUsuarios(){
        int impedidos = 0;
        for(int i = 0; i <= count-1; i++){
            if(lista[i].isBloqueado()){
                impedidos++;
            }
            lista[i].Print();
        }
        System.out.println("Total de usuarios bloqueados por atraso: " + impedidos);
    }
}
