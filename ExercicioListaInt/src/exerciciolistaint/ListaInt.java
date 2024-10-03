/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciolistaint;

/**
 *
 * @author 0040962123029
 */
public class ListaInt {
    private int lista[];

    public ListaInt(int capMax) {
        this.lista = new int[capMax];
    }
    
    public void fill(int limite) {
        for(int i = 0; i< lista.length; i++) {
            lista[i] = (int)(Math.random() * limite);
        }
    }
    
    public boolean exist(int valor) {
        for(int i = 0; i< lista.length; i++) {
            if(lista[i] == valor) return true;
        }
        return false;
    }
    
    public int maxValue() {
        int max = lista[0];
        for(int i = 0; i< lista.length; i++) {
            if(lista[i] > max) max = lista[i];
        }
        return max;
    }
    
    public int minValue() {
        int min = lista[0];
        for(int i = 0; i< lista.length; i++) {
            if(lista[i] < min) min = lista[i];
        }
        return min;
    }
    
    public double average() {
        int soma = 0;
        for(int i = 0; i< lista.length; i++) {
            soma+=lista[i];
        }
        return soma/lista.length;
//        return (maxValue() + minValue()) / 2;
    }
    
    public void print() {
        for(int i = 0; i<lista.length; i++) {
            if(i%10 == 0) {
                System.out.println();
            }
            System.out.print("" +  lista[i] + "\t");
        }
        System.out.println("\n\nValor maximo: " +  maxValue() + "\n" + 
                           "Valor minimo: " +  minValue() + "\n" +
                           "Media entre o numero maior e o menor da lista: " +  ((maxValue() + minValue()) / 2) + "\n" + 
                           "Media da lista: " +  average() + "\n");
    }
}
