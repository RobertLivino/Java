/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autopeca;

/**
 *
 * @author 0040962123029
 */
public class Peca {
    private int codigo, estoque;
    private double peso;
    private String descricao;

    public Peca(int codigo, int estoque, double peso, String descricao) {
        this.codigo = codigo;
        this.estoque = estoque;
        this.peso = peso;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int Codigo) {
        this.codigo = Codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void print() {
        System.out.println("Codigo: " + codigo + "\n" +
                           "Estoque: " + estoque + "\n" +
                           "Peso: " + peso + "\n" + 
                           "Descricao: " + descricao + "\n");
    }   
}
