/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962123029
 */
public class NaoUsuario extends Usuario{
    private String rg, telefone;

    public NaoUsuario(String nome, String email, int codigo, String rg, String telefone) {
        super(nome, email, codigo);
        this.rg = rg;
        this.telefone = telefone;
    }
    public void cadastrarAtraso(){
        if(super.getAtraso() > 5) super.setBloqueado(true);
        super.setAtraso(super.getAtraso() + 1);
    }
    public String getRg() {
        return rg;
    }
    
    @Override
    public void Print(){
        super.Print();
        System.out.println("RG: " + rg + "\n" + 
                           "Telefone: " + rg + "\n");
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
