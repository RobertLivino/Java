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
        return "("  + super.getX() + ", " + super.getY() + "):" + raio;
    }
    
    public boolean isValid(){
        return raio > 0;
    }
    
    public double perimeter(){
        return 2*Math.PI*raio;
    }
    
    public double area(){
        return Math.PI*Math.pow(raio, 2);
    }
        
    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(!(obj instanceof Circulo)) return false;
        Circulo cl = (Circulo)obj;
        return (raio ==cl.raio) && super.equals(cl);
    }    
}
