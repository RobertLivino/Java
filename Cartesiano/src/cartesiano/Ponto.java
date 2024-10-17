/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040962123029
 */
public class Ponto {
    private double x, y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto(Ponto pt) {
        this.x = pt.x;
        this.y = pt.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    public void setXY(double newX, double newY){
        this.x = newX;
        this.x = newY;
    }
    
    public void assign(Ponto pt){
        this.x = pt.x;
        this.y = pt.y;
    }
    
    public double deltaX(double vX){
        return vX-x;
    }
    
    public double deltaY(double vY){
        return vY-y;
    }
    
    public double distance(double posX, double posY){
        double dX = deltaX(posX);
        double dY = deltaY(posY);
        double dist = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
        return dist;
    }
    public double distance(Ponto pt){
        return distance(pt.x, pt.y);
    }
    
    public double distance(){
        double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(dist);
        return dist;
    }
    public void desloc(double dX, double dY){
        this.x = this.x + dX;
        this.y = this.y + dY;
    }
    
    public void escale(double factor){
        this.x = this.x * factor;
        this.y = this.y * factor;
    }
    
    @Override
    public String toString (){
        return "("  + x + ", " + y + ")";
    }
            
    
    public void print(){
        System.out.println(x + " , " + y);
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){ 
            return false;
        }
        if(!(obj instanceof Ponto)){ 
            return false;
        }
        Ponto pt = (Ponto)obj;
        return (x == pt.x) && (y == pt.y);
    }
}
