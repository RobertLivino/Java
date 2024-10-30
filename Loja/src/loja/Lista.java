/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author 0040962123029
 */
public class Lista {
    private ItemEstoqueInt lista[];
    private int count;
    
    public Lista(int tamMax) {
        this.lista = new ItemEstoqueInt[tamMax];
        this.count = 0;
    }
    
    public int add(ItemEstoqueInt item) {
        if (count >= lista.length) return -1;
        lista[count] = item;
        count++;
        return count-1;
    }
    public boolean incUnits(int index, int qtd) {
        if (index < 0 || index > count -1) return true;
        lista[index].incUnits(qtd);
        return true;
    }
    public boolean decUnits(int index, int qtd) {
        if (index < 0 || index > count -1) return true;
        lista[index].decUnits(qtd);
        return true;
    }
    public void listAll() {
        for(int i = 0; i<count; i++) {
            lista[i].print();
        }
    }
}
