/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040962123029
 */
public class PontoJaExiste extends Exception {
    private String msg;
    public PontoJaExiste() {
        this.msg = "O ponto informado ja existe";
    }
    public PontoJaExiste(String msg) {
        super(msg);
    }
    @Override
    public String toString(){
        return msg;
    }
}
