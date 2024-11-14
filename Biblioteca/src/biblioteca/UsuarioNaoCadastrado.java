/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962123029
 */
public class UsuarioNaoCadastrado extends Exception{
    private String msg;
    public UsuarioNaoCadastrado() {
        this.msg = "usuario informado não cadastrado";
    }
    public UsuarioNaoCadastrado(int cod) {
        this.msg = "Usuario com codigo " + cod + " não cadastrado";
    }
    @Override
    public String toString(){
        return msg;
    }
}
