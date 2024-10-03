/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciolistaint;

/**
 *
 * @author 0040962123029
 */
public class ExercicioListaInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaInt li = new ListaInt(10);
        li.fill(20);
        li.print();
        int Existe = 5;
        System.out.println("O valor existe: " +  (li.exist(Existe) ? "sim" : "não") + "\n");
    }
    
}
