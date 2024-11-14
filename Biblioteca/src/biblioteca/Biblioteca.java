/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 0040962123029
 */
public class Biblioteca {

    public static void main(String[] args) {
        try {
            ListaUsuario lu = new ListaUsuario(3);
            lu.cadastrar(new Aluno("Carlos", "a@a.com", 1, "00406325895"));
            lu.cadastrar(new Aluno("Carlos", "a@a.com", 2, "00406325895"));
        } catch (Exception ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
