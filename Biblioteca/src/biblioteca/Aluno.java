/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962123029
 */
public class Aluno extends Usuario{
    private String ra;

    public Aluno(String nome, String email, int codigo, String ra) {
        super(nome, email, codigo);
        this.ra = ra;
    }
    @Override
    public void cadastrarAtraso(){
        if(super.getAtraso() > 3) super.setBloqueado(true);
        super.setAtraso(super.getAtraso() + 1);
    }
    @Override
    public void Print(){
        super.Print();
        System.out.println("Ra: " + ra + "\n");
    }
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
