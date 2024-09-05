/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040962123029
 */
public class Segmento  {
    private Ponto p1, p2;
    
    public Segmento (){
        this.p1 = new Ponto();
        this.p2 = new Ponto(0,1);
    }
    
    public Segmento (double x1, double y1, double x2, double y2){
        this.p1 = new Ponto(x1,y1);
        this.p2 = new Ponto(x2,y2);
    }
    
    public Segmento (Segmento sg){
        this.p1 = new Ponto(sg.p1);
        this.p2 = new Ponto(sg.p2);
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }
    
    public void assing(Segmento sg){
        p1 = sg.p2;
        p2 = sg.p1;
    }
    
    public void desloc(double dx, double dy){
        p1.desloc(dx, dy);    
        p2.desloc(dx, dy);    
    }
    
    public void escale(double factor){
        p1.escale(factor);    
        p2.escale(factor);
    }
    
    @Override
    public String toString(){
        return "[" + p1 + "," + p2 + "]";
    }
    
    public double length(){
        double calc1 = p1.distance(p2);
        System.out.println(calc1);
        return calc1;
    }
    
     public boolean isValid() {
        if(p1 == null || p2 == null){
            return false;
        }
        return p1.distance(p2) > 0;
    }
    
     public Ponto midPoint() {
        double xm = (p1.getX()+p2.getX())/2;
        double ym = (p1.getY()+p2.getY())/2;
        return new Ponto(xm, ym);
    }
     
    public boolean equals(Object obj){
        if(obj == null){ 
            return false;
        }
        if(!(obj instanceof Segmento)){ 
            return false;
        }
        Segmento sg = (Segmento)obj;
        return (p1 == sg.p1) && (p2 == sg.p2);
    }
}
