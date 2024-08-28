/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiro;

/**
 *
 * @author 0040962123029
 */
public class Aluno extends Pessoa {
    private String ra;
    
    public Aluno(String nome, String sobrenome, String ra){
        super(nome, sobrenome);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("RA: " + ra);
    }
            
}
