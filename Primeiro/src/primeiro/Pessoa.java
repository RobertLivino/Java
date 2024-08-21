/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiro;

/**
 *
 * @author 0040962123038
 */
public class Pessoa 
{
 private String nome, sobrenome;
// Construtor
//    public Pessoa(String nome, String sobrenome) {
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//    }
 
public Pessoa (String nome, String sobrenome){;
        if(!sobrenome.isEmpty()){
            this.sobrenome = sobrenome;
        }
        
        if(!nome.isEmpty()){
           this.nome = nome;   
        }
         
 }
 
//getters
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
//Setters
    public void setSobrenome(String sobrenome) {
        if(!sobrenome.isEmpty())
        this.sobrenome = sobrenome;
    }
     public void setNome(String nome) {
       if(!nome.isEmpty())
        
         this.nome = nome;
    }
 
    public void print()
    {
        System.out.println(nome + " " + sobrenome);
    }
}
