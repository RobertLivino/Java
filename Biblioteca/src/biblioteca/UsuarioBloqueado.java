/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962123029
 */
public class UsuarioBloqueado extends Exception{
    private String msg;
    public UsuarioBloqueado() {
        this.msg = "usuario informado esta bloqueado";
    }
    public UsuarioBloqueado(int cod) {
        this.msg = "Usuario com codigo " + cod + " esta bloqueado";
    }
    @Override
    public String toString(){
        return msg;
    }
}
