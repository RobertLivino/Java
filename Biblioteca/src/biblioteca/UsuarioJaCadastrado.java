/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962123029
 */
public class UsuarioJaCadastrado extends Exception{
    private String msg;
    public UsuarioJaCadastrado() {
        this.msg = "usuario informado Ja cadastrado";
    }
    public UsuarioJaCadastrado(int cod) {
        this.msg = "Usuario com codigo " + cod + " ja cadastrado";
    }
    @Override
    public String toString(){
        return msg;
    }
}
