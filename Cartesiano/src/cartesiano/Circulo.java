/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040962123029
 */
public class Circulo extends Ponto {
    private double raio;
    
    public Circulo(){
        super();
        this.raio = 1;
    }
    
    public Circulo(double cordX, double cordY, double raio){
        super(cordX, cordY);
        this.raio = raio;
    }
    
    public Circulo(Circulo cl){
        super.assign(cl);
        this.raio = cl.raio;
    }
    
    public void assign(Circulo cl){
        this.raio = cl.raio;
    }
    
    @Override
    public void escale(double factor){
        raio *= factor;
    }
    
    @Override
    public String toString ( ){
        return "("  + super.getCordX() + ", " + super.getCordY() + "):" + raio;
    }
    
    public boolean isValid(){
        boolean isValid = raio > 0;
        System.out.println(isValid);
        return raio > 0;
    }
    
    public double perimeter(){
        double perimeter = 2*Math.PI*raio;
        System.out.println(perimeter);
        return perimeter;
    }
    
    public double area(){
        double area = Math.PI*Math.pow(raio, 2);
        System.out.println(area);
        return area;
    }
        
}
