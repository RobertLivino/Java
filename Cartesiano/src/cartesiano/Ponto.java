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
    private double cordX, cordY;

    public Ponto() {
        this.cordX = 0;
        this.cordY = 0;
    }
    
    public Ponto(double cordX, double cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }
    
    public Ponto(Ponto pt) {
        this.cordX = pt.cordX;
        this.cordY = pt.cordY;
    }

    public void setCordX(double cordX) {
        this.cordX = cordX;
    }

    public double getCordX() {
        return cordX;
    }

    public double getCordY() {
        return cordY;
    }
    
    public void setCordY(float cordY) {
        this.cordY = cordY;
    }
    
    public void setXY(double newX, double newY){
        this.cordX = newX;
        this.cordY = newY;
    }
    
    public void assign(Ponto pt){
        this.cordX = pt.cordX;
        this.cordY = pt.cordY;
    }
    
    public double deltaX(double vX){
        return vX-cordX;
    }
    
    public double deltaY(double vY){
        return vY-cordY;
    }
    
    public double distance(double posX, double posY){
        double dX = deltaX(posX);
        double dY = deltaY(posY);
        double dist = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
        System.out.println(dist);
        return dist;
    }
    public double distance(Ponto pt){
        return distance(pt.cordX, pt.cordY);
    }
    
    public double distance(){
        double dist = Math.sqrt(Math.pow(cordX, 2) + Math.pow(cordY, 2));
        System.out.println(dist);
        return dist;
    }
    public void desloc(double dX, double dY){
        this.cordX = this.cordX + dX;
        this.cordY = this.cordY + dY;
    }
    
    public void escale(double factor){
        this.cordX = this.cordX * factor;
        this.cordY = this.cordY * factor;
    }
    
    public String toString (){
        return "("  + cordX + ", " + cordY + ")";
    }
            
    
    public void print(){
        System.out.println(cordX + " , " + cordY);
        
    }
}
