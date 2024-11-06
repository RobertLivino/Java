/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040962123029
 */
public class ListaCheia extends Exception{
    private String msg;
    public ListaCheia() {
        this.msg = "A lista esta cheia";
    }

    public ListaCheia(String msg) {
        super(msg);
    }
}
