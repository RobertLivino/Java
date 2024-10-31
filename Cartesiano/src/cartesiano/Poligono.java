/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040962123029
 */
public class Poligono {
    private Ponto vertices[];
    private int count;
    
    public Poligono(){
        this.vertices = new Ponto[5];
        this.count = 0;
    }
    public Poligono(Poligono p){
        this();
        for(int i = 0; i<p.count; i++){
            vertices[i] = new Ponto(p.vertices[i]);
        }
        count = p.count;
    }
    
    public int buscaPonto(Ponto pt){
        for(int i = 0; i < count; i++){
            if(pt.equals(vertices[i]))
                return i;
        }
        return -1;
    }
    public boolean ptExist(Ponto pt) {
        return buscaPonto(pt) > 0;
    }
    public boolean addVertex(Ponto pt) {
//        if (count >= vertices.length) return false;
        if (buscaPonto(pt) > 0) return false;
        try{
            vertices[count] = pt;
            count++;
        }
        catch(Exception exc){
            System.out.println(exc.getMessage() + "\n");
        }
        return true;
    } 
    public boolean isValid() {
        return count >= 3;
    } 
    public double perimeter() {
        if(!isValid()) return -1;
        int soma = 0;
        for(int i = 1 ; i < count; i++){
            soma += vertices[i-1].distance(vertices[i]);
        }
        soma += vertices[count-1].distance(vertices[0]);
        return soma;
    }
    public Ponto geoCenter() {
        double mediaX = 0;
        double mediaY = 0;
        for(int i = 1 ; i < count; i++){
            mediaX += vertices[i].getX();
            mediaY += vertices[i].getY();
        }
        return new Ponto(mediaX/count, mediaY/count);
    }
    public double distance(Poligono pl) {
        double deltaX = pl.geoCenter().getX() - geoCenter().getX();
        double deltaY = pl.geoCenter().getY() - geoCenter().getY();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
    public void desloc(double dx, double dy) {
        for(int i = 0; i < count; i++){
            vertices[i].desloc(dx, dy);
        }
    } 
    public void escale(double factor) {
        for(int i = 0; i < count; i++){
            vertices[i].escale(factor);
        }
    }
    @Override
    public String toString(){
        String st = "[";
        for(int i = 0; i < count; i++){
            st = st + vertices[i].toString();
            if (i<count -1) 
                st = st + ",";
            else 
                st = st + "]";
        }
        return st;
    }
    public void print(String caption){
        System.out.println(caption + toString());
    }
}
