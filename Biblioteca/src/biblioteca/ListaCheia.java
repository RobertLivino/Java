/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962123029
 */
public class ListaCheia extends Exception{
    private String msg;
    public ListaCheia() {
        this.msg = "Lista ja esta cheia";
    }
    public ListaCheia(int tam) {
        this.msg = "Lista ja esta com " + tam + " usuarios";
    }
    @Override
    public String toString(){
        return msg;
    }
}
