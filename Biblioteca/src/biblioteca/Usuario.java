/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962123029
 */
public abstract class Usuario {
    private String nome, email;
    private int codigo, atraso;
    private boolean bloqueado;

    public Usuario(String nome, String email, int codigo) {
        this.nome = nome;
        this.email = email;
        this.codigo = codigo;
        this.atraso = 0;
        this.bloqueado = false;
    }
    
    public abstract void cadastrarAtraso();
    public void Print(){
        System.out.println("Nome: " + nome + "\n" + 
                           "Email: " + email + "\n" + 
                           "Codigo: " + codigo + "\n" + 
                           "Atrasos: " + atraso + "\n" + 
                           "Esta Bloqueado: " + (bloqueado ? "Sim" : "Não"));
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public int getAtraso() {
        return atraso;
    }

    public void setAtraso(int atraso) {
        this.atraso = atraso;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
