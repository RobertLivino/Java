/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author 0040962123029
 */
public class Roupa implements ItemEstoqueInt{
    private String descricao;
    private int tamanho, qtd;
    private double preco;

    public Roupa(String descricao, int tamanho, double preco) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
        this.qtd = 0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public void incUnits(int qtd){
        this.qtd += qtd;
    }
//    void decUnits(int qtd) {
//        
//    }
//    int getUnits();
//    float getPrice();
//    void print();
}
