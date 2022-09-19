/**
 * Write a description of class Interseccion here.
 * 
 * @author (Johann Amaya) 
 * @version (Ciclo 2)
 */
public class Interseccion 
{
    private Circle inter;
    private int x,y;
    private String color;
    public Interseccion (String color,int x,int y){
        this.color= color;
        this.x =x;
        this.y =y;
        inter = new Circle();
        inter.changeColor(color);
        inter.changePotition(x, y);
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void makeVisible(){
        inter.makeVisible();
    }
    
    public void makeInvisible(){
        inter.makeInvisible();
    }
    
    public int getx(){
        return inter.getx();
    }
    
    public int gety(){
        return inter.gety();
    }
}
